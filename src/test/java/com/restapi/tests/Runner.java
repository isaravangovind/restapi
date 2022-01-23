package com.restapi.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        plugin = "json:target/jsonreports/cucumber-json.json",
        glue = {"com.restapi.steps"}
)
public class Runner {


}
