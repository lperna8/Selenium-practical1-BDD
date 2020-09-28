package searchOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@Runwith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefinition")

public class TestRunner {

}
