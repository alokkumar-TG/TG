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


class fngetbanfromvalidationapietp_copy {

	public static Object fngetbanfromvalidationapietp(String var_Regression_Ban_Api) {
		tg_String var_TGReturn = "";
			tg.check.isVisible("ele_StatusCode_3a076f88");
			// [DISABLED] // Tosca: id_token | AccessTocken | (ActionMode 165)
			tg_String var_Fngetbanfromvalidationapietp_Response = "";
			var_Fngetbanfromvalidationapietp_Response = tg.readFromAPI("fngetbanfromvalidationapietp.json").getString();
			tg.check.isVisible("ele_Item_3a078c7e");
			// [DISABLED] // Tosca: BAN | BAN | (ActionMode 165)
			// [DISABLED] // Tosca: TAX_ID | TAX_ID | (ActionMode 165)
		return var_TGReturn;
	}
}
