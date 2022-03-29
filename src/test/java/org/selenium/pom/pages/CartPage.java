package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.pom.base.BasePage;
import org.testng.Assert;

public class CartPage extends BasePage {

	public CartPage(WebDriver driver) {
		super(driver);
	}
	public CheckoutPage assertAndClickCheckOut() {
		Assert.assertEquals(driver.findElement(By.xpath("//td/a[text()=\"Blue Shoes\"]")).getText(), "Blue Shoes"	);
		driver.findElement(By.cssSelector("#post-1220 > div > div > div > div > div.cart-collaterals > div > div > a")).click();
		return new CheckoutPage(driver);
	}
}
