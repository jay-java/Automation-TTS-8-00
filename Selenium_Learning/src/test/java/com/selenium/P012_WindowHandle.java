package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverConnection.DriverConnection;

public class P012_WindowHandle {
	public static void main(String[] args) {
		String url = "https://demo.guru99.com/popup.php";
		WebDriver driver = DriverConnection.getDriver(url);

		String mainWin = driver.getWindowHandle();
//		System.out.println(mainWin);
		driver.findElement(By.linkText("Click Here")).click();

		Set<String> allWin = driver.getWindowHandles();
		for (String s : allWin) {
			System.out.println(s);
			if (!s.equals(mainWin)) {
				driver.switchTo().window(s);
				WebElement email = driver.findElement(By.name("emailid"));
				email.sendKeys("selenium@gmail.com");

				driver.findElement(By.name("btnLogin")).click();
			}
		}

	}
}
