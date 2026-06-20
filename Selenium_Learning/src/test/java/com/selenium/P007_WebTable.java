package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P007_WebTable {
	public static void main(String[] args) {
		String url = "https://www.tutorialspoint.com/selenium/practice/webtables.php";
		WebDriver driver = DriverConnection.getDriver(url);

		List<WebElement> thead = driver
				.findElements(By.xpath("//div[@class='container']/div/div[2]/form/div[2]/table/thead/tr/th"));

		for (WebElement e : thead) {
			System.out.print(e.getText() + " ");
		}
		System.out.println();
		List<WebElement> tr = driver
				.findElements(By.xpath("//div[@class='container']/div/div[2]/form/div[2]/table/tbody/tr"));

		for (int i = 1; i <= tr.size(); i++) {
			List<WebElement> td = driver.findElements(
					By.xpath("//div[@class='container']/div/div[2]/form/div[2]/table/tbody/tr[" + i + "]/td"));
			for (int j = 1; j <= td.size(); j++) {
				WebElement data = driver.findElement(By.xpath(
						"//div[@class='container']/div/div[2]/form/div[2]/table/tbody/tr[" + i + "]/td[" + j + "]"));
				System.out.print(data.getText() + " ");
			}
			System.out.println();
		}
	}
}
