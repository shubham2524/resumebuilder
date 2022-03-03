package pomRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FinalPage {
	public FinalPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[text()='Download as']") private WebElement DownloadButton;
	@FindBy(xpath="//button[text()='PDF']") private WebElement pdfButton;

	public WebElement getDownloadButton() {
		return DownloadButton;
	}
	
	public WebElement getPdfButton() {
		return pdfButton;
	}
	
	@FindBy(xpath="//button[text()='WORD']") private WebElement wordButton;

	public WebElement getWordButton() {
		return wordButton;
	}

}
