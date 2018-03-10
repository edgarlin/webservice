package hello.repositories;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class Repository1 {
	private static final Map<String, String> map = new HashMap<>();

	@PostConstruct
	public void initData() {
		map.put("A","Z");
	}

	public String getValue(String name) {
		Assert.notNull(name, "The name must not be null");
		if(map.get(name) == null) {
			return "NULL";
		}
		return map.get(name);
	}
}
