package Runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature/login.feature",glue= {"StepDefinitions"},
monochrome=true,
plugin= {"pretty","junit:reports/junitReports/report.xml","json:reports/JSONReport/report.json",
		"html:reports/HtmlReports"},
tags="@login"
		)
public class loginRunner {

}
