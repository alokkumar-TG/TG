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
import io.testgrid.enums.Alert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class ffdgdfg {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void ffdgdfg() {
		tg.openDevice();
				tg.wait("ele_viewmaleselectImageView1789720789117", ComparisonType.IS_VISIBLE);
				tg.click("ele_viewmaleselectImageView1789720789117", 1);
				tg.wait("ele_spacearmView1789720800429", ComparisonType.IS_VISIBLE);
				tg.click("ele_spacearmView1789720800429", 1);
				tg.wait("ele_linebtnendView1789720806490", ComparisonType.IS_VISIBLE);
				tg.click("ele_linebtnendView1789720806490", 1);
				tg.wait("ele_btnplaceholderView1789720811941", ComparisonType.IS_VISIBLE);
				tg.click("ele_btnplaceholderView1789720811941", 1);
				tg.wait("ele_FullbodyTextView1789720816863", ComparisonType.IS_VISIBLE);
				tg.click("ele_FullbodyTextView1789720816863", 1);
		tg.close();
	}
}