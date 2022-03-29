package org.selenium.pom.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
protected WebDriver driver ;
public BasePage(){
	
}
public BasePage(WebDriver driver){
	this.driver=driver;
}
}
