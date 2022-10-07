$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User Login In The Adaction WebApplication",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-adaction-webapplication",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch the Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-adaction-webapplication;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;user-login-in-the-adaction-webapplication;;1"
    },
    {
      "cells": [
        "AAA",
        "123"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;user-login-in-the-adaction-webapplication;;2"
    },
    {
      "cells": [
        "mythili0806",
        "mythili"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;user-login-in-the-adaction-webapplication;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "User Login In The Adaction WebApplication",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-adaction-webapplication;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch the Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"AAA\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_the_Adactin_Application()"
});
formatter.result({
  "duration": 7637659800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AAA",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 241982100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 91442900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 351544501,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User Login In The Adaction WebApplication",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-adaction-webapplication;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch the Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"mythili0806\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"mythili\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_the_Adactin_Application()"
});
formatter.result({
  "duration": 255957399,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mythili0806",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 98351299,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mythili",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 91831700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 655454500,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "User Search Hotel In this Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-search-hotel-in-this-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user Select The Location",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user Select The Hotels",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Select The Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select The Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select The Check IN Date",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Select The Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Selct Adults Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Children Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Click The Search Button And It Navigates To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Location()"
});
formatter.result({
  "duration": 159693300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Hotels()"
});
formatter.result({
  "duration": 157925301,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Room_Type()"
});
formatter.result({
  "duration": 305479300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Number_Of_Rooms()"
});
formatter.result({
  "duration": 102485499,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Check_IN_Date()"
});
formatter.result({
  "duration": 143719401,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Check_Out_Date()"
});
formatter.result({
  "duration": 135867500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Selct_Adults_Per_Room()"
});
formatter.result({
  "duration": 221180201,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Children_Per_Room()"
});
formatter.result({
  "duration": 195757300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 500843300,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "User Selected Hotel In This Page Displayed",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-selected-hotel-in-this-page-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "user Select The Radio Button",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user Click The Continue Button And It Navigates To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Radio_Button()"
});
formatter.result({
  "duration": 91430200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 530392001,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "In User Book A Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;in-user-book-a-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "user Enter The First Name",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "user Enter The Last Name",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Enter The Billing Address",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Enter The Credit Card Number",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Enter The Credit Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Enter The Expiry Date",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Enter The Expiry Year",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "User Enter The CVV Number",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Click The Book Now And It Navigates To Select Book Now",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_First_Name()"
});
formatter.result({
  "duration": 115687800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Last_Name()"
});
formatter.result({
  "duration": 83677599,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Billing_Address()"
});
formatter.result({
  "duration": 225474400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Credit_Card_Number()"
});
formatter.result({
  "duration": 100263101,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Credit_Card_Type()"
});
formatter.result({
  "duration": 184510600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Expiry_Date()"
});
formatter.result({
  "duration": 254278599,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Expiry_Year()"
});
formatter.result({
  "duration": 320224600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_CVV_Number()"
});
formatter.result({
  "duration": 3185342400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Book_Now_And_It_Navigates_To_Select_Book_Now()"
});
formatter.result({
  "duration": 5079936299,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "In The Booking Confirmation Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;in-the-booking-confirmation-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 44,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 46,
  "name": "user Click Logout And Navigates To Successfully Logout Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Click_Logout_And_Navigates_To_Successfully_Logout_Page()"
});
formatter.result({
  "duration": 3778457000,
  "status": "passed"
});
});