package bookAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DynamicJson {
	
	
	@Test
	public void AddBook()
	{
		RestAssured.baseURI="http://216.10.245.166";
		
		String BookResponse=given()
		.header("Content-Type", "application/json")
		.body("{\r\n"
				+ "\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\"bcd\",\r\n"
				+ "\"aisle\":\"227\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "}")
		.when()
		.post("/Library/Addbook.php")
		.then().log().all()
		.extract().response().asString();
	
	}
	

}
