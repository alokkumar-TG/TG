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
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;

@Listeners(TestListener.class)
public class demoox {

    public static String var_ra_sa = "as";

    public static Double var_ra_asd = 93.00;

    public static int var_dfd = 6;

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tcaccessandusetheringsizeguidefromproductdetailpage() {
        tg.openBrowser();
        tg.wait(1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tcverifyaccessibilityandfunctionalityofaboutusandrelatedcompanyinformationlinksinthewebsitefooter() {
        tg.openBrowser();
        tg.wait(1);
        tg.close();
    }

    public static void fgdfgf() {
        tg.wait(1);
    }

    public static void tgsurat() {
        tg.wait(1);
    }
}
