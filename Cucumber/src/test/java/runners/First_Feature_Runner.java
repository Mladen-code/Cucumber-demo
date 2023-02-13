package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/first_feature.feature",
        glue={"steps"},
        tags = "@secondTag"
)

public class First_Feature_Runner {
}
