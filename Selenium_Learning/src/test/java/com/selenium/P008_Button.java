package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P008_Button {
	public static void main(String[] args) {
		String url = "https://www.tutorialspoint.com/selenium/practice/buttons.php";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement btn1 = driver.findElement(By.xpath("//div[@class='container']/div/div[2]/button[1]"));
		btn1.click();
		WebElement btn2 = driver.findElement(By.xpath("//div[@class='container']/div/div[2]/button[2]"));
//		btn2.
		WebElement btn3 = driver.findElement(By.xpath("//div[@class='container']/div/div[2]/button[3]"));
//		btn1.click();

	}
}
