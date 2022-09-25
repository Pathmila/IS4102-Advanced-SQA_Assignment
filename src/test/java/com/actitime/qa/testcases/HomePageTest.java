package com.actitime.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;

public class HomePageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	public HomePageTest() {
		super();
		
	}

	@BeforeMethod
	public void seup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
	}
	
	
	@Test(priority = 1)
	public void homePageLogoTest() {
		
	boolean flag= homePage.validateActiTimeLogo();
	Assert.assertTrue(flag,"Cannot find the Logo");
		
	}
	
//	@Test(priority = 2)
//	public void clickOnApproveTimeTrack() {		
//	boolean flag= homePage.clickOnApproveTimeTrack();
//	Assert.assertTrue(flag);
//		
//	}
	
//	@Test(priority = 3)
//	public void approveButtonValidation() {		
//	boolean flag= homePage.approveButtonValidation();
//	Assert.assertTrue(flag);
//	}
//	
//	@Test(priority = 4)
//	public void rejectBtnValidation() {		
//	boolean flag= homePage.rejectBtnValidation();
//	Assert.assertTrue(flag);
//	}
//	
//	@Test(priority = 5)
//	public void clickOnEnterTimeTrack() {		
//	boolean flag= homePage.clickOnEnterTimeTrack();
//	Assert.assertTrue(flag);
//		
//	}
//	
//	@Test(priority = 5)
//	public void approveSwitchValidation() {		
//	boolean flag= homePage.approveSwitchValidation();
//	Assert.assertTrue(flag);
//	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
}