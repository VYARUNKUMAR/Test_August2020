package com.maersk.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/com/maersk/Features/"},
		glue = {"com.maersk.StepDefinitions"},
		tags = {"@BlazeDemo"},
		monochrome = true,
		dryRun = false,
		plugin = {"pretty", "html:results/execution/", "json:results/result.json"}
		)

public class Runner {
	
}