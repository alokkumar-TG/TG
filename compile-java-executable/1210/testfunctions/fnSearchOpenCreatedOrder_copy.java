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


class fnsearchopencreatedorder_copy {

	public static Object fnsearchopencreatedorder(String var_Search_Order, String var_Status) {
		tg_String var_TGReturn = "";
		tg.type("ele_CreatedByNTID_3a1e4930", "Order ID");
		tg.performDoubleClick("ele_SearchOrder_39ff3dcd");
		tg.type("ele_SearchOrder_39ff3dcd", "Search Order");
		tg.pressKey(ENTER, 1);
		tg.wait(5);
		// [DISABLED] // Tosca: <Row> | {NULL} | (ActionMode 517)
		// [DISABLED] // Tosca: <Cell> | accountId | (ActionMode 165)
		// [DISABLED] // Tosca: <Cell> | {PL[Status]} | (ActionMode 69)
		// [DISABLED] // Tosca: <Cell> | {Click} | (ActionMode 37)
		tg.click("ele_6152d71312b0163624ec4ef4_39ff3de0", 1);
		tg.wait(20);
		// [DISABLED] // Tosca: <Row> | {NULL} | (ActionMode 517)
		// [DISABLED] // Tosca: <Cell> | {Click} | (ActionMode 37)
		return var_TGReturn;
	}
}
