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
public class AppConfig extends WsConfigurerAdapter {	// generating wsdl pages
	
	private static final String PORTTYPE_NAME = "PortTypeName";				// not in xsd,info only
	private static final String SERVLET_NAME = "/ServletRegistrationBean/";	// not in xsd,info only,same as ServletRegistrationBean
	private static final String NAMESPACE_URI = "http://tns.wsdl/soapserver/";		// not in xsd,info only

	@Bean
	public ServletRegistrationBean bean000(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, SERVLET_NAME + "*");
	}

	@Bean(name = "wsdlBeanName")
	public DefaultWsdl11Definition bean001(XsdSchema bean101) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName(PORTTYPE_NAME);						
		wsdl11Definition.setLocationUri(SERVLET_NAME);
		wsdl11Definition.setTargetNamespace(NAMESPACE_URI);
		wsdl11Definition.setSchema(bean101);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema bean101() {
		return new SimpleXsdSchema(new ClassPathResource("xsds/xsdfilename.xsd"));
	}
}
