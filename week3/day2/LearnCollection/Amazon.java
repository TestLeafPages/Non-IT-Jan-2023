package LearnCollection;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);	
		List<WebElement> phonePrice = driver.findElements(By.className("a-price-whole"));
		List<Integer> newPrice=new ArrayList<Integer>();
		for(WebElement price:phonePrice)
		{
			String text = price.getText();
			String replace = text.replace(",", "");
			if(!replace.isBlank()) {
			int parseInt = Integer.parseInt(replace);
			newPrice.add(parseInt);
			}
		}
			
		System.out.println(newPrice);
		Integer max = Collections.max(newPrice);
		System.out.println(max);
		
		Integer min = Collections.min(newPrice);		
		System.out.println(min);
		
		Set<Integer> priceSet=new HashSet<Integer>(newPrice);
		
		System.out.println(priceSet);
		
		if(newPrice.size()==priceSet.size()) {
			System.out.println("No duplicates found");
		}else {
			System.out.println("Duplicates found");
		}
	}
	
	
	

}
