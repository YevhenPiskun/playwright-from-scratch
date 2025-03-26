import org.junit.jupiter.api.Test;
import steps.LoginSteps;

public class LoginTest extends BaseTest {

    LoginSteps loginSteps = new LoginSteps();

    @Test
    public void loginTest() {
        loginSteps.openLoginPage();
        loginSteps.verifyThatLoginPageOpened();
    }

    @Test
    public void loginTest2() {
        loginSteps.openLoginPage();
        loginSteps.verifyThatLoginPageOpened();
    }
}