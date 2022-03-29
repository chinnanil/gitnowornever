package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.pom.base.BasePage;
import org.testng.Assert;

public class StorePage extends BasePage {


public StorePage() {

}

public StorePage(WebDriver driver)
{
super(driver);
}
public void searchForItem() {
	driver.findElement(By.cssSelector("#woocommerce-product-search-field-0")).sendKeys("blue");
	driver.findElement(By.cssSelector("#woocommerce_product_search-1 > form > button")).click();
  	Assert.assertEquals(driver.findElement(By.xpath("//main[@id=\"main\"]/div/header/h1")).getText(),"Search results: “blue”");
}
public void addToCart() {
	driver.findElement(By.cssSelector("#main > div > ul > li.ast-col-sm-12.ast-article-post.astra-woo-hover-swap.product.type-product.post-1215.status-publish.first.instock.product_cat-men.product_cat-womens-shoes.has-post-thumbnail.featured.taxable.shipping-taxable.purchasable.product-type-simple > div.astra-shop-summary-wrap > a.button.product_type_simple.add_to_cart_button.ajax_add_to_cart")).click();
}
public CartPage viewCart() {
	driver.findElement(By.cssSelector("#main > div > ul > li.ast-col-sm-12.ast-article-post.astra-woo-hover-swap.product.type-product.post-1215.status-publish.first.instock.product_cat-men.product_cat-womens-shoes.has-post-thumbnail.featured.taxable.shipping-taxable.purchasable.product-type-simple > div.astra-shop-summary-wrap > a.added_to_cart.wc-forward")).click();
	return new CartPage(driver);
}
}
