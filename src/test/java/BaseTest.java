import driver.PlaywrightFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

public class BaseTest {

    protected static PlaywrightFactory playwrightFactory = PlaywrightFactory.getInstance();

    @AfterAll
    public static void tearDown() {
        playwrightFactory.closeDriver();
    }

    @AfterEach
    public void tearDownBrowserContext() {
        playwrightFactory.closeBrowserContext();
    }
}