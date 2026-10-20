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
public class registerdemodata {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void registerdemodata() {
		tg.openBrowser();
		tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
		tg.wait("ele_firstname108", ComparisonType.IS_VISIBLE);
		tg.click("ele_firstname108", 1);
		tg.wait("ele_firstname108", ComparisonType.IS_VISIBLE);
		tg.type("ele_firstname108", "hiii");
		tg.wait("ele_lastname274", ComparisonType.IS_VISIBLE);
		tg.click("ele_lastname274", 1);
		tg.wait("ele_lastname274", ComparisonType.IS_VISIBLE);
		tg.type("ele_lastname274", "hiii");
		tg.wait(5);
		tg.navigateToUrl("https://demo.automationtesting.in/Frames.html");
		tg.wait("ele_singleifra915", ComparisonType.IS_VISIBLE);
		tg.click("ele_singleifra915", 1);
		tg.wait("ele_text116", ComparisonType.IS_VISIBLE);
		tg.click("ele_text116", 1);
		tg.wait("ele_text116", ComparisonType.IS_VISIBLE);
		tg.type("ele_text116", "hey");
		tg.wait("ele_iframewith059", ComparisonType.IS_VISIBLE);
		tg.click("ele_iframewith059", 1);
		tg.wait("ele_text410", ComparisonType.IS_VISIBLE);
		tg.click("ele_text410", 1);
		tg.wait("ele_text410", ComparisonType.IS_VISIBLE);
		tg.type("ele_text410", "heyyy");
		tg.wait(5);
		tg.close();
	}
}