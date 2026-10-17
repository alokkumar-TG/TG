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
public class tcmtc02 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tcmtc02() {
		tg.openBrowser();
				tg.wait(1);
				tg.wait("ele_emailaddre952", ComparisonType.IS_VISIBLE);
				tg.click("ele_emailaddre952", 1);
				tg.wait("ele_rcdl6neapp243", ComparisonType.IS_VISIBLE);
				tg.click("ele_rcdl6neapp243", 1);
				tg.wait("ele_rcdl6neapp243", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_rcdl6neapp243", "JapVLcPkgtBY4GsX4BQhUA==:MTIzNDU2Nzg5MTAxMTEyMQ==");
				tg.wait("ele_rcdl6neapp631", ComparisonType.IS_VISIBLE);
				tg.click("ele_rcdl6neapp631", 1);
				tg.wait("ele_rcdl6neapp631", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_rcdl6neapp631", "Lj++FcsxnkWxTsHO+O0Dig==:MTIzNDU2Nzg5MTAxMTEyMQ==");
		tg.close();
	}
}