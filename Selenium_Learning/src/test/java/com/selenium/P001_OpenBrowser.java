package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P001_OpenBrowser {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";

		// 1.Chrome
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// cssSelector
		// className
		// id
		// name
		// xpath
		// tagName
		// linkText
		// partialLinktext
		WebElement emailEle = driver.findElement(By.name("email"));
		emailEle.sendKeys("selenium@gmail.com");
		WebElement passEle = driver.findElement(By.name("pass"));
		passEle.sendKeys("selenium@123");
		Thread.sleep(3000);
		driver.close();

		// 2.edge
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		driver.get(url);
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.close();

		// 3.firefox
//		System.setProperty("webdriver.gecko.driver",
//				"C:\\Users\\Admin\\Downloads\\geckodriver-v0.37.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get(url);
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.close();

	}
}
