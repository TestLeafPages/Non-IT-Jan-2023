package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learntohover {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement mens = driver.findElement(By.xpath("//a[text()='Men']"));
		WebElement tshirt = driver.findElement(By.xpath("//a[text()='T-Shirts']"));
		//Instantiate the actions class to AUI
		Actions build=new Actions(driver);
		//mouse hover the webElement
		//build.moveToElement(mens).perform();		
		build.moveToElement(mens).click(tshirt).perform();
		
	}

}
