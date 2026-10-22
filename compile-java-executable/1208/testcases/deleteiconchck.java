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
public class deleteiconchck {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void deleteiconchck() {
		tg.openBrowser();
				tg.wait("ele_rc9l6neapp104", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp104", 1);
				tg.wait("ele_rc9l6neapp104", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp104", "sdfsdfdsf");
				tg.wait("ele_rcdl6neapp977", ComparisonType.IS_VISIBLE);
				tg.click("ele_rcdl6neapp977", 1);
				tg.wait("ele_rcdl6neapp977", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_rcdl6neapp977", "DOgvOep/6DYdcZp/suEL6Q==:MTIzNDU2Nzg5MTAxMTEyMQ==");
				tg.wait("ele_login238", ComparisonType.IS_VISIBLE);
				tg.click("ele_login238", 1);
				tg.wait("ele_login801", ComparisonType.IS_VISIBLE);
				tg.click("ele_login801", 1);
		tg.close();
	}
}