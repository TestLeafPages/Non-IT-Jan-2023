package learnParametrization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseClass {

	public RemoteWebDriver driver;
	
	
	@BeforeSuite
	public void cloudConection() {
		System.out.println("Establish the connection");
	}
	
	@AfterSuite
	public void disConnect() {
		System.out.println("End the connection");
	}
	@Parameters({"browser","url","username","password"})
	@BeforeMethod
	public void preCondition(String browser,String url,String username,String password) throws InterruptedException {		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		if(browser.equalsIgnoreCase("chrome")) 
		{
	    driver= new ChromeDriver(options);
	    }else if(browser.equalsIgnoreCase("edge"))
	    {
		driver=new EdgeDriver();
	    }
		System.out.println(Thread.currentThread().getId());
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	
}
