package excelIntegration;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnToReadExcelData {

	public static void main(String[] args) throws IOException {
		
		LearnStatic.method1();
		//Step:1 ->set the path of Excel file
		
		XSSFWorkbook book=new XSSFWorkbook("./data/SampleData.xlsx");
				
		//Step:2 -->Read the data from the required sheet
		
		//book.getSheetAt(0)-->Sheet index starts with zero
		XSSFSheet sheet=book.getSheetAt(0);
		//XSSFSheet sheet = book.getSheet("EmpDetails");		
		//Step:3-->get into the row
		XSSFRow row = sheet.getRow(0); //entire second row in Excel sheet
		//Step:4 -->get into cell
		XSSFCell cell = row.getCell(0); //Reads the second column in excel sheet
		//(1,1)->(row,col)
		//Step :5 To read the value from the cell
		String stringCellValue = cell.getStringCellValue();		
		System.out.println(stringCellValue);
		
		//To read all the datas
		//To get the count of active cell
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		
		//to get the count of cell/col
		int cellCount = row.getLastCellNum();
		System.out.println(cellCount);
		
	   //To get the count of all rows including header 
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);		
		
		//Book-->sheet-->row-->cell-->value
		
		for(int i=0;i<=rowCount;i++) {			
			for(int j=0;j<cellCount;j++) {
				//(1,0) (1,1)
				//(2,0) (2,1)				
				String allDatas = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(allDatas);
			}
		}
		
	}

}
