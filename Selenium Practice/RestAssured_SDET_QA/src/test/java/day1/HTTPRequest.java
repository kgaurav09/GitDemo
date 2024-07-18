package day1;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

/*given()
 * 
 * content type, set cookies, add auth, add param, add param, set header info 
when()

get, post, put, delete

then()

validate status code, extract response, extract header cookies and response body 
*/
public class HTTPRequest {
	@Test
	void getUser()
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
