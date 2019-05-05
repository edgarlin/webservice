package com.demo;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Since;

@SuppressWarnings({ "unused" })
public class DemoObj {
	@SerializedName("custom_naming")
	private int value1;
	@Since(1.1)
	private String value2;
	private transient int value3;

	DemoObj(int v1, String v2, int v3) {
		this.value1 = v1;
		this.value2 = v2;
		this.value3 = v3;
	}
}
