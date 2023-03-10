package StepDefinitions;

import Steps.SearchSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import javax.swing.plaf.PanelUI;

public class SearchStepDefinitions {
    SearchSteps searchSteps;
    public SearchStepDefinitions() {
        this.searchSteps = new SearchSteps();
    }
    @Given("^busco un usuario de la lista$")
    public void searchList(){
        searchSteps.searchUserList();
    }
    @And("^extraigo el username, user_role, employee_name y el status$")
    public void obstainsInfoUser(){
        searchSteps.getUserInfo();
    }
    @And("^cargue los datos del usuario en el buscador$")
    public void searchUserName(){
        searchSteps.searchUserNameData();
    }
    @And("pueda observar los datos del usuario procedo a cambiar su (.*) y guardar cambios$")
    public void changeStatus(String status){
        searchSteps.changeStatusCurrent(status);
    }
    @When("^vuelva a realizar la busqueda del mismo usuario$")
    public void searchNewStatus(){
        searchSteps.searchNewUserStatus();
    }
    @Then("^debera cargar la info actualizada$")
    public void searchCurrentData(){
        searchSteps.seeNewInfoUser();
    }

}
