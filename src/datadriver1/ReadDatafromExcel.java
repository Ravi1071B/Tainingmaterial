package datadriver1;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDatafromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("E:\\RaviExcel.xlsx");
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
        XSSFSheet sheet = wb.getSheetAt(0);
       
        String data0= sheet.getRow(0).getCell(0).getStringCellValue();
            
           System.out.println("Data from excel sheet is :" + data0);
           
          String data1 = sheet.getRow(1).getCell(1).getStringCellValue();
          System.out.println(data1);
          
          wb.close();
           
		


		
	}

}
