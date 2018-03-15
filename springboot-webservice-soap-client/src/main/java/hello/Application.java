
package hello;

import hello.wsdl.GetCountryResponse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner xxx(CountryClient bean001) {
		return args -> {
			GetCountryResponse response = bean001.getCountry("Spain");
			System.err.println(response.getCountry().getCapital());
		};
	}

}
