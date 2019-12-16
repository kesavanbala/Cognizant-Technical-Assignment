package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automationpractice.api.base.SeleniumBase;

public class TshirtsMyStore extends SeleniumBase {
	public TshirtsMyStore(WebDriver driver) {
		super(driver);
	}

	private String tshirtsXpath = "//a[contains(text(),'Faded Short Sleeve T-shirts')]";
	private String btnAddCartXpath = "//span[text()='Add to cart']";
	private String btnMoreXpath = "//span[text()='More']";
	private String btnProceedToCheckoutXpath = "//span[contains(text(),'Proceed to checkout')]";

	public void tshirtSelection() {
		WebElement ele = locateElement("xpath", tshirtsXpath);
		moveMouseOnLocator(ele);
	}

	public void clickAddToCart() {
		WebElement ele = locateElement("xpath", btnAddCartXpath);
		click(ele);
	}

	public void clickMore() {
		WebElement ele = locateElement("xpath", btnMoreXpath);
		click(ele);
	}

	public void clickProceedToCheckout() {

		WebElement ele = locateElement("xpath", btnProceedToCheckoutXpath);
		click(ele);
	}
}
