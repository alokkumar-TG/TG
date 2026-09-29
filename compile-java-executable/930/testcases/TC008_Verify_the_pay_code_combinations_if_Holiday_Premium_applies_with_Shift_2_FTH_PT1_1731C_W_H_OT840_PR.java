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
public class tc008_verify_the_pay_code_combinations_if_holiday_premium_applies_with_shift_2_fth_pt1_1731c_w_h_ot840_pr {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc008_verify_the_pay_code_combinations_if_holiday_premium_applies_with_shift_2_fth_pt1_1731c_w_h_ot840_pr() {
		tg.openBrowser();
		tg.wait(2);
		tg.wait("ele_Button_39e706aa", ComparisonType.IS_VISIBLE);
		tg.close();
	}
}