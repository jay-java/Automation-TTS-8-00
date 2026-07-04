package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P009_UploadDownFile {
	public static void main(String[] args) throws InterruptedException {
		String url ="https://www.tutorialspoint.com/selenium/practice/upload-download.php";
		
		WebDriver driver = DriverConnection.getDriver(url);
		WebElement download = driver.findElement(By.linkText("Download"));
		download.click();
		Thread.sleep(3000);
		WebElement upload = driver.findElement(By.id("uploadFile"));
		upload.sendKeys("C:\\Users\\Admin\\Downloads\\sofa.jpeg");
	}
}
