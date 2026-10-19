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


class fnqueryorderfetchingdata_copy {

	public static Object fnqueryorderfetchingdata(String var_Regression_Get_Product) {
		tg_String var_TGReturn = "";
			tg_String var_Fnqueryorderfetchingdata_Response = "";
			var_Fnqueryorderfetchingdata_Response = tg.readFromAPI("fnqueryorderfetchingdata.json").getString();
			tg_String var_Activity_Id = "";
			tg_String var_Link_Uuid = "";
			tg_String var_Financial_Account_Number = "";
			tg_String var_Order_Line_Id = "";
			tg_String var_Customer_Id = "";
			tg_String var_Account_Name = "";
			tg_String var_Level = "";
			START_CUSTOM_SCRIPT;
				JSONObject responseJson = new JSONObject(var_Fnqueryorderfetchingdata_Response);
				var_Activity_Id = responseJson.getString("activityId");
				var_Link_Uuid = responseJson.getString("linkUUID");
				var_Financial_Account_Number = responseJson.getString("financialAccountNumber");
				var_Order_Line_Id = responseJson.getString("orderLineId");
				var_Customer_Id = responseJson.getString("customerId");
				var_Account_Name = responseJson.getString("accountName");
				var_Level = responseJson.getString("level");
			END_CUSTOM_SCRIPT;
		return var_TGReturn;
	}
}
