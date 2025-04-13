package steps;

import io.qameta.allure.Step;
import pages.LoginPage;

public class LoginSteps extends BaseSteps {

    private LoginPage loginPage;

    public LoginSteps() {
        this.loginPage = new LoginPage();
    }

    @Step
    public void openLoginPage() {
        loginPage.openPage();
    }

    @Step
    public void verifyThatLoginPageOpened() {
        loginPage.verifyThatPageOpened();
    }

    @Step
    public void enterUsername(String userName) {
        loginPage.inputUserName(userName);
    }

    @Step
    public void enterPassword(String password) {
        loginPage.inputPassword(password);
    }

    @Step
    public void pressLoginButton() {
        loginPage.pressLoginButton();
    }
}