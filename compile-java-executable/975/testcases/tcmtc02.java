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
public class tcmtc02 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tcmtc02() {
		tg.openBrowser();
				tg.wait(1);
				tg.wait("ele_rc9l6neapp496", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp496", 1);
				tg.wait("ele_rc9l6neapp496", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp496", "cxvxcvxcv");
				tg.wait("ele_rc9l6neapp980", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp980", 1);
				tg.wait("ele_rc9l6neapp980", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp980", "xcvxcvxcv");
				tg.wait("ele_rcdl6neapp035", ComparisonType.IS_VISIBLE);
				tg.click("ele_rcdl6neapp035", 1);
				tg.wait("ele_rcdl6neapp035", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_rcdl6neapp035", "t5zVhxZ2+MWmYi4MZ7hCfw==:MTIzNDU2Nzg5MTAxMTEyMQ==");
		tg.close();
	}
}