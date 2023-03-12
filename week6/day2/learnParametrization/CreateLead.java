package learnParametrization;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{
	String[][] data;
	
	@Test(dataProvider="CreateLead")
		public void runCreate(String cname,String fname,String lname,String phno) {		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();
		
	}
	
	@DataProvider(name="CreateLead")
	public String[][] sendData() {	
		data=new String[2][4];
		
		data[0][0]="TL";
		data[0][1]="Vidya";
		data[0][2]="R";
		data[0][3]="99";
		
		
		data[1][0]="TCS";
		data[1][1]="Raji";
		data[1][2]="L";
		data[1][3]="99";
		
		
		return data;
		
	}
	
	
	
	
	
}






