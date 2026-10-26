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
public class tc03 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc03() {
		tg.openBrowser();
				tg.wait("ele_rc9l6neapp457", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp457", 1);
				tg.wait("ele_rc9l6neapp457", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp457", "gfhfghfghfg");
				tg.wait("ele_rcdl6neapp268", ComparisonType.IS_VISIBLE);
				tg.click("ele_rcdl6neapp268", 1);
				tg.wait("ele_rcdl6neapp268", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_rcdl6neapp268", "K4mCAN8y4gGaBqnY0djabQ==:MTIzNDU2Nzg5MTAxMTEyMQ==");
				tg.wait("ele_rcdl6neapp268", ComparisonType.IS_VISIBLE);
				tg.click("ele_rcdl6neapp268", 1);
				tg.wait("ele_rcdl6neapp268", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_rcdl6neapp268", "FmqPPlqOTWV/CKDPqfEpzg==:MTIzNDU2Nzg5MTAxMTEyMQ==");
				tg.wait("ele_rcdl6neapp268", ComparisonType.IS_VISIBLE);
				tg.click("ele_rcdl6neapp268", 1);
				tg.wait("ele_login178", ComparisonType.IS_VISIBLE);
				tg.click("ele_login178", 1);
				tg.wait("ele_forgottenp489", ComparisonType.IS_VISIBLE);
				tg.click("ele_forgottenp489", 1);
				tg.wait("ele_r750", ComparisonType.IS_VISIBLE);
				tg.click("ele_r750", 1);
				tg.wait("ele_r750", ComparisonType.IS_VISIBLE);
				tg.type("ele_r750", "fghgfhfghfghfg");
				tg.wait("ele_r750", ComparisonType.IS_VISIBLE);
				tg.click("ele_r750", 1);
				tg.wait("ele_continue849", ComparisonType.IS_VISIBLE);
				tg.click("ele_continue849", 1);
				tg.wait("ele_rc9l6neapp826", ComparisonType.IS_VISIBLE);
		tg.close();
	}
}