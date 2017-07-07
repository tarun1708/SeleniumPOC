package admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class home {
public static WebElement element=null;

public static WebElement myAccount(WebDriver driver)
{
	element= driver.findElement(By.id("login-li"));
	return element;	
}
}
