package week4day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		System.out.println(driver);		
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		//give the address of the current opened window
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
				
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//hold the address of all the windows opened during action on webpage
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());		
		System.out.println(driver.getTitle());//returns the homepage title
		
		//to get the focus of the child windows/tab
		//step:2--.convert set to list
		
		List<String> wHandle=new ArrayList<String>(windowHandles);		
		//step:3 -switch to child window using list.get(index)
		driver.switchTo().window(wHandle.get(1));
		System.out.println(driver.getTitle());
		//get(0)-->homepage-->parentwindow
		driver.switchTo().window(wHandle.get(0));		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> winHandle = driver.getWindowHandles();//3
		for (String string : winHandle) {
			System.out.println(string);
		}		
		System.out.println(winHandle.size());
		List<String> wHandles=new ArrayList<String>(winHandle);	//3
				driver.switchTo().window(wHandles.get(3));	
		System.out.println(driver.getTitle());
		//close the current window
		driver.close();
		//close all the openend windows
		driver.quit();
		

		
		
		

		
		
		
		
		
		
	}

}
