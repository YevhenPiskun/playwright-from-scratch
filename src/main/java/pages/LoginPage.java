package pages;

import enums.WebPage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class LoginPage extends BasePage {

    private String titleLocator = ".login_logo";
    private String userNameField = "#user-name";
    private String passwordField = "#password";
    private String loginButton = "#login-button";

    @Override
    public void openPage() {
        page.navigate(WebPage.LOGIN_PAGE.getUrl());
    }

    @Override
    public void verifyThatPageOpened() {
        assertThat(page.locator(titleLocator)).hasText("Swag Labs");
    }

    public void inputUserName(String userName) {
        page.locator(userNameField).fill(userName);
    }

    public void inputPassword(String password) {
        page.locator(passwordField).fill(password);
    }

    public void pressLoginButton() {
        page.locator(loginButton).click();
    }
}