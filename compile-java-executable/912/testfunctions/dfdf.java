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
import org.testng.annotations.Test;

class dfdf {

	public static void dfdf() {
				tg.wait(2);
				tg.testFunction("testlogin", new Object[]{});
				tg.wait("ele_emailaddre295", ComparisonType.IS_VISIBLE);
				tg.click("ele_emailaddre295", 1);
				tg.wait("ele_r1h6kqsqpp919", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1h6kqsqpp919", 1);
				tg.wait("ele_r1h6kqsqpp510", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1h6kqsqpp510", 1);
				tg.wait("ele_password680", ComparisonType.IS_VISIBLE);
				tg.click("ele_password680", 1);
				tg.wait("ele_r1hmkqsqpp900", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1hmkqsqpp900", 1);
				tg.wait("ele_login078", ComparisonType.IS_VISIBLE);
				tg.click("ele_login078", 1);
				tg.wait("ele_forgottenp077", ComparisonType.IS_VISIBLE);
				tg.click("ele_forgottenp077", 1);
				tg.wait("ele_backbutton014", ComparisonType.IS_VISIBLE);
				tg.click("ele_backbutton014", 1);
	}
}