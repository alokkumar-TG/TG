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


class fngetproduct {

	public static Object fngetproduct(String var_Regression_Get_Product, String var_Product_Id) {
		tg_String var_TGReturn = "";
			tg_String var_Fngetproduct_Response = "";
			var_Fngetproduct_Response = tg.readFromAPI("fngetproduct.json").getString();
			tg_String var_Product_Id = "";
			tg_String var_Product_Name = "";
			tg_String var_Product_Version = "";
			tg_String var_Recurring_Price = "";
			tg_String var_One_Time_Price = "";
			tg_String var_Recurring_Frequency = "";
			tg_String var_Level = "";
			tg_String var_Offer_Name = "";
			tg_String var_Offer_Id = "";
			START_CUSTOM_SCRIPT;
				JSONObject responseJson = new JSONObject(var_Fngetproduct_Response);
				var_Product_Id = responseJson.getString("productId");
				var_Product_Name = responseJson.getString("shortDescription");
				var_Product_Version = responseJson.getString("productVersion");
				var_Recurring_Price = responseJson.getString("recurringPrice");
				var_One_Time_Price = responseJson.getString("oneTimePrice");
				var_Recurring_Frequency = responseJson.getString("recurringFrequency");
				var_Level = responseJson.getString("level");
				var_Offer_Name = responseJson.getString("offerName");
				var_Offer_Id = responseJson.getString("offerId");
			END_CUSTOM_SCRIPT;
			// [DISABLED] // Tosca: name | partnerInformation | (ActionMode 519)
			// [DISABLED] // Tosca: value | value | (ActionMode 165)
			// [DISABLED] // Tosca: name | name1 | (ActionMode 165)
			// [DISABLED] // Tosca: value | value1 | (ActionMode 165)
		return var_TGReturn;
	}
}
