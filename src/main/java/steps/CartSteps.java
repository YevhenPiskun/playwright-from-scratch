package steps;

import io.qameta.allure.Step;
import pages.CartPage;

public class CartSteps {

    private CartPage cartPage = new CartPage();

    @Step
    public void verifyThatCartPageOpened() {
        cartPage.verifyThatPageOpened();
    }

    @Step
    public void checkoutCart() {
        cartPage.clickCheckOutButton();
    }
}