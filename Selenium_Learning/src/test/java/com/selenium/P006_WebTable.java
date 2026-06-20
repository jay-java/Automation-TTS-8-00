package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P006_WebTable {
	public static void main(String[] args) {
		String url = "https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement contact = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[5]/td[3]"));
		System.out.println(contact.getText());
	}
}
