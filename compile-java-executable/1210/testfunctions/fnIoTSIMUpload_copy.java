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


class fniotsimupload_copy {

	public static Object fniotsimupload(String var_File_Path, String var_Addon, String var_Addon_2) {
		tg_String var_TGReturn = "";
		tg.click("ele_UploadAFile_3a026968", 1);
		tg.type("ele_FileName_3a0200f0", "FilePath");
		tg.pressKey(TAB, 1);
		tg.pressKey(TAB, 1);
		tg.pressKey(ENTER, 1);
		tg.wait(5);
		if (tg.performAssert("ele_LABEL_3a1e6326", ComparisonType.IS_VISIBLE)) {
						tg.check.isVisible("ele_LABEL_3a1e6326");
						// [DISABLED] tg.click("ele_On_3a1e6326", 1);
						tg.click("ele_On_3a1ef32a", 1);
		}
		tg.click("ele_ActivateSIMs_3a026968", 1);
		return var_TGReturn;
	}
}
