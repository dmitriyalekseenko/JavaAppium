package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.NavigationUI;
import lib.ui.android.AndroidNavigationUI;
import lib.ui.ios.IOSNavigationUI;
import lib.ui.mobile_web.MWNavigationUI;
import org.openqa.selenium.remote.RemoteMouse;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NavigationUIFactory
{
    public static NavigationUI get(RemoteWebDriver driver)         //Определение платформы для вызова необходимого драйвера
    {
        if (Platform.getInstance().isAndroid()) {
            return new AndroidNavigationUI(driver);
        } else if (Platform.getInstance().isIOS()) {
            return new IOSNavigationUI(driver);
        } else {
            return new MWNavigationUI(driver);
        }
    }
}
