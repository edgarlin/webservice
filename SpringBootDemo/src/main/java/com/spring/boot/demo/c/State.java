package com.spring.boot.demo.c;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class State {
	private String state;

	public String getStrState() {
		return this.state;
	}

	public void setStrState(String strState) {
		this.state = strState;
	}
	
	

}
