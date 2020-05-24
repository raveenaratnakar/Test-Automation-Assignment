package com.argos.test;
 
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature",glue={"com.argos.stepdefinitions"})
public class TestRunner {
 
}
