package com.automationpractice.api.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBase {

	public static WebDriver driver;
	public static Properties pro;

	public SeleniumBase(WebDriver driver) {
		SeleniumBase.driver = driver;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public void click(WebElement ele) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.click();
			// reportStep("The Element "+ele+" clicked", "pass");
			System.out.println("The Element " + ele + " clicked");
		} catch (StaleElementReferenceException e) {
			// reportStep("The Element "+ele+" could not be clicked", "fail");
			e.getStackTrace();
			System.err.println("The Element " + ele + " could not be clicked");
		}
	}

	public void jSClick(WebElement ele) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
	}

	public void clearAndType(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			// reportStep("The Data :"+data+" entered Successfully", "pass");
			System.out.println("The Data :" + data + " entered Successfully");
		} catch (ElementNotInteractableException e) {
			// reportStep("The Element "+ele+" is not Interactable", "fail");
			System.err.println("The Element " + ele + " is not Interactable");
			throw new RuntimeException();
		}
	}

	public String getElementText(WebElement ele) {
		String text = ele.getText();
		return text;
	}

	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			driver.navigate().to(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.err.println("The Browser Could not be Launched. Hence Failed");
			throw new RuntimeException();
		}

	}

	public WebElement locateElement(String locatorType, String value) {
		try {
			switch (locatorType.toLowerCase()) {
			case "id":
				return driver.findElement(By.id(value));
			case "name":
				return driver.findElement(By.name(value));
			case "class":
				return driver.findElement(By.className(value));
			case "link":
				return driver.findElement(By.linkText(value));
			case "xpath":
				return driver.findElement(By.xpath(value));
			}
		} catch (NoSuchElementException e) {
			System.err.println("The Element with locator:" + locatorType + " Not Found with value: " + value);
			throw new RuntimeException();
		}
		return null;
	}

	public boolean verifyTitle(String title) {
		if (driver.getTitle().equals(title)) {
			System.out.println("Page title: " + title + " matched successfully");
			return true;
		} else {
			System.out.println("Page url: " + title + " not matched");
		}
		return false;
	}

	public String getTypedText(WebElement ele) {
		String attributeValue = ele.getAttribute("value");
		return attributeValue;
	}

	public void close() {
		driver.close();
	}

	public void quit() {
		driver.quit();

	}

	public String getValueFromProperties(String pkey) {

		String pvalue = null;
		try {
			pro = new Properties();
			pro.load(new FileInputStream(new File("Configuration/Config.properties")));
			pvalue = pro.getProperty(pkey);

		} catch (IOException e) {
			System.out.println("Exception is" + e.getMessage());
		}
		return pvalue;
	}

	public void moveMouseOnLocator(WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
	}

}
