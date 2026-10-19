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
public class appfunction01 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void appfunction01() {
		tg.openDevice();
				tg.wait("ele_yourteamEditText1792000119946", ComparisonType.IS_VISIBLE);
				tg.click("ele_yourteamEditText1792000119946", 1);
				tg.wait("ele_NextButton1792000134404", ComparisonType.IS_VISIBLE);
				tg.click("ele_NextButton1792000134404", 1);
		tg.close();
	}
}