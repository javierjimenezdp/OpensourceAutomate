package Steps;

import PageObject.AddPageObject;
import StepDefinitions.Hooks;

public class AddSteps {
    AddPageObject addPageObject;

    public AddSteps() {
        this.addPageObject = new AddPageObject();
        addPageObject.setDriver(Hooks.getDriver());
    }


}
