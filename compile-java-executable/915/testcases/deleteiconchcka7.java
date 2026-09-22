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
public class deleteiconchcka7 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void deleteiconchcka7() {
		tg.openBrowser();
				tg.wait("ele_loginTest", ComparisonType.IS_VISIBLE);
				tg.wait("ele_r1h6kqsqpp303", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1h6kqsqpp303", 1);
				tg.wait("ele_r1h6kqsqpp292", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1h6kqsqpp292", 1);
				tg.wait("ele_r1h6kqsqpp292", ComparisonType.IS_VISIBLE);
				tg.type("ele_r1h6kqsqpp292", "sdfdsfdsf");
				tg.wait("ele_r1hmkqsqpp818", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1hmkqsqpp818", 1);
				tg.wait("ele_r1hmkqsqpp818", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_r1hmkqsqpp818", "rruih5mZfZbJAEq/X516+g==:MTIzNDU2Nzg5MTAxMTEyMQ==");
				tg.wait("ele_r1hmkqsqpp608", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1hmkqsqpp608", 1);
		tg.close();
	}
}