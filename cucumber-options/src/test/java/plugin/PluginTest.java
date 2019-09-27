package plugin;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

//Single plugin options
@CucumberOptions(plugin = "html:target/html-report/", glue="glue.stepdef", features="src/test/resources/common")

//Multiple plugin options
//@CucumberOptions(plugin = {"json:target/json-report/report.json", "pretty"}, glue="glue.stepdef", features="src/test/resources/common")

public class PluginTest { }
