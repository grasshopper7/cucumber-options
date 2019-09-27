package feature;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)

//Single feature options
@CucumberOptions(glue="glue.stepdef", features="src/test/resources/feature/barordering.feature")

//Multiple feature options
//@CucumberOptions(glue="glue.stepdef", features={"src/test/resources/feature/barordering.feature","src/test/resources/feature/counterordering.feature:3"})

public class FeatureTest { }
