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

class fngetproductdialpad_copy2 {

	public static void fngetproductdialpad_copy2() {
		tg_String var_TGReturn = "";
		tg_String var_Fngetproductdialpad_Response = "";
				var_Fngetproductdialpad_Response = tg.readFromAPI("fngetproductdialpad.json").getString();
		START_CUSTOM_SCRIPT;
		JSONObject responseJson = new JSONObject(var_Fngetproductdialpad_Response);
		var_Product_Id = responseJson.getString("productId");
		var_Product_Name = responseJson.getString("shortDescription");
		var_Product_Version = responseJson.getString("productVersion");
		var_Recurring_Price = responseJson.getString("recurringPrice");
		var_One_Time_Price = responseJson.getString("oneTimePrice");
		var_Recurring_Frequency = responseJson.getString("recurringFrequency");
		var_Level = responseJson.getString("level");
		var_Rate_Plan_Name = responseJson.getString("ratePlanName");
		var_Rate_Plan_Id = responseJson.getString("ratePlanId");
		var_Name = responseJson.getString("name");
		var_Value = responseJson.getString("value");
		END_CUSTOM_SCRIPT;
	}
}