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


class fnorderstatushistoryvalidations_copy {

	public static Object fnorderstatushistoryvalidations(String var_Regression_Get_Product) {
		tg_String var_TGReturn = "";
			tg_String var_Fnorderstatushistoryvalidations_Response = "";
			var_Fnorderstatushistoryvalidations_Response = tg.readFromAPI("fnorderstatushistoryvalidations.json").getString();
		return var_TGReturn;
	}
}
