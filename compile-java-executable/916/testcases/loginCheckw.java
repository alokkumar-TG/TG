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
public class logincheckw {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void logincheckw() {
		tg.openBrowser();
				tg.wait(2);
				tg.wait("ele_r1h6kqsqpp710", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1h6kqsqpp710", 1);
				tg.wait("ele_r1h6kqsqpp710", ComparisonType.IS_VISIBLE);
				tg.type("ele_r1h6kqsqpp710", "ddfddf");
				tg.wait("ele_r1h6kqsqpp757", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1h6kqsqpp757", 1);
				tg.wait("ele_r1h6kqsqpp757", ComparisonType.IS_VISIBLE);
				tg.type("ele_r1h6kqsqpp757", "fgdfgdfgfdg");
				tg.wait("ele_r1h6kqsqpp324", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1h6kqsqpp324", 1);
				tg.wait("ele_r1h6kqsqpp324", ComparisonType.IS_VISIBLE);
				tg.type("ele_r1h6kqsqpp324", "sdsdsd");
				tg.wait("ele_login639", ComparisonType.IS_VISIBLE);
				tg.click("ele_login639", 1);
				tg.wait("ele_login138", ComparisonType.IS_VISIBLE);
				tg.click("ele_login138", 1);
				tg.wait("ele_r1cl2p4jik607", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1cl2p4jik607", 1);
				tg.wait("ele_r1cl2p4jik607", ComparisonType.IS_VISIBLE);
				tg.type("ele_r1cl2p4jik607", "dfgfdgdfg");
				tg.wait("ele_surname369", ComparisonType.IS_VISIBLE);
				tg.click("ele_surname369", 1);
				tg.wait("ele_surname369", ComparisonType.IS_VISIBLE);
				tg.type("ele_surname369", "sseee");
				tg.wait("ele_day407", ComparisonType.IS_VISIBLE);
				tg.click("ele_day407", 1);
				tg.wait("ele_dateofbirt069", ComparisonType.IS_VISIBLE);
				tg.click("ele_dateofbirt069", 1);
				tg.wait("ele_dateofbirt006", ComparisonType.IS_VISIBLE);
				tg.click("ele_dateofbirt006", 1);
				tg.wait("ele_gender559", ComparisonType.IS_VISIBLE);
				tg.click("ele_gender559", 1);
				tg.wait("ele_january893", ComparisonType.IS_VISIBLE);
				tg.click("ele_january893", 1);
				tg.wait("ele_year554", ComparisonType.IS_VISIBLE);
				tg.click("ele_year554", 1);
				tg.wait("ele_div045", ComparisonType.IS_VISIBLE);
				tg.click("ele_div045", 1);
		tg.close();
	}
}