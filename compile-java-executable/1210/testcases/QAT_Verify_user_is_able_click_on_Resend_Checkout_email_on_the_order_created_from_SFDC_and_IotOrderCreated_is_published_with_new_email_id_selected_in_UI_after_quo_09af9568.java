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
public class QAT_Verify_user_is_able_click_on_Resend_Checkout_email_on_the_order_created_from_SFDC_and_IotOrderCreated_is_published_with_new_email_id_selected_in_UI_after_quo_09af9568 extends tc_QAT_f305658e {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void QAT_Verify_user_is_able_click_on_Resend_Checkout_email_on_the_order_created_from_SFDC_and_IotOrderCreated_is_published_with_new_email_id_selected_in_UI_after_quo_09af9568() {
		tg.openBrowser();
		tg_String var_fnGenerateOAuthAccessTokenV1response = "";
		var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1_copy2", new Object[]{var_Regression_Get_Product});
			tg_String var_Qat_Verify_User_Is_Able_Click_On_Resend_Checkout_Email_On_The_Order_Created_From_Sfdc_And_Iotordercreated_Is_Published_With_New_Email_Id_Selected_In_Ui_After_Quote_Is_Submitted_And_Before_Order_Submitted_Response = "";
			var_Qat_Verify_User_Is_Able_Click_On_Resend_Checkout_Email_On_The_Order_Created_From_Sfdc_And_Iotordercreated_Is_Published_With_New_Email_Id_Selected_In_Ui_After_Quote_Is_Submitted_And_Before_Order_Submitted_Response = tg.readFromAPI("qat_verify_user_is_able_click_on_resend_checkout_email_on_the_order_created_from_sfdc_and_iotordercreated_is_published_with_new_email_id_selected_in_ui_after_quote_is_submitted_and_before_order_submitted.json").getString();
			tg_String var_Reason_Codes = "";
			START_CUSTOM_SCRIPT;
				JSONObject responseJson = new JSONObject(var_Qat_Verify_User_Is_Able_Click_On_Resend_Checkout_Email_On_The_Order_Created_From_Sfdc_And_Iotordercreated_Is_Published_With_New_Email_Id_Selected_In_Ui_After_Quote_Is_Submitted_And_Before_Order_Submitted_Response);
				var_Reason_Codes = responseJson.getString("reasonCodes");
			END_CUSTOM_SCRIPT;
	}
}
