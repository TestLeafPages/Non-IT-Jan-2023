package week2day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.manager.SeleniumManager;



public class LaunchBrowser {

	public static void main(String[] args) {
	
		//System.setProperty("webdriver.chrome.driver", null);
			//WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();		
		/*
		 * EdgeDriver driver1=new EdgeDriver(); FirefoxDriver driver2 =new
		 * FirefoxDriver();
		 */		
		driver.get("http://www.google.com");
	  
	}

}
