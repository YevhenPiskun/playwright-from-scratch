import enums.SortingType;
import org.junit.jupiter.api.Test;
import steps.LoginSteps;
import steps.ProductSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class SortingTest extends BaseTest {

    LoginSteps loginSteps = new LoginSteps();
    ProductSteps productSteps = new ProductSteps();

    @Test
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