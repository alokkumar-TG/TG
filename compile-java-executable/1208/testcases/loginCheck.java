import java.sql.Connection;
import java.sql.DriverManager;;
import java.sql.ResultSet;;
import java.sql.SQLException;
import java.sql.Statement;;
import java.util.Scanner;
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

@Listeners(TestListener.class);
public class logincheck {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void logincheck() {
		tg.openBrowser();
		// [DISABLED] tg.wait(2);
		tg.wait(2);
		tg_int var_a = 10;
		tg_int var_b = 20;
		tg_int var_c = 30;
		var_a = tg.saveToVariable(var_a, var_a);
		var_b = tg.saveToVariable(var_b, var_b);
		var_c = tg.saveToVariable(var_c, var_c);
		START_CUSTOM_SCRIPT;
		        int sum = var_a + var_b + var_c;
		END_CUSTOM_SCRIPT;
		tg.printLogs("sum");
		tg.close();
	}
}