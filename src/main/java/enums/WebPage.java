package enums;

public enum WebPage {

    LOGIN_PAGE("https://www.saucedemo.com/"),
    PRODUCT_PAGE("https://www.saucedemo.com/inventory.html"),
    CART_PAGE("https://www.saucedemo.com/cart.html"),
    CHECK_OUT_STEP_ONE_PAGE("https://www.saucedemo.com/checkout-step-one.html"),
    CHECK_OUT_STEP_TWO_PAGE("https://www.saucedemo.com/checkout-step-two.html");

    private final String url;

    WebPage(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}