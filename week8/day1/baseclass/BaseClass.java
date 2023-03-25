package baseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	//parallel 
	public ChromeDriver driver;
	
	
	//public static ChromeDriver driver;
	//seql execution
	
	@BeforeMethod
	public void perCondition() {
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

		}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
		
	}

}
