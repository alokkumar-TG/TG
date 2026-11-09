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
public class tc021 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc021() {
		tg.openBrowser();
				tg.wait("ele_rojadeslcl273", ComparisonType.IS_VISIBLE);
				tg.click("ele_rojadeslcl273", 1);
				tg.wait("ele_rojadeslcl273", ComparisonType.IS_VISIBLE);
				tg.type("ele_rojadeslcl273", "dfsdfsdfsdf");
				tg.wait("ele_roradeslcl353", ComparisonType.IS_VISIBLE);
				tg.click("ele_roradeslcl353", 1);
				tg.wait("ele_roradeslcl353", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_roradeslcl353", "sGXe+rBez93FpWWG6ewGuw==:MTIzNDU2Nzg5MTAxMTEyMQ==");
				tg.wait("ele_login476", ComparisonType.IS_VISIBLE);
				tg.click("ele_login476", 1);
				tg.wait("ele_forgotpass705", ComparisonType.IS_VISIBLE);
				tg.click("ele_forgotpass705", 1);
				tg.wait("ele_r546", ComparisonType.IS_VISIBLE);
				tg.click("ele_r546", 1);
				tg.wait("ele_r546", ComparisonType.IS_VISIBLE);
				tg.type("ele_r546", "dsfsdfsdf");
				tg.wait("ele_r991", ComparisonType.IS_VISIBLE);
				tg.click("ele_r991", 1);
		tg.close();
	}
}