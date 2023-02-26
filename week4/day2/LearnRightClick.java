package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnRightClick {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/menu.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement customers = driver.findElement(By.xpath("//span[text()='Customers']"));
		Actions act=new Actions(driver);	
		//right click on a element
		act.contextClick(customers).perform();		
		act.scrollByAmount(0, 120).perform();		
		act.scrollByAmount(0, -120).perform();
		

	}

}
