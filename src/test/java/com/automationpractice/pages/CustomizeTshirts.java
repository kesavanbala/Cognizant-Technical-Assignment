package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automationpractice.api.base.SeleniumBase;

public class CustomizeTshirts extends SeleniumBase {

	public CustomizeTshirts(WebDriver driver) {
		super(driver);
	}

	private String QuentityId = "quantity_wanted";
	private String btnAddCartXpath = "//span[text()='Add to cart']";

	public void changeQuentity(String data) {
		WebElement ele = locateElement("id", QuentityId);
		clearAndType(ele, data);
	}

	public void clickAddToCart() {
		WebElement ele = locateElement("xpath", btnAddCartXpath);
		click(ele);
	}

}
