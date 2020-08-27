package com.maersk.StepDefinitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BlazeDemoSteps {
	
	@Given("I navigated successfully to website")
	public void I_Navigated_Successfully_To_Website(){
		Hooks.objBlazeDemoPage.verifyUserNavigatedSuccessfully();
	}
	
	@When("I select departure city as \"([^\"]*)\"")
	public void I_Select_Departure_City_As(String departure){
		Hooks.objBlazeDemoPage.enterDeparture(departure);
	}
	
	@And("I select destination city as \"([^\"]*)\"")
	public void I_Select_Destination_City_As(String destination){
		Hooks.objBlazeDemoPage.enterDestination(destination);
	}
	
	@When("I click on Find Flights button")
	public void I_Click_On_Find_Flights_Button(){
		Hooks.objBlazeDemoPage.findFlightsClick();
	}

	
	@When("I click on Choose This Flight button for Flight \"([^\"]*)\" on Reservation Page")
	public void I_Click_On_Choose_This_Flight_Button(String flightNum){
		Hooks.objBlazeDemoPage.chooseThisFlightBtnClick(flightNum);
	}
	
	/*@When("I enter all my details on Purchase Page")
	public void I_Enter_All_My_Details(){
		
	}*/
	
	@And("I click on Purchase Flight button")
	public void I_Click_On_Purchase_Flight_Button(){
		Hooks.objBlazeDemoPage.purchaseFlightBtnClick();
	}
	
	@And("Print the Confirmation id on Confirmation Page")
	public void Print_The_Confirmation_id(){
		Hooks.objBlazeDemoPage.displayConfirmationID();
	}
	
}