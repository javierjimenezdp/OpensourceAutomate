package Steps;

import PageObject.SearchPageObject;
import Reports.Reports;
import StepDefinitions.Hooks;
import org.junit.Assert;

public class SearchSteps {
    String userName = "";
    SearchPageObject searchPageObject;
    public SearchSteps() {
        this.searchPageObject = new SearchPageObject();
        searchPageObject.setDriver(Hooks.getDriver());
    }
    public void searchUserList() {
        searchPageObject.dashBoardAdmin();
        searchPageObject.selectAnyUser();
        Reports.reports("PASS","Se valida 1er usuario de la lista",Reports.takeSnapShot(Hooks.getDriver()));

    }
    public void getUserInfo() {
        if (!searchPageObject.selectAnyUser()){
            Reports.reports("FAIL","No hay usuarios para seleccionar", Reports.takeSnapShot(Hooks.getDriver()));
            Assert.fail("No hay usuarios para seleccionar");
        }
        userName = searchPageObject.obtainsTextUser();
        Reports.reports("PASS","El nombre del 1er usuario de la lista es: " + userName, Reports.takeSnapShot(Hooks.getDriver()));
        searchPageObject.clicCheckBox();
    }
    public void changeStatusCurrent(String status) {
        searchPageObject.changeStatus(status);
        Reports.reports("INFO","Se cambió el STATUS",Reports.takeSnapShot(Hooks.getDriver()));
    }
    public void searchUserNameData() {
        searchPageObject.isVisibleHome();
        searchPageObject.sendKeysUserName(userName);
    }
    public void searchNewUserStatus() {
        searchPageObject.searchNewStatus();
    }

    public void seeNewInfoUser() {
        searchPageObject.isVisibleNewStatus();
        Reports.reports("PASS","Se valida el nuevo Status del usuario",Reports.takeSnapShot(Hooks.getDriver()));
    }
}
