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
public class QAT_PP_Bundle__Product_Rate_Plan_One_time_Fee_New_Activation_with_Quanity_2_Verify_Recurring_Charges_for_Rate_plan_and_one_time_fee_for_each_line_in_the_order_ba_18ecd665 extends tc_QAT_f305658e {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void QAT_PP_Bundle__Product_Rate_Plan_One_time_Fee_New_Activation_with_Quanity_2_Verify_Recurring_Charges_for_Rate_plan_and_one_time_fee_for_each_line_in_the_order_ba_18ecd665() {
		tg.openBrowser();
		tg_String var_fnGetBANFromValidationAPIETPresponse = "";
		var_fnGetBANFromValidationAPIETPresponse = (String) tg.testFunction("fnGetBANFromValidationAPIETP_copy", new Object[]{var_Regression_Ban_Api});
		tg_String var_fnGenerateOAuthAccessTokenV1response = "";
		var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1_copy2", new Object[]{var_Regression_Get_Product});
			tg_String var_Qat_Pp_Bundle_Product_Rate_Plan_One_Time_Fee_New_Activation_With_Quanity_2_Verify_Recurring_Charges_For_Rate_Plan_And_One_Time_Fee_For_Each_Line_In_The_Order_Based_On_Quanity_Ie_2_In_This_Case_Response = "";
			var_Qat_Pp_Bundle_Product_Rate_Plan_One_Time_Fee_New_Activation_With_Quanity_2_Verify_Recurring_Charges_For_Rate_Plan_And_One_Time_Fee_For_Each_Line_In_The_Order_Based_On_Quanity_Ie_2_In_This_Case_Response = tg.readFromAPI("qat_pp_bundle_product_rate_plan_one_time_fee_new_activation_with_quanity_2_verify_recurring_charges_for_rate_plan_and_one_time_fee_for_each_line_in_the_order_based_on_quanity_ie_2_in_this_case.json").getString();
			tg_String var_Product_Id = "";
			tg_String var_Product_Name = "";
			tg_String var_Product_Version = "";
			tg_String var_Recurring_Price = "";
			tg_String var_One_Time_Price = "";
			tg_String var_Level = "";
			tg_String var_Product_Id_1 = "";
			tg_String var_Product_Name_1 = "";
			tg_String var_Product_Version_1 = "";
			tg_String var_Recurring_Price_1 = "";
			tg_String var_One_Time_Price_1 = "";
			tg_String var_Recurring_Frequency = "";
			tg_String var_Level_1 = "";
			tg_String var_Offer_Name = "";
			tg_String var_Offer_Id = "";
			tg_String var_Product_Id_2 = "";
			tg_String var_Product_Name_2 = "";
			tg_String var_Product_Version_2 = "";
			tg_String var_Recurring_Price_2 = "";
			tg_String var_One_Time_Price_2 = "";
			tg_String var_Recurring_Frequency_1 = "";
			tg_String var_Level_2 = "";
			tg_String var_Rate_Plan_Id = "";
			tg_String var_Rate_Plan_Name = "";
			tg_String var_Product_Sub_Type = "";
			START_CUSTOM_SCRIPT;
				JSONObject responseJson = new JSONObject(var_Qat_Pp_Bundle_Product_Rate_Plan_One_Time_Fee_New_Activation_With_Quanity_2_Verify_Recurring_Charges_For_Rate_Plan_And_One_Time_Fee_For_Each_Line_In_The_Order_Based_On_Quanity_Ie_2_In_This_Case_Response);
				var_Product_Id = responseJson.getString("productId");
				var_Product_Name = responseJson.getString("shortDescription");
				var_Product_Version = responseJson.getString("productVersion");
				var_Recurring_Price = responseJson.getString("recurringPrice");
				var_One_Time_Price = responseJson.getString("oneTimePrice");
				var_Level = responseJson.getString("level");
				var_Product_Id_1 = responseJson.getString("productId_1");
				var_Product_Name_1 = responseJson.getString("shortDescription_1");
				var_Product_Version_1 = responseJson.getString("productVersion_1");
				var_Recurring_Price_1 = responseJson.getString("recurringPrice_1");
				var_One_Time_Price_1 = responseJson.getString("oneTimePrice_1");
				var_Recurring_Frequency = responseJson.getString("recurringFrequency");
				var_Level_1 = responseJson.getString("level_1");
				var_Offer_Name = responseJson.getString("offerName");
				var_Offer_Id = responseJson.getString("offerId");
				var_Product_Id_2 = responseJson.getString("productId_2");
				var_Product_Name_2 = responseJson.getString("shortDescription_2");
				var_Product_Version_2 = responseJson.getString("productVersion_2");
				var_Recurring_Price_2 = responseJson.getString("recurringPrice_2");
				var_One_Time_Price_2 = responseJson.getString("oneTimePrice_2");
				var_Recurring_Frequency_1 = responseJson.getString("recurringFrequency_1");
				var_Level_2 = responseJson.getString("level_2");
				var_Rate_Plan_Id = responseJson.getString("ratePlanId");
				var_Rate_Plan_Name = responseJson.getString("ratePlanName");
				var_Product_Sub_Type = responseJson.getString("productSubType");
			END_CUSTOM_SCRIPT;
			tg_String var_Qat_Pp_Bundle_Product_Rate_Plan_One_Time_Fee_New_Activation_With_Quanity_2_Verify_Recurring_Charges_For_Rate_Plan_And_One_Time_Fee_For_Each_Line_In_The_Order_Based_On_Quanity_Ie_2_In_This_Case_2_Response = "";
			var_Qat_Pp_Bundle_Product_Rate_Plan_One_Time_Fee_New_Activation_With_Quanity_2_Verify_Recurring_Charges_For_Rate_Plan_And_One_Time_Fee_For_Each_Line_In_The_Order_Based_On_Quanity_Ie_2_In_This_Case_2_Response = tg.readFromAPI("qat_pp_bundle_product_rate_plan_one_time_fee_new_activation_with_quanity_2_verify_recurring_charges_for_rate_plan_and_one_time_fee_for_each_line_in_the_order_based_on_quanity_ie_2_in_this_case_2.json").getString();
			tg_String var_Order_Id = "";
			START_CUSTOM_SCRIPT;
				JSONObject responseJson = new JSONObject(var_Qat_Pp_Bundle_Product_Rate_Plan_One_Time_Fee_New_Activation_With_Quanity_2_Verify_Recurring_Charges_For_Rate_Plan_And_One_Time_Fee_For_Each_Line_In_The_Order_Based_On_Quanity_Ie_2_In_This_Case_2_Response);
				var_Order_Id = responseJson.getString("orderId");
			END_CUSTOM_SCRIPT;
		tg.wait(30);
		tg_String var_fnOrderStatusHistoryValidationsresponse = "";
		var_fnOrderStatusHistoryValidationsresponse = (String) tg.testFunction("fnOrderStatusHistoryValidations_copy", new Object[]{var_Regression_Get_Product});
	}
}
