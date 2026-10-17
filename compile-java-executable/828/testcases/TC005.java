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
public class tc005 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc005() {
		tg.openDevice();
		tg.wait(1);
		tg.wait("ele_TextView1789202896210", ComparisonType.IS_VISIBLE);
		tg.click("ele_TextView1789202896210", 1);
		tg.wait("ele_Sunset659PMTextView1789202904015", ComparisonType.IS_VISIBLE);
		tg.click("ele_Sunset659PMTextView1789202904015", 1);
		tg.wait("ele_mainmenusearchcityTextView1789202920707", ComparisonType.IS_VISIBLE);
		tg.click("ele_mainmenusearchcityTextView1789202920707", 1);
		tg.wait("ele_suratEditText1789202934810", ComparisonType.IS_VISIBLE);
		tg.click("ele_suratEditText1789202934810", 1);
		tg.wait("ele_SratTextView1789202941734", ComparisonType.IS_VISIBLE);
		tg.click("ele_SratTextView1789202941734", 1);
		tg.wait("ele_OpennavigationdrawerImageButton1789202949078", ComparisonType.IS_VISIBLE);
		tg.click("ele_OpennavigationdrawerImageButton1789202949078", 1);
		tg.wait("ele_TextView1789202952606", ComparisonType.IS_VISIBLE);
		tg.click("ele_TextView1789202952606", 1);
		tg.swipe(Direction.DOWN);
		tg.testFunction("aKPxz", new Object[]{});
		tg_int var_abc = 10;
		tg.close();
	}
}