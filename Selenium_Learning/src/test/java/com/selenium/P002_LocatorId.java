package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P002_LocatorId {
	public static void main(String[] args) {
		String url = "https://www.tutorialspoint.com/selenium/practice/text-box.php";
		WebDriver driver = DriverConnection.getDriver(url);
		WebElement nameELe = driver.findElement(By.id("fullname"));
		nameELe.sendKeys("selenium");
		WebElement emailELe = driver.findElement(By.id("email"));
		emailELe.sendKeys("selenim@gmail.com");
		WebElement addressELe = driver.findElement(By.id("address"));
		addressELe.sendKeys("ahmedabad");
		WebElement passwordELe = driver.findElement(By.id("password"));
		passwordELe.sendKeys("selenium@123");

	}
}
