package stepDefinations;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
	
	@Given("^User is on landing page$")
	public void user_is_on_landing_page()  {
	   System.out.println("Landed on landing page");
	    
	}



	@When("User login to application with {string} and password {string}")
	public void user_login_to_application_with_and_password(String args1, String args2) {
	   System.out.println(args1);
	   System.out.println(args2);
	}




	@Then("^Homepage is populated$")
	public void homepage_is_populated()  {
		System.out.println("Logged in with valid user name and password");
	  
	}



	@Then("Cards displayed are {string}")
	public void cards_displayed_are(String c) {
	    System.out.println(c);
	}




	
	
	

}
