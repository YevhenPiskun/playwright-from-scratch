package pages;

import enums.SortingType;
import enums.WebPage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class ProductPage extends BasePage {

    private String sortButton = ".product_sort_container";
    private String optionAz = "Name (A to Z)";
    private String optionZa = "Name (Z to A)";
    private String itemsNames = ".inventory_item_name";
    private String cartButton = ".shopping_cart_link";
    private static final String ADD_TO_CART_BUTTON = ".inventory_item:nth-of-type(%s) button";

    @Override
    public void openPage() {
        page.navigate(WebPage.PRODUCT_PAGE.getUrl());
    }

    @Override
    public void verifyThatPageOpened() {
        assertThat(page.locator(title)).hasText("Products");
    }

    public void chooseSorting(SortingType sortingType) {
        page.locator(sortButton).click();
        switch (sortingType) {
            case A_TO_Z:
                page.getByText(optionAz).click();
                break;
            case Z_TO_A:
                page.getByText(optionZa).click();
                break;
            default:
                throw new RuntimeException("Sorting not supported");
        }
    }

    public void addProductToCart(int productItem) {
        page.locator(String.format(ADD_TO_CART_BUTTON, productItem)).click();
    }

    public void clickCartButton() {
        page.locator(cartButton).click();
    }

    public boolean verifySorting(SortingType sortingType) {
        List<String> itemsTitles = page.locator(itemsNames).allTextContents();
        List<String> sortedItemsTitles = new ArrayList<>(itemsTitles);

        if (sortingType.equals(SortingType.A_TO_Z)) {
            sortedItemsTitles = sortedItemsTitles.stream().sorted(Comparator.naturalOrder()).toList();
            return sortedItemsTitles.equals(itemsTitles);
        } else if (sortingType.equals(SortingType.Z_TO_A)) {
            sortedItemsTitles = sortedItemsTitles.stream().sorted(Comparator.reverseOrder()).toList();
            return sortedItemsTitles.equals(itemsTitles);
        } else {
            throw new RuntimeException("Sorting not supported");
        }
    }
}