package pages;

import enums.WebPage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class ProductPage extends BasePage {

    @Override
    public void openPage() {
        page.navigate(WebPage.PRODUCT_PAGE.getUrl());
    }

    @Override
    public void verifyThatPageOpened() {
        assertThat(page.locator(title)).hasText("Products");
    }
}