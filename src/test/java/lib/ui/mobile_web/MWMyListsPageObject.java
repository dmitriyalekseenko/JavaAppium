package lib.ui.mobile_web;

import lib.ui.MyListsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MWMyListsPageObject extends MyListsPageObject {
    static {
        ARTICLE_BY_TITLE_TPL = "xpath://a[contains(@class, 'title')]/h3[contains(text(), '{TITLE}')]";
       REMOVE_FROM_SAVED_BUTTON = "xpath://a[contains(@class, 'title')]/h3[contains(text(), '{TITLE}')]/../../a[contains(@class, 'watched')]";
    }

    public MWMyListsPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
