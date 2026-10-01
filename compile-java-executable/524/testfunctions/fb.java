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

class fb {

	public static void fb() {
				tg.wait("ele_rc9l6neapp633", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp633", 1);
				tg.wait("ele_rc9l6neapp633", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp633", "manish");
				tg.wait("ele_rcdl6neapp471", ComparisonType.IS_VISIBLE);
				tg.click("ele_rcdl6neapp471", 1);
				tg.wait("ele_rcdl6neapp199", ComparisonType.IS_VISIBLE);
				tg.click("ele_rcdl6neapp199", 1);
				tg.wait("ele_rcdl6neapp199", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_rcdl6neapp199", "YxmEprh58CRmbhlS3wz6Fw==:MTIzNDU2Nzg5MTAxMTEyMQ==");
				tg.wait("ele_login991", ComparisonType.IS_VISIBLE);
				tg.click("ele_login991", 1);
	}
}