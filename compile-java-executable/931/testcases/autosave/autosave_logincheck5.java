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
public class logincheck5 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void logincheck5() {
		tg.openBrowser();
				tg.wait("ele_emailaddre703", ComparisonType.IS_VISIBLE);
				tg.wait("ele_rc9l6neapp358", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp358", 1);
				tg.wait("ele_rc9l6neapp358", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp358", "dsfsdf");
				tg.wait("ele_rc9l6neapp648", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp648", 1);
				tg.wait("ele_rc9l6neapp648", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp648", "sdfsdfsdfsdf");
				tg.wait("ele_login220", ComparisonType.IS_VISIBLE);
				tg.click("ele_login220", 1);
				tg.wait("ele_rcdl6neapp591", ComparisonType.IS_VISIBLE);
				tg.click("ele_rcdl6neapp591", 1);
				tg.wait("ele_rcdl6neapp591", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_rcdl6neapp591", "VLYz4QIWqcU0cRLTnL+FJg==:MTIzNDU2Nzg5MTAxMTEyMQ==");
				tg.wait("ele_login913", ComparisonType.IS_VISIBLE);
				tg.click("ele_login913", 1);
				tg.wait("ele_forgottenp232", ComparisonType.IS_VISIBLE);
				tg.click("ele_forgottenp232", 1);
				tg.wait("ele_svg002424c956", ComparisonType.IS_VISIBLE);
				tg.click("ele_svg002424c956", 1);
				tg.wait("ele_rc9l6neapp341", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp341", 1);
				tg.wait("ele_createnewa616", ComparisonType.IS_VISIBLE);
				tg.click("ele_createnewa616", 1);
		tg.close();
	}
}