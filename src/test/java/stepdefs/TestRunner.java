package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		monochrome= true,
		plugin = {"pretty","html:target/html-cucumber","json:target/cucumber.json"},
		features="src/test/java/features", 
		glue = "stepdefs",
	    //tags = {"@WIP"}
		//tags = {"@Sanity"} 
		//tags = {"@Regression or @Sanity"} //either Regression or Sanity
		//tags = {"@Regression and @Sanity"} //both the tags should be there
		//tags = {"@Calculator"} //in NewCalculator.feature file and feature level tag
		//tags = {"Not @WIP"} //run all the scenarios except WIP
		tags = {"@Browser and not @WIP"} // run all the browser scenarios except WIP

		
		)

public class TestRunner {

}
