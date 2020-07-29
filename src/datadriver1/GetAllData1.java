package datadriver1;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetAllData1 {

	public static void main(String[] args) throws Exception {


		FileInputStream fis =new FileInputStream("E:\\RaviExcel.xlsx");
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		            
		          XSSFSheet sheet1 = wb.getSheetAt(0);
		          
		          
		        int count = sheet1.getLastRowNum();
		        
		        
		        System.out.println("Total count in a sheet is: " + count);
		        
		        
		        for(int i=0; i<count;i++)
		        {
		        	      String data2 = sheet1.getRow(i).getCell(0).getStringCellValue();
		        	      System.out.println(data2);
		        	       
		        	
		        }
		          
		          
		          
		
		
		
		

	}

}
