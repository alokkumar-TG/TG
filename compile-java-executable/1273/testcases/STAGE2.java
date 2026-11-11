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
public class stage2 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void stage2() {
		tg.openDevice();
				tg.swipe(Direction.DOWN);
				tg.swipe(Direction.UP);
				tg.wait("ele_TextField1785956378472", ComparisonType.IS_VISIBLE);
				tg.click("ele_TextField1785956378472", 1);
				tg.wait("ele_TextField1785956381598", ComparisonType.IS_VISIBLE);
				tg.click("ele_TextField1785956381598", 1);
				tg.wait("ele_TextField1785956384528", ComparisonType.IS_VISIBLE);
				tg.click("ele_TextField1785956384528", 1);
		tg.close();
	}
}