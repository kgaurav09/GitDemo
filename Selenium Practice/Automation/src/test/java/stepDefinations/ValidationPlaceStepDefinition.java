package stepDefinations;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.AddPlace;
import pojo.Location;
import resources.TestDataBuild;
import resources.Utils;

public class ValidationPlaceStepDefinition extends Utils{
	RequestSpecification req;
	ResponseSpecification resspec;
	RequestSpecification res;
	Response response;
	
	TestDataBuild data= new TestDataBuild();


	@Given("Add Place Payload")
	public void add_place_payload() 
	{
		
		 resspec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		 res=given().spec(requestSpecification())
		.body(data.addPlacePayLoad());
	    
	}
	@When("User call {string} with Post http request")
	public void user_call_with_post_http_request(String string) {
		
	response =res.when().post("/maps/api/place/add/json").
				then().spec(resspec).extract().response();

	}
	@Then("the API call got success with status code as {int}")
	public void the_api_call_got_success_with_status_code_as(Integer int1) {
		assertEquals(response.getStatusCode(),200);
		
		
	    
	}


	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String ExpectedValue) {
		
		String resp=response.asString();
		JsonPath js= new JsonPath(resp);
		assertEquals(js.get(keyValue).toString(),ExpectedValue);
	}




}