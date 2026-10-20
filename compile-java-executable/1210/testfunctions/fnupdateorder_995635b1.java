import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import static io.testgrid.enums.KeyboardKeys.*;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import org.openqa.selenium.*;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import static io.testgrid.baseClass.driver;


class fnupdateorder_995635b1 {

	public static Object fnupdateorder_995635b1() {
		tg_String var_TGReturn = "";
			tg.click("ele_UpdateOrder_39ff4780", 1);
			tg.wait(5);
			// [DISABLED] if (/* Tosca: If */) {
				// [DISABLED] tg.check.isVisible("ele_TextBox_39ff4784");
				// [DISABLED] tg.check.isVisible("ele_TextBox_39ff4784");
			// [DISABLED] }
			tg.swipe("ele_Activated_39ff4784", Direction.UP);
			tg.click("ele_Activated_39ff4784", 1);
			tg.click("ele_Submit_39ff4784", 1);
		return var_TGReturn;
	}
}
