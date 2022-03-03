package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectDetailsPage {
	
	public ProjectDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[text()='ProjectDetails']") private WebElement ProjectDetailsModule;
	
	@FindBy(xpath="(//div[@class='input-data'])[1]") private WebElement ProjectName;
	
	@FindBy(xpath = "//input[@placeholder='Design Patterns']") private WebElement designPatternlistBox;

	@FindBy(xpath = "//li[text()='Singleton']") private WebElement designOption;

	public WebElement getProjectDetailsModule() {
		return ProjectDetailsModule;
	}

	public WebElement getProjectName() {
		return ProjectName;
	}

	public WebElement getDesignPatternlistBox() {
		return designPatternlistBox;
	}

	public WebElement getDesignOption() {
		return designOption;
	}
	

	


	
	

	
	
	
	
	

	


	


}
