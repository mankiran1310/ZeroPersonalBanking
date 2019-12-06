package com.datadriventests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import com.base.Page;
import com.pages.actions.AccountSummaryPage;
import com.pages.actions.HomePage;
import com.pages.actions.LoginPage;
import com.pages.actions.PayBillsPage;
import com.relevantcodes.extentreports.LogStatus;
import com.utilities.ExcelReader;


public class TC002_AddPayeeTest_data extends Page{
	
	@Test(dataProvider="payeeData")
	public void verifyAddNewPayee(String mypayeeName,String mypayeeAdd,String mypayeeAccNo,String mypayeeDetails) {
		
		Page.initConfiguration();
		test.log(LogStatus.INFO, "AddNewPayee Test started");
		HomePage hp = new HomePage();
		hp.clickSignIn();
		LoginPage lp=new LoginPage();
		lp.doLogin("username", "password");
		AccountSummaryPage asp=new AccountSummaryPage();
		asp.clickPayBills();
		PayBillsPage pb=new PayBillsPage();
		pb.addPayee(mypayeeName,mypayeeAdd,mypayeeAccNo,mypayeeDetails);
		
		String expectedAlert=pb.addPayeeSuccessAlert();
		String actualAlert="The new payee"+" " + mypayeeName + " " + "was successfully created.";
		Assert.assertEquals(actualAlert, expectedAlert);
		test.log(LogStatus.INFO,"AddNewPayee Test completed");
		Page.quitBrowser();
	}
     
	@DataProvider(name="payeeData")
	public Object[][] payeedata(){
		ExcelReader reader=new ExcelReader("/Users/buneetchandhok/Desktop/Testing/TestData.xlsx");
				int rows=reader.getRowCount(1);
				Object[][] data = new Object[rows][4];
				for(int i=0; i<rows; i++)
					{
				data[i][0]=reader.getData(1, i, 0);									                   
				data[i][1]=reader.getData(1, i, 1);
				data[i][2]=reader.getData(1, i, 2);
				data[i][3]=reader.getData(1, i, 3);
					}
				return data;

				}	
}
