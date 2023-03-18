package learnParametrization;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	String[][] data;

	@BeforeClass
	public void setfileName() {
		filename="Createleaddata";
		sheetno=0;
	}
	
	@Test(dataProvider = "fetchData", threadPoolSize = 2)
	public void runCreate(String cname, String fname, String lname, String phno) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();

	}
	// row and col
	// multiple datas and multiple categories
	// Empid EnmpName Address phone adhar no
	// Emp01 Bala XXX 91 YYYYYYYY
	// Emp02 Annapoorani WWW 63.. YYYYYY
	// Empo3

	/*
	 * @DataProvider(name="fetchData") public String[][] sendData() throws
	 * IOException {
	 * 
	 * //Integrate the Excel sheet
	 * 
	 * data=new String[2][4];
	 * 
	 * data[0][0]="TL"; data[0][1]="Vidya"; data[0][2]="R"; data[0][3]="99";
	 * 
	 * * data[1][0]="TCS"; data[1][1]="Raji"; data[1][2]="L"; data[1][3]="99";
	 * return data;
	 * 
	 * 
	 * //Exceldata data=new Exceldata(); //String[][] readData =
	 * Exceldata.readData(); //return readData; return
	 * Exceldata.readData("Createleaddata"); }
	 */

}
