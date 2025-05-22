package com.luckybox;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = { 
    "src/test/resources/Feature/login.feature",
    "src/test/resources/Feature/logout.feature"
    },
    glue = {"com.wbst.stepdefinition"},
    plugin = {  "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:output"
    		
    },
    monochrome = true
)
public class Runnerclass {
	
	
}


