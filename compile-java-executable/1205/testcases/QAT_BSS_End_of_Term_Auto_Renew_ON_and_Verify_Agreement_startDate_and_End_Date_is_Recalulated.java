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
public class QAT_BSS_End_of_Term_Auto_Renew_ON_and_Verify_Agreement_startDate_and_End_Date_is_Recalulated extends tc_QAT_f305658e {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void QAT_BSS_End_of_Term_Auto_Renew_ON_and_Verify_Agreement_startDate_and_End_Date_is_Recalulated() {
		tg.openBrowser();
		tg_String var_fnGetBANFromValidationAPIETPresponse = "";
		var_fnGetBANFromValidationAPIETPresponse = (String) tg.testFunction("fnGetBANFromValidationAPIETP_copy", new Object[]{var_Regression_Ban_Api});
		tg_String var_fnGenerateOAuthAccessTokenV1response = "";
		var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1_copy2", new Object[]{var_Regression_Get_Product});
		tg_String var_fnGetProductresponse = "";
		var_fnGetProductresponse = (String) tg.testFunction("fnGetProduct_copy", new Object[]{var_Regression_Get_Product, var_Product_Id});
		tg_String var_Created_By = "SDET_Automation";
		tg_String var_fnBSSNewActivationRequestAndResponseresponse = "";
		var_fnBSSNewActivationRequestAndResponseresponse = (String) tg.testFunction("fnBSSNewActivationRequestAndResponse_copy", new Object[]{var_Regression_Get_Product, var_Created_By});
		tg.wait(20);
			tg_String var_Qat_Bss_End_Of_Term_Auto_Renew_On_And_Verify_Agreement_Startdate_And_End_Date_Is_Recalulated_Response = "";
			var_Qat_Bss_End_Of_Term_Auto_Renew_On_And_Verify_Agreement_Startdate_And_End_Date_Is_Recalulated_Response = tg.readFromAPI("qat_bss_end_of_term_auto_renew_on_and_verify_agreement_startdate_and_end_date_is_recalulated.json").getString();
			tg_String var_Account_Id = "";
			tg_String var_Taxpayer_Id = "";
			tg_String var_Product_Id = "";
			tg_String var_Product_Version = "";
			tg_String var_Product_Offer_Order_Id = "";
			tg_String var_Product_Name = "";
			tg_String var_Product_Description = "";
			tg_String var_External_Id = "";
			tg_String var_Subscription_Id = "";
			tg_String var_Version = "";
			tg_String var_Offer_Name = "";
			tg_String var_Offer_Id = "";
			tg_String var_Order_Id = "";
			tg_String var_Quantity = "";
			tg_String var_Modified_Date = "";
			tg_String var_Name = "";
			tg_String var_Value = "";
			tg_String var_Recurring_Price = "";
			tg_String var_One_Time_Price = "";
			tg_String var_Recurring_Frequency = "";
			tg_String var_Cost_Price = "";
			tg_String var_Id = "";
			tg_String var_Address_Id = "";
			START_CUSTOM_SCRIPT;
				JSONObject responseJson = new JSONObject(var_Qat_Bss_End_Of_Term_Auto_Renew_On_And_Verify_Agreement_Startdate_And_End_Date_Is_Recalulated_Response);
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
				var_Id = responseJson.getString("id");
				var_Address_Id = responseJson.getString("addressId");
			END_CUSTOM_SCRIPT;
			tg_String var_Qat_Bss_End_Of_Term_Auto_Renew_On_And_Verify_Agreement_Startdate_And_End_Date_Is_Recalulated_2_Response = "";
			var_Qat_Bss_End_Of_Term_Auto_Renew_On_And_Verify_Agreement_Startdate_And_End_Date_Is_Recalulated_2_Response = tg.readFromAPI("qat_bss_end_of_term_auto_renew_on_and_verify_agreement_startdate_and_end_date_is_recalulated_2.json").getString();
			tg_String var_Qat_Bss_End_Of_Term_Auto_Renew_Off_And_Verify_Offer_Is_Cancelled_Through_Ordering_Flow_3_Response = "";
			var_Qat_Bss_End_Of_Term_Auto_Renew_Off_And_Verify_Offer_Is_Cancelled_Through_Ordering_Flow_3_Response = tg.readFromAPI("qat_bss_end_of_term_auto_renew_off_and_verify_offer_is_cancelled_through_ordering_flow_3.json").getString();
		// [DISABLED] tg.testFunction("fnKillApps_copy");
		// [DISABLED] tg_String var_fnLoginTMobileUSAStagingSignInresponse = "";
		// [DISABLED] var_fnLoginTMobileUSAStagingSignInresponse = (String) tg.testFunction("fnLoginTMobileUSAStagingSignIn_copy", new Object[]{var_Url, var_Regression_Username, var_Regression_Password});
		// [DISABLED] tg_String var_fnSearchOpenCreatedOrderresponse = "";
		// [DISABLED] var_fnSearchOpenCreatedOrderresponse = (String) tg.testFunction("fnSearchOpenCreatedOrder_copy", new Object[]{var_Search_Order, var_Status});
	}
}
