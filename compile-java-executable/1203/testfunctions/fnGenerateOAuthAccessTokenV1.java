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


class fngenerateoauthaccesstokenv1 {

	public static Object fngenerateoauthaccesstokenv1(String var_Regression_Get_Product) {
		tg_String var_TGReturn = "";
		tg_String var_Fngenerateoauthaccesstokenv1_Response = "";
		var_Fngenerateoauthaccesstokenv1_Response = tg.readFromAPI("fngenerateoauthaccesstokenv1.json").getString();
		tg_String var_Access_Tocken = "";
		START_CUSTOM_SCRIPT;
			JSONObject responseJson = new JSONObject(var_Fngenerateoauthaccesstokenv1_Response);
			var_Access_Tocken = responseJson.getString("access_token");
		END_CUSTOM_SCRIPT;
		return var_TGReturn;
	}
}
