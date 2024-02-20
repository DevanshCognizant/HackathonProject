package com.GSD.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {".//FeatureFiles/carLoan.feature"}, 
		glue = "com.GSD.stepDefinitions", 
		plugin = {"pretty","html:reports/report.html"},
		dryRun=false,
		monochrome=true
		)

public class testRunner {
}
