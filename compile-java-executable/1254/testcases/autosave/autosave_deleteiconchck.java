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
				tg.wait("ele_hitmranchi774", ComparisonType.IS_VISIBLE);
				tg.click("ele_hitmranchi774", 1);
				tg.wait("ele_worldclass082", ComparisonType.IS_VISIBLE);
				tg.click("ele_worldclass082", 1);
				tg.wait("ele_admissions341", ComparisonType.IS_VISIBLE);
				tg.click("ele_admissions341", 1);
				tg.wait("ele_futureread362", ComparisonType.IS_VISIBLE);
				tg.click("ele_futureread362", 1);
				tg.wait("ele_premiercam067", ComparisonType.IS_VISIBLE);
				tg.click("ele_premiercam067", 1);
				tg.wait("ele_futureread011", ComparisonType.IS_VISIBLE);
				tg.click("ele_futureread011", 1);
				tg.wait("ele_programmes823", ComparisonType.IS_VISIBLE);
				tg.click("ele_programmes823", 1);
				tg.wait("ele_btech413", ComparisonType.IS_VISIBLE);
				tg.click("ele_btech413", 1);
				tg.wait("ele_aicteappro729", ComparisonType.IS_VISIBLE);
				tg.click("ele_aicteappro729", 1);
				tg.wait("ele_admissionc881", ComparisonType.IS_VISIBLE);
				tg.click("ele_admissionc881", 1);
				tg.wait("ele_admissionc732", ComparisonType.IS_VISIBLE);
				tg.click("ele_admissionc732", 1);
				tg.wait("ele_admissionc110", ComparisonType.IS_VISIBLE);
				tg.click("ele_admissionc110", 1);
				tg.wait("ele_admissionc295", ComparisonType.IS_VISIBLE);
				tg.click("ele_admissionc295", 1);
				tg.wait("ele_entername722", ComparisonType.IS_VISIBLE);
				tg.click("ele_entername722", 1);
				tg.wait("ele_entername722", ComparisonType.IS_VISIBLE);
				tg.type("ele_entername722", "gfhfghfgh");
				tg.wait("ele_enteremail342", ComparisonType.IS_VISIBLE);
				tg.click("ele_enteremail342", 1);
				tg.wait("ele_enteremail342", ComparisonType.IS_VISIBLE);
				tg.type("ele_enteremail342", "fdgdfgdfg");
		// [DISABLED] 		tg.wait("ele_enteremail052", ComparisonType.IS_VISIBLE);
				tg.click("ele_enteremail052", 1);
				tg.wait("ele_enteremail052", ComparisonType.IS_VISIBLE);
				tg.type("ele_enteremail052", "8745464464");
				tg.selectDropdownByValue("ele_selectprog698","1500002");
				tg.selectDropdownByValue("ele_selectspec891","1500015");
				tg.wait("ele_register533", ComparisonType.IS_VISIBLE);
				tg.click("ele_register533", 1);
				tg.wait("ele_lazywidth608", ComparisonType.IS_VISIBLE);
				tg.click("ele_lazywidth608", 1);
				tg.wait("ele_lazywidth701", ComparisonType.IS_VISIBLE);
				tg.click("ele_lazywidth701", 1);
		tg.close();
	}
}