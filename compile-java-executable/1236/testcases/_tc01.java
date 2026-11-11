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
public class _tc01 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void _tc01() {
		tg.openBrowser();
				tg.wait(2);
				tg.wait("ele_emailaddre980", ComparisonType.IS_VISIBLE);
				tg.click("ele_emailaddre980", 1);
				tg.wait("ele_rc9l6neapp251ff", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp251ff", 1);
				tg.wait("ele_rc9l6neapp251ff", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp251ff", "dfgdfgfg");
				tg.wait("ele_rcdl6neapp878", ComparisonType.IS_VISIBLE);
				tg.click("ele_rcdl6neapp878", 1);
				tg.wait("ele_rcdl6neapp878", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_rcdl6neapp878", "bVhk8FUnuQA8N2buNmxOdQ==:MTIzNDU2Nzg5MTAxMTEyMQ==");
				tg.wait("ele_login311", ComparisonType.IS_VISIBLE);
				tg.click("ele_login311", 1);
				tg.wait("ele_login311", ComparisonType.IS_VISIBLE);
				tg.click("ele_login311", 1);
		tg.close();
	}
}