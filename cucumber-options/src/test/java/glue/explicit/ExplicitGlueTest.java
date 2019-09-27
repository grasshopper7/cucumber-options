package glue.explicit;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

//Single glue option
@CucumberOptions(glue = "glue.stepdef")

//Multiple glue options
//@CucumberOptions(glue = {"glue.stepdef","glue.hook"})

public class ExplicitGlueTest { }
