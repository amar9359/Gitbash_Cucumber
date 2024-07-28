package practise;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Sample {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		given()
						.log().all()
						.queryParam("key", "qaclick123").header("Content-Type","application/json")
						.body("{\r\n"
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
								+ "}")
					.when()
						.post("/maps/api/place/add/json")
					.then().log().all().assertThat()
					.statusCode(200);
	}

}
