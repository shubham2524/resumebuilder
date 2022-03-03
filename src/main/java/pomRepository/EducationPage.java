package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EducationPage {
	
	public EducationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[text()='Education']") private WebElement EducationModule;
	
	@FindBy(id = "University") private WebElement University;

	public WebElement getEducationModule() {
		return EducationModule;
	}

	public WebElement getUniversity() {
		return University;
	}
	
	public void selectUniversity() {
		Select select = new Select(University);
		select.selectByVisibleText("Delhi Technological University");
		}
		
	}
	

	

	

