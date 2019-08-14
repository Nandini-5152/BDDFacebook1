package com.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\Automation\\BDDFacebook\\src\\test\\java\\com\\page\\featurefiles\\LoginLogoutpage.feature"
		,glue={"com.page.script"}
		,format={"pretty","html:test-output","json:test_output"}
		//,monochrome={"false"}	
		)
public class MyTestRunner {

}


