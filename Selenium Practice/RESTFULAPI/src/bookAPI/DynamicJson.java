package bookAPI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;



public class DynamicJson {
	@Test(dataProvider="BooksData")
	public void addBook(String isbn, String aisle)
	{
		RestAssured.baseURI="http://216.10.245.166";
		
		String rs=given()
		.header("Content-Type", "application/json")
		.body(Payload.AddBook(isbn,aisle))
		.when()
		.post("/Library/Addbook.php")
		.then()
		.log().all().extract().response().asString();
				
		JsonPath js= ReuseableMethods.RawToJSON(rs);
		System.out.println(js.getString("ID"));
				
	}
	@DataProvider(name="BooksData")
	public Object[][] getData()
	{
		 return new Object[][] {{"dfgn","5678"},{"hjkil","9087"},{"dfge","3421"}};
	}

}
