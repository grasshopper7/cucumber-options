package nameregex;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(name = "counter", glue="glue.stepdef", features="src/test/resources/common")
public class NameRegexTest { }
