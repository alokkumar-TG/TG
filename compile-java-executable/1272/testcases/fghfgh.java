import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
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
public class fghfgh {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void fghfgh() {
		tg.openBrowser();
				tg.wait("ele_rc9l6neapp709", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp709", 1);
				tg.wait("ele_rc9l6neapp709", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp709", "dsfdsf");
				tg.wait("ele_rcdl6neapp578", ComparisonType.IS_VISIBLE);
				tg.click("ele_rcdl6neapp578", 1);
				tg.wait("ele_rcdl6neapp578", ComparisonType.IS_VISIBLE);
				tg.type("ele_rcdl6neapp578", "sfdsfdsfdsf");
				tg.wait("ele_rc9l6neapp821", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp821", 1);
				tg.wait("ele_rc9l6neapp821", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp821", "fdsfdsfdf");
		tg.close();
	}
}