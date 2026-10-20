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


class fnsimfromportaldbandupdateinsamsondbqat03apitesting {

	public static Object fnsimfromportaldbandupdateinsamsondbqat03apitesting(String var_Regression_Samson_Db) {
		tg_String var_TGReturn = "";
			// [DB] Configure var_Portal_Db_Url, var_Portal_Db_User, var_Portal_Db_Password in TestGrid globals (Tosca encrypted connection ref)
			// Tosca DB: PORTAL DB | SELECT | Driver=MSSQL
			tg_String var_Imsi = "";
			tg_String var_Iccid = "";
			tg_String var_Ntid = "";
			START_CUSTOM_SCRIPT;
				Connection PORTALDBConn_2 = null;
				Statement PORTALDBStmt_2 = null;
				ResultSet PORTALDBRs_2 = null;
				try {
					PORTALDBConn_2 = DriverManager.getConnection(var_Portal_Db_Url, var_Portal_Db_User, var_Portal_Db_Password);
					System.out.println("Connected to database: PORTAL DB");
					PORTALDBStmt_2 = PORTALDBConn_2.createStatement();
					PORTALDBRs_2 = PORTALDBStmt_2.executeQuery("Select * from Reserve_SIM_Tracker where Status is NULL;");
					if (PORTALDBRs_2.next()) {
						var_Imsi = PORTALDBRs_2.getString("IMSI");
						var_Iccid = PORTALDBRs_2.getString("ICCID");
						var_Ntid = PORTALDBRs_2.getString("NTID");
					}
				} catch (SQLException e) {
					System.err.println("Database operation failed: " + e.getMessage());
					e.printStackTrace();
				} finally {
					if (PORTALDBRs_2 != null) try { PORTALDBRs_2.close(); } catch (SQLException e) { /* ignore */ }
					if (PORTALDBStmt_2 != null) try { PORTALDBStmt_2.close(); } catch (SQLException e) { /* ignore */ }
					if (PORTALDBConn_2 != null) try { PORTALDBConn_2.close(); } catch (SQLException e) { /* ignore */ }
				}
			END_CUSTOM_SCRIPT;
			// Tosca DB: SAMSON_DB | UPDATE | Driver=Generic ODBC
			tg_int var_Samson_Db_Rows_3 = 0;
			START_CUSTOM_SCRIPT;
				Connection SAMSONDBConn_3 = null;
				Statement SAMSONDBStmt_3 = null;
				try {
					SAMSONDBConn_3 = DriverManager.getConnection(var_Regression_Samson_Db, var_Regression_Samson_Db_User, var_Regression_Samson_Db_Password);
					System.out.println("Connected to database: SAMSON_DB");
					SAMSONDBStmt_3 = SAMSONDBConn_3.createStatement();
					var_Samson_Db_Rows_3 = SAMSONDBStmt_3.executeUpdate("update serial_item_inv set UNSIM_IND='N',RESOURCE_STATUS='AA',Activity_code='ACTV', PREV_RSRC_STS='AA' where SERIAL_NUMBER in ('" + var_Iccid + "');");
					if (var_Samson_Db_Rows_3 != 1) {
						System.err.println("Expected 1 row(s), got " + var_Samson_Db_Rows_3);
					}
				} catch (SQLException e) {
					System.err.println("Database operation failed: " + e.getMessage());
					e.printStackTrace();
				} finally {
					if (SAMSONDBStmt_3 != null) try { SAMSONDBStmt_3.close(); } catch (SQLException e) { /* ignore */ }
					if (SAMSONDBConn_3 != null) try { SAMSONDBConn_3.close(); } catch (SQLException e) { /* ignore */ }
				}
			END_CUSTOM_SCRIPT;
		return var_TGReturn;
	}
}
