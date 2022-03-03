package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryPage {
	
	
		
		public SummaryPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath="//button[text()='Summary']") private WebElement SummaryModule;

		@FindBy(xpath="//div[@class='input-data']") private WebElement SummaryTextField;

		public WebElement getSummaryModule() {
			return SummaryModule;
		}

		public WebElement getSummaryTextField() {
			return SummaryTextField;
		}
		
		

		


}


