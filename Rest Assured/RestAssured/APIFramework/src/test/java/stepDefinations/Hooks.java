package stepDefinations;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@DeletePlace")
	
	public void beforeScenario() throws IOException
	{
		stepDefination m = new stepDefination();
		
		if(stepDefination.placeID==null)
		{
		
		m.add_place_payload_with("kumar", "French", "ASIA");
		m.user_call_with_http_request("addPlaceAPI", "POST");
		m.verify_place_id_created_maps_to_using("kumar", "getPlaceAPI");
		
		}
	}
	

}
