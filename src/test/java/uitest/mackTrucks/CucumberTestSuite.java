package uitest.mackTrucks;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(strict = true,
        plugin = {"pretty"},
        features = "src/test/resources/uifeature",
        glue = {"uitest.mackTrucks.stepDefinitions"}
)
public class CucumberTestSuite {}
