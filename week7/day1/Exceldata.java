package learnParametrization;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata {

	public static String[][] readData(String filename,int sheetno) throws IOException {

		XSSFWorkbook book = new XSSFWorkbook("./data/"+filename+".xlsx");
		XSSFSheet sheet = book.getSheetAt(sheetno);
		book.getNumberOfSheets();
		XSSFRow row = sheet.getRow(0);
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		int cellCount = row.getLastCellNum();
		System.out.println(cellCount);
		
		String[][] data =new String[rowCount][cellCount];
		
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				// (1,0) (1,1)
				// (2,0) (2,1)
				String allDatas = sheet.getRow(i).getCell(j).getStringCellValue();
				//System.out.println(allDatas);
				//assigning the excel data to the string[][] array
				data[i-1][j]=allDatas; //(1,0) (1,1)(1,2)
				//i=1 -->i=0 -->i-1
				//data[0][0]="Testleaf"
				//(0,0) (0,1) (0,2)
			}
		}

		book.close();
		return data;
	}

}
