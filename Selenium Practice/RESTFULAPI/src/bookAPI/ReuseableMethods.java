package bookAPI;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class ReuseableMethods {
	
	public static JsonPath RawToJSON(String response)
	{
		JsonPath js= new JsonPath(response);
		return js;
	}

}
