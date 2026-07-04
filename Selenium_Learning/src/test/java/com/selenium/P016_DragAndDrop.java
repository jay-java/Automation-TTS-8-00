package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driverConnection.DriverConnection;

public class P016_DragAndDrop {
	public static void main(String[] args) {
		String url = "https://www.globalsqa.com/demo-site/draganddrop/";

		WebDriver driver = DriverConnection.getDriver(url);

		WebElement iframe = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframe);

		WebElement img1 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
		WebElement img2 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]/img"));
		WebElement trash = driver.findElement(By.id("trash"));
		Actions action = new Actions(driver);
		action.clickAndHold(img1).moveToElement(trash).release().build().perform();
		action.clickAndHold(img2).moveToElement(trash).release().build().perform();
	}
}
