package steps;

import pages.CartPage;

public class CartSteps {

    private CartPage cartPage = new CartPage();

    public void verifyThatCartPageOpened() {
        cartPage.verifyThatPageOpened();
    }

    public void checkoutCart() {
        cartPage.clickCheckOutButton();
    }
}