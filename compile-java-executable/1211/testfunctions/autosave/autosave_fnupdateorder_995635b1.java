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

class fnupdateorder_995635b1 {

	public static void fnupdateorder_995635b1() {
		tg_String var_TGReturn = "";
		tg.click("ele_UpdateOrder_39ff4780", 1);
		tg.wait(5);
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] if (/* Tosca: If */) {
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] tg.check.isVisible("ele_TextBox_39ff4784");
		// [DISABLED] tg.check.isVisible("ele_TextBox_39ff4784");
		tg.swipe("ele_Activated_39ff4784", Direction.UP);
		tg.click("ele_Activated_39ff4784", 1);
		tg.click("ele_Submit_39ff4784", 1);
	}
}