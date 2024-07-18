package bookAPI;

public class Payload {
	
	public static String AddBook(String isbn, String aisle)
	{
		String addbookPayload="{\r\n"
				+ "\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\""+isbn+"\",\r\n"
				+ "\"aisle\":\""+aisle+"\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "}";
		return addbookPayload;
	}

}
