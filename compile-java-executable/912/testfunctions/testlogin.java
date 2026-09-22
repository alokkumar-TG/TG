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

class testlogin {

	public static void testlogin() {
				tg.wait("ele_emailaddre340", ComparisonType.IS_VISIBLE);
				tg.wait(1);
				tg.click("ele_emailaddre340", 1);
				tg.wait("ele_r1h6kqsqpp235", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1h6kqsqpp235", 1);
				tg.wait("ele_r1hmkqsqpp607", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1hmkqsqpp607", 1);
				tg.wait("ele_r1hmkqsqpp607", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_r1hmkqsqpp607", "ghfghfghgfh");
				tg.wait("ele_r1h6kqsqpp628", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1h6kqsqpp628", 1);
				tg.wait("ele_r1h6kqsqpp374", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1h6kqsqpp374", 1);
				tg.wait("ele_r1hmkqsqpp269", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1hmkqsqpp269", 1);
				tg.wait("ele_logintofac882", ComparisonType.IS_VISIBLE);
				tg.click("ele_logintofac882", 1);
				tg.wait("ele_r1h6kqsqpp593", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1h6kqsqpp593", 1);
				tg.wait("ele_r1h6kqsqpp163", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1h6kqsqpp163", 1);
				tg.wait("ele_r1h6kqsqpp367", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1h6kqsqpp367", 1);
				tg.wait("ele_r1h6kqsqpp367", ComparisonType.IS_VISIBLE);
				tg.type("ele_r1h6kqsqpp367", "hgfhfghfghfghgfh");
				tg.wait("ele_login760", ComparisonType.IS_VISIBLE);
				tg.click("ele_login760", 1);
				tg.wait("ele_emailaddre688", ComparisonType.IS_VISIBLE);
				tg.click("ele_emailaddre688", 1);
	}
}