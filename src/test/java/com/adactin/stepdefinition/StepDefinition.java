package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.RunnerClass;
import com.baseclass.BaseClassAdactin;
import com.pomadactin.BookAHotelPage;
import com.pomadactin.LoginPage;
import com.pomadactin.PageObjectManager;
import com.pomadactin.SearchHotelPage;
import com.pomadactin.SelectHotelPage;
import com.properties.FileReaderManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClassAdactin {

	public static WebDriver driver = RunnerClass.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);

	@Given("^user Launch the Adactin Application$")
	public void user_Launch_the_Adactin_Application() throws Throwable {
		
		String url = FileReaderManager.getInstanceFRM().getInstanceCR().getUrl();
		driver=getUrl(url);
		
//		driver.get("https://adactinhotelapp.com");
//		driver.manage().window().maximize();
	}

//	@When("^user Enter The Username In Username Field$")
//	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
//
//		inputValueElement(pom.getInstanceLogin().getUserName(), "mythili0806");
//	}
//
//	@When("^user Enter The Password In Password Field$")
//	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
//
//		inputValueElement(pom.getInstanceLogin().getPassWord(), "mythili");
//	}
	
	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
	   
		inputValueElement(pom.getInstanceLogin().getUserName(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
	    
		inputValueElement(pom.getInstanceLogin().getPassWord(), password);
	}

	
	

	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {

		ClickOnElement(pom.getInstanceLogin().getLogin());
	}

	@When("^user Select The Location$")
	public void user_Select_The_Location() throws Throwable {

		dropDown("selectbyvalue", pom.getInstanceSearch().getLocation(), "Melbourne");
//		WebElement location = driver.findElement(By.id("location"));
//		Select L = new Select(location);
//		L.selectByValue("Melbourne");

	}

	@When("^user Select The Hotels$")
	public void user_Select_The_Hotels() throws Throwable {
		
		dropDown("selectByVisibleText",pom.getInstanceSearch().getHotels(), "Hotel Hervey");
//		WebElement hotels = driver.findElement(By.id("hotels"));
//		Select H = new Select(hotels);
//		H.selectByVisibleText("Hotel Hervey");
	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		
		dropDown("selectByIndex", pom.getInstanceSearch().getRoom_type(), "3");
//		WebElement room_Type = driver.findElement(By.id("room_type"));
//		Select R = new Select(room_Type);
//		R.selectByIndex(3);
	}

	@When("^user Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
		
		dropDown("selectByVisibleText", pom.getInstanceSearch().getRoom_nos(), "1 - One");
//		WebElement room_No = driver.findElement(By.id("room_nos"));
//		Select RN = new Select(room_No);
//		RN.selectByVisibleText("1 - One");
	}

	@When("^user Select The Check IN Date$")
	public void user_Select_The_Check_IN_Date() throws Throwable {
		
		clearOnText(pom.getInstanceSearch().getDateIn());
		inputValueElement(pom.getInstanceSearch().getDateIn(), "28/09/2022");
//		WebElement date_In = driver.findElement(By.xpath("//input[@id='datepick_in']"));
//		date_In.clear();
//		date_In.sendKeys("08/08/2022");
	}

	@When("^user Select The Check Out Date$")
	public void user_Select_The_Check_Out_Date() throws Throwable {
		
		clearOnText(pom.getInstanceSearch().getDateOut());
		inputValueElement(pom.getInstanceSearch().getDateOut(), "29/09/2022");
//		WebElement date_Out = driver.findElement(By.xpath("//input[contains(@id,'datepick_out')]"));
//		date_Out.clear();
//		date_Out.sendKeys("09/08/2022");
	}

	@When("^user Selct Adults Per Room$")
	public void user_Selct_Adults_Per_Room() throws Throwable {

		dropDown("selectByVisibleText", pom.getInstanceSearch().getAdultRoom(), "2 - Two");
//		WebElement adults = driver.findElement(By.xpath("//select [@id='adult_room']"));
//		Select ad = new Select(adults);
//		ad.selectByVisibleText("2 - Two");

	}

	@When("^user Children Per Room$")
	public void user_Children_Per_Room() throws Throwable {
		
		dropDown("selectByIndex", pom.getInstanceSearch().getChildRoom(), "1");
//		WebElement child_no = driver.findElement(By.xpath("//select[@id='child_room']"));
//		Select Cn = new Select(child_no);
//		Cn.selectByIndex(1);

	}

	@Then("^user Click The Search Button And It Navigates To Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
		
		ClickOnElement(pom.getInstanceSearch().getSearch());

//		driver.findElement(By.id("Submit")).click();
	}

	@When("^user Select The Radio Button$")
	public void user_Select_The_Radio_Button() throws Throwable {
		
		ClickOnElement(pom.getInstanceSelect().getSelectHotel());
//		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();

	}

	@Then("^user Click The Continue Button And It Navigates To Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {
		
		ClickOnElement(pom.getInstanceSelect().getContinu());
//		driver.findElement(By.id("continue")).click();
	}

	@When("^user Enter The First Name$")
	public void user_Enter_The_First_Name() throws Throwable {
		
		inputValueElement(pom.getInstanceBook().getFirstName(), "Mythili");
//		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Mythili");

	}

	@When("^user Enter The Last Name$")
	public void user_Enter_The_Last_Name() throws Throwable {
		
		inputValueElement(pom.getInstanceBook().getLastName(), "S");
//		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("S");

	}

	@When("^user Enter The Billing Address$")
	public void user_Enter_The_Billing_Address() throws Throwable {
		
		inputValueElement(pom.getInstanceBook().getAddress(), "Ganga foundation ,Est ,Usa");
//		driver.findElement(By.id("address")).sendKeys("Ganga foundation ,Est ,Usa");

	}

	@When("^user Enter The Credit Card Number$")
	public void user_Enter_The_Credit_Card_Number() throws Throwable {
		
		inputValueElement(pom.getInstanceBook().getCardNo(), "123456789012d4512");
//		driver.findElement(By.xpath("(//input[@class='reg_input'])[3]")).sendKeys("123456789012d4512");

	}

	@When("^user Enter The Credit Card Type$")
	public void user_Enter_The_Credit_Card_Type() throws Throwable {
		
		dropDown("selectByValue", pom.getInstanceBook().getCardType(), "AMEX");
//		WebElement type_Card = driver.findElement(By.xpath("//select[@id='cc_type']"));
//		Select vv = new Select(type_Card);
//		vv.selectByValue("AMEX");
	}

	@When("^user Enter The Expiry Date$")
	public void user_Enter_The_Expiry_Date() throws Throwable {
		
		dropDown("selectByVisibleText", pom.getInstanceBook().getExpiryMonth(), "October");
//		WebElement expiry_Month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
//		Select month = new Select(expiry_Month);
//		month.selectByVisibleText("October");

	}

	@When("^user Enter The Expiry Year$")
	public void user_Enter_The_Expiry_Year() throws Throwable {
		
		dropDown("selectByValue", pom.getInstanceBook().getExpiryYear(), "2022");
//		WebElement expiry_Year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
//		Select ww = new Select(expiry_Year);
//		ww.selectByValue("2022");

	}

	@When("^User Enter The CVV Number$")
	public void user_Enter_The_CVV_Number() throws Throwable {
		
		inputValueElement(pom.getInstanceBook().getCvv(), "123");
//		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("123");
		Thread.sleep(3000);
	}

	@Then("^user Click The Book Now And It Navigates To Select Book Now$")
	public void user_Click_The_Book_Now_And_It_Navigates_To_Select_Book_Now() throws Throwable {
		
		ClickOnElement(pom.getInstanceBook().getBookNow());
//		driver.findElement(By.xpath("//input[@value='Book Now']")).click();
		Thread.sleep(5000);
	}

	@Then("^user Click Logout And Navigates To Successfully Logout Page$")
	public void user_Click_Logout_And_Navigates_To_Successfully_Logout_Page() throws Throwable {
		
		ClickOnElement(pom.getInstanceLogout().getLogout());
//		driver.findElement(By.id("logout")).click();
	}

}
