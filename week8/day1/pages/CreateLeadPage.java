package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClass;

public class CreateLeadPage extends BaseClass{

	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	
	
	
	
	public CreateLeadPage enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
return this;
	}

	public CreateLeadPage enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dilip");
return this;
	}


	public CreateLeadPage enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
return this;
	}

	public ViewLeadPage clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();

		return new ViewLeadPage(driver);
	}

	
	
	
	
	
	
	
}
