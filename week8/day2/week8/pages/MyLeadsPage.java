package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClass;

public class MyLeadsPage extends BaseClass {

	public MyLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	public  CreateLeadPage clickOnCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();

		CreateLeadPage cp= new CreateLeadPage(driver);
		return cp;
	}
}
