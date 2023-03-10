package StepDefinitions;

import Steps.QualificationSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class QualificationStepDefinitions {
    QualificationSteps qualificationSteps;
    public QualificationStepDefinitions() {
        this.qualificationSteps = new QualificationSteps();
    }
    @Given("^me dirija a qualification y filtre por (.*)$")
    public void clicQualifications(String qualifications){
       qualificationSteps.optionQualifications(qualifications);
    }
    @And("^cargue la lista de todos los skills$")
    public void listSkills(){
        qualificationSteps.skillsList();
    }
    @And("^desee eliminar el 4to de la lista$")
    public void deleteQualifications(){
        qualificationSteps.deleteFirstQualifications();
    }
    @When("^agrego un nuevo skill (.*), (.*) y guardo$")
    public void searchSkillDeleted(String nombre, String descripcion){
        qualificationSteps.addSkill(nombre, descripcion);
    }
    @Then("^valido los primeros 3 skills$")
    public void validateSkillsList(){
        qualificationSteps.listSkillsFirst();
    }



}
