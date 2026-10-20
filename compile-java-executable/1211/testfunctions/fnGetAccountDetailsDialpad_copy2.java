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


class fngetaccountdetailsdialpad_copy2 {

	public static Object fngetaccountdetailsdialpad(String var_Regression_Get_Product, int var_Account_Id) {
		tg_String var_TGReturn = "";
				tg_String var_Fngetaccountdetails_Response = "";
				var_Fngetaccountdetails_Response = tg.readFromAPI("fngetaccountdetails.json").getString();
				START_CUSTOM_SCRIPT;
					JSONObject responseJson = new JSONObject(var_Fngetaccountdetails_Response);
					var_Account_Name = responseJson.getString("accountName");
					var_Account_Id = responseJson.getString("accountId");
					var_Taxpayer_Id = responseJson.getString("taxpayerId");
					var_Product_Id = responseJson.getString("productId");
					var_Product_Version = responseJson.getString("productVersion");
					var_Product_Description = responseJson.getString("productDescription");
					var_Recurring_Price = responseJson.getString("recurringPrice");
					var_One_Time_Price = responseJson.getString("oneTimePrice");
					var_Recurring_Frequency = responseJson.getString("recurringFrequency");
					var_Financial_Account_Number = responseJson.getString("financialAccountNumber");
					var_Offer_Id = responseJson.getString("offerId");
					var_Offer_Name = responseJson.getString("offerName");
					var_Name = responseJson.getString("name");
					var_Value = responseJson.getString("value");
					var_Pl_Effective_Date = responseJson.getString("effectiveDate");
				END_CUSTOM_SCRIPT;
		return var_TGReturn;
	}
}
