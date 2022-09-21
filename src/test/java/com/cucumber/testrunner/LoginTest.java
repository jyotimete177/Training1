package com.cucumber.testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)																																										
@CucumberOptions(features="D:\\java\\CucumberFramework\\src\\test\\resources\\Features\\Login.feature",
glue="com.cucumber.stepdefination",monochrome=true

,dryRun=false,
plugin={"html:target/cucumber-html-report", "json:target/cucumber-reports/cucumber.json",
		  "junit:target/cucumber-reports/cucumber.xml",})
public class LoginTest {

}
//@RunWith(Cucumber.class)
//@CucumberOptions(features= "Features", glue = {"stepDefinitions"},
//plugin = { "html:target/cucumber-html-report", "json:target/cucumber-reports/cucumber.json",
//  "junit:target/cucumber-reports/cucumber.xml",
//  },
//monochrome = true,
//tags = "@HomeScenario2"
//)
//public class TestRunner {
//

//}