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
public class scanner {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void scanner() {
		tg.openBrowser();
				tg.wait(2);
				tg.wait("ele_logintofac637", ComparisonType.IS_VISIBLE);
				tg.click("ele_logintofac637", 1);
				tg.wait("ele_rcdl6neapp096", ComparisonType.IS_VISIBLE);
				tg.click("ele_rcdl6neapp096", 1);
				tg.wait("ele_rcdl6neapp096", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_rcdl6neapp096", "mIP+Ax0S8qye7d+18xV7PQ==:MTIzNDU2Nzg5MTAxMTEyMQ==");
		tg.close();
	}
}