package pages;

import enums.WebPage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CartPage extends BasePage {

    private String checkOutButton = "#checkout";

    @Override
    public void openPage() {
        page.navigate(WebPage.CART_PAGE.getUrl());
    }

    @Override
    public void verifyThatPageOpened() {
        assertThat(page.locator(title)).hasText("Your Cart");
    }

    public void clickCheckOutButton() {
        page.locator(checkOutButton).click();
    }
}