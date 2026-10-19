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
public class IOTCC_TC029_IOT_Connectivity_STP_NEW_Activation_Order_API_V2_ESIM_Ordering_IOTCC_TC029_IoT_CC_New_Activation_ESIM_qat03 extends tc_IOTCC_TC029_IOT_Connectivity_STP_NEW_Activation_Order_API_V2_ESIM_Ordering_088b27c8 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void IOTCC_TC029_IOT_Connectivity_STP_NEW_Activation_Order_API_V2_ESIM_Ordering_IOTCC_TC029_IoT_CC_New_Activation_ESIM_qat03() {
		tg.openBrowser();
					// [DISABLED] // Tosca: Path | taskkill | (ActionMode 37)
					// [DISABLED] // Tosca: Arguments | {NULL} | (ActionMode 517)
					tg.type("ele_Argument_3a170ab2", "/f");
					tg.type("ele_Argument_3a170ab2", "/im");
					tg.type("ele_Argument_3a170ab2", "iexplore.exe");
					tg.swipe("ele_WaitForExit_3a170ab2", Direction.UP);
					tg.type("ele_TimeoutForExit_3a170ab2", "30");
					// [DISABLED] // Tosca: Path | taskkill | (ActionMode 37)
					// [DISABLED] // Tosca: Arguments | {NULL} | (ActionMode 517)
					// [DISABLED] tg.type("ele_Argument_3a170ab2", "/f");
					// [DISABLED] tg.type("ele_Argument_3a170ab2", "/im");
					// [DISABLED] tg.type("ele_Argument_3a170ab2", "Chrome.exe");
					// [DISABLED] tg.swipe("ele_WaitForExit_3a170ab2", Direction.UP);
					// [DISABLED] tg.type("ele_TimeoutForExit_3a170ab2", "30");
					// [DISABLED] // Tosca: Path | taskkill | (ActionMode 37)
					// [DISABLED] // Tosca: Arguments | {NULL} | (ActionMode 517)
					tg.type("ele_Argument_3a170ab2", "/f");
					tg.type("ele_Argument_3a170ab2", "/im");
					tg.type("ele_Argument_3a170ab2", "AcroRd32.exe");
					tg.swipe("ele_WaitForExit_3a170ab2", Direction.UP);
					tg.type("ele_TimeoutForExit_3a170ab2", "30");
			tg.testFunction("fnGetEIDFromTDM");
			tg.wait(99);
			// [DISABLED] tg_String var_fnFetchTDMBANDELresponse = "";
			// [DISABLED] var_fnFetchTDMBANDELresponse = (String) tg.testFunction("fnFetchTDMBANDEL", new Object[]{var_Regression_Ban_Api});
				tg.testFunction("fn1CreateDirectoryPathDEL");
				tg.type("ele_Directory_3a170ab2", "{B[Directory]}\\{B[Folder Name]}");
				tg.type("ele_File_3a170ab2", "body.json");
				tg.type("ele_Text_3a170ab2", "{ \"\"category\"\": \"\"New Activation\"\", \"\"orderType\"\": \"\"SIM to be Purchased\"\", \"\"actionTypeCode\"\": \"\"checkout\"\", \"\"captureOrderDate\"\": \"\"2024-04-30T14:05:00Z\"\", \"\"processOrderDate\"\": \"\"2024-04-30T14:07:23Z\"\", \"\"productOrderItem\"\": [ { \"\"action\"\": \"\"add\"\", \"\"quantity\"\": 1, \"\"id\"\": \"\"5672d2e3-0559-492d-84ba-c2a7c9b447cb\"\", \"\"product\"\": { \"\"productSpecification\"\": { \"\"id\"\": \"\"8e3454e4-0771-47bc-95c1-3e139ba4b867\"\", \"\"href\"\": \"\"https://host:port/productCatalogManagement/v4/productSpecification/5b9753ba-38b9-4046-96f4-ef18e70a8a10\"\" }, \"\"productCharacteristic\"\": [ { \"\"@type\"\": \"\"StringCharacteristic\"\", \"\"name\"\": \"\"sku_product_id\"\", \"\"ProductId\"\": \"\"8905cbf0-093c-4cb9-a881-1f409e47df9a\"\" } ], \"\"realizingResource\"\": [ { \"\"@type\"\": \"\"DeviceResource\"\", \"\"eid\"\": \"\"89049032005006867796417567304583\"\" } ], \"\"@type\"\": \"\"ProductRefOrValue\"\" }, \"\"orderItemCharacteristic\"\": [ { \"\"@type\"\": \"\"StringCharacteristic\"\", \"\"name\"\": \"\"target_sim_status\"\", \"\"Status1\"\": \"\"Activation Ready\"\" } ], \"\"itemPrice\"\": [ { \"\"name\"\": \"\"due_monthly\"\", \"\"price\"\": { \"\"dutyFreeAmount\"\": { \"\"value\"\": 6 }, \"\"@type\"\": \"\"Price\"\" }, \"\"@type\"\": \"\"OrderPrice\"\" }, { \"\"name\"\": \"\"sku_unit_price\"\", \"\"price\"\": { \"\"dutyFreeAmount\"\": { \"\"value\"\": 0 }, \"\"@type\"\": \"\"Price\"\" }, \"\"@type\"\": \"\"OrderPrice\"\" } ], \"\"@type\"\": \"\"ProductOrderItem\"\" } ], \"\"billingAccount\"\": { \"\"@type\"\": \"\"OrderBillingAccount\"\", \"\"samsonBAN\"\": \"\"985421644\"\", \"\"taxPayerId\"\": \"\"111111111\"\", \"\"accountname\"\": \"\"atleastthi1mek001\"\" }, \"\"relatedParty\"\": [ { \"\"id\"\": \"\"0000002\"\", \"\"role\"\": \"\"primary_dealer\"\", \"\"@type\"\": \"\"Dealer\"\", \"\"email\"\": \"\"jd@tmobile.com\"\" } ], \"\"orderCharacteristic\"\": [ { \"\"name\"\": \"\"primary_contact\"\", \"\"value\"\": { \"\"familyName\"\": \"\"familyname\"\", \"\"givenName\"\": \"\"givenname\"\", \"\"fullName\"\": \"\"fullname\"\", \"\"title\"\": \"\"Decision Maker\"\", \"\"contactMedium\"\": [ { \"\"mediumType\"\": \"\"email\"\", \"\"characteristic\"\": { \"\"emailAddress\"\": \"\"gaddam.siddar21371@t-mobile.com\"\", \"\"contactType\"\": \"\"ADMIN\"\", \"\"@type\"\": \"\"MediumCharacteristic\"\" }, \"\"@type\"\": \"\"ContactMedium\"\" }, { \"\"mediumType\"\": \"\"phone\"\", \"\"characteristic\"\": { \"\"phoneNumber\"\": \"\"8885552321\"\", \"\"contactType\"\": \"\"MOBILE\"\", \"\"@type\"\": \"\"MediumCharacteristic\"\" }, \"\"@type\"\": \"\"ContactMedium\"\" } ], \"\"@type\"\": \"\"Individual\"\" }, \"\"@type\"\": \"\"EntityCharacteristic\"\" }, { \"\"name\"\": \"\"billing_contact\"\", \"\"value\"\": { \"\"familyName\"\": \"\"familyname\"\", \"\"givenName\"\": \"\"givenname\"\", \"\"fullName\"\": \"\"Fullname\"\", \"\"contactMedium\"\": [ { \"\"mediumType\"\": \"\"address\"\", \"\"characteristic\"\": { \"\"city\"\": \"\"BROOKLYN\"\", \"\"country\"\": \"\"US\"\", \"\"stateOrProvince\"\": \"\"NY\"\", \"\"postCode\"\": \"\"11201\"\", \"\"street1\"\": \"\"237 DUFFIELD ST APT 8D\"\", \"\"@type\"\": \"\"MediumCharacteristic\"\" }, \"\"@type\"\": \"\"ContactMedium\"\" }, { \"\"mediumType\"\": \"\"email\"\", \"\"characteristic\"\": { \"\"emailAddress\"\": \"\"gaddam.siddartha@t-mobile.com\"\", \"\"@type\"\": \"\"MediumCharacteristic\"\" }, \"\"@type\"\": \"\"ContactMedium\"\" }, { \"\"mediumType\"\": \"\"phone\"\", \"\"characteristic\"\": { \"\"phoneNumber\"\": \"\"8885552321\"\", \"\"contactType\"\": \"\"MOBILE\"\", \"\"@type\"\": \"\"MediumCharacteristic\"\" }, \"\"@type\"\": \"\"ContactMedium\"\" } ], \"\"@type\"\": \"\"MultiRoleIndividual\"\" }, \"\"@type\"\": \"\"EntityCharacteristic\"\" }, { \"\"name\"\": \"\"ppu\"\", \"\"value\"\": { \"\"mediumType\"\": \"\"address\"\", \"\"characteristic\"\": { \"\"city\"\": \"\"RICHMOND\"\", \"\"country\"\": \"\"US\"\", \"\"stateOrProvince\"\": \"\"VA\"\", \"\"postCode\"\": \"\"23220\"\", \"\"postCodeExtension\"\": \"\"7197\"\", \"\"street1\"\": \"\"1503 NEW YORK AVE\"\", \"\"@type\"\": \"\"MediumCharacteristic\"\" }, \"\"@type\"\": \"\"ContactMedium\"\" }, \"\"@type\"\": \"\"EntityCharacteristic\"\" }, { \"\"name\"\": \"\"shipping_contact\"\", \"\"value\"\": { \"\"familyName\"\": \"\"familyname\"\", \"\"givenName\"\": \"\"givenname\"\", \"\"fullName\"\": \"\"fullname\"\", \"\"contactMedium\"\": [ { \"\"mediumType\"\": \"\"address\"\", \"\"characteristic\"\": { \"\"city\"\": \"\"Beverly Hills\"\", \"\"country\"\": \"\"US\"\", \"\"stateOrProvince\"\": \"\"CA\"\", \"\"postCode\"\": \"\"90210\"\", \"\"postCodeExtension\"\": \"\"2011\"\", \"\"street1\"\": \"\"245 N. Beverly Dr\"\", \"\"@type\"\": \"\"MediumCharacteristic\"\" }, \"\"@type\"\": \"\"ContactMedium\"\" } ], \"\"@type\"\": \"\"MultiRoleIndividual\"\" }, \"\"@type\"\": \"\"EntityCharacteristic\"\" } ], \"\"language\"\": \"\"EN\"\", \"\"@type\"\": \"\"NonCoreWirelessProductOrder\"\" }");
				tg.type("ele_Encoding_3a170ab2", "UTF-8");
				tg.type("ele_Overwrite_3a170ab2", "True");
				tg_String var_Uri = "/et/v2/productOrder";
				tg_String var_Method = "POST";
				tg_String var_Body_Replace = "eid:" + var_Eid + ",samsonBAN:" + var_Tban_Spcl + ",accountname:" + var_Parent_Account_Name + ",ProductId:" + var_Product_Id + ",Status1:" + var_Status;
				tg_String var_Body_Replace_String = "accountname:name,ProductId:value,Status1:value";
				tg_String var_fn3PopTokenJSExecutorresponse = "";
				var_fn3PopTokenJSExecutorresponse = (String) tg.testFunction("fn3PopTokenJSExecutor", new Object[]{var_Uri, var_Method, var_Body_Replace, var_Body_Replace_String, var_Client_Id, var_Secret_Key, var_Private_Key});
				// [DISABLED] var_Body_Replace = "eid:" + var_Eid + ",samsonBAN:" + var_Tban_Spcl + ",accountname:" + var_Parent_Account_Name + ",ProductId:" + var_Product_Id + ",Status1:" + var_Status;
				// [DISABLED] var_Body_Replace_String = "accountname:name,ProductId:value,Status1:value";
				// [DISABLED] var_Uri = "/et/v2/productOrder";
				// [DISABLED] var_Method = "POST";
				// [DISABLED] tg_String var_fn3PopTokenJSExecutorDELresponse = "";
				// [DISABLED] var_fn3PopTokenJSExecutorDELresponse = (String) tg.testFunction("fn3PopTokenJSExecutorDEL", new Object[]{var_Uri, var_Method, var_Body_Replace, var_Body_Replace_String, var_Client_Id, var_Secret_Key, var_Private_Key});
				tg_String var_Iotcc_Tc029_Iot_Connectivity_Stp_New_Activation_Order_Api_V2_Esim_Ordering_Iotcc_Tc029_Iot_Cc_New_Activation_Esim_Qat_Response = "";
				var_Iotcc_Tc029_Iot_Connectivity_Stp_New_Activation_Order_Api_V2_Esim_Ordering_Iotcc_Tc029_Iot_Cc_New_Activation_Esim_Qat_Response = tg.readFromAPI("iotcc_tc029_iot_connectivity_stp_new_activation_order_api_v2_esim_ordering_iotcc_tc029_iot_cc_new_activation_esim_qat.json").getString();
				tg.type("ele_Name_3a18129a", "ParentAccountName");
				// [DISABLED] // Tosca: ProductId | {B[ProductId]} | (ActionMode 515)
				// [DISABLED] // Tosca: Status | {B[Status]} | (ActionMode 515)
				// [DISABLED] // Tosca: id | ESIM_ORDERID | (ActionMode 165)
				tg.check.isVisible("ele_StatusCode_3a18129b");
				tg.check.isVisible("ele_State_3a18157b");
				tg.testFunction("fn1CreateDirectoryPathDEL");
				tg.type("ele_Directory_3a170ab2", "{B[Directory]}\\{B[Folder Name]}");
				tg.type("ele_File_3a170ab2", "body.json");
				tg.type("ele_Text_3a170ab2", "{ \"\"category\"\": \"\"New Activation\"\", \"\"orderType\"\": \"\"SIM to be Purchased\"\", \"\"actionTypeCode\"\": \"\"submit\"\", \"\"orderid\"\": \"\"67ae2f3a651d5e3183091038\"\", \"\"captureOrderDate\"\": \"\"2024-04-30T14:05:00Z\"\", \"\"processOrderDate\"\": \"\"2024-04-30T14:07:23Z\"\", \"\"productOrderItem\"\": [ { \"\"action\"\": \"\"add\"\", \"\"quantity\"\": 1, \"\"id\"\": \"\"5672d2e3-0559-492d-84ba-c2a7c9b447cb\"\", \"\"product\"\": { \"\"productSpecification\"\": { \"\"id\"\": \"\"8e3454e4-0771-47bc-95c1-3e139ba4b867\"\", \"\"href\"\": \"\"https://host:port/productCatalogManagement/v4/productSpecification/5b9753ba-38b9-4046-96f4-ef18e70a8a10\"\" }, \"\"productCharacteristic\"\": [ { \"\"@type\"\": \"\"StringCharacteristic\"\", \"\"name\"\": \"\"sku_product_id\"\", \"\"ProductId\"\": \"\"8905cbf0-093c-4cb9-a881-1f409e47df9a\"\" } ], \"\"realizingResource\"\": [ { \"\"@type\"\": \"\"DeviceResource\"\", \"\"eid\"\": \"\"89049032005006867796417567304583\"\" } ], \"\"@type\"\": \"\"ProductRefOrValue\"\" }, \"\"orderItemCharacteristic\"\": [ { \"\"@type\"\": \"\"StringCharacteristic\"\", \"\"name\"\": \"\"target_sim_status\"\", \"\"Status1\"\": \"\"Activation Ready\"\" } ], \"\"itemPrice\"\": [ { \"\"name\"\": \"\"due_monthly\"\", \"\"price\"\": { \"\"dutyFreeAmount\"\": { \"\"value\"\": 6 }, \"\"@type\"\": \"\"Price\"\" }, \"\"@type\"\": \"\"OrderPrice\"\" }, { \"\"name\"\": \"\"sku_unit_price\"\", \"\"price\"\": { \"\"dutyFreeAmount\"\": { \"\"value\"\": 0 }, \"\"@type\"\": \"\"Price\"\" }, \"\"@type\"\": \"\"OrderPrice\"\" } ], \"\"@type\"\": \"\"ProductOrderItem\"\" } ], \"\"billingAccount\"\": { \"\"@type\"\": \"\"OrderBillingAccount\"\", \"\"samsonBAN\"\": \"\"985421644\"\", \"\"taxPayerId\"\": \"\"111111111\"\", \"\"accountname\"\": \"\"atleastthi1mek001\"\" }, \"\"relatedParty\"\": [ { \"\"id\"\": \"\"0000002\"\", \"\"role\"\": \"\"primary_dealer\"\", \"\"@type\"\": \"\"Dealer\"\", \"\"email\"\": \"\"jd@tmobile.com\"\" } ], \"\"orderCharacteristic\"\": [ { \"\"name\"\": \"\"primary_contact\"\", \"\"value\"\": { \"\"familyName\"\": \"\"familyname\"\", \"\"givenName\"\": \"\"givenname\"\", \"\"fullName\"\": \"\"fullname\"\", \"\"title\"\": \"\"Decision Maker\"\", \"\"contactMedium\"\": [ { \"\"mediumType\"\": \"\"email\"\", \"\"characteristic\"\": { \"\"emailAddress\"\": \"\"gaddam.siddar21371@t-mobile.com\"\", \"\"contactType\"\": \"\"ADMIN\"\", \"\"@type\"\": \"\"MediumCharacteristic\"\" }, \"\"@type\"\": \"\"ContactMedium\"\" }, { \"\"mediumType\"\": \"\"phone\"\", \"\"characteristic\"\": { \"\"phoneNumber\"\": \"\"8885552321\"\", \"\"contactType\"\": \"\"MOBILE\"\", \"\"@type\"\": \"\"MediumCharacteristic\"\" }, \"\"@type\"\": \"\"ContactMedium\"\" } ], \"\"@type\"\": \"\"Individual\"\" }, \"\"@type\"\": \"\"EntityCharacteristic\"\" }, { \"\"name\"\": \"\"billing_contact\"\", \"\"value\"\": { \"\"familyName\"\": \"\"familyname\"\", \"\"givenName\"\": \"\"givenname\"\", \"\"fullName\"\": \"\"Fullname\"\", \"\"contactMedium\"\": [ { \"\"mediumType\"\": \"\"address\"\", \"\"characteristic\"\": { \"\"city\"\": \"\"BROOKLYN\"\", \"\"country\"\": \"\"US\"\", \"\"stateOrProvince\"\": \"\"NY\"\", \"\"postCode\"\": \"\"11201\"\", \"\"street1\"\": \"\"237 DUFFIELD ST APT 8D\"\", \"\"@type\"\": \"\"MediumCharacteristic\"\" }, \"\"@type\"\": \"\"ContactMedium\"\" }, { \"\"mediumType\"\": \"\"email\"\", \"\"characteristic\"\": { \"\"emailAddress\"\": \"\"gaddam.siddartha@t-mobile.com\"\", \"\"@type\"\": \"\"MediumCharacteristic\"\" }, \"\"@type\"\": \"\"ContactMedium\"\" }, { \"\"mediumType\"\": \"\"phone\"\", \"\"characteristic\"\": { \"\"phoneNumber\"\": \"\"8885552321\"\", \"\"contactType\"\": \"\"MOBILE\"\", \"\"@type\"\": \"\"MediumCharacteristic\"\" }, \"\"@type\"\": \"\"ContactMedium\"\" } ], \"\"@type\"\": \"\"MultiRoleIndividual\"\" }, \"\"@type\"\": \"\"EntityCharacteristic\"\" }, { \"\"name\"\": \"\"ppu\"\", \"\"value\"\": { \"\"mediumType\"\": \"\"address\"\", \"\"characteristic\"\": { \"\"city\"\": \"\"RICHMOND\"\", \"\"country\"\": \"\"US\"\", \"\"stateOrProvince\"\": \"\"VA\"\", \"\"postCode\"\": \"\"23220\"\", \"\"postCodeExtension\"\": \"\"7197\"\", \"\"street1\"\": \"\"1503 NEW YORK AVE\"\", \"\"@type\"\": \"\"MediumCharacteristic\"\" }, \"\"@type\"\": \"\"ContactMedium\"\" }, \"\"@type\"\": \"\"EntityCharacteristic\"\" }, { \"\"name\"\": \"\"shipping_contact\"\", \"\"value\"\": { \"\"familyName\"\": \"\"familyname\"\", \"\"givenName\"\": \"\"givenname\"\", \"\"fullName\"\": \"\"fullname\"\", \"\"contactMedium\"\": [ { \"\"mediumType\"\": \"\"address\"\", \"\"characteristic\"\": { \"\"city\"\": \"\"Beverly Hills\"\", \"\"country\"\": \"\"US\"\", \"\"stateOrProvince\"\": \"\"CA\"\", \"\"postCode\"\": \"\"90210\"\", \"\"postCodeExtension\"\": \"\"2011\"\", \"\"street1\"\": \"\"245 N. Beverly Dr\"\", \"\"@type\"\": \"\"MediumCharacteristic\"\" }, \"\"@type\"\": \"\"ContactMedium\"\" } ], \"\"@type\"\": \"\"MultiRoleIndividual\"\" }, \"\"@type\"\": \"\"EntityCharacteristic\"\" } ], \"\"language\"\": \"\"EN\"\", \"\"@type\"\": \"\"NonCoreWirelessProductOrder\"\" }");
				tg.type("ele_Encoding_3a170ab2", "UTF-8");
				tg.type("ele_Overwrite_3a170ab2", "True");
				var_Uri = "/et/v2/productOrder";
				var_Method = "POST";
				var_Body_Replace = "eid:" + var_Eid + ",samsonBAN:" + var_Tban_Spcl + ",accountname:" + var_Parent_Account_Name + ",orderid:" + var_Esim_Orderid + "," + var_Product_Id + ",Status1:" + var_Status;
				var_Body_Replace_String = "accountname:name,orderid:id,ProductId:value,Status1:value";
				var_fn3PopTokenJSExecutorresponse = (String) tg.testFunction("fn3PopTokenJSExecutor", new Object[]{var_Uri, var_Method, var_Body_Replace, var_Body_Replace_String, var_Client_Id, var_Secret_Key, var_Private_Key});
				// [DISABLED] var_Body_Replace = "eid:" + var_Eid + ",samsonBAN:" + var_Tban_Spcl + ",accountname:" + var_Parent_Account_Name + ",orderid:" + var_Esim_Orderid + "," + var_Product_Id + ",Status1:" + var_Status;
				// [DISABLED] var_Body_Replace_String = "accountname:name,orderid:id,ProductId:value,Status1:value";
				// [DISABLED] var_Uri = "/et/v2/productOrder";
				// [DISABLED] var_Method = "POST";
				// [DISABLED] tg_String var_fn3PopTokenJSExecutorDELresponse = "";
				// [DISABLED] var_fn3PopTokenJSExecutorDELresponse = (String) tg.testFunction("fn3PopTokenJSExecutorDEL", new Object[]{var_Uri, var_Method, var_Body_Replace, var_Body_Replace_String, var_Client_Id, var_Secret_Key, var_Private_Key});
				tg_String var_Iotcc_Tc029_Iot_Connectivity_Stp_New_Activation_Order_Api_V2_Esim_Ordering_Iotcc_Tc029_Iot_Cc_New_Activation_Esim_Qat_2_Response = "";
				var_Iotcc_Tc029_Iot_Connectivity_Stp_New_Activation_Order_Api_V2_Esim_Ordering_Iotcc_Tc029_Iot_Cc_New_Activation_Esim_Qat_2_Response = tg.readFromAPI("iotcc_tc029_iot_connectivity_stp_new_activation_order_api_v2_esim_ordering_iotcc_tc029_iot_cc_new_activation_esim_qat_2.json").getString();
	}
}
