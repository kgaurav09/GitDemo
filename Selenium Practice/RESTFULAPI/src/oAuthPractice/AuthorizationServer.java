package oAuthPractice;
import org.testng.annotations.Test;

import bookAPI.ReuseableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojo.GetCources;

import static io.restassured.RestAssured.*;


public class AuthorizationServer {
	

	@Test
	public void GenerateToken()
	{
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		 String res= given()
		
		.formParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.formParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
		.formParam("grant_type", "client credentials")
		.formParam("scope", "trust")
		.when()
		.post("/oauthapi/oauth2/resourceOwner/token")
		.then()
		.log().all()
		.extract().response().asString();
		 
		 
		 JsonPath js=ReuseableMethods.RawToJSON(res);
		 String accessToken=js.getString("access_token");
		System.out.println(accessToken);
		
		
		/*
		 * GetCources gc=given() .queryParam("access_token", accessToken) .when()
		 * .get("/oauthapi/getCourseDetails") .as(GetCources.class);
		 */
		//System.out.println(courceDetails);
		/*
		 * System.out.println("URL of linkin "+gc.getLinkedIn());
		 * System.out.println("URL of linkin "+gc.getInstructor());
		 */
		
	}

}
