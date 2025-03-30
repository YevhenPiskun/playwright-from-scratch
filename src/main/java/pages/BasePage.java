package pages;

import com.microsoft.playwright.Page;
import driver.PlaywrightFactory;

public abstract class BasePage {

    protected static PlaywrightFactory playwrightFactory = PlaywrightFactory.getInstance();
    protected Page page;

    protected String title = ".title";

    protected BasePage() {
        this.page = playwrightFactory.getPage();
    }

    public abstract void openPage();

    public abstract void verifyThatPageOpened();
}