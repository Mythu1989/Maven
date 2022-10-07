package com.pomadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotelPage {
	
	public static WebDriver driver;

	@FindBy (xpath="//input[@id='first_name']")
	private WebElement firstName;
	
	@FindBy (xpath="//input[@id='last_name']")
	private WebElement lastName;
	
	@FindBy (id="address")
	private WebElement address;
	
	@FindBy (xpath="(//input[@class='reg_input'])[3]")
	private WebElement cardNo;
	
	@FindBy (xpath="//select[@id='cc_type']")
	private WebElement cardType;
	
	@FindBy (xpath="//select[@id='cc_exp_month']")
	private WebElement expiryMonth;
	
	@FindBy (xpath="//select[@id='cc_exp_year']")
	private WebElement expiryYear;
	
	@FindBy (xpath="//input[@name='cc_cvv']")
	private WebElement cvv;
	
	@FindBy (xpath="//input[@value='Book Now']")
	private WebElement bookNow;
	

	public BookAHotelPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
	
}
