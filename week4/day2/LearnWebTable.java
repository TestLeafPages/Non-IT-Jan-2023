package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {

		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//retreived data from the first row and second column of header data
		String text = driver.findElement(By.xpath("//table[@role='grid']/thead/tr/th[2]/span")).getText();
		System.out.println(text);
		
		//retrieved the particular data from 3rd row and 2nd column
		String text2 = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr[3]/td[2]/span[3]")).getText();
		System.out.println(text2);
		
		//to get the column count respective to 1 row
		List<WebElement> columndata = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr[1]/td"));
		int Colsize = columndata.size();
		System.out.println("Size of Columns repective to 1 row  " +Colsize);
		
		//to get the row count of the table
		List<WebElement> rowData = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr"));
		int rsize = rowData.size();
		System.out.println("Number of rows in the table " +rsize +" ");
		
		List<String> collist=new ArrayList<String>();
		
		//to get the all data from 1st colum 		
		for(int i=1;i<=rsize;i++) {
			String firstColumdata = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr["+i+"]/td[2]")).getText();
			//System.out.println(firstColumdata);//1,2,..10
			collist.add(firstColumdata);
					}
		
					/*
					 * Set<String> uniqueColData=new HashSet<String>(collist);
					 * if(collist.size()==uniqueColData.size()) {
					 * System.out.println("No duplicates"); } else {
					 * System.out.println("Found duplicates"); }
					 */
		
		
		//to reterive the data from all columns of particular row
		
		for(int i=1;i<=Colsize;i++) {			
			String allColdata = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr[1]/td["+i+"]")).getText();
			System.out.println(allColdata);
		}
		
		System.out.println("*****************************************");
		
		//to reterive all the rows and col data
		for(int i=1;i<=rsize;i++) {
			for(int j=1;j<=Colsize;j++) {
				String allrowandCol=driver.findElement(By.xpath("//table[@role='grid']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(allrowandCol);
			}
		}
		
		
	}

}
