package lib.ui.mobile_web;

import lib.ui.SearchPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MWSearchPageObject extends SearchPageObject {
    static {
        SEARCH_INIT_ELEMENT = "css:button#searchIcon";
        SEARCH_INPUT = "css:form>input[type='search']";
        SEARCH_CANCEL_BUTTON = "xpath://div[contains(@class, 'header-action')]";
        SEARCH_RESULT_BY_SUBSTRING_TPL = "xpath://div[contains(text(), '{SUBSTRING}')]";
        SEARCH_RESULT_BY_TITLE_AND_DESCRIPTION_TPL = "xpath://*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='{TITLE}']/..//*[@text='{DESCRIPTION}']";
        SEARCH_RESULT_ELEMENT = "css:ul.page-list thumbs actionable>li.page-summary";
        SEARCH_EMPTY_RESULT_ELEMENT = "css:p.without-results']";

    }

    public MWSearchPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
