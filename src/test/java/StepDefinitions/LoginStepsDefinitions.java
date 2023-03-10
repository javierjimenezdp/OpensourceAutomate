package StepDefinitions;

import Steps.LoginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

public class LoginStepsDefinitions {
    LoginSteps loginSteps;
    public LoginStepsDefinitions() {
        this.loginSteps = new LoginSteps();
    }
    @Given("^extraiga los valores de la pagina$")
    public void getText() throws IOException {
        loginSteps.getTextPage();
    }
    @When("^me loguee con (.*) y (.*)$")
    public void inputData(String usuario, String contraseña){
        loginSteps.inputDataUser(usuario, contraseña);
    }
    @Then("^valido el home del usuario nuevo$")
    public void validateHome(){
        loginSteps.isVisibleHomeUser();
    }
    @Given("^ingreso al home de la pagina HRM con (.*) y (.*)$")
    public void inputScenario2(String usuario, String contraseña) throws IOException {
        loginSteps.getTextPage();
        loginSteps.inputDataUser(usuario, contraseña);
        loginSteps.isVisibleHomeUser();
    }

}
