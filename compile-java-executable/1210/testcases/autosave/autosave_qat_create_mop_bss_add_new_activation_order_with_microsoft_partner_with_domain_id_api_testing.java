import java.sql.Connection;;
import java.sql.DriverManager;;
import java.sql.ResultSet;;
import java.sql.SQLException;;
import java.sql.Statement;;
import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.*;
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class qat_create_mop_bss_add_new_activation_order_with_microsoft_partner_with_domain_id_api_testing {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void qat_create_mop_bss_add_new_activation_order_with_microsoft_partner_with_domain_id_api_testing() {
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
		tg_String var_fnQueryOrderFetchingDataresponse = "";
		var_fnQueryOrderFetchingDataresponse = (String) tg.testFunction("fnQueryOrderFetchingData_copy", new Object[]{var_Regression_Get_Product});
		var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1_copy2", new Object[]{var_Regression_Get_Product});
		tg_String var_Transaction_Type = "New Activation";
		tg_String var_Action_Type_Code = "ACTIVATE";
		tg_String var_fnBSSUpdateresponse = "";
		var_fnBSSUpdateresponse = (String) tg.testFunction("fnBSSUpdate_copy", new Object[]{var_Regression_Get_Product, var_Action_Type_Code, var_Transaction_Type});
		tg.wait(15);
		tg_String var_Status_Code = "OrderCompleted";
		tg_String var_Sub_Status_Code = "OrderCompleted";
		tg_String var_Customer_Id = "AccountId";
		tg_String var_fnOrderQueryresponse = "";
		var_fnOrderQueryresponse = (String) tg.testFunction("fnOrderQuery_copy", new Object[]{var_Order_Id, var_Regression_Get_Product, var_Status_Code});
		tg_String var_fnQueryOrderAPIresponse = "";
		var_fnQueryOrderAPIresponse = (String) tg.testFunction("fnQueryOrderAPI_copy", new Object[]{var_Regression_Get_Product});
		tg.close();
	}
}