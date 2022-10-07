Feature: Hotel Booking In Adactin Application

@test
Scenario Outline: User Login In The Adaction WebApplication
Given  user Launch the Adactin Application
When  user Enter The "<Username>" In Username Field
And user Enter The "<Password>" In Password Field
Then user Click The Login Button And It Navigates To Search Hotel Page

Examples:
|Username|Password|
|AAA|123|
|mythili0806|mythili|

@test
Scenario: User Search Hotel In this Page
When user Select The Location
And  user Select The Hotels
And user Select The Room Type
And user Select The Number Of Rooms
And user Select The Check IN Date
And user Select The Check Out Date
And user Selct Adults Per Room
And user Children Per Room
Then user Click The Search Button And It Navigates To Select Hotel Page

@test
Scenario: User Selected Hotel In This Page Displayed
When user Select The Radio Button
Then user Click The Continue Button And It Navigates To Book A Hotel Page

@test
Scenario: In User Book A Hotel Page 
When user Enter The First Name 
And user Enter The Last Name
And user Enter The Billing Address
And user Enter The Credit Card Number
And user Enter The Credit Card Type
And user Enter The Expiry Date
And user Enter The Expiry Year
And User Enter The CVV Number
Then user Click The Book Now And It Navigates To Select Book Now

@test
Scenario: In The Booking Confirmation Page
Then user Click Logout And Navigates To Successfully Logout Page

