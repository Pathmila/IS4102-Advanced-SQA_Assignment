package com.actitime.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;
import com.actitime.qa.pages.TimeTrackingPage;

public class TimeTrackingPageTest extends TestBase{
	TimeTrackingPage timeTrackingPage;
	LoginPage loginPage;
	HomePage homePage;
	
	
	public TimeTrackingPageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void seup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
		homePage.clickOnTimeTrackLinkLink();
		timeTrackingPage = new TimeTrackingPage();
	}
	
	@Test(priority = 1)
	public void TaskPageLogoTest() {
		
	boolean flag= timeTrackingPage.validateActiTimeLogo();
	Assert.assertTrue(flag,"Cannot find the Logo");
		
	}
	
	@Test(priority = 2)
	public void clickOnApproveTimeTrack() {		
	boolean flag= timeTrackingPage.clickOnApproveTimeTrack();
	Assert.assertTrue(flag);
		
	}
	
	@Test(priority = 3)
	public void approveButtonValidation() {		
	boolean flag= timeTrackingPage.approveButtonValidation();
	Assert.assertTrue(flag);
	}
	
	@Test(priority = 4)
	public void rejectBtnValidation() {		
	boolean flag= timeTrackingPage.rejectBtnValidation();
	Assert.assertTrue(flag);
	}
	
	@Test(priority = 5)
	public void clickOnEnterTimeTrack() {		
	boolean flag= timeTrackingPage.clickOnEnterTimeTrack();
	Assert.assertTrue(flag);
		
	}
	
	@Test(priority = 5)
	public void approveSwitchValidation() {		
	boolean flag= timeTrackingPage.approveSwitchValidation();
	Assert.assertTrue(flag);
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
}
