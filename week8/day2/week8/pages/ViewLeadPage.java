package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClass;

public class ViewLeadPage extends BaseClass{

	public ViewLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	
	public ViewLeadPage verifyFirstName() {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	if(text.contains("Dilip")) {
		System.out.println("passed");
	}else {
		System.out.println("not passsed");
	}
	
	return this;
	
	}
	
}
