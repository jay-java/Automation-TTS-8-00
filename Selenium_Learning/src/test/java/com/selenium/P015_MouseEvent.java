package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driverConnection.DriverConnection;

public class P015_MouseEvent {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.amazon.in/";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement fresh = driver.findElement(By.linkText("Fresh"));
		WebElement mx = driver.findElement(By.linkText("MX Player"));
		WebElement sell = driver.findElement(By.linkText("Sell"));
		WebElement bestSellers = driver.findElement(By.linkText("Bestsellers"));

		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(fresh).build().perform();
		Thread.sleep(2000);
		action.moveToElement(mx).build().perform();
		Thread.sleep(2000);
		action.moveToElement(sell).build().perform();
		Thread.sleep(2000);
		action.moveToElement(bestSellers).build().perform();

		bestSellers.click();
	}
}
