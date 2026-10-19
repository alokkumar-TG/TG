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


class fnsimuploadqueryapi_copy2 {

	public static Object fnsimuploadqueryapi(String var_Regression_Sim_Inventory, String var_Imsi, String var_Iccid) {
		tg_String var_TGReturn = "";
		// [DISABLED] tg.wait(3);
		tg_String var_fnGenerateOAuthAccessTokenV1response = "";
		var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1_copy3", new Object[]{var_Regression_Get_Product});
		tg_String var_Fnsimuploadqueryapi_Response = "";
		var_Fnsimuploadqueryapi_Response = tg.readFromAPI("fnsimuploadqueryapi.json").getString();
		return var_TGReturn;
	}
}
