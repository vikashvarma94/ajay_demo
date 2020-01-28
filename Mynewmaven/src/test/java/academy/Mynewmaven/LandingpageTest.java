package academy.Mynewmaven;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjectsmy.nxtmyleshomepage;
import resources.basicdriver;


	
	
	



public class LandingpageTest extends basicdriver {
	public static Logger log=	LogManager.getLogger(LandingpageTest.class.getName());
	@BeforeTest()
	public void validation() throws IOException
	{
		driver=driverwakeup();
		driver.get(prope.getProperty("url"));
		log.info("required url opened");
		
		
		
		
		
		
		
	}
	
	@AfterTest
	public void closeall()
	
	{
		
		driver.close();
	
		driver=null;
	}
	
	
	@Test
	public void landinginn() throws IOException, InterruptedException
	{
		
		
		

		
		nxtmyleshomepage hmee=new nxtmyleshomepage(driver);
		
		
		
		Thread.sleep(2000);
hmee.getsearchatruck().click();

		
		
		
		
		
		
		
		
	}
	
	
}
