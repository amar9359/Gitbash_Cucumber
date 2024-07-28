package sample;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import pojo.LoginRequest;
import pojo.LoginResponse;

import static io.restassured.RestAssured.*;

public class EcommerceApiTest {
	
	public static void main(String[] args) {
		RequestSpecification req = new RequestSpecBuilder().
								setBaseUri("https://rahulshettyacademy.com")
								.setContentType(ContentType.JSON)
								.build();
		
		LoginRequest lr = new LoginRequest();
		lr.setUserEmail("amar.kadam@openxcell.com");
		lr.setUserPassword("Amar@1234");
		
		RequestSpecification reqLogin = given().log().all().
				spec(req).body(lr);
		
		LoginResponse loginResponse = reqLogin.when().post("/api/ecom/auth/login")
			.then().log().all().extract().response().as(LoginResponse.class);
		
		System.out.println(loginResponse.getToken());
		System.out.println(loginResponse.getUserId());
	}

}
