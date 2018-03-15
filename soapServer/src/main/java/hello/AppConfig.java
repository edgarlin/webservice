package hello;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
@SuppressWarnings({ "rawtypes", "unchecked" })
public class AppConfig extends WsConfigurerAdapter {

	@Bean
	public ServletRegistrationBean bean000(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/ServletRegistrationBean/*");
	}

	@Bean(name = "wsdlBeanName")
	public DefaultWsdl11Definition bean001(XsdSchema bean002) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("yyy"); // not in xsd
		wsdl11Definition.setLocationUri("/zzz");	// not in xsd
		wsdl11Definition.setTargetNamespace("http://com.wsdl/tns");	// not in xsd
		wsdl11Definition.setSchema(bean002);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema bean002() {
		return new SimpleXsdSchema(new ClassPathResource("countries.xsd"));
	}
}
