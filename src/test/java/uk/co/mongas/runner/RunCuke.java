package uk.co.mongas.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/resources/features",
        glue = {"uk/co/mongas/steps"},
        tags = "@smoke",
        plugin = {"html:target/cucumber-reports/cucumber-html-report.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class RunCuke extends AbstractTestNGCucumberTests {

}