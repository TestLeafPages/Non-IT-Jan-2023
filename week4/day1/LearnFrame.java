package week4day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		System.out.println(driver);
		
		  driver.get("https://www.leafground.com/frame.xhtml");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  //to handle frame 
		  WebDriver frame = driver.switchTo().frame(0);
		  WebElement
		  firstframeElement = driver.findElement(By.id("Click"));
		  firstframeElement.click(); System.out.println(firstframeElement.getText());
		  driver.switchTo().defaultContent();//to bring the control to main page
		  
		  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("CountFrames")
		  ;
		  
		  List<WebElement> noOfframe = driver.findElements(By.tagName("iframe"));
		  System.out.println(noOfframe.size());
		  
		  driver.switchTo().frame(1); WebElement secframeElement =
		  driver.findElement(By.id("Click"));
		  System.out.println(secframeElement.getText());
		  driver.switchTo().defaultContent();
		  
		  WebElement Outerframe =
		  driver.findElement(By.xpath("(//div[@class='card']//iframe)[3]"));
		  //switching to the outerframe in nested frame using frame as webElement
		  driver.switchTo().frame(Outerframe);
		  
		  //switch to the inner frame to click the webElement using attribute
		  driver.switchTo().frame("frame2");
		  driver.findElement(By.id("Click")).click();
		  
		  //takes to the immediate outer frame(parent frame) //
		  driver.switchTo().parentFrame();
		 
	}
}