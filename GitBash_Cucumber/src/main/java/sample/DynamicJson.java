package sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import files.ReusableMethods;
import files.PayLoad;

public class DynamicJson {

	@Test(dataProvider = "BooksData")
	public void addBook(String isbn, String aisle){

		RestAssured.baseURI = "http://216.10.245.166";

		String resp = given().

				header("Content-Type", "application/json").

				body(PayLoad.addbook(isbn, aisle)).

				when().

				post("/Library/Addbook.php").

				then().assertThat().statusCode(200).

				extract().response().asString();

		JsonPath js = ReusableMethods.rawToJson(resp);

		String id = js.get("ID");

		System.out.println(id);

		// deleteBOok

	}

	@DataProvider (name = "BooksData")
	public Object[][] getData() {
		
		return new Object[][] {{"ojfawty","93663"},{"cwbetee","42253"},{"okmcfet","5334"}};
	}
}
