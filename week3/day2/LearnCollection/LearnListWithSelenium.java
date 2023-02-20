package LearnCollection;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnListWithSelenium {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@name='keyword']")).sendKeys("SportsShoe",Keys.ENTER);

		List<WebElement> productList = driver.findElements(By.xpath("//p[@class='product-title']"));
		System.out.println(productList.size());
		
		for(WebElement shoe:productList) {
			String text = shoe.getText();
			System.out.println(text);
		}
		
		
		
		
	}

}
