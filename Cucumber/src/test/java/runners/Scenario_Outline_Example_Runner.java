package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/scenario_outline_example.feature",
        glue={"steps"},
        plugin = { "pretty", "html:target/cucumber-reports.html" }
)

public class Scenario_Outline_Example_Runner {
}
