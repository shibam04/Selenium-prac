package excel1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writeexcel 
{
  public static void main(String[] args) throws IOException 
  {
	XSSFWorkbook workbook=new XSSFWorkbook();
	//XSSFSheet sheet=workbook.createSheet("Shibam");
	XSSFSheet sheet1=workbook.createSheet("Shibam1");
	
	Object arr[][]= {{"Username","password"},
			{"Admin","manager"},
			{"Admin1","teacher"}
	};
	int row=arr.length;
	int columns=arr[0].length;
	System.out.println(row);
	System.out.println(columns);
	for(int i=0;i<row;i++)
	{
		XSSFRow row1=sheet1.createRow(i);
		for(int j=0;j<columns;j++)
		{
			XSSFCell cell=row1.createCell(j);
			Object value=arr[i][j];
			if(value instanceof String)
				cell.setCellValue((String)value);
			if(value instanceof Integer)
				cell.setCellValue((Integer)value);
			if(value instanceof Boolean)
				cell.setCellValue((Boolean)value);
		}
	}
	 File src=new File("C:\\Users\\shiba\\OneDrive\\Desktop\\Actitime.xlsx");
	  FileOutputStream fs=new FileOutputStream(src);
	  workbook.write(fs);
	  fs.close();
	
}
}
