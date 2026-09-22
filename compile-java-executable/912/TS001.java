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
public class TS001 {

    public static String var_ra_water = "bottle";

    public static String var_ra_Pen = "riffile";

    public static String var_ra_Age = "28";

    public static String var_ra_Name = "Alok";

    public static int var_gfhfgh = 6;

    @Test
    public void alok001() {
        tg.openBrowser();
        tg.wait(6);
        tg.testFunction("testlogin", new Object[] {});
        tg.close();
    }

    @Test
    public void tc001() {
        tg.openBrowser();
        tg.wait(6);
        tg.close();
    }

    @Test
    public void tc011() {
        tg.openBrowser();
        tg.wait(5);
        tg.close();
    }

    @Test
    public void tc012() {
        tg.openBrowser();
        tg.wait(5);
        tg.close();
    }

    @Test
    public void tc013() {
        tg.openBrowser();
        tg.wait(2);
        tg.close();
    }

    @Test
    public void tc016() {
        tg.openBrowser();
        tg.wait(2);
        tg.testFunction("testlogin", new Object[] {});
        tg.close();
    }
}
