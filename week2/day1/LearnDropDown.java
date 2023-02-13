package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		WebElement parentEle = driver.findElement(By.className("ui-selectonemenu"));
		
		//Select obj=new Select(WebElement)
		Select dd=new Select(parentEle);		
		dd.selectByIndex(0);
		dd.selectByVisibleText("Selenium");
		
		
		
		
		
		

	}

}
