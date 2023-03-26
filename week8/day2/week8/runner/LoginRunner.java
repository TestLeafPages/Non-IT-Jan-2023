package runner;

import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class LoginRunner extends BaseClass{

	@Test
	public void  rundata() {
		LoginPage lp= new LoginPage(driver);
	lp.enterusername("DemoCsr").enterpassword("crmsfa").clickOnLoginButton();
	
	
	}
}
