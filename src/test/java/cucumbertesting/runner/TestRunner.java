package cucumbertesting.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;
//test
@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"classpath:features"},
		glue="LoginStepDefinitions",
		plugin = {"pretty",
				"html:target/cucumber-reports/Cucumber.html","json:json_output/cucumber.json","junit:juint_xml/cucumber.xml"},
		monochrome=true,//readable output
		//strict=true,
		dryRun=false// throw step def mapping
		
		)


public class TestRunner {

}
 

