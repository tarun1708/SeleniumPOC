package volerWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopHeaderElement {
public static WebElement element=null;

public static WebElement getLogin(WebDriver driver)
{
	element= driver.findElement(By.id("login-li"));
	return element;	
}

public static WebElement viewMyAccount(WebDriver driver)
{
	element=driver.findElement(By.xpath(".//*[@id='login-li']/ul/li/div/div[1]/span/a"));
	return element;	
}

public static WebElement clickMyAccount(WebDriver driver)
{
	element=driver.findElement(By.xpath(".//*[@id='login-li']/a"));
	return element;	
}

}
