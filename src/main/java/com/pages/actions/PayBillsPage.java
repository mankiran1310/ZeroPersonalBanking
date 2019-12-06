package com.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.base.Page;
import com.pages.locators.PayBillsPageLocators;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.support.ui.Select;

public class PayBillsPage extends Page{
	
	public PayBillsPageLocators pb;
	public PayBillsPage() {
		this.pb=new PayBillsPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.pb);
	}

	
	//method for add new payee
		public void addPayee(String mypayeeName,String mypayeeAdd,String mypayeeAccNo,String mypayeeDetails) {
			log.debug("click addpayee link");
			test.log(LogStatus.INFO, "clicking add payee link");
		 pb.addPayeeLink.click();
			log.debug("type payee name");
			test.log(LogStatus.INFO, "Entering payee name");
		pb.payeeName.sendKeys(mypayeeName);
			log.debug("type payee address");
			test.log(LogStatus.INFO, "Entering payee address");
		pb.payeeAdd.sendKeys(mypayeeAdd);
			log.debug("type account number");
			test.log(LogStatus.INFO, "Entering account number");
		pb.payeeAccNo.sendKeys(mypayeeAccNo);
			log.debug("type payee details");
			test.log(LogStatus.INFO, "Entering payee details");
		pb.payeeDetails.sendKeys(mypayeeDetails);
			log.debug("click add button");
			test.log(LogStatus.INFO, "clicking add button");
		pb.addPayeeBtn.click();
					
		}
		
		//method for getting success alert
		public String addPayeeSuccessAlert() {
		return	pb.addalert.getText();
		}
		//method for purchase foreign currency
		public void clickForeignCurrencyLink() {
			log.debug("click purchase foreing currency link");
			test.log(LogStatus.INFO, "Clicking purchase foreign currency");
		pb.foreignCurrencyLink.click();
			
		}
		
		public void foreignCurrency(String mypurchaseAmount)  {
			
			log.debug("click currency type");
			test.log(LogStatus.INFO, "selecting currency type");
		pb.purchaseCurrencyType.click();
			log.debug("read and print sell rate");
			test.log(LogStatus.INFO, "reading and printing sell rate");
		if(pb.sellRate.isDisplayed()==true) {
				String sr=pb.sellRate.getText();
			System.out.println("Sell Rate:"+sr);
			
			}
		    log.debug("type purchase amount");
		    test.log(LogStatus.INFO, "Entering purchase amount");
		pb.purchaseCurrencyAmount.sendKeys(mypurchaseAmount);
			log.debug("select radio button");
			test.log(LogStatus.INFO, "Selecting radio button");
		pb.usdRadioBtn.click();
			log.debug("read and print conversion amount");
			test.log(LogStatus.INFO, "Reading and printing conversion amount");
		if(pb.conversionAmount.isDisplayed()==true) {
				String ca=pb.conversionAmount.getText();
				System.out.println("Conversion Amount:"+ca);
			}
			log.debug("click purchase button");
			test.log(LogStatus.INFO, "Clicking purchase button");
		pb.purchaseBtn.click();
			
		}
		
		public void selectCurrencyType(int index) {
			
			Select currencyType=new Select(pb.purchaseCurrencyType);
			currencyType.selectByIndex(index);
		}
		
	public String foreignCurrencySuccessAlert() {
		return pb.purchaseSuccessAlert.getText();
	}
}
