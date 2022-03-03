package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillsPage {
	

	public SkillsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[text()='Skills']") private WebElement SkillsModule;
	
	@FindBy(xpath="//input[@placeholder='Frontend Technologies']") private WebElement FrontEnd;
	
	@FindBy(xpath="//li[text()='React js']")private WebElement frontEndOption;

	public WebElement getSkillsModule() {
		return SkillsModule;
	}

	public WebElement getFrontEnd() {
		return FrontEnd;
	}

	public WebElement getFrontEndOption() {
		return frontEndOption;
	}
	
	
	
	

	


}
