package org.selenium.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Factory {
//public WebDriver initDriver() {
//	return new ChromeDriver();
//}

public WebDriver initDriver() {
	String browser = System.getProperty("browser");
	WebDriver driver;
	switch(browser) {
	case "chrome" :
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
		default:
			throw new IllegalStateException("not a browser"	);
	}
	return driver;
}
}
