package pages;

import enums.WebPage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CheckOutStepTwoPage extends BasePage {

    private String finishButton = "#finish";

    @Override
    public void openPage() {
        page.navigate(WebPage.CHECK_OUT_STEP_TWO_PAGE.getUrl());
    }

    @Override
    public void verifyThatPageOpened() {
        assertThat(page.locator(title)).hasText("Checkout: Overview");
    }

    public void pressFinishButton() {
        page.locator(finishButton).click();
    }
}