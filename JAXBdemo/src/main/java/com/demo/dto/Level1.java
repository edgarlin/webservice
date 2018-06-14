package com.demo.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "LEVEL_1")
public class Level1 {
	
	private int int1;

	@XmlElement(name = "INT", nillable = false, required = true)
	public int getInt1() {
		return int1;
	}

	public void setInt1(int int1) {
		this.int1 = int1;
	}

}
