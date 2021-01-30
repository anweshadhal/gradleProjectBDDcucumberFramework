package StepDefinitions;

import APIMethodsAutomation.APIGetMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class APISteps {
	
	APIGetMethod apiGetMethod = new APIGetMethod();
	
	@Given("user is given with the get method to be automated")
	public void user_is_given_with_the_get_method_to_be_automated() {
	    
	}

	@When("hit the get method")
	public void hit_the_get_method() {
		apiGetMethod.getRequest();
	}

	@Then("validate that the user should get response with the {int}")
	public void validate_that_the_user_should_get_response_with_the(Integer int1) {
	   
	}

}
