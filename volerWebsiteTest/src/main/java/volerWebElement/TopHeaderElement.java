package volerWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TopHeaderElement {
public static WebElement element=null;

public static WebElement getLogin(WebDriver driver)
{
	element= driver.findElement(By.id("login-li"));
	return element;	
}

public static WebElement viewMyAccount(WebDriver driver)
{
	element=driver.findElement(By.xpath(".//*[@id='login-li']/ul/li/div/div[1]/a"));
	return element;	
}

public static WebElement clickMyAccount(WebDriver driver)
{
	element=driver.findElement(By.xpath(".//*[@id='login-li']/a"));
	return element;	
}


public static WebElement changeCity(WebDriver driver)
{
	element=driver.findElement(By.xpath(".//*[@id='bs-example-navbar-collapse-1']/ul[1]/li/a/span"));
	return element;	
}

public static WebElement savedAddressOption(WebDriver driver)
{
	element=driver.findElement(By.xpath(".//*[@class='bg-full-background white-bg-background']/div[2]/div[1]/div[1]/div[2]/ul/li[3]/a"));
	return element;	
}


}
