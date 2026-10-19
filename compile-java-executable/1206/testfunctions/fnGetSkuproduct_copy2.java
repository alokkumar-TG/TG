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


class fngetskuproduct_copy2 {

	public static Object fngetskuproduct(String var_Regression_Get_Product, String var_Product_Id) {
		tg_String var_TGReturn = "";
			tg_String var_Fngetskuproduct_Response = "";
			var_Fngetskuproduct_Response = tg.readFromAPI("fngetskuproduct.json").getString();
			START_CUSTOM_SCRIPT;
				JSONObject responseJson = new JSONObject(var_Fngetskuproduct_Response);
				var_Sku_Product_Id = responseJson.getString("productId");
				var_Sku = responseJson.getString("shortDescription");
				var_Sku_Offer_Name = responseJson.getString("offerName");
				var_Sku_Id = responseJson.getString("sku");
				var_Material_Group = responseJson.getString("materialGroup");
			END_CUSTOM_SCRIPT;
		return var_TGReturn;
	}
}
