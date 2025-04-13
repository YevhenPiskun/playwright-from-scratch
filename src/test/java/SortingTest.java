import enums.SortingType;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import steps.LoginSteps;
import steps.ProductSteps;

import static org.assertj.core.api.Assertions.assertThat;

@Epic("Sorting test suite")
public class SortingTest extends BaseTest {

    LoginSteps loginSteps = new LoginSteps();
    ProductSteps productSteps = new ProductSteps();

    @Test
    @Feature("Sorting from Z to A test")
    @Description("Sorting on Product page from Z to A")
    public void sortingFromZtoATest() {
        loginSteps.openLoginPage();
        loginSteps.enterUsername(userName);
        loginSteps.enterPassword(password);
        loginSteps.pressLoginButton();
        productSteps.productPageOpened();
        productSteps.chooseSorting(SortingType.Z_TO_A);
        assertThat(productSteps.verifySorting(SortingType.Z_TO_A)).isTrue();
    }

    @Test
    @Feature("Sorting from A to Z test")
    @Description("Sorting on Product page from A to Z")
    public void sortingFromAtoZTest() {
        loginSteps.openLoginPage();
        loginSteps.enterUsername(userName);
        loginSteps.enterPassword(password);
        loginSteps.pressLoginButton();
        productSteps.productPageOpened();
        productSteps.chooseSorting(SortingType.A_TO_Z);
        assertThat(productSteps.verifySorting(SortingType.A_TO_Z)).isTrue();
    }
}