package PageObject;

import com.ibm.icu.text.Replaceable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewPageObject extends NewWebBasePage{
    String inputRole="//span[contains(text(),'Replaceable')]";
    String inputStatus="//span[contains(text(),'Replaceable')]";
    String searchNewAccount ="//div[contains(text(),'Replaceable')]";
    @FindBy(xpath = "//ul//li//a[@class=\"oxd-main-menu-item\"]")
    private WebElement isVisibleElementeAdmin;
    @FindBy(xpath = "//div//button//i[@class=\"oxd-icon bi-plus oxd-button-icon\"]")
    private WebElement clicBottonAdd;
    @FindBy(xpath = "//label[contains(text(),\"User Role\")]")
    private WebElement isVisibleUserNew;
    @FindBy(xpath = "//div[@class=\"oxd-select-text-input\"]")
    private WebElement selectRole;
    @FindBy(xpath = "(//div[@class=\"oxd-select-text-input\"])[2]")
    private WebElement selecStatus;
    @FindBy(xpath = "//input[@placeholder=\"Type for hints...\"]")
    private WebElement selectEmployee;
    @FindBy(xpath = "//input[@autocomplete=\"off\"]")
    private WebElement inputUsername;
    @FindBy(xpath = "//input[@type=\"password\"]")
    private WebElement inputPassword;
    @FindBy(xpath = "(//input[@type=\"password\"])[2]")
    private WebElement inputConfirmation;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement clicBottonSave;
    @FindBy(xpath = "//ul//li//a[@class=\"oxd-main-menu-item\"]")
    private WebElement bottonAdmin;
    @FindBy(xpath = "//div//ul//li//span[@class=\"oxd-userdropdown-tab\"]")
    private WebElement dashBoardHome;


    public boolean isVisibleAdmi() {
        esperaElemnento(isVisibleElementeAdmin, 10);
        return isVisibleElementeAdmin.isDisplayed();
    }

    public void bottonAddAccount() {
        esperaElemnento(clicBottonAdd, 10);
        clicBottonAdd.click();
    }
    public boolean isVisibleAddUser() {
        esperaElemnento(isVisibleUserNew,10);
        return isVisibleUserNew.isDisplayed();
    }

    public void selectUserRole(String role) {
        esperaElemnento(selectRole, 10);
        selectRole.click();
        threadTest(1);
        WebElement element = returnElement(inputRole, role);
        element.click();
    }

    public void selectStatus(String status) {
        esperaElemnento(selecStatus, 10);
        selecStatus.click();
        WebElement element = returnElement(inputStatus,status);
        element.click();
    }

    public void imputEmployee(String empleado) {
        esperaElemnento(selectEmployee, 10);
        selectEmployee.click();
        selectEmployee.sendKeys(empleado);
        threadTest(5);
        selectEmployee.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void sendKeysInputUsername(String usuario) {
        esperaElemnento(inputUsername, 10);
        inputUsername.click();
        inputUsername.sendKeys(usuario);
    }

    public void sendKeysInputPassword(String contrasena) {
        esperaElemnento(inputPassword, 10);
        inputPassword.click();
        inputPassword.sendKeys(contrasena);
    }

    public void sendKeysInputConfirmPassword(String confirmacion) {
        esperaElemnento(inputConfirmation, 10);
        inputConfirmation.click();
        inputConfirmation.sendKeys(confirmacion);
    }

    public void clicBottonSave() {
        esperaElemnento(clicBottonSave, 10);
        clicBottonSave.click();
    }

    public boolean searchNewUser(String registrado) {
        WebElement element = returnElement(searchNewAccount, registrado);
        scrollElement(element);
        return waitUntilElementIsVisibleNonThrow(element, 10);
    }

    public void stayAdminBotton() {
        esperaElemnento(bottonAdmin,10);
        bottonAdmin.click();
    }
    public boolean isVisibleHomeAdmin() {
        esperaElemnento(dashBoardHome, 10);
        return dashBoardHome.isDisplayed();
    }
}
