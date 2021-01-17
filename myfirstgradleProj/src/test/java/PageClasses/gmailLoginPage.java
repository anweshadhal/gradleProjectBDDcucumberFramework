package PageClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import StepDefinitions.loginSteps;

public class gmailLoginPage {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement userID;

	@FindBy(xpath="//*[@id=\"pass\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"u_0_b\"]")
	WebElement submitButton;
	
	

    public gmailLoginPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

	public void clickNext(String userID2,String password1) {
		
		System.out.println("driver :"+driver);
		userID.click();
		userID.sendKeys(userID2);
		password.click();
		password.sendKeys(password1);
		
	}
	
	public void loginToPage()
	{
		submitButton.click();
	}
}
