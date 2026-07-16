package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driverConnection.DriverConnection;

public class CrossBrowserTest {

	@Parameters("browser")
	@Test
	public void test(String browser) {

		WebDriver driver = null;
		String url = "https://www.facebook.com/";
		if (browser.equals("chrome")) {
			driver = DriverConnection.getDriver(url);
		}
		if (browser.equals("ff")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Admin\\Downloads\\geckodriver-v0.37.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Admin\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		}
	}
}
