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


class fncloseallbrowser_copy {

	public static Object fncloseallbrowser() {
		tg_String var_TGReturn = "";
			// [DISABLED] if (/* Tosca: If Chrome Browser Open */) {
				// [DISABLED] // Tosca: Caption | *Google Chrome | (ActionMode 37)
				// [DISABLED] // Tosca: Operation | Verify Window Exists | (ActionMode 69)
				// [DISABLED] // Tosca: Caption | *Google Chrome | (ActionMode 37)
				// [DISABLED] // Tosca: Operation | Close | (ActionMode 37)
			// [DISABLED] }
			// [DISABLED] if (/* Tosca: If Internet Explorer Open */) {
				// [DISABLED] // Tosca: Caption | *Internet Explorer | (ActionMode 37)
				// [DISABLED] // Tosca: Operation | Verify Window Exists | (ActionMode 69)
				// [DISABLED] // Tosca: Caption | *Internet Explorer | (ActionMode 37)
				// [DISABLED] // Tosca: Operation | Close | (ActionMode 37)
			// [DISABLED] }
			// [DISABLED] if (/* Tosca: If Microsoft Edge Open */) {
				// [DISABLED] // Tosca: Caption | *Microsoft Edge | (ActionMode 37)
				// [DISABLED] // Tosca: Operation | Verify Window Exists | (ActionMode 69)
				// [DISABLED] // Tosca: Caption | *Microsoft Edge | (ActionMode 37)
				// [DISABLED] // Tosca: Operation | Close | (ActionMode 37)
			// [DISABLED] }
			// [DISABLED] if (/* Tosca: If Firefox Open */) {
				// [DISABLED] // Tosca: Caption | *Firefox | (ActionMode 37)
				// [DISABLED] // Tosca: Operation | Verify Window Exists | (ActionMode 69)
				// [DISABLED] // Tosca: Caption | *Firefox | (ActionMode 37)
				// [DISABLED] // Tosca: Operation | Close | (ActionMode 37)
			// [DISABLED] }
			while (tg.verify.isInvisible("ele_WindowIndex_39f68e81")) {
				// [DISABLED] // Tosca: Caption | *Google Chrome | (ActionMode 37)
				tg.type("ele_WindowIndex_39f68e81", "1");
				// [DISABLED] // Tosca: Operation | Verify Window Exists | (ActionMode 69)
				// [DISABLED] // Tosca: Caption | *Google Chrome | (ActionMode 37)
				tg.type("ele_WindowIndex_39f68e81", "1");
				// [DISABLED] // Tosca: Operation | Close | (ActionMode 37)
				tg.wait(2);
			}
		return var_TGReturn;
	}
}
