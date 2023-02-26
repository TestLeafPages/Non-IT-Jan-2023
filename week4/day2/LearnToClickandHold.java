package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnToClickandHold {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act= new Actions(driver);
		
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		
		int x = item4.getLocation().getX();
		int y = item4.getLocation().getY();
		
		act.clickAndHold(item1).dragAndDropBy(item1, x, y).perform();
		

		
	}

}
