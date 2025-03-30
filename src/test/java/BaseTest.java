import driver.PlaywrightFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

public class BaseTest {

    protected static PlaywrightFactory playwrightFactory = PlaywrightFactory.getInstance();

    protected String userName = System.getenv("USER_NAME");
    protected String password = System.getenv("PASSWORD");

    @AfterAll
    public static void tearDown() {
        playwrightFactory.closeDriver();
    }

    @AfterEach
    public void tearDownBrowserContext() {
        playwrightFactory.closeBrowserContext();
    }
}