package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P021_Tagname {

	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);

		List<WebElement> tags = driver.findElements(By.tagName("a"));
		for (WebElement tag : tags) {
			System.out.println(tag.getText());
		}
	}
}
