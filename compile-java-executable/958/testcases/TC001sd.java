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
public class tc001sd {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc001sd() {
		tg.openBrowser();
		tg.wait("ele_myaccount293", ComparisonType.IS_VISIBLE);
		tg.click("ele_myaccount293", 1);
		tg.wait("ele_login161", ComparisonType.IS_VISIBLE);
		tg.click("ele_login161", 1);
		tg.click("ele_emailorpho810", 1);
		tg.wait("ele_emailorpho139", ComparisonType.IS_VISIBLE);
		tg.click("ele_emailorpho139", 1);
		tg.wait("ele_emailorpho139", ComparisonType.IS_VISIBLE);
		tg.type("ele_emailorpho139", "4046686547");
		tg.wait("ele_loginemail070", ComparisonType.IS_VISIBLE);
		tg.click("ele_loginemail070", 1);
		tg.wait("ele_passwordte671", ComparisonType.IS_VISIBLE);
		tg.click("ele_passwordte671", 1);
		tg.wait("ele_passwordte671", ComparisonType.IS_VISIBLE);
		tg.typeEncrypted("ele_passwordte671", "fTel/xuew45e4H5sZafyrQ==:MTIzNDU2Nzg5MTAxMTEyMQ==");
		tg.wait("ele_welcome528", ComparisonType.IS_VISIBLE);
		tg.performDoubleClick("ele_welcome528");
		tg.navigateToUrl("https://www.t-mobile.com/my-account/profile/tmobile-id");
		tg.wait("ele_edit127", ComparisonType.IS_VISIBLE);
		tg.wait("ele_edit127", ComparisonType.IS_VISIBLE);
		tg.wait("ele_edit127", ComparisonType.IS_VISIBLE);
		tg.close();
	}
}