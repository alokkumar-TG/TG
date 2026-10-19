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
public class Diapad_TC006_QAT_Delinquency_Dialpad_Account_Resume_Order extends tc_QAT_f305658e {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void Diapad_TC006_QAT_Delinquency_Dialpad_Account_Resume_Order() {
		tg.openBrowser();
		// [DISABLED] tg_String var_fnGetBANFromValidationAPIETPresponse = "";
		// [DISABLED] var_fnGetBANFromValidationAPIETPresponse = (String) tg.testFunction("fnGetBANFromValidationAPIETP_copy", new Object[]{var_Regression_Ban_Api});
		// [DISABLED] tg_String var_fnGenerateOAuthAccessTokenV1response = "";
		// [DISABLED] var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1_copy2", new Object[]{var_Regression_Get_Product});
		tg_String var_fnGetProductDialpadresponse = "";
		var_fnGetProductDialpadresponse = (String) tg.testFunction("fnGetProductDialpad_copy", new Object[]{var_Regression_Get_Product, var_Product_Id});
		// [DISABLED] tg_String var_Created_By = "SDET_Automation";
		// [DISABLED] tg_String var_fnDialpadRequestResponseWithoutAutopayresponse = "";
		// [DISABLED] var_fnDialpadRequestResponseWithoutAutopayresponse = (String) tg.testFunction("fnDialpadRequestResponseWithoutAutopay_copy", new Object[]{var_Regression_Get_Product, var_Created_By});
		// [DISABLED] tg.wait(15);
		tg_String var_fnDelinquencyCancellationresponse = "";
		var_fnDelinquencyCancellationresponse = (String) tg.testFunction("fnDelinquencyCancellation_copy", new Object[]{var_Regression_Get_Product, var_Customer_Details_Ban, var_Customer_Details_Ban});
		tg.wait(25);
		tg_String var_fnValidationStepDresponse = "";
		var_fnValidationStepDresponse = (String) tg.testFunction("fnValidationStepD_copy", new Object[]{var_Customer_Details_Ban, var_Regression_Get_Product, var_Status_Code, var_Reason_Code, var_Status_Code_1, var_Reason_Code_1});
		tg.wait(10);
		tg_String var_fnDelinquencyResumedresponse = "";
		var_fnDelinquencyResumedresponse = (String) tg.testFunction("fnDelinquencyResumed_copy", new Object[]{var_Regression_Get_Product, var_Customer_Details_Ban, var_Customer_Details_Ban});
		tg.wait(25);
		var_fnValidationStepDresponse = (String) tg.testFunction("fnValidationStepD_copy", new Object[]{var_Customer_Details_Ban, var_Regression_Get_Product, var_Status_Code, var_Reason_Code, var_Status_Code_1, var_Reason_Code_1});
	}
}
