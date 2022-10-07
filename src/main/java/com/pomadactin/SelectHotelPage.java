package com.pomadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement selectHotel;
	
	@FindBy(id="continue")
	private WebElement continu;
	


	public SelectHotelPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getSelectHotel() {
		return selectHotel;
	}


	public WebElement getContinu() {
		return continu;
	}
	
	
	
}
