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
public class dfsf {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void dfsf() {
		tg.openBrowser();
				tg.wait("ele_rc9l6neapp018", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp018", 1);
				tg.wait("ele_rc9l6neapp018", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp018", "hdsgfhgdfgxcjhcvcxvxcvxcv");
				tg.wait("ele_rcdl6neapp706", ComparisonType.IS_VISIBLE);
				tg.click("ele_rcdl6neapp706", 1);
				tg.wait("ele_rcdl6neapp706", ComparisonType.IS_VISIBLE);
				tg.type("ele_rcdl6neapp706", "cxvxcvxcv");
				tg.wait("ele_rcdl6neapp712", ComparisonType.IS_VISIBLE);
				tg.click("ele_rcdl6neapp712", 1);
				tg.wait("ele_rc9l6neapp743", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp743", 1);
				tg.wait("ele_rc9l6neapp743", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp743", "xcvxcvxcvcvx");
				tg.wait("ele_login524", ComparisonType.IS_VISIBLE);
				tg.click("ele_login524", 1);
				tg.wait("ele_forgottenp063", ComparisonType.IS_VISIBLE);
				tg.click("ele_forgottenp063", 1);
				tg.wait("ele_backbutton038", ComparisonType.IS_VISIBLE);
				tg.click("ele_backbutton038", 1);
				tg.wait("ele_createnewa975", ComparisonType.IS_VISIBLE);
				tg.click("ele_createnewa975", 1);
				tg.wait("ele_r1cl2p4jik249", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1cl2p4jik249", 1);
				tg.wait("ele_r1cl2p4jik249", ComparisonType.IS_VISIBLE);
				tg.type("ele_r1cl2p4jik249", "fgdfgdfgfdg");
				tg.wait("ele_r1kl2p4jik987", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1kl2p4jik987", 1);
				tg.wait("ele_r1kl2p4jik987", ComparisonType.IS_VISIBLE);
				tg.type("ele_r1kl2p4jik987", "gdfgdfgdfgfdg");
				tg.wait("ele_day430", ComparisonType.IS_VISIBLE);
				tg.click("ele_day430", 1);
				tg.wait("ele_div477", ComparisonType.IS_VISIBLE);
				tg.click("ele_div477", 1);
		tg.close();
	}
}