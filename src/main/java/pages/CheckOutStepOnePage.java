package pages;

import enums.WebPage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CheckOutStepOnePage extends BasePage {

    private String firstNameInput = "#first-name";
    private String lastNameInput = "#last-name";
    private String postalCodeInput = "#postal-code";
    private String continueButton = "#continue";


    @Override
    public void openPage() {
        page.navigate(WebPage.CHECK_OUT_STEP_ONE_PAGE.getUrl());
    }

    @Override
    public void verifyThatPageOpened() {
        assertThat(page.locator(title)).hasText("Checkout: Your Information");
    }

    public void inputFirstName(String firstName) {
        page.locator(firstNameInput).fill(firstName);
    }

    public void inputLastName(String lastName) {
        page.locator(lastNameInput).fill(lastName);
    }

    public void inputPostalCode(String postalCode) {
        page.locator(postalCodeInput).fill(postalCode);
    }

    public void pressContinueButton() {
        page.locator(continueButton).click();
    }
}