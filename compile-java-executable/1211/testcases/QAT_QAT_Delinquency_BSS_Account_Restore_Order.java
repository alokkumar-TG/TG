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
public class QAT_QAT_Delinquency_BSS_Account_Restore_Order extends tc_QAT_f305658e {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void QAT_QAT_Delinquency_BSS_Account_Restore_Order() {
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
		tg.wait(10);
		// [DISABLED] tg.testFunction("fnKillApps_copy");
		tg_String var_fnLoginTMobileUSAStagingSignInresponse = "";
		var_fnLoginTMobileUSAStagingSignInresponse = (String) tg.testFunction("fnLoginTMobileUSAStagingSignIn_copy2", new Object[]{var_Url, var_Regression_Username, var_Regression_Password});
		tg_String var_fnSearchOpenCreatedOrderresponse = "";
		var_fnSearchOpenCreatedOrderresponse = (String) tg.testFunction("fnSearchOpenCreatedOrder_copy2", new Object[]{var_Search_Order, var_Status});
			tg.click("ele_UpdateOrder_39ff4780", 1);
			tg.wait(5);
			// [DISABLED] if (/* Tosca: If */) {
				// [DISABLED] tg.check.isVisible("ele_TextBox_39ff4784");
				// [DISABLED] tg.check.isVisible("ele_TextBox_39ff4784");
			// [DISABLED] }
			tg.swipe("ele_Activated_39ff4784", Direction.UP);
			tg.click("ele_Activated_39ff4784", 1);
			tg.click("ele_Submit_39ff4784", 1);
		tg.wait(20);
		tg.check.isVisible("ele_DoneOrderSuccessfullySubmittedForActivation_39ff4845");
		// [DISABLED] tg.testFunction("fnKillApps_copy");
		tg_String var_fnDelinquencySuspensionresponse = "";
		var_fnDelinquencySuspensionresponse = (String) tg.testFunction("fnDelinquencySuspension_copy2", new Object[]{var_Regression_Get_Product, var_Customer_Details_Ban, var_Customer_Details_Ban});
		var_fnLoginTMobileUSAStagingSignInresponse = (String) tg.testFunction("fnLoginTMobileUSAStagingSignIn_copy2", new Object[]{var_Url, var_Regression_Username, var_Regression_Password});
			tg.click("ele_OrderID_39ff3dc7", 1);
			tg.pressKey(ARROWDOWN, 1);
			tg.pressKey(ARROWDOWN, 1);
			tg.pressKey(ENTER, 1);
			tg.performDoubleClick("ele_SearchOrder_39ff3dcd");
			tg.type("ele_SearchOrder_39ff3dcd", "BAN");
			tg.pressKey(ENTER, 1);
			tg.wait(5);
			tg.swipe("ele_TABLE_39ff3dd7", Direction.UP);
			// [DISABLED] // Tosca: <Row> | {NULL} | (ActionMode 517)
			// [DISABLED] // Tosca: <Cell> | Account ID | (ActionMode 165)
			// [DISABLED] // Tosca: <Cell> | {Click} | (ActionMode 37)
			tg.wait(15);
		// [DISABLED] tg.testFunction("fnUpdateOrder_copy");
		tg.wait(20);
		tg.check.isVisible("ele_DoneOrderSuccessfullySubmittedForCancellation_3a0a8827");
		tg.wait(10);
		// [DISABLED] tg.testFunction("fnKillApps_copy");
		var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1_copy3", new Object[]{var_Regression_Get_Product});
		tg.wait(20);
		tg_String var_fnValidationStepresponse = "";
		var_fnValidationStepresponse = (String) tg.testFunction("fnValidationStep_copy2", new Object[]{var_Regression_Get_Product, var_Status_Code, var_Reason_Code, var_Status_Code_1, var_Reason_Code_1});
		tg.wait(10);
		tg_String var_fnDelinquencyRestoreresponse = "";
		var_fnDelinquencyRestoreresponse = (String) tg.testFunction("fnDelinquencyRestore_copy2", new Object[]{var_Regression_Get_Product, var_Customer_Details_Ban, var_Customer_Details_Ban});
		tg.wait(25);
		var_fnLoginTMobileUSAStagingSignInresponse = (String) tg.testFunction("fnLoginTMobileUSAStagingSignIn_copy2", new Object[]{var_Url, var_Regression_Username, var_Regression_Password});
			tg.click("ele_OrderID_39ff3dc7", 1);
			tg.pressKey(ARROWDOWN, 1);
			tg.pressKey(ARROWDOWN, 1);
			tg.pressKey(ENTER, 1);
			tg.performDoubleClick("ele_SearchOrder_39ff3dcd");
			tg.type("ele_SearchOrder_39ff3dcd", "BAN");
			tg.pressKey(ENTER, 1);
			tg.wait(5);
			tg.swipe("ele_TABLE_39ff3dd7", Direction.UP);
			// [DISABLED] // Tosca: <Row> | {NULL} | (ActionMode 517)
			// [DISABLED] // Tosca: <Cell> | Account ID | (ActionMode 165)
			// [DISABLED] // Tosca: <Cell> | {Click} | (ActionMode 37)
			tg.wait(15);
		// [DISABLED] tg.testFunction("fnUpdateOrder_copy");
		tg.wait(20);
		tg.check.isVisible("ele_DoneOrderSuccessfullySubmittedForCancellation_3a0a8827");
		tg.wait(10);
		// [DISABLED] tg.testFunction("fnKillApps_copy");
		var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1_copy3", new Object[]{var_Regression_Get_Product});
		var_fnValidationStepresponse = (String) tg.testFunction("fnValidationStep_copy2", new Object[]{var_Regression_Get_Product, var_Status_Code, var_Reason_Code, var_Status_Code_1, var_Reason_Code_1});
	}
}
