package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.automationpractice.api.base.SeleniumBase;

public class HomePage extends SeleniumBase{
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}

	private String SigninClass="login";

	public void clickSignInLink()
	{
		WebElement eleUserName = locateElement("class", SigninClass);
		click(eleUserName);
	}


}
