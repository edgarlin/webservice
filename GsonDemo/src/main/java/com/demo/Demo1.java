package com.demo;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

@SuppressWarnings({ "unused" })
public class Demo1 {

	public static void main(String[] args) {
		// Serialization

		// Gson gson = new Gson();
		Gson gson = new GsonBuilder().setPrettyPrinting().setVersion(1.0).serializeNulls().create();
		System.out.println(gson.toJson(1));
		System.out.println(gson.toJson("abcd"));
		System.out.println(gson.toJson(Long.valueOf(10L)));

		int[] values = { 1, 2, 3 };
		System.out.println(gson.toJson(values));

		// Deserialization
		int one1 = gson.fromJson("1", int.class);
		Integer oneI = gson.fromJson("1", Integer.class);
		Long oneL = gson.fromJson("1", Long.class);
		Boolean false1 = gson.fromJson("false", Boolean.class);
		String str = gson.fromJson("\"abc\"", String.class);
		String[] anotherStr = gson.fromJson("[\"abc\"]", String[].class);

		DemoObj o1 = new DemoObj(3, null, 4);
		System.out.println(gson.toJson(o1));

		Integer[] i = { 1, 2, 3, 4 };
		Collection<Integer> ints = Arrays.asList(i);

		// Serialization
		String json = gson.toJson(ints);
		System.out.println(json);

		// Deserialization
		Type collectionType = new TypeToken<Collection<Integer>>() {
		}.getType();
		Collection<Integer> ints2 = gson.fromJson(json, collectionType);
		// ==> ints2 is same as ints
	}
}
