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

@Listeners(TestListener.class);
public class gf {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void gf() {
		tg.openBrowser();
				tg.wait("ele_rc9l6neapp038", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp038", 1);
				tg.wait("ele_rc9l6neapp038", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp038", "sdfsdfsdf");
				tg.wait("ele_rcdl6neapp263", ComparisonType.IS_VISIBLE);
				tg.click("ele_rcdl6neapp263", 1);
				tg.wait("ele_rcdl6neapp263", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_rcdl6neapp263", "EMsVOe/S86dpC/Wplh4SCg==:MTIzNDU2Nzg5MTAxMTEyMQ==");
				tg.wait("ele_login645", ComparisonType.IS_VISIBLE);
				tg.click("ele_login645", 1);
				tg.wait("ele_login109", ComparisonType.IS_VISIBLE);
				tg.click("ele_login109", 1);
				tg.wait("ele_forgottenp755", ComparisonType.IS_VISIBLE);
				tg.click("ele_forgottenp755", 1);
				tg.wait("ele_backbutton640", ComparisonType.IS_VISIBLE);
				tg.click("ele_backbutton640", 1);
		tg.close();
	}
}