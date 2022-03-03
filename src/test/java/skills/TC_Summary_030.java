package skills;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.EducationPage;
import pomRepository.FinalPage;
import pomRepository.ProfilePage;
import pomRepository.ProjectDetailsPage;
import pomRepository.SkillsPage;
import pomRepository.SummaryPage;

public class TC_Summary_030 extends Base_Class {
	
	
	@Test
	public void downloadResumePdf() throws InterruptedException {
		ExcelUtil excel= new ExcelUtil();
		String FirstName = excel.readStringDataFromExcel("Sheet1",0,0);
		String LastName = excel.readStringDataFromExcel("Sheet1",1,0);
		String Summary = excel.readStringDataFromExcel("Sheet1",3,0);
		String ExpectedTitle = excel.readStringDataFromExcel("Sheet1",4,0);
		
		
		
		Assert.assertEquals(driver.getTitle(),ExpectedTitle, "profile page is not displyed");
		Reporter.log("profile page displayed successfully",true);
		ProfilePage profile = new ProfilePage(driver);
	    profile.getFirstNmae().clear();
		profile.getFirstNmae().sendKeys(FirstName);
		profile.getLastName().clear();
		profile.getLastName().sendKeys(LastName);
		
		
		Assert.assertEquals(driver.getTitle(),ExpectedTitle, "Summary page is not displayed");
		Reporter.log("Summary displayed successfully",true);
		SummaryPage summary = new SummaryPage(driver);
		summary.getSummaryModule().click();
		summary.getSummaryTextField().click();
		Actions actions=new Actions(driver);
		actions.sendKeys(Summary).click().perform();
		
		Assert.assertEquals(driver.getTitle(),ExpectedTitle, "Skills page is not displyed");
		Reporter.log("Skills page displayed successfully",true);
		SkillsPage  skills = new SkillsPage(driver);
		skills.getSkillsModule().click();
		skills.getFrontEnd().click();
		skills.getFrontEndOption().click();
		
		

		Assert.assertEquals(driver.getTitle(),ExpectedTitle, "Educations page is not displyed");
		Reporter.log("Education page displayed successfully",true);
		EducationPage education = new EducationPage(driver);
		education.getEducationModule().click();
		education.selectUniversity();
		
		Assert.assertEquals(driver.getTitle(),ExpectedTitle, "Project Details page is not displyed");
		Reporter.log("project details page displayed successfully",true);
		ProjectDetailsPage project = new ProjectDetailsPage(driver);
		project.getProjectDetailsModule().click();
		explicitWait.until(ExpectedConditions.elementToBeClickable(project.getDesignPatternlistBox()));
		project.getDesignPatternlistBox().click();
		project.getDesignOption().click();
		
		Assert.assertEquals(driver.getTitle(),ExpectedTitle, "Resume not downloaded in  format");
		Reporter.log("Resume downloaded successfully in pdf format",true);
		FinalPage finalPage= new FinalPage(driver);
		Thread.sleep(2000);
		actions.moveToElement(finalPage.getDownloadButton()).click().perform();
		finalPage.getPdfButton().click();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
