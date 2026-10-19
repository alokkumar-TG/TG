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
public class QAT_Verify_user_is_able_to_Reject_the_SFDC_Order_in_COP_page_by_clicking_Reject_button_before_or_after_eSIGN extends tc_QAT_f305658e {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void QAT_Verify_user_is_able_to_Reject_the_SFDC_Order_in_COP_page_by_clicking_Reject_button_before_or_after_eSIGN() {
		tg.openBrowser();
		tg_String var_fnGetBANFromValidationAPIETPresponse = "";
		var_fnGetBANFromValidationAPIETPresponse = (String) tg.testFunction("fnGetBANFromValidationAPIETP", new Object[]{var_Regression_Ban_Api});
		tg_String var_fnGenerateOAuthAccessTokenV1response = "";
		var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1_copy", new Object[]{var_Regression_Get_Product});
		tg_String var_fnGetProductresponse = "";
		var_fnGetProductresponse = (String) tg.testFunction("fnGetProduct", new Object[]{var_Regression_Get_Product, var_Product_Id});
		tg_String var_Created_By = "SDET_Automation";
		tg_String var_fnSFDCBSSNewActivationPayloadresponse = "";
		var_fnSFDCBSSNewActivationPayloadresponse = (String) tg.testFunction("fnSFDCBSSNewActivationPayload", new Object[]{var_Regression_Get_Product, var_Created_By, var_Customer_Details_Ban, var_Tax_Payer_Id});
		tg_String var_Status_Code = "OrderCreated";
		tg_String var_Sub_Status_Code = "OrderCreated";
		tg_String var_fnOrderQueryresponse = "";
		var_fnOrderQueryresponse = (String) tg.testFunction("fnOrderQuery", new Object[]{var_Order_Id, var_Regression_Get_Product, var_Status_Code, var_Sub_Status_Code, var_Customer_Id, var_Customer_Details_Ban, var_Regression_Env, var_Bill_Pass_Addon, var_Billpassthrough, var_Billpassvalue, var_Offerstatus});
		// [DISABLED] tg.testFunction("fnKillApps_copy");
			// [DISABLED] tg.testFunction("fnKillApps_copy");
			tg.navigateToUrl("https://etcheckout.qat.t-mobile.com/{B[linkUUID]}");
			tg.wait(5);
			tg.type("ele_EmailAddress_3a0dcf8d", "iot_sdets@t-mobile.com");
			tg.click("ele_Authenticate_3a0dcf8d", 1);
			tg.wait(50);
			tg.click("ele_Reject_3a0dcf8f", 1);
			tg.wait(5);
			tg.click("ele_Reason_3a0dcf91", 1);
			tg.click("ele_NoLongerWant_3a0dcf91", 1);
			tg.click("ele_RejectOrder_3a0dcf91", 1);
			tg_String var_Qat_Verify_User_Is_Able_To_Reject_The_Sfdc_Order_In_Cop_Page_By_Clicking_Reject_Button_Before_Or_After_Esign_Response = "";
			var_Qat_Verify_User_Is_Able_To_Reject_The_Sfdc_Order_In_Cop_Page_By_Clicking_Reject_Button_Before_Or_After_Esign_Response = tg.readFromAPI("qat_verify_user_is_able_to_reject_the_sfdc_order_in_cop_page_by_clicking_reject_button_before_or_after_esign.json").getString();
		// [DISABLED] tg_String var_fnESginresponse = "";
		// [DISABLED] var_fnESginresponse = (String) tg.testFunction("fnESgin", new Object[]{var_Url, var_Primary_Contact_Email_Address});
		// [DISABLED] tg.testFunction("fnKillApps_copy");
			// [DISABLED] tg_String var_Qat_Verify_User_Is_Able_To_Reject_The_Sfdc_Order_In_Cop_Page_By_Clicking_Reject_Button_Before_Or_After_Esign_2_Response = "";
			// [DISABLED] var_Qat_Verify_User_Is_Able_To_Reject_The_Sfdc_Order_In_Cop_Page_By_Clicking_Reject_Button_Before_Or_After_Esign_2_Response = tg.readFromAPI("qat_verify_user_is_able_to_reject_the_sfdc_order_in_cop_page_by_clicking_reject_button_before_or_after_esign_2.json").getString();
			// [DISABLED] tg_String var_Order_Id = "";
			// [DISABLED] START_CUSTOM_SCRIPT;
			// [DISABLED] 	JSONObject responseJson = new JSONObject(var_Qat_Verify_User_Is_Able_To_Reject_The_Sfdc_Order_In_Cop_Page_By_Clicking_Reject_Button_Before_Or_After_Esign_2_Response);
			// [DISABLED] 	var_Order_Id = responseJson.getString("orderId");
			// [DISABLED] END_CUSTOM_SCRIPT;
	}
}
