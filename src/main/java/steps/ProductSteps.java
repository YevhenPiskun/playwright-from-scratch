package steps;

import pages.ProductPage;

public class ProductSteps extends BaseSteps {

    private ProductPage productPage;

    public ProductSteps() {
        this.productPage = new ProductPage();
    }

    public void productPageOpened() {
        productPage.verifyThatPageOpened();
    }
}