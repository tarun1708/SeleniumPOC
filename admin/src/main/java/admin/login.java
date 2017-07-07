package admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
	public static WebElement userelement = null;
	public static WebElement pwdelement = null;
	public static WebElement loginbuttonelement = null;

	public static WebElement userName(WebDriver driver) {
		userelement = driver.findElement(By.id("sign_in_email"));
		return userelement;
	}

	public static WebElement password(WebDriver driver) {
		pwdelement = driver.findElement(By.id("sign_in_pass"));
		return pwdelement;
	}

	public static WebElement loginbutton(WebDriver driver) {
		loginbuttonelement = driver.findElement(By.xpath(".//*[@id='login-form']/div/div[3]/input"));
		return loginbuttonelement;
	}
}