package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.objects.BillingAddress;

public class CheckoutPage extends BasePage{
CheckoutPage(WebDriver driver){
	super(driver);
}
public CheckoutPage enterFirstName(String first_name) {
	driver.findElement(By.id("billing_first_name")).clear();
driver.findElement(By.id("billing_first_name")).sendKeys(first_name);
return this;
}
public CheckoutPage enterLastName(String last_name) {
	driver.findElement(By.id("billing_last_name")).clear();
driver.findElement(By.id("billing_last_name")).sendKeys(last_name);
return this;
}
public CheckoutPage enterAddressLineOne(String addressLaneOne) {
	driver.findElement(By.id("billing_address_1")).clear();
driver.findElement(By.id("billing_address_1")).sendKeys(addressLaneOne);
return this;
}
public CheckoutPage enterCity(String city) {
	driver.findElement(By.id("billing_city")).clear();
driver.findElement(By.id("billing_city")).sendKeys(city);
return this;
}
public CheckoutPage enterPostalcode(String postCode) {
	driver.findElement(By.id("billing_postcode")).clear();
driver.findElement(By.id("billing_postcode")).sendKeys(postCode);
return this;
}
public CheckoutPage enterEmail(String email) {
	driver.findElement(By.id("billing_email")).clear();
driver.findElement(By.id("billing_email")).sendKeys(email);
return this;
}
public void fillForm(BillingAddress billAddress) {
	enterFirstName(billAddress.getFirstName()).enterLastName(billAddress.getLastName()).enterAddressLineOne(billAddress.getAddressLineOne()).
	enterCity(billAddress.getCity()).enterPostalcode(billAddress.getPostalCode()).enterEmail(billAddress.getEmail());
}

}
