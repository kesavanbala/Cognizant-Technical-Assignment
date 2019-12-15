package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automationpractice.api.base.SeleniumBase;

public class Order extends SeleniumBase{
	
	public Order(WebDriver driver)
	{
		super(driver);
	}
	private String btnProceedtocheckoutOnSummaryXpath="//span[text()='Proceed to checkout']";
	private String btnProceedtocheckoutOnAddressXpath="//span[text()='Proceed to checkout']";
	private String checkboxOnShippingXpath="//input[@id='cgv']";
	private String btnProceedtocheckoutShippingXpath="//button[@name='processCarrier']";
	private String linkBankPayXpath="//a[@class='bankwire']";
	private String btnConfirmMyOrderXpath="//span[text()='I confirm my order']";
	private String linkBackOrdersHistoryXpath="//a[text()='Back to orders']";

	
	
	public void proceedSummmary() {
		WebElement ele = locateElement("xpath", btnProceedtocheckoutOnSummaryXpath);
		click(ele);
	}
	public void proceedAddress() {
		WebElement ele = locateElement("xpath", btnProceedtocheckoutOnAddressXpath);
		click(ele);
	}
	public void clickcheckboxOnShipping() {
		
		WebElement ele = locateElement("xpath", checkboxOnShippingXpath);
		jSClick(ele);
	}
	public void proceedShipping() {
		WebElement ele = locateElement("xpath", btnProceedtocheckoutShippingXpath);
		click(ele);
	}
	public void proceedBankPay() {
		WebElement ele = locateElement("xpath", linkBankPayXpath);
		click(ele);
	}
	public void clickConfirmMyOrder() {
		WebElement ele = locateElement("xpath", btnConfirmMyOrderXpath);
		click(ele);
	}
	public void clickBackOrdersHistory() {
		WebElement ele = locateElement("xpath", linkBackOrdersHistoryXpath);
		click(ele);
	}
}
