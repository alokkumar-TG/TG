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


class fnorderquery_copy2 {

	public static Object fnorderquery(String var_Order_Id, String var_Regression_Get_Product, String var_Status_Code, String var_Sub_Status_Code, String var_Customer_Id, int var_Customer_Details_Ban, String var_Regression_Env, String var_Bill_Pass_Addon, String var_Billpassthrough, String var_Billpassvalue, String var_Offerstatus) {
		tg_String var_TGReturn = "";
		tg.wait(10);
		tg_String var_fnGenerateOAuthAccessTokenV1response = "";
		if (tg.performAssert(var_Env, ComparisonType.NOT_EQUAL_TO, "")) {
					var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1_copy3", new Object[]{var_Regression_Get_Product});
		}
		if (tg.performAssert(var_Env, ComparisonType.NOT_EQUAL_TO, "")) {
					var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1_copy3", new Object[]{var_Regression_Get_Product});
		}
		tg_String var_Fngenerateoauthaccesstokenv1_Response = "";
		var_Fngenerateoauthaccesstokenv1_Response = tg.readFromAPI("fngenerateoauthaccesstokenv1.json").getString();
		START_CUSTOM_SCRIPT;
			JSONObject responseJson = new JSONObject(var_Fngenerateoauthaccesstokenv1_Response);
			var_Access_Tocken = responseJson.getString("access_token");
		END_CUSTOM_SCRIPT;
		tg_String var_Fnorderquery_Response = "";
		var_Fnorderquery_Response = tg.readFromAPI("fnorderquery.json").getString();
		START_CUSTOM_SCRIPT;
			JSONObject responseJson = new JSONObject(var_Fnorderquery_Response);
			var_Pl_Financial_Account_Number = responseJson.getString("financialAccountNumber");
			var_Pl_Customer_Id = responseJson.getString("customerId");
			var_Account_Name = responseJson.getString("accountName");
			var_Link_Uuid = responseJson.getString("linkUUID");
		END_CUSTOM_SCRIPT;
		tg.wait(10);
		return var_TGReturn;
	}
}
