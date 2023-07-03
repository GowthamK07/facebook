package com.facebook;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/gowtham/eclipse-workspace/Facebook/src/test/resources/signup.feature",
                      glue ="com.facebook" ,
                      plugin = {"html:target","json:target/report.json"},
                      dryRun = false
                   
                      
                     )
                     
                    

public class TestRunner {
	

}
