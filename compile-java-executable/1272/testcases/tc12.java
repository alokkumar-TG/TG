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
public class tc12 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc12() {
		tg.openBrowser();
				tg.wait("ele_rc9l6neapp809", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp809", 1);
				tg.wait("ele_rc9l6neapp809", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp809", "fdgdfgdfg");
				tg.wait("ele_rc9l6neapp148", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp148", 1);
				tg.wait("ele_rc9l6neapp148", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp148", "gfdgdfgdfg");
				tg.wait("ele_login830", ComparisonType.IS_VISIBLE);
				tg.click("ele_login830", 1);
				tg.wait("ele_forgottenp122", ComparisonType.IS_VISIBLE);
				tg.click("ele_forgottenp122", 1);
				tg.wait("ele_r171", ComparisonType.IS_VISIBLE);
				tg.click("ele_r171", 1);
				tg.wait("ele_r171", ComparisonType.IS_VISIBLE);
				tg.type("ele_r171", "gdfgdfgdfgdfg");
		tg.close();
	}
}