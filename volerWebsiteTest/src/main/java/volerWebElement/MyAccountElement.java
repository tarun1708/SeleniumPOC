package volerWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class MyAccountElement {
	public static WebElement changePassword = null;
	public static WebElement editDetails = null;
	public static WebElement backButton = null;
	
	public static WebElement changePasswordElement(WebDriver driver) {
		changePassword = driver.findElement(By.xpath("html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[4]/div/a[1]"));
		return changePassword;
	}
	
	public static WebElement editDetailsElement(WebDriver driver) {
		editDetails = driver.findElement(By.xpath("html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[4]/div/a[2]"));
		return editDetails;
	}
	
	public static WebElement editDetailsBackElement(WebDriver driver) {
		backButton = driver.findElement(By.xpath("html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/div/a"));
		return backButton;
	}
	
	
	
	
	
}
