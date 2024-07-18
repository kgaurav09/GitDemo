package day3;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;


import io.restassured.response.Response;


public class CookiesDemo {
	
	//@Test
	void testCookies()
	{
		given()
		
		.when()
			.get("https://www.google.com/")
		
		.then()
			.cookie("AEC", "AQTF6HztmF-zYw2RPo4-QZBbsDCy0To6ibFSGbQJNUNRuw3O20pTXPZqz6g; UULE=a+cm9sZTogMQpwcm9kdWNlcjogMTIKdGltZXN0YW1wOiAxNzE2MTE2MTk2NTYyMDAwCmxhdGxuZyB7CiAgbGF0aXR1ZGVfZTc6IDE4NTU5Nzk1MgogIGxvbmdpdHVkZV9lNzogNzM5MTQ3Nzc2Cn0KcmFkaXVzOiA4NzM2Mjg5Mi44NDA1OTc5Mwpwcm92ZW5hbmNlOiA2Cg==;")
			.log().all();
		
		
	}
	
	@Test
	void getCookiesInfo()
	{
		
		
		Response	res=given()
		
		
		.when()
		
			.get("https://www.google.com/");
		
		String cookie=res.getCookie("AEC");// to get single cookie value
		System.out.println(cookie);
		Map<String, String>cookies_values=res.getCookies();
		
		//System.out.println(cookies_value.keySet());//it will print all the key of map
		
		for(String k:cookies_values.keySet())
			
		{
				String cookie_value= res.getCookie(k);
				System.out.println(k+"       "+cookie_value);
		}
		
		
		
		
		
	}

}
