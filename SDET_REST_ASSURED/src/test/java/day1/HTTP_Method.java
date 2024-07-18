package day1;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

/*given()
content type,set cookies, add auth, add param, set headers info etc...

when()
get, post, put, delete

then()
validate status code, extract response, extract header cookies and response body....
*/

public class HTTP_Method {
	
	int id;
	
	@Test(priority = 1)
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
	
	@Test(priority = 2)
	void CreateUser()
	{
		
		HashMap hs= new HashMap();
		hs.put("name", "deepak");
		hs.put("job", "trainer");
		
		id=given()
		.contentType("application/json")
		.body(hs)
		
		.when()
		.post("https://reqres.in/api/users")
		.jsonPath().getInt("id");
		
		System.out.println("created user id is"+ id);
		
		/*.then()
		.statusCode(201)
		.log().all();*/
		
	}

	@Test(priority = 3, dependsOnMethods = {"CreateUser"})
	void UpdateUser()
	
	{
		given()
		
		.when()
		.put("https://reqres.in/api/users/"+id)
		
		.then()
		.statusCode(200)
		.log().all();
		
		
	}
	@Test(priority = 4, dependsOnMethods = {"CreateUser"})
	void DeleteUser()
	{
		
		given()
		
		
		.when()
		.delete("https://reqres.in/api/users/"+id)
			
		
		.then()
		.statusCode(204);
		
	}

}
