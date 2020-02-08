package academy.Mynewmaven;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjectsmy.nxtmylesloginpage;
import resources.Dataproviderutils;
import resources.basicdriver;

public class loginTest extends basicdriver {
	public static Logger log=	LogManager.getLogger(loginTest.class.getName());
	@BeforeTest()
	public void validation() throws IOException
	{
		driver=driverwakeup();
		driver.get(prope.getProperty("url"));
		
	}
	
	
	
	@AfterTest
	public void closeall()
	
	{
		
		driver.close();
		driver=null;
		
		
	}
	
	
	@Test(dataProvider="getids",dataProviderClass =Dataproviderutils.class)
	public void logincase(String username,String passward) throws IOException, InterruptedException
	{
		
		
		
		nxtmylesloginpage ln=new nxtmylesloginpage(driver);
		Thread.sleep(2000);
		
		ln.getlogin().click();
		log.info("clicked on login button");
	
		ln.getusername().sendKeys(username);
		log.error("this is error");
		ln.getpass().sendKeys(passward);
		log.info("filling required feilds");
		Thread.sleep(2000);

		
		ln.getsigningin().click();
		log.info("clicked on go");
		
		
		
	}
	
	
	/*@DataProvider
	
	public Object[][] getids() throws Exception
	{
		String path="C:\\Users\\Vijay\\Documents\\Book1.xlsx";
		ExcelUtilsmy.setExcelFile(path, "used one");
		int rowcount=ExcelUtilsmy.getRowCount(path, "used one");
	int colnum=ExcelUtilsmy.getCellCount(path, "used one", rowcount);
	//System.out.println(rowcount);
	
	System.out.println(colnum);
		Object [][] data=new Object[rowcount][2];
		for(int rows=1;rows<=rowcount;rows++)
		{
		
			for(int cols=0;cols<colnum;cols++)
			{
				data[rows-1][cols]=ExcelUtilsmy.getCellData(path, "used one", rows, cols);
		
		//data[0][2]="normaluser";
		}
		

}
		return data;
	}*/
	
}

	
	
		
		
		

		
	
	
	
	
	

