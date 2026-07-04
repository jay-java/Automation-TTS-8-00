package com.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P005_AnnotationsPractical {

	WebDriver driver = null;

	@Before
	public void openBrowser() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.getDriver(url);
	}

	@Test
	public void loginTest() throws InterruptedException {
		WebElement emailEle = driver.findElement(By.name("email"));
		emailEle.sendKeys("selenium@gmail.com");
		WebElement passEle = driver.findElement(By.name("pass"));
		passEle.sendKeys("selenium@123");
		Thread.sleep(3000);
	}

	@After
	public void tearDown() {
		driver.close();
	}

}
