package day6;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class JSONSchemaValidation {

	@Test
	public void jsonSchemaValidation()
	{
		
		given()
		
		.when()
			.get("https://reqres.in/api/users/2")
		
		
		.then()
		 	.assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("singleUserJsonSchema.json"));
		
		
		
	}
}
