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
public class sdsd {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void sdsd() {
		tg.openBrowser();
				tg.wait("ele_element508", ComparisonType.IS_VISIBLE);
				tg.click("ele_element508", 1);
				tg.wait("ele_rc9l6neapp741", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp741", 1);
				tg.wait("ele_rc9l6neapp741", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp741", "gfhfghgf");
				tg.wait("ele_rc9l6neapp095", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp095", 1);
				tg.wait("ele_rc9l6neapp095", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp095", "dfgdfgdfg");
				tg.wait("ele_login015", ComparisonType.IS_VISIBLE);
				tg.click("ele_login015", 1);
				tg.wait("ele_rcdl6neapp464", ComparisonType.IS_VISIBLE);
				tg.click("ele_rcdl6neapp464", 1);
		tg.close();
	}
}