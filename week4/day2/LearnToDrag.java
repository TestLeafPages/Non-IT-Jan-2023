package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnToDrag {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement drag = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
	
	
		Actions opt=new Actions(driver);
		
		opt.dragAndDropBy(drag, 200, 300).perform();
		
		WebElement dragtarget = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement droptarget = driver.findElement(By.xpath("//span[text()='Droppable Target']"));
		
		opt.dragAndDrop(dragtarget, droptarget).perform();
	
	
	
	
	}

}
