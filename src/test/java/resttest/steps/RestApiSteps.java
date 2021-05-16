package resttest.steps;

import net.thucydides.core.annotations.Step;
import resttest.AppStatus;

public class RestApiSteps {

    public AppStatus currentStatus() {
        int statusCode = 200;
        return (statusCode == 200) ? AppStatus.RUNNING : AppStatus.DOWN;
    }
    @Step("Get current status message")
    public void readStatusMessage() {

    }
}
