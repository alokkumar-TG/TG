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


class fniotcreatesimfile {

	public static Object fniotcreatesimfile(String var_Directory, String var_Orderype, String var_Data) {
		tg_String var_TGReturn = "";
		tg.type("ele_Directory_39f68e81", var_Directory);
		tg.type("ele_File_39f68e81", var_Orderype);
		tg.type("ele_Text_39f68e81", var_Data);
		tg.type("ele_Overwrite_39f68e81", "True");
		return var_TGReturn;
	}
}
