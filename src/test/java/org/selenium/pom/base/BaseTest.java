package org.selenium.pom.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.selenium.factory.*;

public class BaseTest {
WebDriver driver;
@BeforeMethod
void startDriver() {
	this.driver=new Factory().initDriver();
}
@AfterMethod
void quitDriver() {
	driver.quit();
}
}
