package Steps;

import PageObject.NewPageObject;
import Reports.Reports;
import StepDefinitions.Hooks;
import org.junit.Assert;

public class NewAccountSteps {
    NewPageObject newPageObject;
    public NewAccountSteps() {
        this.newPageObject = new NewPageObject();
        newPageObject.setDriver(Hooks.getDriver());
    }

    public void adminSectionHome() {
        newPageObject.isVisibleAdmi();
    }

    public void addAccountNew() {
        newPageObject.bottonAddAccount();
        newPageObject.isVisibleAddUser();
    }

    public void inputRole(String role) {
        newPageObject.selectUserRole(role);
        Reports.reports("INFO","Se ingresó el ROL",Reports.takeSnapShot(Hooks.getDriver()));
    }

    public void inputStatus(String status) {
        newPageObject.selectStatus(status);
        Reports.reports("INFO","Se ingresó el STATUS",Reports.takeSnapShot(Hooks.getDriver()));
    }

    public void inputEmployee(String empleado) {
        newPageObject.imputEmployee(empleado);
        Reports.reports("INFO","Se ingresó el EMPLEADO",Reports.takeSnapShot(Hooks.getDriver()));
    }

    public void inputDataNewUser(String usuario, String contrasena, String confirmacion) {
        newPageObject.sendKeysInputUsername(usuario);
        Reports.reports("INFO","Se ingresó el usuario",Reports.takeSnapShot(Hooks.getDriver()));
        newPageObject.sendKeysInputPassword(contrasena);
        Reports.reports("INFO","Se ingresó la contraseña",Reports.takeSnapShot(Hooks.getDriver()));
        newPageObject.sendKeysInputConfirmPassword(confirmacion);
        Reports.reports("INFO","Se ingresó la confirmacion de contraseña",Reports.takeSnapShot(Hooks.getDriver()));
    }

    public void clicBottonSave() {
        newPageObject.clicBottonSave();
    }

    public void searchNewlyAccount(String registrado) {
        if(!newPageObject.searchNewUser(registrado)){
            Reports.reports("FAIL","User no encontrado",Reports.takeSnapShot(Hooks.getDriver()));
            Assert.fail("User no encontrado");
        }
        newPageObject.threadTest(1);
        Reports.reports("PASS","Se valida usuario registrado",Reports.takeSnapShot(Hooks.getDriver()));
        newPageObject.stayAdminBotton();
        newPageObject.isVisibleHomeAdmin();
    }
}
