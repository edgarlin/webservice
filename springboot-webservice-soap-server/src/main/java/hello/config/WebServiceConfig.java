package hello.config;

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
public class WebServiceConfig extends WsConfigurerAdapter {
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/soap/*");
	}

	@Bean(name = "bean_name_xsd1")
	public DefaultWsdl11Definition xsd1Wsdl11Definition(XsdSchema xsd1) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("xsd1PortTypeName");
		wsdl11Definition.setLocationUri("/soap");
		wsdl11Definition.setTargetNamespace("http://wsdl.tns/");
		wsdl11Definition.setSchema(xsd1);
		return wsdl11Definition;
	}

	@Bean(name = "xsd1")
	public XsdSchema getXsd1() {
		return new SimpleXsdSchema(new ClassPathResource("xsd1.xsd"));
	}

}
