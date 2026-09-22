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
public class tc002 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc002() {
		tg.openBrowser();
				tg.wait(2);
				tg.wait("ele_enteryoure208", ComparisonType.IS_VISIBLE);
				tg.click("ele_enteryoure208", 1);
				tg.wait("ele_enteryoure208", ComparisonType.IS_VISIBLE);
				tg.type("ele_enteryoure208", "dfsfdsfdsfdsf");
				tg.wait("ele_enteryourp858", ComparisonType.IS_VISIBLE);
				tg.click("ele_enteryourp858", 1);
				tg.wait("ele_enteryourp858", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_enteryourp858", "G00s54dSGskUQ7/xCY8cZD/B2DYUTt2/1o8tT4Wp/34=:MTIzNDU2Nzg5MTAxMTEyMQ==");
				tg.wait("ele_login057", ComparisonType.IS_VISIBLE);
				tg.click("ele_login057", 1);
		tg.close();
	}
}