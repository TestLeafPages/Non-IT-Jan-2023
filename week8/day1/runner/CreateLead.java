package runner;

import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.LoginPage;

public class CreateLead extends BaseClass{

	@Test
	public void  createlead() {
		
	LoginPage lp= new LoginPage(driver);	
	lp.enterusername("DemoCsr").enterpassword("crmsfa").clickOnLoginButton()
	.clickOnCrmsfa().clickOnLeads().clickOnCreateLead()
	.enterCompanyName().enterFirstName().enterLastName()
	.clickCreateLeadButton().verifyFirstName();
		
		
		
		
	}
}
