package resources;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutilitiesclass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream fiis=new FileInputStream("C:\\Users\\Vijay\\Documents\\Book1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fiis);
		
XSSFSheet sheet=workbook.getSheet("used one");

int rownum=sheet.getLastRowNum();
int colnum=sheet.getRow(0).getLastCellNum();
//System.out.println(rownum);
//System.out.println(colnum);


for(int i=0;i<=rownum;i++)
{
	XSSFRow row=sheet.getRow(i);
	for(int j=0;j<colnum;j++)
	{
		
	String cellvalue=	row.getCell(j).toString();
		
		System.out.print(cellvalue+" ");
		
		
	}
	
	System.out.println();
}



	}

}
