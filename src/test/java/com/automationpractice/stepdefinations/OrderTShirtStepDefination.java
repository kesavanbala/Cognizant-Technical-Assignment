package com.automationpractice.stepdefinations;

import org.junit.Assert;

import com.automationpractice.api.base.SeleniumBase;
import com.automationpractice.pages.CustomizeTshirts;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.MyAccount;
import com.automationpractice.pages.Order;
import com.automationpractice.pages.OrderHistory;
import com.automationpractice.pages.SignInPage;
import com.automationpractice.pages.TshirtsMyStore;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrderTShirtStepDefination {

	HomePage home = new HomePage(SeleniumBase.getDriver());
	SignInPage signin = new SignInPage(SeleniumBase.getDriver());
	MyAccount myAccount = new MyAccount(SeleniumBase.getDriver());
	TshirtsMyStore tshirt = new TshirtsMyStore(SeleniumBase.getDriver());
	Order order = new Order(SeleniumBase.getDriver());
	CustomizeTshirts customT = new CustomizeTshirts(SeleniumBase.getDriver());
	OrderHistory orderList = new OrderHistory(SeleniumBase.getDriver());

	@Given("^Initialize browser and lunch the URL with valid credential$")
	public void Initialize_browser_and_lunch_the_URL_with_valid_credential() throws Throwable {
		home.startApp(home.getValueFromProperties("browser"), home.getValueFromProperties("URL"));
		home.clickSignInLink();
		signin.enterEmail(home.getValueFromProperties("username"));
		signin.enterPassword(home.getValueFromProperties("password"));
		signin.clickSignIn();
	}

	@Given("^Navigate to T-shirts tab$")
	public void Navigate_to_T_shirts_tab() throws Throwable {
		myAccount.clickTshirtMyStore();
		tshirt.tshirtSelection();
		tshirt.clickMore();
	}

	@And("^Place the order$")
	public void place_the_order() throws Throwable {
		customT.changeQuentity(home.getValueFromProperties("Quantity"));
		customT.clickAddToCart();
		tshirt.clickProceedToCheckout();
		order.proceedSummmary();
		order.proceedAddress();
		order.clickcheckboxOnShipping();
		order.proceedShipping();
		order.proceedBankPay();
		order.clickConfirmMyOrder();
	}

	@Then("^Validate the order history$")
	public void validate_the_order_history() throws Throwable {
		order.clickBackOrdersHistory();
		orderList.clickOrderHistoryDetails();
		Assert.assertEquals("Order details are not matched", home.getValueFromProperties("productNameforVerify"),
				orderList.getProductName());
		Assert.assertEquals("Order details are not matched", home.getValueFromProperties("Quantity"),
				orderList.getQuantity());
		orderList.close();
	}

	@Given("^Validate whether User navigated to My Account page after login$")
	public void Validate_whether_User_navigated_to_My_Account_page_after_login() throws Throwable {
		myAccount.validatingTitle(home.getValueFromProperties("titleOfMyAccount"));

	}

	@When("^Update the Personal Information$")
	public void update_the_Personal_Information() throws Throwable {
		myAccount.clickmyPersonalInfo();
		myAccount.changeFirstNmae(home.getValueFromProperties("newFirstName"));
		myAccount.enterOldPassword(home.getValueFromProperties("password"));
		myAccount.clickSave();
	}

	@Then("^Validating user updates$")
	public void Validating_user_updates() throws Throwable {
		myAccount.clickbtnBackToAccount();
		myAccount.clickmyPersonalInfo();
		Assert.assertEquals("Modified information not updated in personal information",
				home.getValueFromProperties("newFirstName"), myAccount.getModifiedFirstName());
		myAccount.close();
	}

}
