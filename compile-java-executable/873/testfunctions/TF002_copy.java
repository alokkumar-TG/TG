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
import io.testgrid.enums.Alert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.Test;

class tf002_copy {

	public static Object tf002(String abc1, String abc2, String abc3) {
		tg_String var_TGReturn = "";
		START_CUSTOM_SCRIPT;
		var_TGReturn = abc1+abc2+abc3 ;
		END_CUSTOM_SCRIPT;
		tg.printLogs(var_TGReturn);
		tg.wait(2);
		return var_TGReturn;
	}
}