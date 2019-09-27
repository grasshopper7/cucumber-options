package undefined;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/undefined", dryRun = true, snippets = SnippetType.CAMELCASE)
public class UndefinedSnippetDryTest {
}
