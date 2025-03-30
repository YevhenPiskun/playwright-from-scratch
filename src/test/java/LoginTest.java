import org.junit.jupiter.api.Test;
import steps.LoginSteps;
import steps.ProductSteps;

public class LoginTest extends BaseTest {

    LoginSteps loginSteps = new LoginSteps();
    ProductSteps productSteps = new ProductSteps();

    @Test
    public void loginTest() {
        loginSteps.openLoginPage();
        loginSteps.verifyThatLoginPageOpened();
        loginSteps.enterUsername(userName);
        loginSteps.enterPassword(password);
        loginSteps.pressLoginButton();
        productSteps.productPageOpened();
    }
}