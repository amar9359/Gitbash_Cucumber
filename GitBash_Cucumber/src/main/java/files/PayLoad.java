package files;

public class PayLoad {
	
	public static String addbook(String isbn, String aisle) {
		return "{\r\n"
				+ "\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\""+isbn+"\",\r\n"
				+ "\"aisle\":\""+aisle+"\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "}";
	}
	
	public static String addPlace() {
			return "{\r\n"
					+ "    \"accuracy\": 50,\r\n"
					+ "    \"name\": \"Frontline house\",\r\n"
					+ "    \"address\": \"29, side layout, cohen 09\",\r\n"
					+ "    \"website\": \"https://rahulshettyacademy.com\",\r\n"
					+ "    \"language\": \"French-IN\",\r\n"
					+ "    \"location\": {\r\n"
					+ "        \"lat\": -38.383494,\r\n"
					+ "        \"lon\": 33.427362\r\n"
					+ "    },\r\n"
					+ "    \"types\": [\r\n"
					+ "        \"shoe park\",\r\n"
					+ "        \"shop\"\r\n"
					+ "    ],\r\n"
					+ "    \"phoneNumber\": \"(+91) 983 893 3937\"\r\n"
					+ "}";
		}
	}


