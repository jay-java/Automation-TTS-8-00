package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P020_PartialLInkText {

	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);

		List<WebElement> list = driver.findElements(By.partialLinkText("Create"));
		for (WebElement e : list) {
			System.out.println(e.getText());
		}
		list.get(2).click();
		driver.navigate().back();
	}
}
