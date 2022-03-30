package org.selenium.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Factory {
//public WebDriver initDriver() {
//	return new ChromeDriver();
//}
WebDriver driver;
public WebDriver initDriver() {
	// TODO Auto-generated method stub
	String browser = System.getProperty("browser");
	browser="FIREFOX";
	switch(browser) {
	case  "CHROME" :
		WebDriverManager.chromedriver();
		driver= new ChromeDriver();
		break;
	case "FIREFOX" :
		WebDriverManager.firefoxdriver();
		driver= new FirefoxDriver();
		break;
	default:
		WebDriverManager.operadriver();
		driver= new OperaDriver();
		break;
	}
	
	return driver;

}
}
