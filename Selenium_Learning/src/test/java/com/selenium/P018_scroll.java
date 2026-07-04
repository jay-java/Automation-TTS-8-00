package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P018_scroll {
	public static void main(String[] args) {
		String url = "https://demoqa.com/automation-practice-form";
		WebDriver driver = DriverConnection.getDriver(url);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// 1.by pixels
//		js.executeScript("window.scrollBy(0, 300)");

		// 2.by element
		WebElement state = driver.findElement(By.className("css-19bb58m"));
//		js.executeScript("arguments[0].scrollIntoView();", state);

		// 3.by height
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
}
