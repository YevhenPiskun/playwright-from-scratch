import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import steps.LoginSteps;
import steps.ProductSteps;

@Epic("Login test suite")
public class LoginTest extends BaseTest {

    LoginSteps loginSteps = new LoginSteps();
    ProductSteps productSteps = new ProductSteps();

    @Test
    @Feature("Login test")
    @Description("Login to application")
    public void loginTest() {
        loginSteps.openLoginPage();
        loginSteps.verifyThatLoginPageOpened();
        loginSteps.enterUsername(userName);
        loginSteps.enterPassword(password);
        loginSteps.pressLoginButton();
        productSteps.productPageOpened();
    }
}