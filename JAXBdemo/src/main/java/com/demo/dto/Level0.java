package com.demo.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "LEVEL_0")
// @XmlType(propOrder = { "level1s", "string1" })
public class Level0 {

	private String string1;

	private List<Level1> level1s;

	@XmlElement(name = "STRING_1", nillable = false, required = true)
	// @XmlElement(name = "STRING_1", nillable = true, required = true)
	public String getString1() {
		return string1;
	}

	public void setString1(String string1) {
		this.string1 = string1;
	}

	//@XmlElementWrapper(name = "LEVEL_1S")
	@XmlElement(name = "LEVEL_1")
	public List<Level1> getLevel1s() {
		return level1s;
	}

	public void setLevel1s(List<Level1> level1s) {
		this.level1s = level1s;
	}

}
