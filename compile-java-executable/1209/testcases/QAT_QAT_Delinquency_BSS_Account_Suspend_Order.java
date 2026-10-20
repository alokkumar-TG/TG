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
public class QAT_QAT_Delinquency_BSS_Account_Suspend_Order extends tc_QAT_f305658e {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void QAT_QAT_Delinquency_BSS_Account_Suspend_Order() {
		tg.openBrowser();
		tg_String var_fnGetBANFromValidationAPIETPresponse = "";
		var_fnGetBANFromValidationAPIETPresponse = (String) tg.testFunction("fnGetBANFromValidationAPIETP", new Object[]{var_Regression_Ban_Api});
		tg_String var_fnGenerateOAuthAccessTokenV1response = "";
		var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1_copy", new Object[]{var_Regression_Get_Product});
		tg_String var_fnGetProductresponse = "";
		var_fnGetProductresponse = (String) tg.testFunction("fnGetProduct", new Object[]{var_Regression_Get_Product, var_Product_Id});
		tg_String var_Created_By = "SDET_Automation";
		tg_String var_fnBSSNewActivationRequestAndResponseresponse = "";
		var_fnBSSNewActivationRequestAndResponseresponse = (String) tg.testFunction("fnBSSNewActivationRequestAndResponse", new Object[]{var_Regression_Get_Product, var_Created_By});
		tg.wait(10);
		// [DISABLED] tg.testFunction("fnKillApps_copy");
		// [DISABLED] tg_String var_fnLoginTMobileUSAStagingSignInresponse = "";
		// [DISABLED] var_fnLoginTMobileUSAStagingSignInresponse = (String) tg.testFunction("fnLoginTMobileUSAStagingSignIn", new Object[]{var_Url, var_Regression_Username, var_Regression_Password});
		// [DISABLED] tg_String var_fnSearchOpenCreatedOrderresponse = "";
		// [DISABLED] var_fnSearchOpenCreatedOrderresponse = (String) tg.testFunction("fnSearchOpenCreatedOrder", new Object[]{var_Search_Order, var_Status});
			// [DISABLED] tg.click("ele_UpdateOrder_39ff4780", 1);
			// [DISABLED] tg.wait(5);
			// [DISABLED] tg.swipe("ele_Activated_39ff4784", Direction.UP);
			// [DISABLED] tg.click("ele_Activated_39ff4784", 1);
			// [DISABLED] tg.click("ele_Submit_39ff4784", 1);
			tg_String var_fnQueryOrderFetchingDataresponse = "";
			var_fnQueryOrderFetchingDataresponse = (String) tg.testFunction("fnQueryOrderFetchingData", new Object[]{var_Regression_Get_Product});
			tg.wait(20);
			var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1_copy", new Object[]{var_Regression_Get_Product});
			tg_String var_Transaction_Type = "Add a Line";
			tg_String var_Action_Type_Code = "ACTIVATE";
			tg_String var_fnBSSUpdateresponse = "";
			var_fnBSSUpdateresponse = (String) tg.testFunction("fnBSSUpdate", new Object[]{var_Regression_Get_Product, var_Action_Type_Code, var_Transaction_Type});
			tg.wait(15);
			tg_String var_Status_Code = "OrderCompleted";
			tg_String var_Sub_Status_Code = "OrderCompleted";
			tg_String var_fnOrderQueryresponse = "";
			var_fnOrderQueryresponse = (String) tg.testFunction("fnOrderQuery", new Object[]{var_Order_Id, var_Regression_Get_Product, var_Status_Code, var_Sub_Status_Code, var_Customer_Id, var_Customer_Details_Ban, var_Regression_Env, var_Bill_Pass_Addon, var_Billpassthrough, var_Billpassvalue, var_Offerstatus});
			tg_String var_fnQueryOrderAPIresponse = "";
			var_fnQueryOrderAPIresponse = (String) tg.testFunction("fnQueryOrderAPI", new Object[]{var_Regression_Get_Product});
		// [DISABLED] tg.wait(20);
		// [DISABLED] tg.check.isVisible("ele_DoneOrderSuccessfullySubmittedForActivation_39ff4845");
		// [DISABLED] tg.testFunction("fnKillApps_copy");
		tg_String var_fnDelinquencySuspensionresponse = "";
		var_fnDelinquencySuspensionresponse = (String) tg.testFunction("fnDelinquencySuspension", new Object[]{var_Regression_Get_Product, var_Customer_Details_Ban, var_Customer_Details_Ban});
		tg_String var_fnLoginTMobileUSAStagingSignInresponse = "";
		var_fnLoginTMobileUSAStagingSignInresponse = (String) tg.testFunction("fnLoginTMobileUSAStagingSignIn", new Object[]{var_Url, var_Regression_Username, var_Regression_Password});
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
		var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1_copy", new Object[]{var_Regression_Get_Product});
		tg.wait(20);
		tg_String var_fnValidationStepresponse = "";
		var_fnValidationStepresponse = (String) tg.testFunction("fnValidationStep", new Object[]{var_Regression_Get_Product, var_Status_Code, var_Reason_Code, var_Status_Code_1, var_Reason_Code_1});
	}
}
