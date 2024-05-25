package com.e2eTest.automation.utils;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup {
	private static WebDriver driver;

	/**
	 * This method is used to open browser.This method is called before the
	 * invocation of each test method in the given class. In this method we need to
	 * pass browser name which will invoke the respective driver.
	 * 
	 * @throws malformedURLException the malformed URL exception
	 * @before Methods annotated with @before will execute before every scenario.
	 */
	@Before
	public void setWebDriver() {
		String browser = System.getProperty("browser");
		if (browser == null) {
			browser = "chrome";
		}
		switch (browser) {
		case "chrome":
			// System.setProperty("webdriver.chrome.driver",
			// "src/test/resources/drivers/chromedriver.exe");
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "firefox":
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			FirefoxProfile profile = new FirefoxProfile();
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			WebDriverManager.firefoxdriver().setup();
			firefoxOptions.setCapability("platform", Platform.WIN10);
			firefoxOptions.setProfile(profile);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		case "edge":
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		default:
			throw new IllegalArgumentException("Browser \"" + browser + "\"is not supported");

		}
		
	}
	

	// Getter /
	public static WebDriver getDriver() {
		return driver;
	}
}