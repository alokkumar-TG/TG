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
public class QAT_BSS_End_of_Term_Auto_Renew_Off_and_verify_Offer_is_Cancelled_through_ordering_flow extends tc_QAT_f305658e {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void QAT_BSS_End_of_Term_Auto_Renew_Off_and_verify_Offer_is_Cancelled_through_ordering_flow() {
		tg.openBrowser();
		tg_String var_fnGetBANFromValidationAPIETPresponse = "";
		var_fnGetBANFromValidationAPIETPresponse = (String) tg.testFunction("fnGetBANFromValidationAPIETP_copy2", new Object[]{var_Regression_Ban_Api});
		tg_String var_fnGenerateOAuthAccessTokenV1response = "";
		var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1_copy3", new Object[]{var_Regression_Get_Product});
		tg_String var_fnGetProductresponse = "";
		var_fnGetProductresponse = (String) tg.testFunction("fnGetProduct_copy2", new Object[]{var_Regression_Get_Product, var_Product_Id});
		var_Created_By = "SDET_Automation";
		tg_String var_fnBSSNewActivationRequestAndResponseresponse = "";
		var_fnBSSNewActivationRequestAndResponseresponse = (String) tg.testFunction("fnBSSNewActivationRequestAndResponse_copy2", new Object[]{var_Regression_Get_Product, var_Created_By});
			tg_String var_Qat_Bss_End_Of_Term_Auto_Renew_Off_And_Verify_Offer_Is_Cancelled_Through_Ordering_Flow_Response = "";
			var_Qat_Bss_End_Of_Term_Auto_Renew_Off_And_Verify_Offer_Is_Cancelled_Through_Ordering_Flow_Response = tg.readFromAPI("qat_bss_end_of_term_auto_renew_off_and_verify_offer_is_cancelled_through_ordering_flow.json").getString();
			START_CUSTOM_SCRIPT;
				JSONObject responseJson = new JSONObject(var_Qat_Bss_End_Of_Term_Auto_Renew_Off_And_Verify_Offer_Is_Cancelled_Through_Ordering_Flow_Response);
				var_Account_Id = responseJson.getString("accountId");
				var_Taxpayer_Id = responseJson.getString("taxpayerId");
				var_Product_Id = responseJson.getString("productId");
				var_Product_Version = responseJson.getString("productVersion");
				var_Product_Offer_Order_Id = responseJson.getString("productOfferOrderId");
				var_Product_Name = responseJson.getString("productName");
				var_Product_Description = responseJson.getString("productDescription");
				var_External_Id = responseJson.getString("externalId");
				var_Subscription_Id = responseJson.getString("subscriptionId");
				var_Version = responseJson.getString("version");
				var_Offer_Name = responseJson.getString("offerName");
				var_Offer_Id = responseJson.getString("offerId");
				var_Order_Id = responseJson.getString("orderId");
				var_Quantity = responseJson.getString("quantity");
				var_Modified_Date = responseJson.getString("modifiedDate");
				var_Name = responseJson.getString("name");
				var_Value = responseJson.getString("value");
				var_Recurring_Price = responseJson.getString("recurringPrice");
				var_One_Time_Price = responseJson.getString("oneTimePrice");
				var_Recurring_Frequency = responseJson.getString("recurringFrequency");
				var_Cost_Price = responseJson.getString("costPrice");
			END_CUSTOM_SCRIPT;
			tg_String var_Qat_Bss_End_Of_Term_Auto_Renew_Off_And_Verify_Offer_Is_Cancelled_Through_Ordering_Flow_2_Response = "";
			var_Qat_Bss_End_Of_Term_Auto_Renew_Off_And_Verify_Offer_Is_Cancelled_Through_Ordering_Flow_2_Response = tg.readFromAPI("qat_bss_end_of_term_auto_renew_off_and_verify_offer_is_cancelled_through_ordering_flow_2.json").getString();
			tg_String var_Qat_Bss_End_Of_Term_Auto_Renew_Off_And_Verify_Offer_Is_Cancelled_Through_Ordering_Flow_3_Response = "";
			var_Qat_Bss_End_Of_Term_Auto_Renew_Off_And_Verify_Offer_Is_Cancelled_Through_Ordering_Flow_3_Response = tg.readFromAPI("qat_bss_end_of_term_auto_renew_off_and_verify_offer_is_cancelled_through_ordering_flow_3.json").getString();
	}
}
