package pageobjectsmy;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class nxtmylesloginpage {
	
	public nxtmylesloginpage(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	
	
	public WebDriver driver;
	private By login=By.xpath("//i[@class='fa fa-lock']");

	private By username=By.id("email");

	private By password=By.id("password");

	private By rememberpass=By.xpath("//input[type='checkbox']");

	private By signin=By.xpath("//input[@type='submit']");

	private By newregister=By.linkText("New Registration");

	private By forgotpass=By.linkText("Forgot Password?");


	
	
public WebElement getlogin() 
{
	
return driver.findElement(login);
	
	
}



public WebElement getusername()

{
	
return driver.findElement(username);
	
	
}
	

public WebElement getpass()

{
	
return driver.findElement(password);
	
	
}

public WebElement getremempass()

{
	
return driver.findElement(rememberpass);
	
	
}

public WebElement getsigningin() 
{
	
return driver.findElement(signin);
	
	
}

public WebElement getnewregister() 
{
	
return driver.findElement(newregister);
	
	
}

public WebElement forgotpassword() 
{
	
return driver.findElement(forgotpass);
	
	
}





}


