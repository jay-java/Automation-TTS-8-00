package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import driverConnection.DriverConnection;

public class P010_Dropdown {
	public static void main(String[] args) {
		String url = "https://www.globalsqa.com/demo-site/select-dropdown-menu/";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement countryDrop = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));

		Select select = new Select(countryDrop);
		// 1.select by index
//		select.selectByIndex(1);

		// 2.select by value
//		select.selectByValue("ATA");

		// 3.select by visibletext
//		select.selectByVisibleText("Argentina");

		String myCountryString = "India";

		List<WebElement> allCountries = select.getOptions();
		for (WebElement e : allCountries) {
			System.out.println(e.getText());
			if (e.getText().equals(myCountryString)) {
				e.click();
			}

		}
	}
}
