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


class fnsfdcbssnewactivationpayload_copy2 {

	public static Object fnsfdcbssnewactivationpayload(String var_Regression_Get_Product, String var_Created_By, int var_Customer_Details_Ban, String var_Tax_Payer_Id) {
		tg_String var_TGReturn = "";
			tg_String var_Fnsfdcbssnewactivationpayload_Response = "";
			var_Fnsfdcbssnewactivationpayload_Response = tg.readFromAPI("fnsfdcbssnewactivationpayload.json").getString();
			tg.check.isVisible("ele_Partner_3a0ea111");
			tg.check.isVisible("ele_StatusCode_3a0aca1b");
			// [DISABLED] // Tosca: quoteId | orderId | (ActionMode 165)
			tg.check.isVisible("ele_QuoteStatusCode_3a0aca1b");
			tg.check.isVisible("ele_SubStatusCode_3a0aca1b");
		return var_TGReturn;
	}
}
