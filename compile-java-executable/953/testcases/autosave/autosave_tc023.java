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
public class tc023 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc023() {
		tg.openBrowser();
				tg.wait("ele_rc9l6neapp587", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp587", 1);
				tg.wait("ele_rc9l6neapp587", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp587", "dfsdfsdfdsf");
				tg.wait("ele_rcdl6neapp778", ComparisonType.IS_VISIBLE);
				tg.click("ele_rcdl6neapp778", 1);
				tg.wait("ele_rcdl6neapp778", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_rcdl6neapp778", "DHFb3XPJM/QrInp7/pQIcw==:MTIzNDU2Nzg5MTAxMTEyMQ==");
				tg.wait("ele_rcdl6neapp180", ComparisonType.IS_VISIBLE);
				tg.click("ele_rcdl6neapp180", 1);
				tg.wait("ele_rcdl6neapp180", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_rcdl6neapp180", "DCjGOY+ZH/I7Sr3f4/vZfw==:MTIzNDU2Nzg5MTAxMTEyMQ==");
				tg.wait("ele_login825", ComparisonType.IS_VISIBLE);
				tg.click("ele_login825", 1);
		tg.close();
	}
}