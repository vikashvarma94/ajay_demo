package academy.Mynewmaven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import resources.basicdriver;

public class Goibiboclass extends basicdriver{

	@Test()
	public void goselection() throws IOException, InterruptedException
	{
		String title="https://www.goibibo.com/flights/flights-from-hyderabad/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Generic-Overall-Hyderabad-DT&utm_content=Online%20Ticket%20Booking&gclid=CjwKCAiA8qLvBRAbEiwAE_ZzPR2_OFY3kPm-S5aMxd4feP-k4odAE0yeyJx-DK1i-wBQz-VgyxG8pRoCUXkQAvD_BwE";
		driverwakeup();
		driver.get(title);
		WebElement fromdrop=driver.findElement(By.id("gi_source_st"));
		System.out.println(fromdrop.getText());
		fromdrop.clear();
		fromdrop.sendKeys("hy");
		Thread.sleep(2000);
		
		fromdrop.sendKeys(Keys.ARROW_DOWN);
		fromdrop.sendKeys(Keys.ARROW_DOWN);

		fromdrop.sendKeys(Keys.ENTER);
		fromdrop.click();
		System.out.println(fromdrop.getText());
		
		
		//Assertion newone=new Assertion();
		
		
		
		
		
		
		
	}
	
	
}
