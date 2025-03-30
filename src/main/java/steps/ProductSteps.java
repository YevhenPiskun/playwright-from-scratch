package steps;

import enums.SortingType;
import pages.ProductPage;

public class ProductSteps extends BaseSteps {

    private ProductPage productPage;

    public ProductSteps() {
        this.productPage = new ProductPage();
    }

    public void productPageOpened() {
        productPage.verifyThatPageOpened();
    }

    public void chooseSorting(SortingType sortingType) {
        productPage.chooseSorting(sortingType);
    }

    public boolean verifySorting(SortingType sortingType) {
        return productPage.verifySorting(sortingType);
    }

    public void addProductToCart(int productItem) {
        productPage.addProductToCart(productItem);
    }

    public void openCart() {
        productPage.clickCartButton();
    }
}