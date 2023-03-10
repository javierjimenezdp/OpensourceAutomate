package PageObject;

import cucumber.api.java.es.E;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QualificationPageObject extends QualificationWebBasePage{
    String skillElement ="//ul//a[(text()='Replaceable')]";
    @FindBy(xpath = "//ul//li[@class=\"oxd-main-menu-item-wrapper\"]")
    private WebElement bottonAdmin;
    @FindBy(xpath = "//ul//li//span[(text()=\"Qualifications \")]")
    private WebElement bottonQA;
    @FindBy(xpath = "//div[@class=\"orangehrm-header-container\"]")
    private WebElement listSkills;
    @FindBy(xpath = "//div//div[(text()=\"C#\")]")
    private WebElement firstSkill;
    @FindBy(xpath = "//div//div[(text()=\"C/C++\")]")
    private WebElement secondSkill;
    @FindBy(xpath = "//div//div[(text()=\"Content Creation\")]")
    private WebElement thirdSkill;
    @FindBy(xpath = "(//div//div[@class=\"oxd-table-card-cell-checkbox\"])[4]")
    private WebElement clicCheckBox;
    @FindBy(xpath = "(//button//i[@class=\"oxd-icon bi-trash\"])[4]")
    private WebElement clicDeletSkill;
    @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin\"]")
    private WebElement clicConfirmationDelete;
    @FindBy(xpath = "//div[@class=\"orangehrm-container\"]")
    private WebElement confirmationSkill;
    @FindBy(xpath = "//div//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
    private WebElement addSkill;
    @FindBy(xpath = "//h6[(text()=\"Add Skill\")]")
    private WebElement confirmationAddSkill;
    @FindBy(xpath = "(//div//input[@class=\"oxd-input oxd-input--active\"])[2]")
    private WebElement inputName;
    @FindBy(xpath = "//div//textarea[@class=\"oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical\"]")
    private WebElement inputDescription;
    @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")
    private WebElement clicButtonSave;

    public void cliclQualifications() {
        esperaElemnento(bottonAdmin, 5);
        bottonAdmin.click();
        esperaElemnento(bottonQA, 5);
    }

    public void selectSkill(String qualifications) {
        bottonQA.click();
        WebElement element = returnElement(skillElement,qualifications);
        element.click();
    }

    public boolean selectFirstsSkills() {
        esperaElemnento(listSkills, 10);
        return listSkills.isDisplayed();
    }

    public String obtainsTextFirstSkill() {
        esperaElemnento(firstSkill, 10);
        return firstSkill.getText();
    }

    public String obtainsTextSecondSkill() {
        esperaElemnento(secondSkill, 10);
        return secondSkill.getText();
    }

    public String obtainsTextThirdSkill() {
        esperaElemnento(thirdSkill, 10);
        return thirdSkill.getText();
    }

    public void clicCheckBox() {
        esperaElemnento(clicCheckBox, 5);
        clicCheckBox.click();

    }

    public void clicDeleteSkill() {
        esperaElemnento(clicDeletSkill, 5);
        clicDeletSkill.click();
    }

    public void clicConfirmation() {
        esperaElemnento(clicConfirmationDelete, 5);
        clicConfirmationDelete.click();
        esperaElemnento(confirmationSkill, 10);
    }

    public void clicAddSkill() {
        addSkill.click();
        esperaElemnento(confirmationAddSkill, 10);
    }

    public void sendKeysNombre(String nombre) {
        esperaElemnento(inputName, 10);
        inputName.click();
        esperaElemnento(inputName,15);
        inputName.sendKeys(nombre);
    }

    public void sendKeysDescription(String descripcion) {
        esperaElemnento(inputDescription,5);
        inputDescription.click();
        esperaElemnento(inputDescription, 3);
        inputDescription.sendKeys(descripcion);
        esperaElemnento(clicButtonSave,5);
        clicButtonSave.click();
        esperaElemnento(confirmationSkill,15);
    }

    public void searchQaNew() {
    }

    public void isVisibleQaNew() {
    }
}
