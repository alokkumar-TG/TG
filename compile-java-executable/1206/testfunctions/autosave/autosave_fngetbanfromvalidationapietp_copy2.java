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

class fngetbanfromvalidationapietp_copy2 {

	public static Object fngetbanfromvalidationapietp_copy2(String var_Regression_Ban_Api) {
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