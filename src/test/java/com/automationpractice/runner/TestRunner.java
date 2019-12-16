package com.automationpractice.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.vimalselvam.cucumber.listener.ExtentProperties;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		glue= {"com.automationpractice.stepdefinations"},
		features= {"src/test/resources/Feature.feature"},		
		tags = {"@FeatureStore"},
		monochrome = true,
		dryRun = false,
	    plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"}
		//plugin = {"pretty","html:target/cucumber-htmlreport","json:target/cucumber-report.json"}
		)


public class TestRunner {
	@BeforeClass
    public static void setup() {
        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
        extentProperties.setReportPath("Output/Extentreport.html");
    }
		    
	}
