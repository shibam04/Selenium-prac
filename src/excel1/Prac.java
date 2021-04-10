package excel1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Prac 
{
      @DataProvider(name="browser")
	  public String[][] excel1() throws IOException
	  {
		 String[][] value;
		 File src=new File("C:\\Users\\shiba\\OneDrive\\Desktop\\Browser.xlsx");
		 FileInputStream fis=new FileInputStream(src);
		 XSSFWorkbook workbook=new XSSFWorkbook(fis);
		 XSSFSheet sheet=workbook.getSheet("Browser");
		 int rows=sheet.getLastRowNum();
		 int columns=sheet.getRow(0).getLastCellNum();
		 System.out.println(rows);
		 System.out.println(columns);
		 value=new String[rows][columns];
		 for(int i=1;i<=rows;i++)
		 {
			 XSSFRow row=sheet.getRow(i);
			 for(int j=0;j<columns;j++)
			 {
				 XSSFCell columns1=row.getCell(j);
				 value[i-1][j]=columns1.toString();
			 }
		 }
		 return value;
}
      @Test(dataProvider="browser")
      public void browser1(String name)
      {
    	  System.out.println(name);
      }
}