package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.automationpractice.api.base.SeleniumBase;

public class SignInPage extends SeleniumBase {
	public SignInPage(WebDriver driver)
	{
		super(driver);
	}
	
	private String txtEmailAddressId="email";
	private String txtEmailPasswordId="passwd";
	private String btnSubmitLoginId="SubmitLogin";
	
	public void enterEmail(String data) {
		WebElement ele = locateElement("id", txtEmailAddressId);
		clearAndType(ele, data);
	}

	public void enterPassword(String data) {
		WebElement ele = locateElement("id", txtEmailPasswordId);
		clearAndType(ele, data);
		
	}

	public void clickSignIn() {
		WebElement ele = locateElement("id", btnSubmitLoginId);
		click(ele);
		
	}
}
