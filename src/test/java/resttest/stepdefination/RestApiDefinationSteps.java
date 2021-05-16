package resttest.stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import resttest.steps.RestApiSteps;
import uitest.mackTrucks.steps.EndUserSteps;

public class RestApiDefinationSteps {

    @Steps
    RestApiSteps steps;

    @Given("the application is running")
    public void the_application_is_running() {
        Assert.assertTrue(true);
    }

    @When("I check the application status")
    public void i_check_the_application_status() {

    }
    @Then("the API should return {string}")
    public void the_API_should_return(String expectedMessage) {

    }

}
