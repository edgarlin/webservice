package com.pkgname;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flipkart.zjsonpatch.JsonDiff;

public class ClassName {

	public static void main(String[] args) {

		String before = "{\"widget\": {\n" + "    \"debug\": \"on\",\n" + "    \"window\": {\n"
				+ "        \"title\": \"Sample Konfabulator Widget\",\n" + "        \"name\": \"main_window\",\n"
				+ "        \"width\": 500,\n" + "        \"height\": 500\n" + "    },\n" + "    \"image\": { \n"
				+ "        \"src\": \"Images/Sun.png\",\n" + "        \"name\": \"sun1\",\n"
				+ "        \"hOffset\": 250,\n" + "        \"vOffset\": 250,\n" + "        \"alignment\": \"center\"\n"
				+ "    },\n" + "    \"text\": {\n" + "        \"data\": \"Click Here\",\n" + "        \"size\": 36,\n"
				+ "        \"style\": \"bold\",\n" + "        \"name\": \"text1\",\n" + "        \"hOffset\": 250,\n"
				+ "        \"alignment\": \"center\",\n"
				+ "        \"onMouseUp\": \"sun1.opacity = (sun1.opacity / 100) * 90;\"\n" + "    }\n" + "}}    ";

		String after = "{\"widget\": {\n" + "    \"debug\": \"off\",\n" + "    \"window\": {\n"
				+ "        \"title\": \"Sample Konfabulator Widget\",\n" + "        \"name\": \"main_window\",\n"
				+ "        \"title2\": \"Sample Konfabulator Widget\",\n" + "        \"width\": 500,\n"
				+ "        \"height\": 500\n" + "    },\n" + "    \"image\": { \n"
				+ "        \"src\": \"Images/Sun.png\",\n" + "        \"name\": \"sun1\",\n"
				+ "        \"hOffset\": 250,\n" + "        \"vOffset\": 250,\n" + "        \"alignment\": \"center\"\n"
				+ "    },\n" + "    \"text\": {\n" + "        \"data\": \"Click Here\",\n" + "        \"size\": 36,\n"
				+ "        \"style\": \"bold\",\n" + "        \"name\": \"text1\",\n" + "        \"vOffset\": 100,\n"
				+ "        \"alignment\": \"center\",\n"
				+ "        \"onMouseUp\": \"sun1.opacity = (sun1.opacity / 100) * 90;\"\n" + "    }\n" + "}}    ";

		try {
			ObjectMapper oMapper = new ObjectMapper();
			JsonNode source = oMapper.readTree(before);
			JsonNode target = oMapper.readTree(after);

			JsonNode patch = JsonDiff.asJson(source, target);
			System.out.println(oMapper.writerWithDefaultPrettyPrinter().writeValueAsString(patch));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
