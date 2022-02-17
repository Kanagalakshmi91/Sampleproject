package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ADMIN1\\AdactinCucumberproject\\src\\test\\resources\\Adactin\\adactin.feature",glue = "Stepdefinition")
public class Runnerclass {
	
}
