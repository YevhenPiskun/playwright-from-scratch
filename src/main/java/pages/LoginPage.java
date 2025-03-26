package pages;

import enums.WebPage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class LoginPage extends BasePage {

    private String titleLocator = ".login_logo";

    @Override
    public void openPage() {
        page.navigate(WebPage.LOGIN_PAGE.getUrl());
    }

    @Override
    public void verifyThatPageOpened() {
        assertThat(page.locator(titleLocator)).hasText("Swag Labs");
    }
}