package org.selenium.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.selenium.pom.constants.BrowserType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Factory {
//public WebDriver initDriver() {
//	return new ChromeDriver();
//}

public WebDriver initDriver() {
//	String browser =  System.getProperty("browser");
	String browser ="CHROME";
	WebDriver driver;
	switch(BrowserType.valueOf("FIREFOX")) {
	case CHROME :
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
	case FIREFOX:
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
		default:
			throw new IllegalStateException("not a browser"	);
	}
	return driver;
}
}
