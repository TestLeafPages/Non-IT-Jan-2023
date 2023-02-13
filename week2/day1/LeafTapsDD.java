package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTapsDD {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		/*
		 * WebElement username = driver.findElement(By.id("username"));
		 * username.sendKeys("demosalesManager");
		 */
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select op=new Select(source);
		op.selectByIndex(1);
		
		op.selectByValue("LEAD_WEBSITE");
		
		op.selectByVisibleText("Existing Customer");

	}

}
