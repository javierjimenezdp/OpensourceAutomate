package StepDefinitions;

import Steps.NewAccountSteps;
import Utils.Utils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import javax.rmi.CORBA.Util;

public class NewAccountStepDefinitions {
    String role = "";
    NewAccountSteps newAccountSteps;
    public NewAccountStepDefinitions() {
        this.newAccountSteps = new NewAccountSteps();
    }
    @Given("^en el home de la pagina de Orange HRM y me dirijo a admin$")
    public  void adminSection(){
        newAccountSteps.adminSectionHome();
    }
    @And("^en el botón agregar una nueva cuenta doy clic$")
    public void addAccount(){
        newAccountSteps.addAccountNew();
    }
    @And("^ingreso el role (.*)$")
    public void setRole(String role){
        this.role=role;
        newAccountSteps.inputRole(Utils.readTxt(Integer.valueOf(role),0));
    }
    @And("^registro el (.*)$")
    public void setStatus(String status){
        newAccountSteps.inputStatus(Utils.readTxt(Integer.valueOf(role),1));
    }
    @And("^busco el nombre de un (.*) aleatorio$")
    public void setNameEmployee(String empleado){
        newAccountSteps.inputEmployee(Utils.readTxt(Integer.valueOf(role),2));
    }
    @And("^valido mi (.*), (.*) y (.*)$")
    public void setDataUserNew(String usuario, String contrasena, String confirmacion){
        newAccountSteps.inputDataNewUser(usuario, contrasena, confirmacion);
    }
    @When("^haya registrados mis datos, procedo a darle clic a salvar cambios$")
    public void bottonSaveAccount(){
        newAccountSteps.clicBottonSave();
    }
    @Then("^realizo la busqueda del nuevo usuario (.*)$")
    public void searchNewAccount(String registrado){
        newAccountSteps.searchNewlyAccount(registrado);
    }
}
