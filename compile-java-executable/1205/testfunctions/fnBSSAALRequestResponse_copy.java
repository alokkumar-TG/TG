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


class fnbssaalrequestresponse_copy {

	public static Object fnbssaalrequestresponse(String var_Regression_Get_Product, String var_Created_By) {
		tg_String var_TGReturn = "";
			tg_String var_Fnbssaalrequestresponse_Response = "";
			var_Fnbssaalrequestresponse_Response = tg.readFromAPI("fnbssaalrequestresponse.json").getString();
			tg_String var_Order_Id = "";
			tg_String var_Reason_Codes = "";
			START_CUSTOM_SCRIPT;
				JSONObject responseJson = new JSONObject(var_Fnbssaalrequestresponse_Response);
				var_Order_Id = responseJson.getString("orderId");
				var_Reason_Codes = responseJson.getString("reasonCodes");
			END_CUSTOM_SCRIPT;
		return var_TGReturn;
	}
}
