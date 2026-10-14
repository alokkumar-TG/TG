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
public class tf001389 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tf001389() {
		tg.openBrowser();
		tg.wait("ele_rc9l6neapp679", ComparisonType.IS_VISIBLE);
		tg.click("ele_rc9l6neapp679", 1);
		tg.wait("ele_rc9l6neapp679", ComparisonType.IS_VISIBLE);
		tg.type("ele_rc9l6neapp679", "sdsdsd");
		tg.wait("ele_rcdl6neapp839", ComparisonType.IS_VISIBLE);
		tg.click("ele_rcdl6neapp839", 1);
		tg.wait("ele_rcdl6neapp839", ComparisonType.IS_VISIBLE);
		tg.typeEncrypted("ele_rcdl6neapp839", "Aw1i2/GmC+0j1pZIqDCyfw==:MTIzNDU2Nzg5MTAxMTEyMQ==");
		tg.wait("ele_login334", ComparisonType.IS_VISIBLE);
		tg.click("ele_login334", 1);
		tg.wait("ele_rcdl6neapp839", ComparisonType.IS_VISIBLE);
		tg.click("ele_rcdl6neapp839", 1);
		tg.wait("ele_rcdl6neapp839", ComparisonType.IS_VISIBLE);
		tg.typeEncrypted("ele_rcdl6neapp839", "ji9W8rkl40TSiobwqsAl1w==:MTIzNDU2Nzg5MTAxMTEyMQ==");
		tg.wait("ele_login334", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_login334", 5);
		tg.wait("ele_forgottenp103", ComparisonType.IS_VISIBLE);
		tg.click("ele_forgottenp103", 1);
		tg.wait("ele_r1mi9okpil584", ComparisonType.IS_VISIBLE);
		tg.click("ele_r1mi9okpil584", 1);
		tg.wait("ele_r1mi9okpil584", ComparisonType.IS_VISIBLE);
		tg.type("ele_r1mi9okpil584", "fhgfhg");
		tg.wait("ele_r1mi9okpil584", ComparisonType.IS_VISIBLE);
		tg.click("ele_r1mi9okpil584", 1);
		tg.wait("ele_continue944", ComparisonType.IS_VISIBLE);
		tg.click("ele_continue944", 1);
		tg.wait("ele_svg002424c963", ComparisonType.IS_VISIBLE);
		tg.click("ele_svg002424c963", 1);
		tg.close();
	}
}