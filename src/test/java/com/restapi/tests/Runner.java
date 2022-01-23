package com.restapi.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/cucumber/report.html",
                "summary",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber-html-reports"
        },
        glue = {"com.restapi.steps"}
)
public class Runner {


}
