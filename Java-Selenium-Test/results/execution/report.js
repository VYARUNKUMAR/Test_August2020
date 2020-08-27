$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/maersk/Features/BlazeDemo.feature");
formatter.feature({
  "name": "User should be able to",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@BlazeDemo"
    }
  ]
});
formatter.scenario({
  "name": "Verify the Confirmation id for the successful booking",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BlazeDemo"
    },
    {
      "name": "@New"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigated successfully to website",
  "keyword": "Given "
});
formatter.match({
  "location": "BlazeDemoSteps.I_Navigated_Successfully_To_Website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select departure city as \"Boston\"",
  "keyword": "When "
});
formatter.match({
  "location": "BlazeDemoSteps.I_Select_Departure_City_As(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select destination city as \"London\"",
  "keyword": "And "
});
formatter.match({
  "location": "BlazeDemoSteps.I_Select_Destination_City_As(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Find Flights button",
  "keyword": "When "
});
formatter.match({
  "location": "BlazeDemoSteps.I_Click_On_Find_Flights_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Choose This Flight button for Flight \"43\" on Reservation Page",
  "keyword": "And "
});
formatter.match({
  "location": "BlazeDemoSteps.I_Click_On_Choose_This_Flight_Button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Purchase Flight button",
  "keyword": "And "
});
formatter.match({
  "location": "BlazeDemoSteps.I_Click_On_Purchase_Flight_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Print the Confirmation id on Confirmation Page",
  "keyword": "And "
});
formatter.match({
  "location": "BlazeDemoSteps.Print_The_Confirmation_id()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});