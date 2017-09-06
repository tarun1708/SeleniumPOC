package volerWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class adminWebElement {
	public static WebElement element=null;

	public static WebElement getEmailField(WebDriver driver)
	{
		element= driver.findElement(By.xpath(".//*[@id='sign_in_email']"));
		return element;	
	}
	public static WebElement getPasswordField(WebDriver driver)
	{
		element= driver.findElement(By.xpath(".//*[@id='sign_in_pass']"));
		return element;	
	}
	public static WebElement getLoginField(WebDriver driver)
	{
		element= driver.findElement(By.xpath(".//*[@id='login-form']/div[3]/div[3]/input"));
		return element;	
	}
	
	public static WebElement getInventoryField(WebDriver driver)
	{
		element= driver.findElement(By.id("invens"));
		return element;	
	}
	
	public static WebElement getCityField(WebDriver driver)
	{
		//Select cityoption=new Select(driver.findElement(By.id("bookingtype")));
		element= driver.findElement(By.id("bookingtype"));
		//cityoption.selectByValue("Vz79NtWO80");
		return element;	
	}
	
	public static WebElement getCheckField(WebDriver driver)
	{
		element= driver.findElement(By.xpath(".//*[@id='checkbtn']"));
		return element;	
	}
}
