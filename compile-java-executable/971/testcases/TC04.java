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
public class tc04 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc04() {
		tg.openBrowser();
				tg.wait("ele_password930", ComparisonType.IS_VISIBLE);
				tg.wait("ele_rc9l6neapp241", ComparisonType.IS_VISIBLE);
				tg.click("ele_rc9l6neapp241", 1);
				tg.wait("ele_rc9l6neapp241", ComparisonType.IS_VISIBLE);
				tg.type("ele_rc9l6neapp241", "mhjghj");
				tg.wait("ele_rcdl6neapp950", ComparisonType.IS_VISIBLE);
				tg.click("ele_rcdl6neapp950", 1);
				tg.wait("ele_rcdl6neapp950", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_rcdl6neapp950", "0wR5JIPTbmS4r0ueGdw1I/IEdFYSiitlMot97VOF+Qw=:MTIzNDU2Nzg5MTAxMTEyMQ==");
				tg.wait("ele_login880", ComparisonType.IS_VISIBLE);
				tg.click("ele_login880", 1);
				tg.wait("ele_forgottenp192", ComparisonType.IS_VISIBLE);
				tg.click("ele_forgottenp192", 1);
				tg.wait("ele_r995", ComparisonType.IS_VISIBLE);
				tg.click("ele_r995", 1);
				tg.wait("ele_r995", ComparisonType.IS_VISIBLE);
				tg.type("ele_r995", "dsfdsfdfdsfdfdsf");
				tg.wait("ele_continue873", ComparisonType.IS_VISIBLE);
				tg.click("ele_continue873", 1);
		tg.close();
	}
}