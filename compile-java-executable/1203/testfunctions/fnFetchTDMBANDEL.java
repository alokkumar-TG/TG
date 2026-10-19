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


class fnfetchtdmbandel {

	public static Object fnfetchtdmbandel(String var_Regression_Ban_Api) {
		tg_String var_TGReturn = "";
		tg_String var_Fnfetchtdmbandel_Response = "";
		var_Fnfetchtdmbandel_Response = tg.readFromAPI("fnfetchtdmbandel.json").getString();
		tg_String var_Tban_Spcl = "";
		START_CUSTOM_SCRIPT;
			JSONObject responseJson = new JSONObject(var_Fnfetchtdmbandel_Response);
			var_Tban_Spcl = responseJson.getString("BAN");
		END_CUSTOM_SCRIPT;
		return var_TGReturn;
	}
}
