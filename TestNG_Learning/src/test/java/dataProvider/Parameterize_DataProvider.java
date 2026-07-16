package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import driverConnection.DriverConnection;

public class Parameterize_DataProvider {

	static WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.getDriver(url);
	}

	@Test(dataProvider = "dp")
	public void login(String email, String password) {
		WebElement emailEle = driver.findElement(By.name("email"));
		emailEle.sendKeys(email);
		WebElement passEle = driver.findElement(By.name("pass"));
		passEle.sendKeys(password);
	}

	@DataProvider(name = "dp")
	public static Object[][] getData() {
		Object o[][] = new Object[4][2];

		o[0][0] = "correct@gmail.com";
		o[0][1] = "correct@123";

		o[1][0] = "incorrect@gmail.com";
		o[1][1] = "correct@123";

		o[2][0] = "correct@gmail.com";
		o[2][1] = "incorrect@123";

		o[3][0] = "incorrect@gmail.com";
		o[3][1] = "incorrect@123";

		return o;
	}

}
