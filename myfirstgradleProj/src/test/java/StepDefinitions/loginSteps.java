package StepDefinitions;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageClasses.gmailLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
	
	public static WebDriver driver;
	gmailLoginPage gmailLoginpage;
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("inside Given step");
	    System.setProperty("webdriver.chrome.driver", "G:\\selenium_jars\\chromedriver_win32\\chromedriver_win32 (2)\\chromedriver.exe");
	    driver=new ChromeDriver();
	    gmailLoginpage = new gmailLoginPage(driver);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@When("user enters the {string} and {string}")
	public void user_enters_the_and(String userID, String password) {
		
		System.out.println("Inside When step");
		System.out.println(userID);
		System.out.println("driver :"+driver);
		gmailLoginpage.clickNext(userID,password);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside And step");
		gmailLoginpage.loginToPage();
	}

	@Then("user should be navigated to the home page")
	public void user_should_be_navigated_to_the_home_page() {
		System.out.println("inside Then step");
	}

}
