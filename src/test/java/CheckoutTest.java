import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import steps.*;

@Epic("Checkout test suite")
public class CheckoutTest extends BaseTest {

    LoginSteps loginSteps = new LoginSteps();
    ProductSteps productSteps = new ProductSteps();
    CartSteps cartSteps = new CartSteps();
    CheckOutStepOneSteps checkOutStepOneSteps = new CheckOutStepOneSteps();
    CheckOutStepTwoSteps checkOutStepTwoSteps = new CheckOutStepTwoSteps();

    @Test
    @Feature("Checkout cart test")
    @Description("Checkout products is cart")
    public void checkoutTest() {
        loginSteps.openLoginPage();
        loginSteps.enterUsername(userName);
        loginSteps.enterPassword(password);
        loginSteps.pressLoginButton();
        productSteps.productPageOpened();
        productSteps.addProductToCart(5);
        productSteps.openCart();
        cartSteps.verifyThatCartPageOpened();
        cartSteps.checkoutCart();
        checkOutStepOneSteps.checkOutPageOpened();
        checkOutStepOneSteps.inputFirstName("Yevhen");
        checkOutStepOneSteps.inputLastName("Piskun");
        checkOutStepOneSteps.inputPostalCode("49024");
        checkOutStepOneSteps.pressContinueButton();
        checkOutStepTwoSteps.clickFinishButton();
    }
}