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
public class IOTPP_TC008_QAT_Package_Products_End_of_Term_Auto_Renew_Off_and_verify_Offer_is_Cancelled_through_ordering_flow extends tc_QAT_f305658e {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void IOTPP_TC008_QAT_Package_Products_End_of_Term_Auto_Renew_Off_and_verify_Offer_is_Cancelled_through_ordering_flow() {
		tg.openBrowser();
		tg_String var_fnGetBANFromValidationAPIETPresponse = "";
		var_fnGetBANFromValidationAPIETPresponse = (String) tg.testFunction("fnGetBANFromValidationAPIETP_copy", new Object[]{var_Regression_Ban_Api});
		tg_String var_fnGenerateOAuthAccessTokenV1response = "";
		var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1_copy2", new Object[]{var_Regression_Get_Product});
		tg_String var_fnGetProductIOTCCresponse = "";
		var_fnGetProductIOTCCresponse = (String) tg.testFunction("fnGetProductIOTCC_copy", new Object[]{var_Regression_Get_Product, var_Product_Id});
			tg_String var_Iotpp_Tc008_Qat_Package_Products_End_Of_Term_Auto_Renew_Off_And_Verify_Offer_Is_Cancelled_Through_Ordering_Flow_Response = "";
			var_Iotpp_Tc008_Qat_Package_Products_End_Of_Term_Auto_Renew_Off_And_Verify_Offer_Is_Cancelled_Through_Ordering_Flow_Response = tg.readFromAPI("iotpp_tc008_qat_package_products_end_of_term_auto_renew_off_and_verify_offer_is_cancelled_through_ordering_flow.json").getString();
			tg_String var_Order_Id = "";
			START_CUSTOM_SCRIPT;
				JSONObject responseJson = new JSONObject(var_Iotpp_Tc008_Qat_Package_Products_End_Of_Term_Auto_Renew_Off_And_Verify_Offer_Is_Cancelled_Through_Ordering_Flow_Response);
				var_Order_Id = responseJson.getString("orderId");
			END_CUSTOM_SCRIPT;
		// [DISABLED] tg.testFunction("fnKillApps_copy");
		tg_String var_fnLoginTMobileUSAStagingSignInresponse = "";
		var_fnLoginTMobileUSAStagingSignInresponse = (String) tg.testFunction("fnLoginTMobileUSAStagingSignIn_copy", new Object[]{var_Url, var_Regression_Username, var_Regression_Password});
		if (tg.performAssert("ele_SendMeTheCode_3a0caf1c", ComparisonType.IS_VISIBLE)) {
						tg.check.isVisible("ele_SendMeTheCode_3a0caf1c");
						tg.click("ele_SendMeTheCode_3a0caf1c", 1);
						tg.navigateToUrl("https://outlook.office365.com/owa/T-Mobile.com/");
						// [DISABLED] // Tosca: UseActiveTab | (ActionMode 37)
						if (tg.performAssert("ele_UseAnotherAccount_3a0caea3", ComparisonType.IS_VISIBLE)) {
											tg.check.isVisible("ele_UseAnotherAccount_3a0caea3");
											tg.check.isVisible("ele_UseAnotherAccount_3a0caea3");
											tg.check.isVisible("ele_UseAnotherAccount_3a0caea3");
											tg.click("ele_UseAnotherAccount_3a0caea3", 1);
											tg.check.isVisible("ele_SomeoneExampleCom_3a0caeb0");
											tg.click("ele_Next_3a0caeb0", 1);
											tg.click("ele_SomeoneExampleCom_3a0caeb0", 1);
											tg.type("ele_SomeoneExampleCom_3a0caeb0", "Pavan.kumar70@t-mobile.com");
						}
						// [DISABLED] tg.check.isVisible("ele_UseAnotherAccount_3a0caea3");
						// [DISABLED] tg.click("ele_UseAnotherAccount_3a0caea3", 1);
						// [DISABLED] tg.check.isVisible("ele_SomeoneExampleCom_3a0caeb0");
						// [DISABLED] tg.click("ele_Next_3a0caeb0", 1);
						// [DISABLED] tg.click("ele_SomeoneExampleCom_3a0caeb0", 1);
						// [DISABLED] tg.type("ele_SomeoneExampleCom_3a0caeb0", "Pavan.kumar70@t-mobile.com");
						tg.wait(15);
						tg.check.isVisible("ele_Search_3a0caeb4");
						tg.click("ele_Search_3a0caeb4", 1);
						tg.type("ele_Search_3a0caeb4", "Okta");
						tg.pressKey(ENTER, 1);
						tg.click("ele_OneTimeVerificationCode_3a0caf40", 1);
						tg.click("ele_MarkAsRead_3a0caf3c", 1);
						tg.click("ele_DIV_3a0caf0e", 1);
						tg.check.isVisible("ele_VerificationCode_3a0caf14");
						// [DISABLED] // Tosca: Verification code | OKTACODE | (ActionMode 165)
						tg.click("ele_VerificationCode_3a0caf4c", 1);
						tg.type("ele_VerificationCode_3a0caf4c", "OKTACODE");
						tg.click("ele_Verify_3a0caf4c", 1);
		}
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
		tg_String var_fnSIMFromPortalDBAndUpdateInSamsonDBQAT03APITestingresponse = "";
		var_fnSIMFromPortalDBAndUpdateInSamsonDBQAT03APITestingresponse = (String) tg.testFunction("fnSIMFromPortalDBAndUpdateInSamsonDBQAT03APITesting_copy", new Object[]{var_Regression_Samson_Db});
			tg_String var_fnSIMUploadQueryAPIresponse = "";
			var_fnSIMUploadQueryAPIresponse = (String) tg.testFunction("fnSIMUploadQueryAPI_copy", new Object[]{var_Regression_Sim_Inventory, var_Imsi, var_Iccid});
			tg_String var_Data = "SIMICCID#,Devicename,IMEI#
" + var_fnSIMUploadQueryAPIresponse + ",SKUIOT," + var_Imsi;
			tg_String var_fnIoTCreateSIMFileresponse = "";
			var_fnIoTCreateSIMFileresponse = (String) tg.testFunction("fnIoTCreateSIMFile_copy", new Object[]{var_Directory, var_Orderype, var_Data});
			tg_String var_File_Path = "C:\\TEMP\\PP_NA_IoTConnectivity_SIM.csv";
			tg_String var_fnIoTSIMUploadresponse = "";
			var_fnIoTSIMUploadresponse = (String) tg.testFunction("fnIoTSIMUpload_copy", new Object[]{var_File_Path, var_Addon, var_Addon});
			tg.wait(90);
		tg.testFunction("fnChangeTheSimStatusToUsedInPortalDB_copy");
		tg_String var_Status_Code = "OrderCompleted";
		tg_String var_Sub_Status_Code = "OrderCompleted";
		tg_String var_fnOrderQueryresponse = "";
		var_fnOrderQueryresponse = (String) tg.testFunction("fnOrderQuery_copy", new Object[]{var_Order_Id, var_Regression_Get_Product, var_Status_Code, var_Sub_Status_Code, var_Customer_Id, var_Customer_Details_Ban, var_Regression_Env, var_Bill_Pass_Addon, var_Billpassthrough, var_Billpassvalue, var_Offerstatus});
		tg.click("ele_ChevronLeft_3a023f28", 1);
		// [DISABLED] tg.testFunction("fnKillApps_copy");
			tg_String var_Iotpp_Tc008_Qat_Package_Products_End_Of_Term_Auto_Renew_Off_And_Verify_Offer_Is_Cancelled_Through_Ordering_Flow_2_Response = "";
			var_Iotpp_Tc008_Qat_Package_Products_End_Of_Term_Auto_Renew_Off_And_Verify_Offer_Is_Cancelled_Through_Ordering_Flow_2_Response = tg.readFromAPI("iotpp_tc008_qat_package_products_end_of_term_auto_renew_off_and_verify_offer_is_cancelled_through_ordering_flow_2.json").getString();
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
			tg_String var_Quantity = "";
			tg_String var_Modified_Date = "";
			tg_String var_Name = "";
			tg_String var_Value = "";
			tg_String var_Recurring_Price = "";
			tg_String var_One_Time_Price = "";
			tg_String var_Recurring_Frequency = "";
			tg_String var_Cost_Price = "";
			tg_String var_Id = "";
			START_CUSTOM_SCRIPT;
				JSONObject responseJson = new JSONObject(var_Iotpp_Tc008_Qat_Package_Products_End_Of_Term_Auto_Renew_Off_And_Verify_Offer_Is_Cancelled_Through_Ordering_Flow_2_Response);
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
			END_CUSTOM_SCRIPT;
			tg_String var_Iotpp_Tc008_Qat_Package_Products_End_Of_Term_Auto_Renew_Off_And_Verify_Offer_Is_Cancelled_Through_Ordering_Flow_3_Response = "";
			var_Iotpp_Tc008_Qat_Package_Products_End_Of_Term_Auto_Renew_Off_And_Verify_Offer_Is_Cancelled_Through_Ordering_Flow_3_Response = tg.readFromAPI("iotpp_tc008_qat_package_products_end_of_term_auto_renew_off_and_verify_offer_is_cancelled_through_ordering_flow_3.json").getString();
			tg_String var_Qat_Bss_End_Of_Term_Auto_Renew_Off_And_Verify_Offer_Is_Cancelled_Through_Ordering_Flow_3_Response = "";
			var_Qat_Bss_End_Of_Term_Auto_Renew_Off_And_Verify_Offer_Is_Cancelled_Through_Ordering_Flow_3_Response = tg.readFromAPI("qat_bss_end_of_term_auto_renew_off_and_verify_offer_is_cancelled_through_ordering_flow_3.json").getString();
		tg.wait(15);
		// [DISABLED] tg.testFunction("fnKillApps_copy");
		var_fnLoginTMobileUSAStagingSignInresponse = (String) tg.testFunction("fnLoginTMobileUSAStagingSignIn_copy", new Object[]{var_Url, var_Regression_Username, var_Regression_Password});
		if (tg.performAssert("ele_SendMeTheCode_3a0caf1c", ComparisonType.IS_VISIBLE)) {
						tg.check.isVisible("ele_SendMeTheCode_3a0caf1c");
						tg.click("ele_SendMeTheCode_3a0caf1c", 1);
						tg.navigateToUrl("https://outlook.office365.com/owa/T-Mobile.com/");
						// [DISABLED] // Tosca: UseActiveTab | (ActionMode 37)
						if (tg.performAssert("ele_UseAnotherAccount_3a0caea3", ComparisonType.IS_VISIBLE)) {
											tg.check.isVisible("ele_UseAnotherAccount_3a0caea3");
											tg.check.isVisible("ele_UseAnotherAccount_3a0caea3");
											tg.check.isVisible("ele_UseAnotherAccount_3a0caea3");
											tg.click("ele_UseAnotherAccount_3a0caea3", 1);
											tg.check.isVisible("ele_SomeoneExampleCom_3a0caeb0");
											tg.click("ele_Next_3a0caeb0", 1);
											tg.click("ele_SomeoneExampleCom_3a0caeb0", 1);
											tg.type("ele_SomeoneExampleCom_3a0caeb0", "Pavan.kumar70@t-mobile.com");
						}
						// [DISABLED] tg.check.isVisible("ele_UseAnotherAccount_3a0caea3");
						// [DISABLED] tg.click("ele_UseAnotherAccount_3a0caea3", 1);
						// [DISABLED] tg.check.isVisible("ele_SomeoneExampleCom_3a0caeb0");
						// [DISABLED] tg.click("ele_Next_3a0caeb0", 1);
						// [DISABLED] tg.click("ele_SomeoneExampleCom_3a0caeb0", 1);
						// [DISABLED] tg.type("ele_SomeoneExampleCom_3a0caeb0", "Pavan.kumar70@t-mobile.com");
						tg.wait(15);
						tg.check.isVisible("ele_Search_3a0caeb4");
						tg.click("ele_Search_3a0caeb4", 1);
						tg.type("ele_Search_3a0caeb4", "Okta");
						tg.pressKey(ENTER, 1);
						tg.click("ele_OneTimeVerificationCode_3a0caf40", 1);
						tg.click("ele_MarkAsRead_3a0caf3c", 1);
						tg.click("ele_DIV_3a0caf0e", 1);
						tg.check.isVisible("ele_VerificationCode_3a0caf14");
						// [DISABLED] // Tosca: Verification code | OKTACODE | (ActionMode 165)
						tg.click("ele_VerificationCode_3a0caf4c", 1);
						tg.type("ele_VerificationCode_3a0caf4c", "OKTACODE");
						tg.click("ele_Verify_3a0caf4c", 1);
		}
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
	}
}
