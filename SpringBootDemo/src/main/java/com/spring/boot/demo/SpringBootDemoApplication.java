package com.spring.boot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.boot.demo.c.City;

@SpringBootApplication	// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringBootDemoApplication implements CommandLineRunner{
	
//	@Autowired
//	private AppProperties appProperties;
//	
//	@Autowired
//	private WebProperties webProperties;

	@Autowired
	private City LA;

	@Autowired
	private City NY;

	
	public static void main(String[] args) {
		System.out.println("main");
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(this.appProperties.isBool());
//		System.out.println(this.appProperties.getStr());
//		System.out.println(this.appProperties.getNames().get(0));
//		System.out.println(this.webProperties.isBool());
//		System.out.println(this.webProperties.getStr());
		
//		LA.setState("CA");
		LA.getState().setStrState("CA");
		NY.getState().setStrState("NY");
		System.out.println(LA.getState().getStrState());
		System.out.println(NY.getState().getStrState());
//		City NY=new City();
//		NY.setState("NY");
//		System.out.println(NY.getState());
	}
}
