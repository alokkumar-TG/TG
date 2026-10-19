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
public class QAT_Create_MOP_BSS_Add_New_Activation_Order_with_Microsoft_partner_with_domain_id_API_Testing extends tc_QAT_f305658e {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void QAT_Create_MOP_BSS_Add_New_Activation_Order_with_Microsoft_partner_with_domain_id_API_Testing() {
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
		tg.wait(20);
		tg_String var_fnQueryOrderFetchingDataresponse = "";
		var_fnQueryOrderFetchingDataresponse = (String) tg.testFunction("fnQueryOrderFetchingData", new Object[]{var_Regression_Get_Product});
		var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1_copy", new Object[]{var_Regression_Get_Product});
		tg_String var_Transaction_Type = "New Activation";
		tg_String var_Action_Type_Code = "ACTIVATE";
		tg_String var_fnBSSUpdateresponse = "";
		var_fnBSSUpdateresponse = (String) tg.testFunction("fnBSSUpdate", new Object[]{var_Regression_Get_Product, var_Action_Type_Code, var_Transaction_Type});
		tg.wait(15);
		tg_String var_Status_Code = "OrderCompleted";
		tg_String var_Sub_Status_Code = "OrderCompleted";
		tg_String var_Customer_Id = "AccountId";
		tg_String var_fnOrderQueryresponse = "";
		var_fnOrderQueryresponse = (String) tg.testFunction("fnOrderQuery", new Object[]{var_Order_Id, var_Regression_Get_Product, var_Status_Code, var_Sub_Status_Code, var_Customer_Id, var_Customer_Details_Ban, var_Regression_Env, var_Bill_Pass_Addon, var_Billpassthrough, var_Billpassvalue, var_Offerstatus});
		tg_String var_fnQueryOrderAPIresponse = "";
		var_fnQueryOrderAPIresponse = (String) tg.testFunction("fnQueryOrderAPI", new Object[]{var_Regression_Get_Product});
	}
}
