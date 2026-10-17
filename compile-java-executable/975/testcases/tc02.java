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
public class tc02 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc02() {
		tg.openBrowser();
		tg.wait(2);
		tg.wait("ele_rc9l6neapp420", ComparisonType.IS_VISIBLE);
		tg.click("ele_rc9l6neapp420", 1);
		tg.wait("ele_rc9l6neapp420", ComparisonType.IS_VISIBLE);
		tg.type("ele_rc9l6neapp420", "dfgdfg");
		tg.wait("ele_logintofac088", ComparisonType.IS_VISIBLE);
		tg.click("ele_logintofac088", 1);
		tg.wait("ele_rc9l6neapp491", ComparisonType.IS_VISIBLE);
		tg.click("ele_rc9l6neapp491", 1);
		tg.wait("ele_rc9l6neapp491", ComparisonType.IS_VISIBLE);
		tg.type("ele_rc9l6neapp491", "gdfg");
		START_CUSTOM_SCRIPT;
		if (tg.performAssert("ele_DeleteConfirmation", ComparisonType.IS_VISIBLE)) {
		    tg.click("ele_ConfirmDelete", 1);
		}
		END_CUSTOM_SCRIPT;
		tg.close();
	}
}