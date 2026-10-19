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


class fngetproductiotcc {

	public static Object fngetproductiotcc(String var_Regression_Get_Product, String var_Product_Id) {
		tg_String var_TGReturn = "";
			tg_String var_Fngetproductiotcc_Response = "";
			var_Fngetproductiotcc_Response = tg.readFromAPI("fngetproductiotcc.json").getString();
			tg_String var_Product_Id = "";
			tg_String var_Product_Name = "";
			tg_String var_Product_Version = "";
			tg_String var_Recurring_Price = "";
			tg_String var_One_Time_Price = "";
			tg_String var_Recurring_Frequency = "";
			tg_String var_Level = "";
			tg_String var_Rate_Plan_Name = "";
			tg_String var_Rate_Plan_Id = "";
			tg_String var_Name = "";
			tg_String var_Value = "";
			START_CUSTOM_SCRIPT;
				JSONObject responseJson = new JSONObject(var_Fngetproductiotcc_Response);
				var_Product_Id = responseJson.getString("productId");
				var_Product_Name = responseJson.getString("shortDescription");
				var_Product_Version = responseJson.getString("productVersion");
				var_Recurring_Price = responseJson.getString("recurringPrice");
				var_One_Time_Price = responseJson.getString("oneTimePrice");
				var_Recurring_Frequency = responseJson.getString("recurringFrequency");
				var_Level = responseJson.getString("level");
				var_Rate_Plan_Name = responseJson.getString("ratePlanName");
				var_Rate_Plan_Id = responseJson.getString("ratePlanId");
				var_Name = responseJson.getString("name");
				var_Value = responseJson.getString("value");
			END_CUSTOM_SCRIPT;
		return var_TGReturn;
	}
}
