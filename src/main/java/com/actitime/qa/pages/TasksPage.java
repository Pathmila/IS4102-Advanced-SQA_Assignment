package com.actitime.qa.pages;

import com.actitime.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class TasksPage extends TestBase {

    @FindBy(xpath = "//div[@id='logo_aT']")
    WebElement actTimeLogo;

    @FindBy(xpath = "//tr[@class='taskRow']")
    WebElement tasksList;

    @FindBy(xpath = "//div[contains(@class, 'allCustomersNode')]")
    WebElement taskleftMenu;

    @FindBy(xpath = "//div[@class='copyTo']")
    WebElement taskcopyButton;
    
    @FindBy(xpath = "//*div[@class='title ellipsis']")
    WebElement titleEllipsis;
    
    @FindBy(xpath = "//div[@class='item createNewCustomer']")
    WebElement createNewCustomer;
    
    public TasksPage() {
        PageFactory.initElements(driver, this);
    }

    public Boolean validateActiTimeLogo() {
        return actTimeLogo.isDisplayed();
    }

    public Boolean validateExistingTasks(){
        return tasksList.isDisplayed();
    }

    public Boolean validateLeftMenu(){
        return taskleftMenu.isDisplayed();
    }
    
    public Boolean validateCopyBtn(){
        return taskcopyButton.isDisplayed();
    }
    
    public Boolean addNewBtnValidation() {
    	titleEllipsis.click();
		if(createNewCustomer.isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}
	
    
}