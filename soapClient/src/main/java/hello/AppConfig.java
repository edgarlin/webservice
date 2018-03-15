
package hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class AppConfig {

	@Bean
	public Jaxb2Marshaller bean000() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.generated.pkgname"); // = package name = <generatePackage> in pom.xml 
		return marshaller;
	}

	@Bean
	public AppClient bean001(Jaxb2Marshaller bean000) {
		AppClient client = new AppClient();
		client.setDefaultUri("http://localhost:8080/ServletRegistrationBean");
		client.setMarshaller(bean000);
		client.setUnmarshaller(bean000);
		return client;
	}

}
