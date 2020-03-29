package com.elsiver;

import com.elsiver.utilities.Setup;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
                 format ={"html:target/cucumber-html-report", "json:target/cucumber.json"},
                 tags = {"@test"},
                 features ="src/test/resources/features",
                 glue = {"com.elsiver.utilities",
                         "com.elsiver.stepdefinitions"})

public class RunCuckesTest extends Setup {

}









