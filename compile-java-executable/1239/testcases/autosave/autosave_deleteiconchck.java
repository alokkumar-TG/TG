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
public class deleteiconchck {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void deleteiconchck() {
		tg.openBrowser();
				tg.wait("ele_rc9l6neapp867", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp867", 1);
				tg.wait("ele_rc9l6neapp867", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp867", "dfsfsdf");
				tg.wait("ele_rc9l6neapp581", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp581", 1);
				tg.wait("ele_rc9l6neapp581", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp581", "dfdsfsdf");
				tg.wait("ele_login855", ComparisonType.IS_VISIBLE);
				tg.click("ele_login855", 1);
				tg.wait("ele_rc9l6neapp591", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp591", 1);
				tg.wait("ele_rc9l6neapp591", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp591", "fdsfsdfdsfdsf");
				tg.wait("ele_rc9l6neapp074", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp074", 1);
				tg.wait("ele_rc9l6neapp074", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp074", "fsdfdsfdfsdf");
				tg.wait("ele_rc9l6neapp832", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp832", 1);
				tg.wait("ele_rc9l6neapp832", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp832", "dfsdfd");
				tg.wait("ele_login692", ComparisonType.IS_VISIBLE);
				tg.click("ele_login692", 1);
				tg.wait("ele_forgottenp732", ComparisonType.IS_VISIBLE);
				tg.click("ele_forgottenp732", 1);
				tg.wait("ele_r354", ComparisonType.IS_VISIBLE);
				tg.click("ele_r354", 1);
				tg.wait("ele_r354", ComparisonType.IS_VISIBLE);
				tg.type("ele_r354", "gfhgh");
		tg.close();
	}
}