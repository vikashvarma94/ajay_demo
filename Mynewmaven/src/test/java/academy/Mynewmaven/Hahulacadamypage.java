package academy.Mynewmaven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.basicdriver;




public class Hahulacadamypage extends basicdriver {
	
	

	@Test
	public static void newrahulTest() throws IOException
	{
		
		
		driver=driverwakeup();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		
		System.out.println(driver.findElement(By.xpath("//h4[contains(text(),'Brocolli - 1 Kg')]")).getText());
		
		
		
		
		
		
		
	}
	
		
	
	
	

}
