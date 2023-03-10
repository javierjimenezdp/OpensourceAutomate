package Steps;

import PageObject.LoginPageObject;
import Reports.Reports;
import StepDefinitions.Hooks;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginSteps {
    LoginPageObject loginPageObject;
    public LoginSteps() {
        this.loginPageObject = new LoginPageObject();
        loginPageObject.setDriver(Hooks.getDriver());
    }
    public void getTextPage() throws IOException {
        Properties configuration = new Properties();
        configuration.load(new FileInputStream("Configuration.properties"));
        Hooks.getDriver().get(configuration.getProperty("url"));
        loginPageObject.obtainsTextUsername();
        loginPageObject.obstainsTextPassword();
    }

    public void inputDataUser(String usuario, String contraseña) {
        if (usuario.contains("usuario")) {
            loginPageObject.sendKeysUser((loginPageObject.obtainsTextUsername().split(" "))[2]);
            loginPageObject.sendKeysPassword((loginPageObject.obstainsTextPassword().split(" "))[2]);
        } else {
            loginPageObject.sendKeysUser(usuario);
            loginPageObject.sendKeysPassword(contraseña);
        }
            Reports.reports("INFO", "Se ingresó las credenciales", Reports.takeSnapShot(Hooks.getDriver()));
            loginPageObject.clickBottonLoggin();
            loginPageObject.stayAdminButton();
        }

    public void isVisibleHomeUser() {
        if (!loginPageObject.isVisibleDataCorrect()) {
            Reports.reports("FAIL","Loggin no Exitoso", Reports.takeSnapShot(Hooks.getDriver()));
            Assert.fail("Loggin no Exitoso");
        }
        Reports.reports("PASS","Se valida profile",Reports.takeSnapShot(Hooks.getDriver()));
    }
}
