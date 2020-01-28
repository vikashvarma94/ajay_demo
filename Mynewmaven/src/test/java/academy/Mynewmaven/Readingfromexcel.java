package academy.Mynewmaven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFName;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Readingfromexcel {
	@Test
	public static void exceldata() throws IOException
	{
		FileInputStream fiss=new FileInputStream("C:\\Users\\Vijay\\Documents\\Book1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fiss);
		 
int	sheetcount=workbook.getNumberOfSheets();

for(int i=0;i<sheetcount;i++)
{
	
	if(workbook.getSheetName(i).equalsIgnoreCase("used one"))
	{

		XSSFSheet sheetname=workbook.getSheetAt(i);
		
	Iterator <Row> rows=sheetname.iterator();
	Row firstrow=rows.next();
Iterator <Cell> cellvalue=	firstrow.cellIterator();
int k=0;
int coloumn=0;
while(cellvalue.hasNext())
{
	Cell value=cellvalue.next();
	if(value.getStringCellValue().equalsIgnoreCase("postcode"))
	{
		
		coloumn=k;
		
		
		
		
	}
	
	k++;
	
	
	
}

System.out.println(coloumn);
		
while(rows.hasNext());
{
	
Row rr=rows.next();

if(rr.getCell(coloumn).getStringCellValue().equalsIgnoreCase("ajay"))
{
	
Iterator <Cell> ccvv=rr.cellIterator();

while(ccvv.hasNext())
{
System.out.println(ccvv.next().getStringCellValue());
	
	
	
	
}
	
	
	
	
}
	
	
}
		
}
	
	
		
		
	
	
	}
	
	
	

	}
}