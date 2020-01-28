package academy.Mynewmaven;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.ExcelUtilsmy;
import resources.basicdriver;

public class Xceltest extends basicdriver{

	
	@Test
	public static void xcelreader () throws Exception
	{
		
		driver=driverwakeup();
		driver.get("http://newtours.demoaut.com/");
		String path="C:\\Users\\Vijay\\Documents\\Book1.xlsx";
		
		
	int rowcount=ExcelUtilsmy.getRowCount(path, "used one");
	//int cellcount=ExcelUtilsmy.getCellCount(path, "used one", rowcount);
	
	
	for(int i=1;i<=rowcount;i++)
	{
	
	String username=ExcelUtilsmy.getCellData(path, "used one", i,0);	
	String password=ExcelUtilsmy.getCellData(path, "used one", i, 1);
	
	driver.findElement(By.name("userName")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	
	driver.findElement(By.name("login")).click();
	
	
	if(driver.getTitle().equals("Find a Flight: Mercury Tours:"))
	{
		
		System.out.println("valid user");
		
		
	}
	else
	{
	
		System.out.println("not valid");
				
	}
	
	driver.findElement(By.linkText("Home")).click();	
	}
	
	driver.close();
	}
	
	
	
}
