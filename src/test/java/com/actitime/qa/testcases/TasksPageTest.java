package com.actitime.qa.testcases;

import com.actitime.qa.pages.TasksPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;
import com.actitime.qa.util.TestUtil;


public class TasksPageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    TasksPage tasksPage;
    String sheetName = "Users";
    TestUtil testUtil;

    public TasksPageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
        homePage.clickOnTaskLink();
        tasksPage = new TasksPage();
    }

    @Test(priority = 1)
    public void tasksPageLogoTest() {
        boolean flag= tasksPage.validateActiTimeLogo();
        Assert.assertTrue(flag);
    }

    @Test(priority = 2)
    public void tasksPageValidateCopyBtn() {
        boolean flag= tasksPage.validateCopyBtn();
        Assert.assertTrue(flag);
    }
    
    @Test(priority = 3)
    public void tasksPageValidateTaskMenu() {
        boolean flag= tasksPage.validateLeftMenu();
        Assert.assertTrue(flag);
    }

    @Test(priority = 4)
    public void tasksPageValidateTasks() {
        boolean flag= tasksPage.validateExistingTasks();
        Assert.assertTrue(flag);
    }
    
    @Test(priority = 5)
    public void tasksPageAddNewBtnValidation() {
        boolean flag= tasksPage.addNewBtnValidation();
        Assert.assertTrue(flag);
    }

    @AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}