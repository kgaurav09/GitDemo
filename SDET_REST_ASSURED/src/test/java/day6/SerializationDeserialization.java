package day6;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class SerializationDeserialization {
	@Test
	public void ConvertPOJO2JSON() throws JsonProcessingException
	
	{
		Student s= new Student();
		
		s.setName("scott");
		s.setLocation("pune");
		s.setPhone("12345678");
		String courceArr[]={"c","java"};
		s.setCources(courceArr);
		
		//convert java object to json object(Serilization)
		
		ObjectMapper objmapper= new ObjectMapper();
		
		String jsondata=objmapper.writerWithDefaultPrettyPrinter().writeValueAsString(s);
		
		System.out.println(jsondata);
	}
	@Test()
	void ConvertJSON2POJO()
	{
		String jsondata="{\r\n"
				+ "  \"name\" : \"scott\",\r\n"
				+ "  \"location\" : \"pune\",\r\n"
				+ "  \"phone\" : \"12345678\",\r\n"
				+ "  \"cources\" : [ \"c\", \"java\" ]\r\n"
				+ "}";
		
		
		ObjectMapper objmapper= new ObjectMapper();
		
		try {
			Student std=objmapper.readValue(jsondata, Student.class);
			System.out.println("name  "+std.getName());
			System.out.println("location  "+std.getLocation());
			System.out.println("phone  "+std.getPhone());
			System.out.println("cource name   "+std.getCources()[0]);
			System.out.println("cource name   "+std.getCources()[1]);
			
			
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
