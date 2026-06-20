package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P004_CheckBox {
	public static void main(String[] args) {
		String url = "https://www.tutorialspoint.com/selenium/practice/check-box.php";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement checkBox = driver.findElement(By.id("c_bs_1"));
		checkBox.click();
	}
}
