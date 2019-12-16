package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.automationpractice.api.base.SeleniumBase;

public class MyAccount extends SeleniumBase {
	public MyAccount(WebDriver driver) {
		super(driver);
	}

	private String linkTshirtsXpath = "(//a[text()='T-shirts'])[2]";
	private String myPersonalInfoXpath = "//a[@title='Information']";
	private String txtfirstnameId = "firstname";
	private String btnSavename = "submitIdentity";
	private String txtOldPasswordId = "old_passwd";
	private String btnBackToAccountXpath = "(//a[@class='btn btn-default button button-small'])[2]";

	public void clickTshirtMyStore() {
		WebElement ele = locateElement("xpath", linkTshirtsXpath);
		click(ele);
	}

	public void clickmyPersonalInfo() {
		WebElement ele = locateElement("xpath", myPersonalInfoXpath);
		click(ele);
	}

	public void changeFirstNmae(String data) {
		WebElement ele = locateElement("id", txtfirstnameId);
		clearAndType(ele, data);
	}

	public void enterOldPassword(String data) {
		WebElement ele = locateElement("id", txtOldPasswordId);
		clearAndType(ele, data);
	}

	public void clickSave() {
		WebElement ele = locateElement("name", btnSavename);
		click(ele);
	}

	public String getModifiedFirstName() {
		WebElement ele = locateElement("id", txtfirstnameId);
		return getTypedText(ele);
	}

	public void clickbtnBackToAccount() {
		WebElement ele = locateElement("xpath", btnBackToAccountXpath);
		click(ele);
	}

	public void validatingTitle(String title) {
		verifyTitle(title);

	}
}