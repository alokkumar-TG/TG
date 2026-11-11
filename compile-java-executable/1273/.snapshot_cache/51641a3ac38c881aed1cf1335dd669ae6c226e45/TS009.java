import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.*;
import io.testgrid.enums.Alert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

@Listeners(TestListener.class)
public class TS009 {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void stage2() {
        tg.openDevice();
        tg.swipe(Direction.DOWN);
        tg.swipe(Direction.UP);
        tg.wait("ele_TextField1785956378472", ComparisonType.IS_VISIBLE);
        tg.click("ele_TextField1785956378472", 1);
        tg.wait("ele_TextField1785956381598", ComparisonType.IS_VISIBLE);
        tg.click("ele_TextField1785956381598", 1);
        tg.wait("ele_TextField1785956384528", ComparisonType.IS_VISIBLE);
        tg.click("ele_TextField1785956384528", 1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc009() {
        tg.openDevice();
        tg.swipe(Direction.DOWN);
        tg.swipe(Direction.UP);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tckishanbhai() {
        tg.openDevice();
        tg.swipe(Direction.DOWN);
        tg.swipe(Direction.DOWN);
        tg.swipe(Direction.DOWN);
        tg.swipe(Direction.UP);
        tg.swipe(Direction.UP);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tcfdgfdg() {
        tg.openDevice();
        tg.wait("ele_TextField1785953571301", ComparisonType.IS_VISIBLE);
        tg.click("ele_TextField1785953571301", 1);
        tg.wait("ele_iKey1785953586797", ComparisonType.IS_VISIBLE);
        tg.click("ele_iKey1785953586797", 1);
        tg.wait("ele_dKey1785953598749", ComparisonType.IS_VISIBLE);
        tg.click("ele_dKey1785953598749", 1);
        tg.wait("ele_yKey1785953618446", ComparisonType.IS_VISIBLE);
        tg.click("ele_yKey1785953618446", 1);
        tg.wait("ele_sKey1785953632380", ComparisonType.IS_VISIBLE);
        tg.click("ele_sKey1785953632380", 1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void gfhgfhg() {
        tg.openDevice();
        tg.wait(5);
        tg.close();
    }

    public static void sfsdfsdf() {
        tg.wait(6);
    }
}
