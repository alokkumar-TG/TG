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


class fnkillapps_8e03e8d9 {

	public static Object fnkillapps_8e03e8d9() {
		tg_String var_TGReturn = "";
				// [DISABLED] // Tosca: Path | taskkill | (ActionMode 37)
				// [DISABLED] // Tosca: Arguments | {NULL} | (ActionMode 517)
				tg.type("ele_Argument_39f09b0d", "/f");
				tg.type("ele_Argument_39f09b0d", "/im");
				tg.type("ele_Argument_39f09b0d", "Chrome.exe");
				tg.swipe("ele_WaitForExit_39f09b0d", Direction.UP);
				tg.type("ele_TimeoutForExit_39f09b0d", "30");
				// [DISABLED] // Tosca: Path | taskkill | (ActionMode 37)
				// [DISABLED] // Tosca: Arguments | {NULL} | (ActionMode 517)
				tg.type("ele_Argument_39f09b0d", "/f");
				tg.type("ele_Argument_39f09b0d", "/im");
				tg.type("ele_Argument_39f09b0d", "msedge.exe");
				tg.swipe("ele_WaitForExit_39f09b0d", Direction.UP);
				tg.type("ele_TimeoutForExit_39f09b0d", "30");
				// [DISABLED] // Tosca: Path | taskkill | (ActionMode 37)
				// [DISABLED] // Tosca: Arguments | {NULL} | (ActionMode 517)
				tg.type("ele_Argument_39f09b0d", "/f");
				tg.type("ele_Argument_39f09b0d", "/im");
				tg.type("ele_Argument_39f09b0d", "AcroRd32.exe");
				tg.swipe("ele_WaitForExit_39f09b0d", Direction.UP);
				tg.type("ele_TimeoutForExit_39f09b0d", "30");
			tg.wait(10);
		return var_TGReturn;
	}
}
