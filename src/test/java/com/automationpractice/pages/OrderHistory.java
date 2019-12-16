package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.automationpractice.api.base.SeleniumBase;

public class OrderHistory extends SeleniumBase {

	public OrderHistory(WebDriver driver) {
		super(driver);
	}

	private String orderedDetailsXpath = "(//table[@id='order-list']/tbody/tr[1]/td[7]/a)[1]";
	private String productNameXpath = "//table[@class='table table-bordered']/tbody/tr/td[2]";
	private String quantityXpath = "//table[@class='table table-bordered']/tbody/tr/td[3]";

	public void clickOrderHistoryDetails() {
		WebElement ele = locateElement("xpath", orderedDetailsXpath);
		click(ele);
	}

	public String getProductName() {
		WebElement ele = locateElement("xpath", productNameXpath);
		return getElementText(ele);
	}

	public String getQuantity() {
		WebElement ele = locateElement("xpath", quantityXpath);
		return getElementText(ele);
	}

}
