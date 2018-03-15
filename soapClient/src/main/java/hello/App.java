
package hello;

import com.generated.pkgname.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Bean
	CommandLineRunner xxx(AppClient bean001) {
		return args -> {
			OperationResponse response = bean001.doSomething("Spain");
			System.err.println(response.getCountry().getCapital());
		};
	}

}
