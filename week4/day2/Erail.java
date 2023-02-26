package week4day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) {

		ChromeDriver driver =new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//From station
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MAS" , Keys.ENTER);
		
		
		//To station
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MDU" , Keys.ENTER);
		
		
		//click on sort on date
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		//get the trains
		driver.findElement(By.id("buttonFromTo")).click();
		
		//to retreieve the trainNames
		List<WebElement> trainNames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
		
		//method 1
		for (WebElement tname : trainNames) {
			System.out.println(tname.getText());
					}
		
		//Method:2		
		/*
		 * for(int i=2;i<trainNames.size();i++) {
		 * 
		 * String tname=driver.findElement(By.
		 * xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["
		 * +i+"]/td[2]")).getText();
		 * 
		 * System.out.println(tname); }
		 */
		
		
		
		
		
		
	}

}
