@BlazeDemo
Feature: User should be able to

@ConfirmationPage
Scenario: Verify the Confirmation id display for the successful booking
	Given I navigated successfully to website
	When I select departure city as "Boston"
	And I select destination city as "London"
	When I click on Find Flights button
	And I click on Choose This Flight button for Flight "43" on Reservation Page
	#And I enter all my details on Purchase Page
	And I click on Purchase Flight button
	Then Print the Confirmation id on Confirmation Page 
