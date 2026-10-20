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
public class IOTPP_TC012_QAT_Delinquency_Package_Products_Account_Resume_Order extends tc_QAT_f305658e {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void IOTPP_TC012_QAT_Delinquency_Package_Products_Account_Resume_Order() {
		tg.openBrowser();
		// [DISABLED] tg_String var_fnGetBANFromValidationAPIETPresponse = "";
		// [DISABLED] var_fnGetBANFromValidationAPIETPresponse = (String) tg.testFunction("fnGetBANFromValidationAPIETP", new Object[]{var_Regression_Ban_Api});
		tg_String var_fnGenerateOAuthAccessTokenV1response = "";
		var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1_copy", new Object[]{var_Regression_Get_Product});
		// [DISABLED] tg_String var_fnGetProductIOTCCresponse = "";
		// [DISABLED] var_fnGetProductIOTCCresponse = (String) tg.testFunction("fnGetProductIOTCC", new Object[]{var_Regression_Get_Product, var_Product_Id});
			// [DISABLED] tg_String var_Iotpp_Tc011_Qat_Delinquency_Package_Products_Account_Cancel_Order_With_Agreemnt_Mothly_Product_Response = "";
			// [DISABLED] var_Iotpp_Tc011_Qat_Delinquency_Package_Products_Account_Cancel_Order_With_Agreemnt_Mothly_Product_Response = tg.readFromAPI("iotpp_tc011_qat_delinquency_package_products_account_cancel_order_with_agreemnt_mothly_product.json").getString();
			// [DISABLED] tg_String var_Order_Id = "";
			// [DISABLED] START_CUSTOM_SCRIPT;
			// [DISABLED] 	JSONObject responseJson = new JSONObject(var_Iotpp_Tc011_Qat_Delinquency_Package_Products_Account_Cancel_Order_With_Agreemnt_Mothly_Product_Response);
			// [DISABLED] 	var_Order_Id = responseJson.getString("orderId");
			// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] tg.testFunction("fnKillApps_copy");
		// [DISABLED] tg_String var_fnLoginTMobileUSAStagingSignInresponse = "";
		// [DISABLED] var_fnLoginTMobileUSAStagingSignInresponse = (String) tg.testFunction("fnLoginTMobileUSAStagingSignIn", new Object[]{var_Url, var_Regression_Username, var_Regression_Password});
		// [DISABLED] if (/* Tosca: Email Authentication */) {
			// [DISABLED] tg.check.isVisible("ele_SendMeTheCode_3a0caf1c");
			// [DISABLED] tg.click("ele_SendMeTheCode_3a0caf1c", 1);
			// [DISABLED] tg.navigateToUrl("https://outlook.office365.com/owa/T-Mobile.com/");
			// [DISABLED] // Tosca: UseActiveTab | (ActionMode 37)
			// [DISABLED] if (/* Tosca: If */) {
				// [DISABLED] tg.check.isVisible("ele_UseAnotherAccount_3a0caea3");
				// [DISABLED] tg.check.isVisible("ele_UseAnotherAccount_3a0caea3");
				// [DISABLED] tg.check.isVisible("ele_UseAnotherAccount_3a0caea3");
				// [DISABLED] tg.click("ele_UseAnotherAccount_3a0caea3", 1);
				// [DISABLED] tg.check.isVisible("ele_SomeoneExampleCom_3a0caeb0");
				// [DISABLED] tg.click("ele_Next_3a0caeb0", 1);
				// [DISABLED] tg.click("ele_SomeoneExampleCom_3a0caeb0", 1);
				// [DISABLED] tg.type("ele_SomeoneExampleCom_3a0caeb0", "Pavan.kumar70@t-mobile.com");
			// [DISABLED] }
			// [DISABLED] tg.check.isVisible("ele_UseAnotherAccount_3a0caea3");
			// [DISABLED] tg.click("ele_UseAnotherAccount_3a0caea3", 1);
			// [DISABLED] tg.check.isVisible("ele_SomeoneExampleCom_3a0caeb0");
			// [DISABLED] tg.click("ele_Next_3a0caeb0", 1);
			// [DISABLED] tg.click("ele_SomeoneExampleCom_3a0caeb0", 1);
			// [DISABLED] tg.type("ele_SomeoneExampleCom_3a0caeb0", "Pavan.kumar70@t-mobile.com");
			// [DISABLED] tg.wait(15);
			// [DISABLED] tg.check.isVisible("ele_Search_3a0caeb4");
			// [DISABLED] tg.click("ele_Search_3a0caeb4", 1);
			// [DISABLED] tg.type("ele_Search_3a0caeb4", "Okta");
			// [DISABLED] tg.pressKey(ENTER, 1);
			// [DISABLED] tg.click("ele_OneTimeVerificationCode_3a0caf40", 1);
			// [DISABLED] tg.click("ele_MarkAsRead_3a0caf3c", 1);
			// [DISABLED] tg.click("ele_DIV_3a0caf0e", 1);
			// [DISABLED] tg.check.isVisible("ele_VerificationCode_3a0caf14");
			// [DISABLED] // Tosca: Verification code | OKTACODE | (ActionMode 165)
			// [DISABLED] tg.click("ele_VerificationCode_3a0caf4c", 1);
			// [DISABLED] tg.type("ele_VerificationCode_3a0caf4c", "OKTACODE");
			// [DISABLED] tg.click("ele_Verify_3a0caf4c", 1);
		// [DISABLED] }
			// [DISABLED] tg.click("ele_OrderID_39ff3dc7", 1);
			// [DISABLED] tg.pressKey(ARROWDOWN, 1);
			// [DISABLED] tg.pressKey(ARROWDOWN, 1);
			// [DISABLED] tg.pressKey(ENTER, 1);
			// [DISABLED] tg.performDoubleClick("ele_SearchOrder_39ff3dcd");
			// [DISABLED] tg.type("ele_SearchOrder_39ff3dcd", "BAN");
			// [DISABLED] tg.pressKey(ENTER, 1);
			// [DISABLED] tg.wait(5);
			// [DISABLED] tg.swipe("ele_TABLE_39ff3dd7", Direction.UP);
			// [DISABLED] // Tosca: <Row> | {NULL} | (ActionMode 517)
			// [DISABLED] // Tosca: <Cell> | Account ID | (ActionMode 165)
			// [DISABLED] // Tosca: <Cell> | {Click} | (ActionMode 37)
			// [DISABLED] tg.wait(15);
		// [DISABLED] tg_String var_fnSIMFromPortalDBAndUpdateInSamsonDBQAT03APITestingresponse = "";
		// [DISABLED] var_fnSIMFromPortalDBAndUpdateInSamsonDBQAT03APITestingresponse = (String) tg.testFunction("fnSIMFromPortalDBAndUpdateInSamsonDBQAT03APITesting", new Object[]{var_Regression_Samson_Db});
			// [DISABLED] tg_String var_fnSIMUploadQueryAPIresponse = "";
			// [DISABLED] var_fnSIMUploadQueryAPIresponse = (String) tg.testFunction("fnSIMUploadQueryAPI", new Object[]{var_Regression_Sim_Inventory, var_Imsi, var_Iccid});
			// [DISABLED] tg_String var_Data = "SIMICCID#,Devicename,IMEI#
" + var_fnSIMUploadQueryAPIresponse + ",SKUIOT," + var_Imsi;
			// [DISABLED] tg_String var_fnIoTCreateSIMFileresponse = "";
			// [DISABLED] var_fnIoTCreateSIMFileresponse = (String) tg.testFunction("fnIoTCreateSIMFile", new Object[]{var_Directory, var_Orderype, var_Data});
			// [DISABLED] tg_String var_File_Path = "C:\\TEMP\\PP_NA_IoTConnectivity_SIM.csv";
			// [DISABLED] tg_String var_fnIoTSIMUploadresponse = "";
			// [DISABLED] var_fnIoTSIMUploadresponse = (String) tg.testFunction("fnIoTSIMUpload", new Object[]{var_File_Path, var_Addon, var_Addon});
			// [DISABLED] tg.wait(90);
		// [DISABLED] tg.testFunction("fnChangeTheSimStatusToUsedInPortalDB");
		// [DISABLED] tg_String var_Status_Code = "OrderCompleted";
		// [DISABLED] tg_String var_Sub_Status_Code = "OrderCompleted";
		// [DISABLED] tg_String var_fnOrderQueryresponse = "";
		// [DISABLED] var_fnOrderQueryresponse = (String) tg.testFunction("fnOrderQuery", new Object[]{var_Order_Id, var_Regression_Get_Product, var_Status_Code, var_Sub_Status_Code, var_Customer_Id, var_Customer_Details_Ban, var_Regression_Env, var_Bill_Pass_Addon, var_Billpassthrough, var_Billpassvalue, var_Offerstatus});
		// [DISABLED] tg.click("ele_ChevronLeft_3a023f28", 1);
		// [DISABLED] tg.testFunction("fnKillApps_copy");
		// [DISABLED] tg_String var_fnDelinquencyCancellationresponse = "";
		// [DISABLED] var_fnDelinquencyCancellationresponse = (String) tg.testFunction("fnDelinquencyCancellation", new Object[]{var_Regression_Get_Product, var_Customer_Details_Ban, var_Customer_Details_Ban});
		// [DISABLED] tg.wait(15);
		// [DISABLED] tg_String var_fnValidationStepDresponse = "";
		// [DISABLED] var_fnValidationStepDresponse = (String) tg.testFunction("fnValidationStepD", new Object[]{var_Customer_Details_Ban, var_Regression_Get_Product, var_Status_Code, var_Reason_Code, var_Status_Code_1, var_Reason_Code_1});
		// [DISABLED] tg.wait(10);
		tg_String var_fnDelinquencyResumedresponse = "";
		var_fnDelinquencyResumedresponse = (String) tg.testFunction("fnDelinquencyResumed", new Object[]{var_Regression_Get_Product, var_Customer_Details_Ban, var_Customer_Details_Ban});
		tg.wait(10);
		tg_String var_fnValidationStepDresponse = "";
		var_fnValidationStepDresponse = (String) tg.testFunction("fnValidationStepD", new Object[]{var_Customer_Details_Ban, var_Regression_Get_Product, var_Status_Code, var_Reason_Code, var_Status_Code_1, var_Reason_Code_1});
	}
}
