package driver;

import com.microsoft.playwright.*;
import config.Environment;

public class PlaywrightFactory {

    private static PlaywrightFactory instance = new PlaywrightFactory();

    private PlaywrightFactory() {

    }

    public static PlaywrightFactory getInstance() {
        return instance;
    }

    protected Playwright playwright;
    protected Browser browser;
    protected BrowserContext browserContext;
    protected Page page;

    private Playwright getPlaywright() {
        if (playwright == null) {
            playwright = Playwright.create();
        }
        return playwright;
    }

    private Browser getBrowser() {
        if (browser == null) {
            if (Environment.getValue("browser").equalsIgnoreCase("chrome")) {
                browser = getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
            } else if (Environment.getValue("browser").equalsIgnoreCase("firefox")) {
                browser = getPlaywright().firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
            }
        }
        return browser;
    }

    private BrowserContext getBrowserContext() {
        if (browserContext == null) {
            browserContext = getBrowser().newContext(
                    new Browser.NewContextOptions().setViewportSize(1920, 1080));
            browserContext.setDefaultTimeout(10000);
        }
        return browserContext;
    }

    public Page getPage() {
        if (page == null) {
            page = getBrowserContext().newPage();
        }
        return page;
    }

    public void closeDriver() {
        if (playwright != null) {
            playwright.close();
            playwright = null;
            browserContext = null;
            browser = null;
            page = null;
        }
    }

    public void closeBrowserContext() {
        if (browserContext != null) {
            browserContext.close();
            browserContext = null;
            page = null;
        }
    }
}