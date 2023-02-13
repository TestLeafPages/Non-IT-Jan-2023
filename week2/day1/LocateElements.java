package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElements {

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
		//to verify the title of the landed page
		String title = driver.getTitle();
		System.out.println(title);		
		//to close the current window
		
		
		
		
		
		driver.close();
	}

}
