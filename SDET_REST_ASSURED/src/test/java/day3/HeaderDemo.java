package day3;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;


public class HeaderDemo {
	
	//@Test
	void testHeader()
	{
		given()
		
		.when()
			.get("https://www.google.com/")
		
		.then()
			.header("Content-Type", "text/html; charset=ISO-8859-1")
			.and()
			.header("Content-Encoding", "gzip")
			.and()
			.header("Server", "gws");
		
		
	}
	
	
	@Test
	void testHeaders()
	{
		 Response res=given()
		
		.when()
			.get("https://www.google.com/");
		
		 
		 
		 String header=res.getHeader("Content-Type");
		 
		 System.out.println("Content-Type header is   "+header);
		 
		 Headers myHeaders=res.getHeaders();
		 
		 	for(Header hd:myHeaders)
		 	{
		 		System.out.println(hd.getName()+"    "+hd.getValue());
		 	}
		
		
	}

}
