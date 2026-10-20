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

@Listeners(TestListener.class);
public class diapad_tc005_qat_delinquency_dialpad_account_restore_order {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void diapad_tc005_qat_delinquency_dialpad_account_restore_order() {
		tg.openBrowser();
		tg.close();
	}
}