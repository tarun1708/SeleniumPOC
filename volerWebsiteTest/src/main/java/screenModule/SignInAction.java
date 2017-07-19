package screenModule;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

import dbUtility.DBConfig;
import junit.framework.Assert;
import utility.ConstantUtility;
import volerWebElement.TopHeaderElement;
import volerWebElement.loginElement;

public class SignInAction {

	public static String execute(WebDriver driver) throws Exception {
		// String excelUserName = ExcelUtils.getCellData(1, 1);
		// String excelPassword = ExcelUtils.getCellData(1, 2);

		TopHeaderElement.getLogin(driver).click();
		// login.userName(driver).sendKeys(excelUserName);
		// login.password(driver).sendKeys(excelPassword);
		loginElement.userName(driver).sendKeys(ConstantUtility.username);
		loginElement.password(driver).sendKeys(ConstantUtility.password);

		String token = null;
		loginElement.loginbutton(driver).click();

		try {
			// create db connection
			DBCollection collection = DBConfig.getMongoCollection("voler_ums", "login_token");
			Cookie ck = driver.manage().getCookieNamed("loginToken");
			token = ck.getValue();
			String response = null;
			// db query
			DBCursor cursor = DBConfig.tokenQuery("token", token);
			System.out.println("login token: " + token);

			try {
				while (cursor.hasNext()) {
					response = cursor.next().toString();
					System.out.println("response " + response);

				}

			} catch (Exception e) {

				System.out.println(e.getMessage());
			} finally {

				cursor.close();
			}
			Assert.assertTrue(response.contains(token));

			System.out.println("this is login token: " + token);
		} catch (Exception e) {
			System.out.println("exception" + e);
			// TODO: handle exception
		}

		return token;

	}
}
