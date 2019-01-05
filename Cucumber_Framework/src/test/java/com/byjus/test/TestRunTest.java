package com.byjus.test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features= "C:\\Users\\Archana\\Downloads\\Cucumber-master\\Cucumber_Framework\\Features",
		glue= {"com.byjus.qa.stepDef"},
		tags= {"@addition"},
		monochrome= true,
		plugin={"usage","html:target/cucumber-html-report","json:target/cucumber.json", "pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json","junit:target/cucumber-results.xml"}
				
		)




public class TestRunTest extends AbstractTestNGCucumberTests {



}
