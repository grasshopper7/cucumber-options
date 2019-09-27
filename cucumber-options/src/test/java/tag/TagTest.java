package tag;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

//Single Tag Test 
@CucumberOptions(tags = "@First", glue="glue.stepdef", features="src/test/resources/common")

//Multiple Tag Test
//@CucumberOptions(tags = {"@First","@Counter"}, glue="glue.stepdef", features="src/test/resources/common")

//Tag Expression Test
//@CucumberOptions(tags = "@Counter or @Bar", glue="glue.stepdef", features="src/test/resources/common")

public class TagTest { }
