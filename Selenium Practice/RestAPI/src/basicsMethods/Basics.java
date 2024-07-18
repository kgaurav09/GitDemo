package basicsMethods;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import files.Payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;


public class Basics {
	

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
	String response=	given()
		
		.queryParam("Key", "qaclick123")
		.header("Content-Type","application/json")
		.body(Payload.AddplacePayload())
		
		.when()
		.post("/maps/api/place/add/json")
		
		.then()
		.log()
		.all()
		.assertThat()
		.statusCode(200)
		.body("scope", equalTo("APP"))
		.header("Server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
	
	System.out.println(response);

	
	JsonPath js= new JsonPath(response);
	String place_id=js.getString("place_id");
	System.out.println("Place_id is  "+place_id);
	
	
	//update place
	String newAddress="40 Summer walk";
	given()
	.log().all()
	.queryParam("key", "qaclick123")
	.header("Content-Type", "application/json")
	.body("{\r\n"
			+ "\"place_id\":\""+place_id+"\",\r\n"
			+ "\"address\":\""+newAddress+"\",\r\n"
			+ "\"key\":\"qaclick123\"\r\n"
			+ "}")
	.when()
	.put("/maps/api/place/update/json")
	.then()
	.log().all()
	.assertThat().statusCode(200)
	.body("msg", equalTo("Address successfully updated"));
	
	
	//get place id
	
	String getResponse=given()
	.queryParam("key", "qaclick123")
	.queryParam("place_id", place_id)
	
	.when()
	.get("/maps/api/place/get/json")
	.then().log().all()
	.statusCode(200).extract().response().asString();

	JsonPath js1= new JsonPath(getResponse);
	
	String updatedAddress=js1.getString("address");
	
	System.out.println(updatedAddress);
	Assert.assertEquals(newAddress, updatedAddress);
	}

}
