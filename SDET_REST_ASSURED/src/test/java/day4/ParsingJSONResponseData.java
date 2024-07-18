package day4;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

public class ParsingJSONResponseData {
	@Test(priority = 2)
	public void testJSONResponse()
	{
		
		given()
		
		.when()
		.get("https://reqres.in/api/users/2")
		
		.then()
		.statusCode(200)
		.header("Content-Type", "application/json; charset=utf-8")
		.log()
		.all();

	}
	@Test(priority = 1)
	public void testJSONResponse1()
	{
		
		Response res=given()
		
		.when()
		.get("https://reqres.in/api/users/2");
		
		int actStatusCode=res.getStatusCode();
		
		Assert.assertEquals(actStatusCode, 200);
		
		Assert.assertEquals(res.header("Content-Type"),"application/json; charset=utf-8");
		
		int id=res.jsonPath().get("data.id");
		System.out.println(id);
		
		Assert.assertEquals(id, 2);
		

	}

@Test(priority=3)
	public void JsonBodyData()
	{
		Response res=given()
				.contentType(ContentType.JSON)
		
		
		.when()
		.get("https://reqres.in/api/users?page=2");
		
		JSONObject jo= new JSONObject(res.asString());
		
		boolean status=false;
		
		for(int i=0;i<jo.getJSONArray("data").length();i++)
		{
			String fname=jo.getJSONArray("data").getJSONObject(i).get("first_name").toString();
			
			System.out.println(fname);
			
			
			
			/*
			 * if(fname.equals("Rachel")) { status=true; break; }
			 * Assert.assertEquals(status, true);
			 */
			 
			 
		}	
		
		//total add all id
		int sumOFID=0;
		
		for(int i=0;i<jo.getJSONArray("data").length();i++)
		{
			String id=jo.getJSONArray("data").getJSONObject(i).get("id").toString();
			
			sumOFID=(int) (sumOFID+Double.parseDouble(id));
			
			
			
		}
		System.out.println(sumOFID);

	}
}
