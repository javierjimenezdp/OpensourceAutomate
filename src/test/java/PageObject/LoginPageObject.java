package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject extends LoginWebBasePage{
    @FindBy(xpath = "(//p[contains(text(),'')])[1]")
    private WebElement returnTextUsername;
    @FindBy(xpath = "(//p[contains(text(),'')])[2]")
    private WebElement returnTextPassword;
    @FindBy(xpath = "//div//input[@name=\"username\"]")
    private WebElement inputUsername;
    @FindBy(xpath = "//div//input[@name=\"password\"]")
    private WebElement inputPassword;
    @FindBy(xpath = "//div//button[@type=\"submit\"]")
    private  WebElement bottonLoggin;
    @FindBy(xpath = "//div//ul//li//span[@class=\"oxd-userdropdown-tab\"]")
    private WebElement dashBoardHome;
    @FindBy(xpath = "//ul//li//a[@class=\"oxd-main-menu-item\"]")
    private WebElement bottonAdmin;
    public String obtainsTextUsername() {
        esperaElemnento(returnTextUsername, 10);
        return returnTextUsername.getText();
    }
    public String obstainsTextPassword() {
        esperaElemnento(returnTextPassword, 10);
        return returnTextPassword.getText();
    }

    public void sendKeysUser(String usuario) {
        inputUsername.click();
        inputUsername.sendKeys(usuario);
    }

    public void sendKeysPassword(String contraseña) {
        inputPassword.click();
        inputPassword.sendKeys(contraseña);
    }
    public void clickBottonLoggin() {
        esperaElemnento(bottonLoggin, 10);
        bottonLoggin.click();
    }
    public void stayAdminButton() {
        esperaElemnento(bottonAdmin,10);
        bottonAdmin.click();
    }
    public boolean isVisibleDataCorrect() {
        esperaElemnento(dashBoardHome, 10);
        return dashBoardHome.isDisplayed();
    }

}
