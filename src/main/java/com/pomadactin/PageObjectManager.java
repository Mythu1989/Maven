package com.pomadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class PageObjectManager {

	
	public static WebDriver driver;

	private LoginPage login;
	private SearchHotelPage search;
	private SelectHotelPage select;
	private BookAHotelPage book;
	private LogoutPage logout;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public LoginPage getInstanceLogin() {
		login=new LoginPage(driver);
		return login;
	}

	public SearchHotelPage getInstanceSearch() {
		search=new SearchHotelPage(driver);
		return search;
	}

	public SelectHotelPage getInstanceSelect() {
		select=new SelectHotelPage(driver);
		return select;
	}

	public BookAHotelPage getInstanceBook() {
		book=new BookAHotelPage(driver);
		return book;
	}

	public LogoutPage getInstanceLogout() {
		logout=new LogoutPage(driver);
		return logout;
	}

}
