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
public class QAT_Create_MOP_BSS_Add_a_license_Order_with_Microsoft_partner_API_Testing extends tc_QAT_f305658e {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void QAT_Create_MOP_BSS_Add_a_license_Order_with_Microsoft_partner_API_Testing() {
		tg.openBrowser();
		tg_String var_fnGenerateOAuthAccessTokenV1response = "";
		var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1_copy2", new Object[]{var_Regression_Get_Product});
		tg_String var_fnGetAccountDetailsresponse = "";
		var_fnGetAccountDetailsresponse = (String) tg.testFunction("fnGetAccountDetails_copy", new Object[]{var_Regression_Get_Product, var_Account_Id, var_Effective_Date});
		tg_String var_Created_By = "SDET_Automation";
		tg_String var_fnBSSAALRequestResponseresponse = "";
		var_fnBSSAALRequestResponseresponse = (String) tg.testFunction("fnBSSAALRequestResponse_copy", new Object[]{var_Regression_Get_Product, var_Created_By});
	}
}
