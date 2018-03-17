package hello;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import xsd.tns.soapserver.Country;
import xsd.tns.soapserver.Currency;

@Component
public class Repository1 {
	private static final Map<String, Country> map = new HashMap<>();

	@PostConstruct
	public void initData() {
		System.out.println("Repository1.initData");
		Country spain = new Country();
		spain.setName("Spain");
		spain.setCapital("Madrid");
		spain.setCurrency(Currency.EUR);
		spain.setPopulation(46704314);
		map.put(spain.getName(), spain);
	}

	public Country findCountry(String name) {
		System.out.println("Repository1.findCountry");
		Assert.notNull(name, "The country's name must not be null");
		return map.get(name);
	}
}
