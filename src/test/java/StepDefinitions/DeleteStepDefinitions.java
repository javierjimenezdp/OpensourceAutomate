package StepDefinitions;

import Steps.DeleteSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteStepDefinitions {
    DeleteSteps deleteSteps;
    public DeleteStepDefinitions() {
        this.deleteSteps = new DeleteSteps();
    }
    @Given("^ingreso al home de la pagina HRM con$")
    public void validateHomeUserNew(){
        deleteSteps.isVisibleHome();

    }
    @And("^me loggue con la cuenta de Admin que carga en el home de Orange$")
    public void isVisibleList() {
        deleteSteps.isVisibleList();
    }

    @And("^procedo a buscar cualquier usuario (.*) en la lista$")
    public void searchAnyUser(String empleado) {
        deleteSteps.searchUser();
        deleteSteps.getTextNameUser();
    }

    @When("^marco el checkbox y procedo a eliminar el usuario$")
    public void clicCheckBox() {
        deleteSteps.clicDeleteUser();
    }

    @Then("^valido que al buscar el (.*), no cargue nada.$")
    public void notVisibleUserDeleted(String admin) {
        deleteSteps.notVisibleDeletedUser(admin);
    }


}
