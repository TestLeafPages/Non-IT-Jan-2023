package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	
	
	public LoginPage enterusername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
//after enter the username ,it should be retain in the page	
		return this;	
		
	}
	
	public LoginPage enterpassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

		return this;
	}
	
	public HomePage clickOnLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();

		//m-1
		
//		HomePage hp= new HomePage();
//		return hp;
		
		//m-2
		
		return new HomePage(driver);
		
	}
	
}
