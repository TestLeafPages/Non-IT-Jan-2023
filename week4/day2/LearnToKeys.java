package week4day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnToKeys {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Actions act = new Actions(driver);

		driver.switchTo().frame(0);

		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));

		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));

		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));

		
		act.keyDown(Keys.CONTROL)
		.click(item1)
		.click(item2)
		.click(item4)
		.keyUp(Keys.CONTROL)
		.perform();
		
		
		//To take snapshot of whole page
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File destn=new File("./snap/shot.png");
		FileUtils.copyFile(screenshotAs, destn);
		
		//take snapshot of particular element
		File screenshot = item5.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snap/shot1.png");
		FileUtils.copyFile(screenshot, dest);
		
	}
	
	
	

}
