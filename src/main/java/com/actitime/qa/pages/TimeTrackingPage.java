package com.actitime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.qa.base.TestBase;

public class TimeTrackingPage extends TestBase {
	
		 @FindBy(xpath = "//div[@id='logo_aT']")
		    WebElement actitimeLogo;
	
		 @FindBy(xpath = "//*[@id=\"topnav\"]/tbody/tr[2]/td[2]/div[4]/a")
		    WebElement approveTimeTrackLink;
		 
		 @FindBy(xpath = "//*[@id=\"approveButton\"]")
		    WebElement approveButton;
		    
		 @FindBy(xpath = "//*[@id=\"rejectButton\"]")
		    WebElement rejectBtn;
		    
		 @FindBy(xpath = "//*[@id=\"topnav\"]/tbody/tr[2]/td[2]/div[1]/a")
		    WebElement enterTimeTrackLink;
		    
		 @FindBy(xpath = "//*[@id=\"enterTTMainContent\"]/table[1]/tbody/tr[1]/td[2]/div[2]/div[2]/div/table/tbody/tr/td[4]")
		    WebElement approvalSwitch;
	 

		public Boolean validateActiTimeLogo() {
				return actitimeLogo.isDisplayed();
		}
		 
		public Boolean clickOnApproveTimeTrack() {
		    	return approveTimeTrackLink.isDisplayed();
		}

	    public Boolean approveButtonValidation() {
	    	approveTimeTrackLink.click();
			if(approveButton.isDisplayed()) {
				return true;
			}else {
				return false;
			}
		}
	    
	    public Boolean rejectBtnValidation() {
	    	approveTimeTrackLink.click();
			if(rejectBtn.isDisplayed()) {
				return true;
			}else {
				return false;
			}
		}
	    
	    public Boolean clickOnEnterTimeTrack() {
	    	return enterTimeTrackLink.isDisplayed();
		}
	    
	    public Boolean approveSwitchValidation() {
	    	enterTimeTrackLink.click();
			if(approvalSwitch.isDisplayed()) {
				return true;
			}else {
				return false;
			}
		}

}
