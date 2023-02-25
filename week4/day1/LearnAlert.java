package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());		
		alert.accept();
		
		//confirmation
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		alert.dismiss();
		

		//prompt alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		alert.sendKeys("Testleaf");
		alert.accept();
		
		
		//sweet alert
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();		
        driver.findElement(By.xpath("//span[text()='Dismiss']")).click();		

	}

}
