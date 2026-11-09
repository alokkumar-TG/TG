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
public class dgdfgfdg {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void dgdfgfdg() {
		tg.openBrowser();
				tg.wait("ele_rc9l6neapp157", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp157", 1);
				tg.wait("ele_rc9l6neapp157", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp157", "sdfdsfsdf");
				tg.wait("ele_rc9l6neapp991", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp991", 1);
				tg.wait("ele_rc9l6neapp991", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp991", "dfgdfgdfg");
				tg.wait("ele_login319", ComparisonType.IS_VISIBLE);
				tg.click("ele_login319", 1);
				tg.wait("ele_login167", ComparisonType.IS_VISIBLE);
				tg.click("ele_login167", 1);
				tg.wait("ele_forgottenp618", ComparisonType.IS_VISIBLE);
				tg.click("ele_forgottenp618", 1);
				tg.wait("ele_r794", ComparisonType.IS_VISIBLE);
				tg.click("ele_r794", 1);
				tg.wait("ele_r794", ComparisonType.IS_VISIBLE);
				tg.type("ele_r794", "gdfgdfgddfgdfg");
				tg.wait("ele_continue491", ComparisonType.IS_VISIBLE);
				tg.click("ele_continue491", 1);
		tg.close();
	}
}