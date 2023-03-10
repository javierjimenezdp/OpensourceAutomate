package Steps;

import PageObject.DeletePageObject;
import Reports.Reports;
import StepDefinitions.Hooks;
import org.junit.Assert;

public class DeleteSteps {
    String user = "";
    DeletePageObject deletePageObject;
    public DeleteSteps() {
        this.deletePageObject = new DeletePageObject();
        deletePageObject.setDriver(Hooks.getDriver());
    }


    public void isVisibleHome() {
        deletePageObject.isVisibleHome();
        Reports.reports("PASS","Se valida dashBord",Reports.takeSnapShot(Hooks.getDriver()));
    }

    public void isVisibleList() {
        deletePageObject.isVisibleListUser();
        Reports.reports("PASS","Se valida list Record",Reports.takeSnapShot(Hooks.getDriver()));
    }

    public void searchUser() {
        deletePageObject.searchAnyUser();
        Reports.reports("PASS","Se valida 1er usuario de la lista",Reports.takeSnapShot(Hooks.getDriver()));
    }
    public void getTextNameUser(){
        if (!deletePageObject.searchAnyUser()){
            Reports.reports("FAIL","No hay usuarios para eliminar", Reports.takeSnapShot(Hooks.getDriver()));
            Assert.fail("No hay usuarios para eliminar");
        }
        user = deletePageObject.obtainsTextUserDelete();
        Reports.reports("PASS","El nombre del 1er usuario de la lista es: " + user, Reports.takeSnapShot(Hooks.getDriver()));
        deletePageObject.clicCheckBox();
    }


    public void clicDeleteUser() {
        deletePageObject.clicDeleteUserBotton();
        deletePageObject.clicConfirmDelete();
    }

    public void notVisibleDeletedUser(String admin) {
        deletePageObject.clicInputUserName();
        deletePageObject.sendKeysUserName(user);
        deletePageObject.trySearchUserDeleted();
        Reports.reports("PASS","El usuario ha sido eliminado de manera satisfactoria", Reports.takeSnapShot(Hooks.getDriver()));
        deletePageObject.stayAdminBotton();
        deletePageObject.isVisibleHomeAdmin();
    }

}
