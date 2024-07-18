Feature: Validating Place API's
@AddPlace
Scenario Outline: Verify if place is being sussfully added using AddPlaceAPI
	Given Add Place Payload with "<name>" "<language>" "<address>"
	When  User call "addPlaceAPI" with "post" http request
	Then  the API call got success with status code as 200
	And   "status" in response body is "OK"
	And   "scope" in response body is "APP"	
	And   verify place_Id created maps to "<name>" using "getPlaceAPI" 
	
	Examples:
	
	|name   |language|address           |
	|AAHouse|English |world corss center|
	#|BBHouse|Spanish |Sea cross center  |
	
	@DeletePlace
	Scenario: Verify if Delete place functionality is working
			Given DeletePlace Payload
	    When User call "deletePlaceAPI" with "post" http request
	    Then  the API call got success with status code as 200
	    And   "status" in response body is "OK"
	    
	    