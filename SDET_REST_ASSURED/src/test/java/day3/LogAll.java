package day3;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class LogAll {
	
	@Test
void logsMethodCheck()

{
	given()
		.pathParam("mypath", "users")
		.queryParam("page",2)
		.queryParam("id", 5)
	
	.when()
		.get("https://reqres.in/api/{mypath}")
	.then()
		.log()
		//.body();
	    //.headers();
		//.cookies();
		  .all();
	
	

	
	}

}
