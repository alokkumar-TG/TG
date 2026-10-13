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
public class aa {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void aa() {
		tg.openDevice();
				tg.swipe(Direction.DOWN);
				tg.swipe(Direction.UP);
				tg.swipe(Direction.DOWN);
				tg.wait("ele_mainmenurefreshTextView1791884256306", ComparisonType.IS_VISIBLE);
				tg.click("ele_mainmenurefreshTextView1791884256306", 1);
				tg.wait("ele_mainmenusearchcityTextView1791884260588", ComparisonType.IS_VISIBLE);
				tg.click("ele_mainmenusearchcityTextView1791884260588", 1);
				tg.wait("ele_searchclosebtnImageView1791884265282", ComparisonType.IS_VISIBLE);
				tg.click("ele_searchclosebtnImageView1791884265282", 1);
				tg.wait("ele_NavigateupImageButton1791884269111", ComparisonType.IS_VISIBLE);
				tg.click("ele_NavigateupImageButton1791884269111", 1);
				tg.wait("ele_OpennavigationdrawerImageButton1791884271955", ComparisonType.IS_VISIBLE);
				tg.click("ele_OpennavigationdrawerImageButton1791884271955", 1);
				tg.wait("ele_TextView1791884275828", ComparisonType.IS_VISIBLE);
				tg.click("ele_TextView1791884275828", 1);
		tg.close();
	}
}