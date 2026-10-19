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


class fnchangethesimstatustousedinportaldb_copy {

	public static Object fnchangethesimstatustousedinportaldb() {
		tg_String var_TGReturn = "";
			// [DB] Configure var_Portal_Db_Url, var_Portal_Db_User, var_Portal_Db_Password in TestGrid globals (Tosca encrypted connection ref)
			// Tosca DB: PORTAL DB | UPDATE | Driver=MSSQL
			tg_int var_Portal_Db_Rows_1 = 0;
			START_CUSTOM_SCRIPT;
				Connection PORTALDBConn_1 = null;
				Statement PORTALDBStmt_1 = null;
				try {
					PORTALDBConn_1 = DriverManager.getConnection(var_Portal_Db_Url, var_Portal_Db_User, var_Portal_Db_Password);
					System.out.println("Connected to database: PORTAL DB");
					PORTALDBStmt_1 = PORTALDBConn_1.createStatement();
					var_Portal_Db_Rows_1 = PORTALDBStmt_1.executeUpdate("update Reserve_SIM_Tracker set Status='USED' where ICCID='" + var_Iccid + "';");
					if (var_Portal_Db_Rows_1 != 1) {
						System.err.println("Expected 1 row(s), got " + var_Portal_Db_Rows_1);
					}
				} catch (SQLException e) {
					System.err.println("Database operation failed: " + e.getMessage());
					e.printStackTrace();
				} finally {
					if (PORTALDBStmt_1 != null) try { PORTALDBStmt_1.close(); } catch (SQLException e) { /* ignore */ }
					if (PORTALDBConn_1 != null) try { PORTALDBConn_1.close(); } catch (SQLException e) { /* ignore */ }
				}
			END_CUSTOM_SCRIPT;
			// [DISABLED] // Tosca: Connection name | PORTAL DB | (ActionMode 37)
			tg.wait(99);
		return var_TGReturn;
	}
}
