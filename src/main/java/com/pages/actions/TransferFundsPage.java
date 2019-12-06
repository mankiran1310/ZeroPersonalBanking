package com.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.Page;
import com.pages.locators.TransferFundsPageLocators;
import com.relevantcodes.extentreports.LogStatus;

public class TransferFundsPage extends Page {
	
	public TransferFundsPageLocators tf;
	public TransferFundsPage() {
		this.tf=new TransferFundsPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.tf);
	}

	
	public void transferFundsInfo(String mytfAmount,String mydescription) {
		log.debug("click from account dropdown");
		test.log(LogStatus.INFO, "clicking from account dropdown");
	tf.tffromAccount.click();
		log.debug("click to account dropdown");
		test.log(LogStatus.INFO, "clicking to account dropdown");
	tf.tftoAccount.click();
		log.debug("type transfer amount");
		test.log(LogStatus.INFO, "Entering transfer amount");
	tf.tfAmount.sendKeys(mytfAmount);
		log.debug("type description");
		test.log(LogStatus.INFO, "Entering description");
	tf.tfdescription.sendKeys(mydescription);
		log.debug("click continue button");
		test.log(LogStatus.INFO, "clicking continue button");
	tf.tfContinuebtn.click();
		log.debug("click submit button");
		test.log(LogStatus.INFO, "clicking submit button");
	tf.tfSubmitbtn.click();
	
	}
	
	public void selectFromAccount(int index) {
		log.debug("select from account");
		test.log(LogStatus.INFO, "Selecting from account");
	Select fromAccount=new Select(tf.tffromAccount);
	fromAccount.selectByIndex(index);
	}
	
	public void selectToAccount(int index) {
		log.debug("select to account");
		test.log(LogStatus.INFO, "Selecting to account");
		Select toAccount=new Select(tf.tftoAccount);
		toAccount.selectByIndex(index);	
	}
	
	public String successAlert() {
		return tf.tfSuccessAlert.getText();
	}
	
}
