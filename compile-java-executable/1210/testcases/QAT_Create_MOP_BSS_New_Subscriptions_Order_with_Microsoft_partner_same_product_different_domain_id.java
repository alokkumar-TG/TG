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


@Listeners(TestListener.class)
public class QAT_Create_MOP_BSS_New_Subscriptions_Order_with_Microsoft_partner_same_product_different_domain_id extends tc_QAT_f305658e {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void QAT_Create_MOP_BSS_New_Subscriptions_Order_with_Microsoft_partner_same_product_different_domain_id() {
		tg.openBrowser();
		tg_String var_fnGenerateOAuthAccessTokenV1response = "";
		var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1_copy2", new Object[]{var_Regression_Get_Product});
		tg_String var_fnGetAccountDetailsresponse = "";
		var_fnGetAccountDetailsresponse = (String) tg.testFunction("fnGetAccountDetails_copy", new Object[]{var_Regression_Get_Product, var_Account_Id, var_Effective_Date});
			tg_String var_Qat_Create_Mop_Bss_New_Subscriptions_Order_With_Microsoft_Partner_Same_Product_Different_Domain_Id_Response = "";
			var_Qat_Create_Mop_Bss_New_Subscriptions_Order_With_Microsoft_Partner_Same_Product_Different_Domain_Id_Response = tg.readFromAPI("qat_create_mop_bss_new_subscriptions_order_with_microsoft_partner_same_product_different_domain_id.json").getString();
			tg_String var_Order_Id = "";
			START_CUSTOM_SCRIPT;
				JSONObject responseJson = new JSONObject(var_Qat_Create_Mop_Bss_New_Subscriptions_Order_With_Microsoft_Partner_Same_Product_Different_Domain_Id_Response);
				var_Order_Id = responseJson.getString("orderId");
			END_CUSTOM_SCRIPT;
	}
}
