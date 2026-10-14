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
public class tctest {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tctest() {
		tg.openBrowser();
				tg.wait(1);
				tg.wait("ele_r1hmkqsqpp945", ComparisonType.IS_VISIBLE);
				tg.wait("ele_emailaddre453", ComparisonType.IS_INVISIBLE);
				tg.wait("ele_rcdl6neapp994", ComparisonType.IS_VISIBLE);
				tg.click("ele_rcdl6neapp994", 1);
				tg.wait("ele_rcdl6neapp994", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_rcdl6neapp994", "jD/BqrMEgDFrX3bkmUIA9g==:MTIzNDU2Nzg5MTAxMTEyMQ==");
				tg.wait("ele_rc9l6neapp554", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp554", 1);
				tg.wait("ele_rc9l6neapp554", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp554", "sdsdsd");
				tg.wait("ele_rcdl6neapp555", ComparisonType.IS_VISIBLE);
				tg.click("ele_rcdl6neapp555", 1);
				tg.wait("ele_rcdl6neapp555", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_rcdl6neapp555", "3x/0956C7utx7wvtjQ9F/g==:MTIzNDU2Nzg5MTAxMTEyMQ==");
				tg.wait("ele_createnewa452", ComparisonType.IS_VISIBLE);
				tg.click("ele_createnewa452", 1);
				tg.wait("ele_r1cl2p4jik653", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1cl2p4jik653", 1);
				tg.wait("ele_r6ad8p4jik192", ComparisonType.IS_VISIBLE);
				tg.click("ele_r6ad8p4jik192", 1);
				tg.wait("ele_selectyour511", ComparisonType.IS_VISIBLE);
				tg.click("ele_selectyour511", 1);
				tg.wait("ele_female861", ComparisonType.IS_VISIBLE);
				tg.click("ele_female861", 1);
		tg.close();
	}
}