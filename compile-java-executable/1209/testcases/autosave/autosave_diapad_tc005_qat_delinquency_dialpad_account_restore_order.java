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
public class diapad_tc005_qat_delinquency_dialpad_account_restore_order {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void diapad_tc005_qat_delinquency_dialpad_account_restore_order() {
		tg.openBrowser();
		// [DISABLED] tg_String var_fnGetBANFromValidationAPIETPresponse = "";
		// [DISABLED] var_fnGetBANFromValidationAPIETPresponse = (String) tg.testFunction("fnGetBANFromValidationAPIETP", new Object[]{var_Regression_Ban_Api});
		// [DISABLED] tg_String var_fnGenerateOAuthAccessTokenV1response = "";
		// [DISABLED] var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1_copy", new Object[]{var_Regression_Get_Product});
		tg_String var_fnGetProductDialpadresponse = "";
		var_fnGetProductDialpadresponse = (String) tg.testFunction("fnGetProductDialpad", new Object[]{var_Regression_Get_Product, var_Product_Id});
		// [DISABLED] tg_String var_Created_By = "SDET_Automation";
		// [DISABLED] tg_String var_fnDialpadRequestResponseWithoutAutopayresponse = "";
		// [DISABLED] var_fnDialpadRequestResponseWithoutAutopayresponse = (String) tg.testFunction("fnDialpadRequestResponseWithoutAutopay", new Object[]{var_Regression_Get_Product, var_Created_By});
		// [DISABLED] tg.wait(15);
		tg_String var_fnDelinquencySuspensionresponse = "";
		var_fnDelinquencySuspensionresponse = (String) tg.testFunction("fnDelinquencySuspension", new Object[]{var_Regression_Get_Product, var_Customer_Details_Ban, var_Customer_Details_Ban});
		tg.wait(25);
		tg_String var_fnValidationStepDresponse = "";
		var_fnValidationStepDresponse = (String) tg.testFunction("fnValidationStepD", new Object[]{var_Customer_Details_Ban, var_Regression_Get_Product, var_Status_Code});
		tg.wait(10);
		tg_String var_fnDelinquencyRestoreresponse = "";
		var_fnDelinquencyRestoreresponse = (String) tg.testFunction("fnDelinquencyRestore", new Object[]{var_Regression_Get_Product, var_Customer_Details_Ban, var_Customer_Details_Ban});
		tg.wait(25);
		var_fnValidationStepDresponse = (String) tg.testFunction("fnValidationStepD", new Object[]{var_Customer_Details_Ban, var_Regression_Get_Product, var_Status_Code});
		tg.close();
	}
}