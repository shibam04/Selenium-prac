package excel1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{
   public static void main(String[] args) throws IOException 
   {
	  File src=new File("C:\\Users\\shiba\\OneDrive\\Desktop\\Actitime.xlsx");
	  FileInputStream fs=new FileInputStream(src);
	  XSSFWorkbook w=new XSSFWorkbook(fs);
	  XSSFSheet sheet=w.getSheet("Shibam1");
	  int row=sheet.getLastRowNum();
	  int column=sheet.getRow(1).getLastCellNum();
	  System.out.println(row);
	  System.out.println(column);
	  for(int i=1;i<=row;i++)
	  {
		  XSSFRow row1=sheet.getRow(i);
		  for(int j=0;j<column;j++)
		  {
			  XSSFCell cells=row1.getCell(j);
			  System.out.print(cells);
			  System.out.print(" ");
		  }
		  System.out.println();
	  }
	  
   }
   
}
