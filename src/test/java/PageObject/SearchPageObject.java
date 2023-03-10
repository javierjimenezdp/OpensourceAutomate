package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageObject extends SearchWebBasePage{
    String inputStatus="//span[contains(text(),'Replaceable')]";
    @FindBy(xpath = "//ul//li[@class=\"oxd-main-menu-item-wrapper\"]")
    private WebElement bottonAdmin;
    @FindBy(xpath = "(//div[@class=\"oxd-table-cell oxd-padding-cell\"])[8]")
    private WebElement searchUserFirst;
    @FindBy(xpath = "(//div[contains(@style,\"flex\")])[11]")
    private WebElement obtainsTextUser;
    @FindBy(xpath = "(//div//div[@class=\"oxd-table-card-cell-checkbox\"])[2]")
    private WebElement clicCheckBox;
    @FindBy(xpath = "(//button//i[@class=\"oxd-icon bi-pencil-fill\"])[2]")
    private WebElement clicEditUser;
    @FindBy(xpath = "(//div[@class=\"oxd-select-text-input\"])[2]")
    private WebElement selecStatus;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement clicBottonSave;
    @FindBy(xpath = "//div[@class=\"orangehrm-horizontal-padding orangehrm-vertical-padding\"]")
    private WebElement dashBoard;
    @FindBy(xpath = "(//div//input[@class=\"oxd-input oxd-input--active\"])[2]")
    private WebElement clicInputUserName;
    @FindBy(xpath = "//div[@class=\"oxd-table-filter-header-title\"]//following::input")
    private WebElement clicSearchUser;


    public void dashBoardAdmin() {
        esperaElemnento(bottonAdmin, 5);
        bottonAdmin.click();
    }
    public boolean selectAnyUser() {
        esperaElemnento(searchUserFirst, 5);
        scrollElement(searchUserFirst);
        esperaElemnento(searchUserFirst, 5);
        return searchUserFirst.isDisplayed();
    }

    public String obtainsTextUser() {
        return obtainsTextUser.getText();
    }
    public void clicCheckBox() {
        esperaElemnento(clicCheckBox, 3);
        clicCheckBox.click();
        clicEditUser.click();
    }
    public void changeStatus(String status) {
        esperaElemnento(selecStatus, 10);
        selecStatus.click();
        WebElement element = returnElement(inputStatus,status);
        element.click();
        esperaElemnento(clicBottonSave, 10);
        clicBottonSave.click();
        esperaElemnento(bottonAdmin, 10);
    }
    public boolean isVisibleHome() {
        esperaElemnento(dashBoard,10);
        return dashBoard.isDisplayed();
    }
    public void sendKeysUserName(String userName) {
        esperaElemnento(clicInputUserName, 5);
        clicInputUserName.click();
        clicInputUserName.sendKeys(userName);
        esperaElemnento(clicSearchUser, 3);
        clicSearchUser.click();
    }

    public void searchNewStatus() {
    }

    public void isVisibleNewStatus() {
    }

}
