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


class fngeteidfromtdm {

	public static Object fngeteidfromtdm() {
		tg_String var_TGReturn = "";
		tg_String var_fnGenerateOAuthAccessTokenV1response = "";
		var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1", new Object[]{var_Regression_Get_Product});
		tg_String var_Fngeteidfromtdm_Response = "";
		var_Fngeteidfromtdm_Response = tg.readFromAPI("fngeteidfromtdm.json").getString();
		tg_String var_Eid_Value = "";
		START_CUSTOM_SCRIPT;
			JSONObject responseJson = new JSONObject(var_Fngeteidfromtdm_Response);
			var_Eid_Value = responseJson.getString("EID");
		END_CUSTOM_SCRIPT;
		return var_TGReturn;
	}
}
