package stepDefinations;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;


public class stepDefination extends Utils {
	
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
    TestDataBuild data= new TestDataBuild();
    String placeid;
   static String placeID;
    
    
	@Given("Add Place Payload")
	

	@Given("Add Place Payload with {string} {string} {string}")
	public void add_place_payload_with(String name, String language, String address) throws IOException {
		
		//resspec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		res=given().spec(requestSpecification())
		.body(data.addPlacePayload(name,language,address));
	  	}


	@When("User call {string} with {string} http request")
	public void user_call_with_http_request(String resources, String method) {
		
	
		
	APIResources resourceAPI= APIResources.valueOf(resources);
	System.out.println(resourceAPI.getResource());
	
	resspec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
	
	if(method.equalsIgnoreCase("POST"))
	
	
		response =res.when().post(resourceAPI.getResource()).
				then().spec(resspec).extract().response();
		else if (method.equalsIgnoreCase("GET"))
			
			response =res.when().get(resourceAPI.getResource()).
			then().spec(resspec).extract().response();
		
		
	

	    
	}
	@Then("the API call got success with status code as {int}")
	public void the_api_call_got_success_with_status_code_as(Integer int1) {
		
		assertEquals(response.getStatusCode(),200);

	}
	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String ExpectedValue) {
		
		assertEquals(getJsonPath(response, keyValue),ExpectedValue);
		System.out.println(ExpectedValue);
	 
	}

	
	@Then("verify place_Id created maps to {string} using {string}")
	public void verify_place_id_created_maps_to_using(String expectedName, String resource) throws IOException {
		
		placeID=getJsonPath(response, "place_id");
		 System.out.println(placeID);
		res=given().spec(requestSpecification()).queryParam("place_id", placeID);
		
		user_call_with_http_request(resource, "GET");
		String actualname=getJsonPath(response, "name");
		assertEquals(actualname,expectedName); 
		
	}
    
	@Given("DeletePlace Payload")
	public void delete_place_payload() throws IOException {
	  res= given().spec(requestSpecification()).body(data.deletePlaceAPI(placeID));
	}





	



}
