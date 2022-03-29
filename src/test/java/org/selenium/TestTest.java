package org.selenium;

import java.io.IOException;
import java.io.InputStream;

import org.openqa.selenium.By;
import org.selenium.factory.Factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium.pom.objects.BillingAddress;
import org.selenium.pom.pages.CartPage;
import org.selenium.pom.pages.CheckoutPage;
import org.selenium.pom.pages.HomePage;
import org.selenium.pom.pages.StorePage;
import org.selenium.pom.utils.JacksonUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class TestTest {
@Test
void checkoutDBT() throws InterruptedException, IOException {
	
	BillingAddress billingAdd = JacksonUtils.deserializeJson("myBillingAddress.json",BillingAddress.class);

	BillingAddress billingAddressObj= new BillingAddress().setFirstName("anil").setLastName("kumar").setAddressLineOne("11th lane").setCity("guntur").setPostalCode("522004").setEmail("dfdf@dkf.com");
	WebDriver driver =new Factory().initDriver()	;
	driver.get("https://askomdch.com");
	driver.manage().window().maximize();
//	driver.findElement(By.cssSelector("#menu-item-1227 > a")).click();
	HomePage homePageObj= new HomePage(driver);
	StorePage storePageObj=homePageObj.clickOnStore();
	
//	driver.findElement(By.cssSelector("#woocommerce-product-search-field-0")).sendKeys("blue");
//	driver.findElement(By.cssSelector("#woocommerce_product_search-1 > form > button")).click();
//  	Assert.assertEquals(driver.findElement(By.xpath("//main[@id=\"main\"]/div/header/h1")).getText(),"Search results: “blue”");
	storePageObj.searchForItem(); 
  	Thread.sleep(3000);
  	storePageObj.addToCart();
//driver.findElement(By.cssSelector("#main > div > ul > li.ast-col-sm-12.ast-article-post.astra-woo-hover-swap.product.type-product.post-1215.status-publish.first.instock.product_cat-men.product_cat-womens-shoes.has-post-thumbnail.featured.taxable.shipping-taxable.purchasable.product-type-simple > div.astra-shop-summary-wrap > a.button.product_type_simple.add_to_cart_button.ajax_add_to_cart")).click();
Thread.sleep(3000);
CartPage cartPageObj=storePageObj.viewCart();
//driver.findElement(By.cssSelector("#main > div > ul > li.ast-col-sm-12.ast-article-post.astra-woo-hover-swap.product.type-product.post-1215.status-publish.first.instock.product_cat-men.product_cat-womens-shoes.has-post-thumbnail.featured.taxable.shipping-taxable.purchasable.product-type-simple > div.astra-shop-summary-wrap > a.added_to_cart.wc-forward")).click();
//Assert.assertEquals(driver.findElement(By.xpath("//td/a[text()=\"Blue Shoes\"]")).getText(), "Blue Shoes"	);
Thread.sleep(3000);
CheckoutPage checkoutPageObj=cartPageObj.assertAndClickCheckOut();
//driver.findElement(By.cssSelector("#post-1220 > div > div > div > div > div.cart-collaterals > div > div > a")).click();
//driver.findElement(By.id("billing_first_name")).sendKeys("anil");
//driver.findElement(By.id("billing_last_name")).sendKeys("kumar");
//driver.findElement(By.id("billing_company")).sendKeys("kas");
checkoutPageObj.fillForm(billingAddressObj);
}


}
