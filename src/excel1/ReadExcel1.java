package excel1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcel1 
{
	@DataProvider
  public static String[][] data() throws IOException
  {
	 String arr[][];
	  File src=new File("C:\\Users\\shiba\\OneDrive\\Desktop\\Actitime.xlsx");
	  FileInputStream fs=new FileInputStream(src);
	  XSSFWorkbook w=new XSSFWorkbook(fs);
	  XSSFSheet sheet=w.getSheet("Shibam1");
	  int row=sheet.getLastRowNum();
	  int column=sheet.getRow(1).getLastCellNum();
	  System.out.println(row);
	  System.out.println(column);
	  arr=new String[row][column];
	  for(int i=1;i<=row;i++)
	  {
		  XSSFRow row1=sheet.getRow(i);
		  for(int j=0;j<column;j++)
		  {
			  XSSFCell cells=row1.getCell(j);
			  arr[i-1][j]=cells.toString();
		  }
		  
	  }
	return arr;
  }
	@Test(dataProvider="data")
	public void tc1(String user,String pass)
	{
		System.out.println("USER:"+user);
		System.out.println("Password:"+pass);
	}
	
}
