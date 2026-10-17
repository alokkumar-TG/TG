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
import io.testgrid.enums.Alert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.Test;

class tf01_copy {

	public static void tf01_copy() {
		tg.swipe(Direction.DOWN);
		tg.printLogs(var_ra_Name);
		tg.swipe(Direction.UP);
		tg.wait("ele_yourteamEditText1785959693265", ComparisonType.IS_VISIBLE);
		tg.click("ele_yourteamEditText1785959693265", 1);
		tg.wait("ele_yourteamEditText1785959693265", ComparisonType.IS_VISIBLE);
		tg.type("ele_yourteamEditText1785959693265", "GHDFGDGDG", true);
		tg.wait("ele_NextButton1785959704774", ComparisonType.IS_VISIBLE);
		tg.click("ele_NextButton1785959704774", 1);
		tg.wait("ele_OKButton1785959709061", ComparisonType.IS_VISIBLE);
		tg.click("ele_OKButton1785959709061", 1);
		tg.wait("ele_yourteamEditText1785959693265", ComparisonType.IS_VISIBLE);
		tg.click("ele_yourteamEditText1785959693265", 1);
		tg.wait("ele_yourteamEditText1785959693265", ComparisonType.IS_VISIBLE);
		tg.type("ele_yourteamEditText1785959693265", "GHDFDSFSDFSDFDSF", true);
		tg.wait("ele_NextButton1785959704774", ComparisonType.IS_VISIBLE);
		tg.click("ele_NextButton1785959704774", 1);
		tg.wait("ele_OKButton1785959709061", ComparisonType.IS_VISIBLE);
		tg.click("ele_OKButton1785959709061", 1);
	}
}