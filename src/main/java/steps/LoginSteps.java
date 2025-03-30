package steps;

import pages.LoginPage;

public class LoginSteps extends BaseSteps {

    private LoginPage loginPage;

    public LoginSteps() {
        this.loginPage = new LoginPage();
    }

    public void openLoginPage() {
        loginPage.openPage();
    }

    public void verifyThatLoginPageOpened() {
        loginPage.verifyThatPageOpened();
    }

    public void enterUsername(String userName) {
        loginPage.inputUserName(userName);
    }

    public void enterPassword(String password) {
        loginPage.inputPassword(password);
    }

    public void pressLoginButton() {
        loginPage.pressLoginButton();
    }
}