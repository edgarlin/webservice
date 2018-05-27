package com.spring.boot.demo.c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class City {
	
	@Autowired
	private State state;

	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
