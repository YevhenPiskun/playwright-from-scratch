package steps;

import enums.SortingType;
import io.qameta.allure.Step;
import pages.ProductPage;

public class ProductSteps extends BaseSteps {

    private ProductPage productPage;

    public ProductSteps() {
        this.productPage = new ProductPage();
    }

    @Step
    public void productPageOpened() {
        productPage.verifyThatPageOpened();
    }

    @Step
    public void chooseSorting(SortingType sortingType) {
        productPage.chooseSorting(sortingType);
    }

    @Step
    public boolean verifySorting(SortingType sortingType) {
        return productPage.verifySorting(sortingType);
    }

    @Step
    public void addProductToCart(int productItem) {
        productPage.addProductToCart(productItem);
    }

    @Step
    public void openCart() {
        productPage.clickCartButton();
    }
}