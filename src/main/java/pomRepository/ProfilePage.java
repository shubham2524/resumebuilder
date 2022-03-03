package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	
	public ProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[text()='Profile']") private WebElement ProfileModule;
	
	@FindBy(xpath = "//input[@value=\"FirstName\"]") private WebElement FirstNmae;
	
	@FindBy(xpath = "//input[@value=\"LastName\"]") private WebElement LastName;
	
	

	public WebElement getLastName() {
		return LastName;
	}


	public WebElement getProfileModule() {
		return ProfileModule;
	}


	public WebElement getFirstNmae() {
		return FirstNmae;
	}


}