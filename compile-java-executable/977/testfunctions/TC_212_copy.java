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

class tc_212_copy {

	public static void tc_212_copy() {
		tg.wait("ele_textip0ele593", ComparisonType.IS_VISIBLE);
		tg.click("ele_textip0ele593", 1);
		tg.wait("ele_textip1ip232", ComparisonType.IS_VISIBLE);
		tg.click("ele_textip1ip232", 1);
		tg.wait("ele_textip1ip232", ComparisonType.IS_VISIBLE);
		tg.type("ele_textip1ip232", "Hello");
	}
}