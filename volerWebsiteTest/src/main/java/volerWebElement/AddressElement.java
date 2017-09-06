package volerWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressElement {
	public static WebElement element=null;
	public static List<WebElement> listItem;

	public static WebElement noAddress(WebDriver driver)
	{
		element= driver.findElement(By.xpath(".//*[@id='myacc-noadd-found']/div/div[2]/div[1]"));
		return element;	
	}
	
	public static WebElement addMoreAddressBtn(WebDriver driver)
	{
		element= driver.findElement(By.xpath(".//*[@id='myacc-addnew-address-btn']"));
		return element;	
	}
	
	public static WebElement addNewAddressBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='add-notfound-btn']"));
		return element;
	}
	
	public static WebElement addressTitle(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='ADDRESS_TAG']"));
		return element;
	}
	
	public static WebElement streetAddress(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='SELECTED_ADDRESS']"));
		return element;
	}
	
	public static WebElement state(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='STATE']"));
		return element;
	}
	
	public static WebElement city(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='CITY']"));
		return element;
	}
	
	public static WebElement landmark(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='LANDMARK']"));
		return element;
	}
	
	public static WebElement postal(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='POSTAL_CODE']"));
		return element;
	}
	
	public static WebElement phone(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='PHONE']"));
		return element;
	}
	
	public static List makeDefault(WebDriver driver) {
		listItem = driver.findElements(By.xpath(".//*[@id='defaultAddr']"));
		return listItem;
	}
	
	public static WebElement saveAddressBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='myacc-add-address-btn']"));
		return element;
	}
	public static WebElement updateAddressBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='myacc-updateAddr-btn']"));
		return element;
	}
	
	
	public static WebElement backBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='myaccount-editAddr-wrapper']/div[2]/div/div[1]/div[1]/a']"));
		return element;
	}
	
	public static WebElement addressTitleError(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='myacc-add-address']/form/div/div[1]/div[1]/div/span"));
		return element;
	}
	
	public static WebElement streetAddressError(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='myacc-add-address']/form/div/div[1]/div[2]/div/span"));
		return element;
	}
	
	public static WebElement stateError(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='myacc-add-address']/form/div/div[1]/div[3]/div/span"));
		return element;
	}
	
	public static WebElement cityError(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='myacc-add-address']/form/div/div[1]/div[4]/div/span"));
		return element;
	}
	
	public static WebElement postalError(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='myacc-add-address']/form/div/div[1]/div[6]/div/span"));
		return element;
	}
	
	public static WebElement phoneError(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='myacc-add-address']/form/div/div[1]/div[7]/div/span"));
		return element;
	}
	public static WebElement updateAddress(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div/div/div/div/div[4]/div[2]/a[1]/div"));
		return element;
	}
	public static WebElement deleteAddress(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div/div/div/div/div[4]/div[2]/a[2]/div"));
		return element;
	}
	
	public static WebElement editAddressTitleError(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='myacc-edit-address']/form/div/div[1]/div[1]/div/span"));
		return element;
	}
	
	public static WebElement editStreetAddressError(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='myacc-edit-address']/form/div/div[1]/div[2]/div/span"));
		return element;
	}
	
	public static WebElement editStateError(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='myacc-edit-address']/form/div/div[1]/div[3]/div/span"));
		return element;
	}
	
	public static WebElement editCityError(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='myacc-edit-address']/form/div/div[1]/div[4]/div/span"));
		return element;
	}
	
	public static WebElement editPostalError(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='myacc-edit-address']/form/div/div[1]/div[6]/div/span"));
		return element;
	}
	
	public static WebElement editPhoneError(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='myacc-edit-address']/form/div/div[1]/div[7]/div/span"));
		return element;
	}
	public static WebElement deleteOkButton(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='deleteAddressModal']/div/div/div[2]/button[2]"));
		return element;
	}
	public static WebElement deleteCancelButton(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='deleteAddressModal']/div/div/div[2]/button[1]"));
		return element;
	}
	public static WebElement deleteSuccess(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='removeSuccess']/div/div/div/div[2]"));
		return element;
	}
	
}
