package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeletePageObject extends DeleteWebBasePage{
    @FindBy(xpath = "//div//ul//li//span[@class=\"oxd-userdropdown-tab\"]")
    private WebElement dashBoardHome;
    @FindBy(xpath = "//div[@role=\"columnheader\"]")
    private WebElement listRecordsFound;
    @FindBy(xpath = "(//div[@class=\"oxd-table-cell oxd-padding-cell\"])[2]")
    private WebElement searchUserFirst;
    @FindBy(xpath = "(//div[contains(@style,\"flex\")])[11]")
    private WebElement obtainsTextUser;
    @FindBy(xpath = "(//div//div[@class=\"oxd-table-card-cell-checkbox\"])[2]")
    private WebElement clicCheckBox;
    @FindBy(xpath = "(//button//i[@class=\"oxd-icon bi-trash\"])[2]")
    private WebElement clicDeleteUser;
    @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin\"]")
    private WebElement clicDeleteConfirmation;
    @FindBy(xpath = "//label[contains(text(),\"Username\")]//following::input")
    private WebElement clicInputUserName;
    @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")
    private WebElement clicSearchUser;
    @FindBy(xpath = "//span[(text()=\"No Records Found\")]")
    private WebElement noRecordsFound;
    @FindBy(xpath = "//ul//li//a[@class=\"oxd-main-menu-item\"]")
    private WebElement bottonAdmin;
    @FindBy(xpath = "//div//ul//li//span[@class=\"oxd-userdropdown-tab\"]")
    private WebElement dashBoardHomeAdmin;


    public boolean isVisibleHome() {
        esperaElemnento(dashBoardHome, 1);
        return dashBoardHome.isDisplayed();
    }

    public boolean isVisibleListUser() {
        esperaElemnento(listRecordsFound, 1);
        return dashBoardHome.isDisplayed();
    }

    public boolean searchAnyUser() {
        scrollElement(searchUserFirst);
        esperaElemnento(searchUserFirst, 1);
        return searchUserFirst.isDisplayed();
    }

    public String obtainsTextUserDelete() {
        return obtainsTextUser.getText();
    }

    public void clicCheckBox() {
        esperaElemnento(clicCheckBox, 3);
        clicCheckBox.click();
    }

    public void clicDeleteUserBotton() {
        esperaElemnento(clicDeleteUser, 3);
        clicDeleteUser.click();
    }

    public void clicConfirmDelete() {
        esperaElemnento(clicDeleteConfirmation, 10);
        clicDeleteConfirmation.click();
    }
    public void clicInputUserName() {
        scrollElement(clicInputUserName);
        esperaElemnento(clicInputUserName, 5);
        clicInputUserName.click();
    }

    public void sendKeysUserName(String user) {
        esperaElemnento(clicInputUserName,4);
        clicInputUserName.sendKeys(user);
        esperaElemnento(clicSearchUser, 3);
        clicSearchUser.click();
    }

    public boolean trySearchUserDeleted() {
        esperaElemnento(noRecordsFound, 5);
        return noRecordsFound.isDisplayed();
    }

    public void stayAdminBotton() {
        bottonAdmin.click();
    }

    public boolean isVisibleHomeAdmin() {
        esperaElemnento(dashBoardHomeAdmin, 5);
        return dashBoardHomeAdmin.isDisplayed();
    }
}
