package lib.ui;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class NavigationUI extends MainPageObject
{
    protected static String
    MY_LIST_LINK,
    POPUP_CLOSE_BUTTON,
    OPEN_NAVIGATION;

    public NavigationUI(RemoteWebDriver driver)
    {
        super(driver);
    }

    public void openNavigation()
    {
        if (Platform.getInstance().isMW()) {
            this.waitForElementAndClick(OPEN_NAVIGATION, "Cannot find open_navigation button", 5);
        } else {
            System.out.println("Method openNavigation() does nothing for platform " + Platform.getInstance().getPlatformVar());

        }
    }

    public void clickMyLists()
    {
        if (Platform.getInstance().isMW()) {
            this.tryClickElementWithFewAttempts(
                    MY_LIST_LINK,
                    "Cannot find 'My list'",
                    5
            );
        }
        this.waitForElementAndClick(
                MY_LIST_LINK,
                "Cannot find 'My list'",
                15
        );
    }

    public void closeSyncPopupButton()
    {
        this.waitForElementAndClick(POPUP_CLOSE_BUTTON, "Cannot find close Sync pop-up button", 10);
    }
}
