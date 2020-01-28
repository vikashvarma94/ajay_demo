package resources;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutilswritedata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Vijay\\Documents\\Book2.xlsx");
		
		XSSFWorkbook newbook=new XSSFWorkbook();
		XSSFSheet newsheet=newbook.createSheet("newsheet");
		
		for(int i=0;i<3;i++)
		{
			
			XSSFRow newrow=newsheet.createRow(i);
			for(int j=0;j<2;j++)
			{
				XSSFCell newcell=newrow.createCell(j);
				newcell.setCellValue("yes");
				
				
			}
			
			
		}
		newbook.write(fos);
		
		System.out.println("creating cells completed");
		
		

	}

}
