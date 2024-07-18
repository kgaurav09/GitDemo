package Day_1;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class HTTP_Request {
	
	@Test
	void getUsers()
	{
		given()
		
		.when()
		  .get("https://reqres.in/api/users?page=2")
		
		.then()
		 .statusCode(200)
		 .body("page", equalTo(2))
		 .log().all();
	}
	

}
