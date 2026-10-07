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
public class TS001CopyFix2 {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc001_copy_copy() {
        tg.openDevice();
        tg.wait(1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc001gfhfghgfhfghfghfghfghfghfghfhfghfghfghfghfghfghfghfghfghfghfghfghghfghfghfghfghfghfghfghfghfghf() {
        tg.openDevice();
        tg.wait(4);
        tg.testFunction("TF001", new Object[] {});
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tcasd_copy_copy() {
        tg.openDevice();
        tg.close();
    }

    @Test
    public void test_case_1788589916_copy_copy() {
        tg.openDevice();
        tg.wait(5);
        tg.close();
    }

    public static void tf001_copy() {
        tg.wait(1);
    }

    public static Object tf0023(String abc1, String abc2, String abc3) {
        tg.wait(1);
        return null;
    }

    public static Object tf002(String abc1, String abc2, String abc3) {
        String var_TGReturn = "";
        tg.customScriptStart();
        var_TGReturn = abc1 + abc2 + abc3;
        tg.customScriptEnd();
        tg.printLogs(var_TGReturn);
        tg.wait(2);
        return var_TGReturn;
    }

    public static void dd_copy() {
    }

    public static void dfgfd() {
        tg.wait(1);
    }

    public static void ds() {
        tg.wait(1);
    }
}
