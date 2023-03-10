package Steps;

import PageObject.QualificationPageObject;
import Reports.Reports;
import StepDefinitions.Hooks;
import org.junit.Assert;

public class QualificationSteps {
    String firstSkill = "";
    String secondSkills ="";
    String thirdSkills="";

    QualificationPageObject qualificationPageObject;
    public QualificationSteps( ) {
        this.qualificationPageObject = new QualificationPageObject();
        qualificationPageObject.setDriver(Hooks.getDriver());
    }

    public void optionQualifications(String qualifications) {
        qualificationPageObject.cliclQualifications();
        qualificationPageObject.selectSkill(qualifications);
        qualificationPageObject.selectFirstsSkills();
        Reports.reports("PASS","Se valida la lista de Skills",Reports.takeSnapShot(Hooks.getDriver()));
    }

    public void skillsList() {
        if (!qualificationPageObject.selectFirstsSkills()){
            Reports.reports("FAIL","No hay skills para seleccionar", Reports.takeSnapShot(Hooks.getDriver()));
            Assert.fail("No hay skills para seleccionar");
        }
        firstSkill = qualificationPageObject.obtainsTextFirstSkill();
        Reports.reports("PASS","El nombre del 1er skill de la lista es: " + firstSkill, Reports.takeSnapShot(Hooks.getDriver()));
        secondSkills = qualificationPageObject.obtainsTextSecondSkill();
        Reports.reports("PASS","El nombre del 2do skill de la lista es: " + secondSkills, Reports.takeSnapShot(Hooks.getDriver()));
        thirdSkills = qualificationPageObject.obtainsTextThirdSkill();
        Reports.reports("PASS","El nombre del 3er skill de la lista es: " + thirdSkills, Reports.takeSnapShot(Hooks.getDriver()));
    }

    public void deleteFirstQualifications() {
        qualificationPageObject.clicCheckBox();
        qualificationPageObject.clicDeleteSkill();
        qualificationPageObject.clicConfirmation();
    }

    public void addSkill(String nombre, String descripcion) {
        qualificationPageObject.clicAddSkill();
        qualificationPageObject.sendKeysNombre(nombre);
        Reports.reports("PASS","Se valida la nombre del Skills",Reports.takeSnapShot(Hooks.getDriver()));
        qualificationPageObject.sendKeysDescription(descripcion);
        Reports.reports("PASS","Se valida la descripcion",Reports.takeSnapShot(Hooks.getDriver()));
    }

    public void listSkillsFirst() {
        qualificationPageObject.searchQaNew();
        qualificationPageObject.isVisibleQaNew();
        Reports.reports("PASS","Se valida el nuevo Skill",Reports.takeSnapShot(Hooks.getDriver()));
    }
}
