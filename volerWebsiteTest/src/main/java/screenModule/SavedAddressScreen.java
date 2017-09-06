package screenModule;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;
import utility.ConstantUtility;
import volerWebElement.AddressElement;
import volerWebElement.TopHeaderElement;

public class SavedAddressScreen {

	public static WebElement findElement=null;
	public static WebElement addressTitle,streetAddress,landmark,postal,phone,saveAddress;
	public static void execute(WebDriver driver) {

		TopHeaderElement.savedAddressOption(driver).click();
		try{
			findElement=AddressElement.addNewAddressBtn(driver);
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		if(findElement!=null)
		{
			findElement.click();
		}
		else
		{
			AddressElement.addMoreAddressBtn(driver).click();
		}
		
		//AddressElement.addNewAddressBtn(driver).click();
		String result=addNewAddress(driver,"add");
		System.out.println("clicked on saved address "+result);
	}
	
	public static void update(WebDriver driver) {

		TopHeaderElement.savedAddressOption(driver).click();
		AddressElement.updateAddress(driver).click();
		String result=addNewAddress(driver,"update");
		System.out.println("clicked on update address "+result);
	}
	
	public static void delete(WebDriver driver)  {

		TopHeaderElement.savedAddressOption(driver).click();
		AddressElement.deleteAddress(driver).click();
		/*Alert alert=driver.switchTo().alert();
		alert.accept();*/
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*AddressElement.deleteAddress(driver).click();
		alert.accept();*/
		AddressElement.deleteOkButton(driver).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String result=AddressElement.deleteSuccess(driver).getText().toString();
		Assert.assertEquals("Deleted Successfully", AddressElement.deleteSuccess(driver).getText());
		
		System.out.println("Deleted Successfully "+result);
	}

	public static String addNewAddress(WebDriver driver,String flag)
	{
		WebElement element=null;
		String result=null;
		addressTitle=AddressElement.addressTitle(driver);
		addressTitle.sendKeys(ConstantUtility.ADDRESSTITLE);
		streetAddress=AddressElement.streetAddress(driver);
		streetAddress.sendKeys(ConstantUtility.STREETADDRESS);
		landmark=AddressElement.landmark(driver);
		landmark.sendKeys(ConstantUtility.LANDMARK);
		postal=AddressElement.postal(driver);
		postal.sendKeys(ConstantUtility.POSTAL);
		phone=AddressElement.phone(driver);
		phone.sendKeys(ConstantUtility.PHONE);
		/*
		List<WebElement> listItem=AddressElement.makeDefault(driver);
		listItem.get(0).click();
		*/
		
		Select stateSelect=new Select(AddressElement.state(driver));
		stateSelect.selectByValue(ConstantUtility.STATE);
		
		Select citySelect=new Select(AddressElement.city(driver));
		citySelect.selectByValue(ConstantUtility.CITY);
		try{
		element=AddressElement.saveAddressBtn(driver);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		if(element!=null)
		{
			
			element.click();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//validation check

			String test=addressTitle.getAttribute("value");
			System.out.println("test "+test);
			if(addressTitle.getAttribute("value").equals("")||addressTitle.getAttribute("value").equals(null)||addressTitle.getAttribute("value").isEmpty())
			{
				Assert.assertEquals("Please enter the address title*.", AddressElement.addressTitleError(driver).getText());
				System.out.println("this is title error message");
			}
			
			else if(streetAddress.getAttribute("value").equals("")||streetAddress.getAttribute("value").equals(null)||streetAddress.getAttribute("value").isEmpty())
			{
				Assert.assertEquals("Please enter the street address*.", AddressElement.streetAddressError(driver).getText());
				System.out.println("this is street error message");
			}
			
			else if(postal.getAttribute("value").equals("")||postal.getAttribute("value").equals(null)||postal.getAttribute("value").isEmpty())
			{
				Assert.assertEquals("Please enter the postal code*.", AddressElement.postalError(driver).getText());
				System.out.println("this is postal error message");
			}
			else if(phone.getAttribute("value").equals("")||phone.getAttribute("value").equals(null)||phone.getAttribute("value").isEmpty())
			{
				Assert.assertEquals("Please enter the phone*.", AddressElement.phoneError(driver).getText());
				System.out.println("this is phone error message");
			}
			else if(stateSelect.getFirstSelectedOption().getText().equals("Please Select"))
			{
				Assert.assertEquals("Please enter the state*.", AddressElement.stateError(driver).getText());
				System.out.println("this is state error message");
			}
			else if(stateSelect.getFirstSelectedOption().getText().equals("Please Select"))
			{
				Assert.assertEquals("Please enter the city*.", AddressElement.cityError(driver).getText());
				System.out.println("this is city error message");
			}
			else{
				System.out.println("nopes");
			}
			
			
		}
		else{
			
			AddressElement.updateAddressBtn(driver).click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(addressTitle.getAttribute("value").equals("")||addressTitle.getAttribute("value").equals(null)||addressTitle.getAttribute("value").isEmpty())
			{
				Assert.assertEquals("Please enter the address title*.", AddressElement.editAddressTitleError(driver).getText());
				System.out.println("this is title error message");
			}
			
			else if(streetAddress.getAttribute("value").equals("")||streetAddress.getAttribute("value").equals(null)||streetAddress.getAttribute("value").isEmpty())
			{
				Assert.assertEquals("Please enter the street address*.", AddressElement.editStreetAddressError(driver).getText());
				System.out.println("this is street error message");
			}
			
			else if(postal.getAttribute("value").equals("")||postal.getAttribute("value").equals(null)||postal.getAttribute("value").isEmpty())
			{
				Assert.assertEquals("Please enter the postal code*.", AddressElement.editPostalError(driver).getText());
				System.out.println("this is postal error message");
			}
			else if(phone.getAttribute("value").equals("")||phone.getAttribute("value").equals(null)||phone.getAttribute("value").isEmpty())
			{
				Assert.assertEquals("Please enter the phone*.", AddressElement.editPhoneError(driver).getText());
				System.out.println("this is phone error message");
			}
			else if(stateSelect.getFirstSelectedOption().getText().equals("Please Select"))
			{
				Assert.assertEquals("Please enter the state*.", AddressElement.editStateError(driver).getText());
				System.out.println("this is state error message");
			}
			else if(stateSelect.getFirstSelectedOption().getText().equals("Please Select"))
			{
				Assert.assertEquals("Please enter the city*.", AddressElement.editCityError(driver).getText());
				System.out.println("this is city error message");
			}
			else{
				System.out.println("nopes");
			}

			
		}
			
		result="success";
		return result;
	}
}