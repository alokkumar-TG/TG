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

class fngenerateoauthaccesstokenv1_copy3 {

	public static Object fngenerateoauthaccesstokenv1_copy3(String var_Regression_Get_Product) {
		tg_String var_TGReturn = "";
		tg_String var_Fngenerateoauthaccesstokenv1_Response = "";
				var_Fngenerateoauthaccesstokenv1_Response = tg.readFromAPI("fngenerateoauthaccesstokenv1.json").getString();
		START_CUSTOM_SCRIPT;
		JSONObject responseJson = new JSONObject(var_Fngenerateoauthaccesstokenv1_Response);
		var_Access_Tocken = responseJson.getString("access_token");
		END_CUSTOM_SCRIPT;
		return var_TGReturn;
	}
}