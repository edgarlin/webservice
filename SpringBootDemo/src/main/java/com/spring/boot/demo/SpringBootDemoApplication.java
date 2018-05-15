package com.spring.boot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.boot.demo.config.AppProperties;
import com.spring.boot.demo.config.WebProperties;

@SpringBootApplication	// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringBootDemoApplication implements CommandLineRunner{
	
	@Autowired
	private AppProperties appProperties;
	
	@Autowired
	private WebProperties webProperties;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		System.out.println(this.appProperties.isBool());
		System.out.println(this.appProperties.getStr());
		System.out.println(this.appProperties.getNames().get(0));
		
		System.out.println(this.webProperties.isBool());
		System.out.println(this.webProperties.getStr());
	}
}
