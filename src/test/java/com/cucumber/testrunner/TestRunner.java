package com.cucumber.testrunner;


@io.cucumber.junit.CucumberOptions(features="/CucumberFramework/src/test/resources/Features/Login.feature",
tags="@smoke",
glue={"com.cucumber.stepdefination","com.framework.config"},
plugin= {"preety","html:reports/cucumber-reports/cucumber.html/"}
,monochrome=true
,dryRun=false)
public class TestRunner{ //extends //AbstractTestNGCucumberTests{

}
 