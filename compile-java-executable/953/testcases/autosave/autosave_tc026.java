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
public class tc026 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc026() {
		tg.openBrowser();
				tg.wait("ele_password602", ComparisonType.IS_VISIBLE);
				tg.click("ele_password602", 1);
				tg.wait("ele_password602", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_password602", "jD/BqrMEgDFrX3bkmUIA9g==:MTIzNDU2Nzg5MTAxMTEyMQ==");
				tg.wait("ele_entercaptc747", ComparisonType.IS_VISIBLE);
				tg.click("ele_entercaptc747", 1);
				tg.wait("ele_entercaptc747", ComparisonType.IS_VISIBLE);
				tg.type("ele_entercaptc747", "fdgdfgfgdfg");
				tg.wait("ele_signin102", ComparisonType.IS_VISIBLE);
				tg.click("ele_signin102", 1);
				tg.wait("ele_signin696", ComparisonType.IS_VISIBLE);
				tg.click("ele_signin696", 1);
		tg.close();
	}
}