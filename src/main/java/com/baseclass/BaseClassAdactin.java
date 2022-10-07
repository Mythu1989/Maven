package com.baseclass;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClassAdactin {

	public static WebDriver driver;
	public static String value;

	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",".\\Chrome_Driver\\chromedriver.exe");

			driver = new ChromeDriver();// upcasting

		} else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", ".\\Chrome_Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		return driver;
	}

	
	public static File takeScreenShot(String fileName) throws IOException {
		try {
			File f = new File(System.getProperty("user.dir") + "\\src\\test\\resource\\Library\\" + fileName + ".png");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(temp, f);
			return f;

		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static WebDriver quit() {

		driver.quit();
		return driver;

	}

	public static WebDriver close() {

		driver.close();
		return driver;

	}
	

	public static void ClickOnElement(WebElement element) {

		element.click();

	}
	
	public static void clearOnText(WebElement element) {

		element.clear();
	}
	
	public static void inputValueElement(WebElement element, String value) {

		element.sendKeys(value);
	}

	public static void dropDown(String type, WebElement element, String value) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("selectbyvalue")) {

			s.selectByValue(value);

		} else if (type.equalsIgnoreCase("selectbyindex")) {

			int index = Integer.parseInt(value);

			s.selectByIndex(index);

		} else if (type.equalsIgnoreCase("selectbyvisibletext")) {

			s.selectByVisibleText(value);
		}
	}

	public static void getText(WebElement element) {

		element.getText();
	}

	public static void getCurrentUrl() {

		driver.getCurrentUrl();
	}

	public static WebDriver getUrl(String url) {

		driver.get(url);
		return driver;
	}

	public static void getTitle() {

		driver.getTitle();
	}

	public static void radioButton(WebElement element) {

		element.click();

	}

	public static void checkBox(WebElement element) {

		element.click();
	}

	public static void IsEnabled(WebElement element) {

		element.isEnabled();
	}

	public static void IsDisplayed(WebElement element) {

		element.isDisplayed();
	}

	public static void IsSelected(WebElement element) {

		element.isSelected();
	}

	public static void navigateTo(String url) {

		driver.navigate().to(url);

	}

	public static void navigateBack(String url) {

		driver.navigate().to(url);

	}

	public static void navigateForward() {

		driver.navigate().forward();

	}

	public static void navigateRefresh() {

		driver.navigate().refresh();
	}

	public static void alert(String type, WebElement element, String value) {

		Alert alert = driver.switchTo().alert();

		if (type.equalsIgnoreCase("Accept")) {

			alert.accept();

		} else if (type.equalsIgnoreCase("Dismiss")) {

			alert.dismiss();

		} else if (type.equalsIgnoreCase("Sendkeys")) {

			alert.sendKeys(value);

		} else if (type.equalsIgnoreCase("value")) {

			alert.getText();

		}

	}

	public static void getAttribute(WebElement element, String name) {

		element.getAttribute(name);

	}

	public static void scrollUpAndDown() {

	}

	public static void waituntilElementVisibility(WebElement element) {
		try {
			WebDriverWait wb = new WebDriverWait(driver, 20);
			wb.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static WebDriver maximize() {
		try {
			driver.manage().window().maximize();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException();
		}
		return driver;
	}

	public static void actions(String type, WebElement element) {

		Actions action = new Actions(driver);

//		driver.switchTo().frame(frameIndex);

		if (type.equalsIgnoreCase("click")) {

			action.click().build().perform();

		} else if (type.equalsIgnoreCase("contextclick")) {

			action.contextClick(element).build().perform();

		} else if (type.equalsIgnoreCase("moveToElement")) {

			action.moveToElement(element).build().perform();

		} else if (type.equalsIgnoreCase("release")) {

			action.release(element).build().perform();

		} else if (type.equalsIgnoreCase("draganddrop")) {

			action.dragAndDrop(element, element).build().perform();

		} else if (type.equalsIgnoreCase("Doubleclick")) {

			action.doubleClick(element).build().perform();

		} else if (type.equalsIgnoreCase("clickonhold")) {

			action.clickAndHold(element).build().perform();
		}
	}

	public static void Frames(String type, WebElement element, String value) {

		if (type.equalsIgnoreCase("defaultcontent")) {

			driver.switchTo().defaultContent();

		} else if (type.equalsIgnoreCase("id")) {

			driver.switchTo().frame(value);

		} else if (type.equalsIgnoreCase("index")) {

			driver.switchTo().frame(value);

		} else if (type.equalsIgnoreCase("framename")) {

			driver.switchTo().frame(element);

			element.sendKeys(value);
		}

	}
}
