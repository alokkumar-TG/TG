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
public class tc01 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc01() {
		tg.openBrowser();
				tg.wait("ele_rc9l6neapp282", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp282", 1);
				tg.wait("ele_rc9l6neapp282", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp282", "gdfgdfgdg");
				tg.wait("ele_rcdl6neapp680", ComparisonType.IS_VISIBLE);
				tg.click("ele_rcdl6neapp680", 1);
				tg.wait("ele_rcdl6neapp680", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_rcdl6neapp680", "bC8CdjkWTxbtv44+TXWUUQ==:MTIzNDU2Nzg5MTAxMTEyMQ==");
				tg.wait("ele_rcdl6neapp396", ComparisonType.IS_VISIBLE);
				tg.click("ele_rcdl6neapp396", 1);
				tg.wait("ele_rcdl6neapp396", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_rcdl6neapp396", "N6kwV0VJ7AhTpjcTP5HCHQ==:MTIzNDU2Nzg5MTAxMTEyMQ==");
				tg.wait("ele_login541", ComparisonType.IS_VISIBLE);
				tg.click("ele_login541", 1);
				tg.wait("ele_forgottenp448", ComparisonType.IS_VISIBLE);
				tg.click("ele_forgottenp448", 1);
				tg.wait("ele_findyourac769", ComparisonType.IS_VISIBLE);
				tg.click("ele_findyourac769", 1);
				tg.wait("ele_r377", ComparisonType.IS_VISIBLE);
				tg.click("ele_r377", 1);
				tg.wait("ele_r377", ComparisonType.IS_VISIBLE);
				tg.type("ele_r377", "fdgfdgdfg");
				tg.wait("ele_continue882", ComparisonType.IS_VISIBLE);
				tg.click("ele_continue882", 1);
				tg.testFunction("TF001", new Object[]{});
		tg.close();
	}
}