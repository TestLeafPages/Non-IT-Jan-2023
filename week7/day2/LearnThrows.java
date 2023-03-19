package learnExceptionHandling;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnThrows {

	public static void main(String[] args) throws IOException {
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		
		File shot = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./shot/snap.png");
		FileUtils.copyFile(shot, dest);
		
	}

}
