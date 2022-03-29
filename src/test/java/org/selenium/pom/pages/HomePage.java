package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.pom.base.BasePage;

public class HomePage extends BasePage {
	//WebDriver driver;
	public HomePage(WebDriver driver){
		super(driver);
	}
public StorePage clickOnStore()	{
	driver.findElement(By.cssSelector("#menu-item-1227 > a")).click();
	return new StorePage(this.driver);
}
}
