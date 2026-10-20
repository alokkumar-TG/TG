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

class fnverifyingpaycodeamountwages {

	public static void fnverifyingpaycodeamountwages() {
		// [DISABLED] tg.testFunction("fnValidationScreenshot", new Object[]{});
		START_CUSTOM_SCRIPT;
		var_Tab_Name = "Totals";
		END_CUSTOM_SCRIPT;
		tg.testFunction("fnSelectAddOnTabOnTimecard", new Object[]{});
		if(tg.performAssert("ele_SpanByDDToggleBtn_3a031a40", ComparisonType.IS_VISIBLE)){
		tg.check.isVisible("ele_SpanByDDToggleBtn_3a031a40");
		tg.click("ele_SpanByDDToggleBtn_3a031a40", 1);
		tg.check.isVisible("ele_Daily_3a031a40");
		tg.click("ele_Daily_3a031a40", 1);
		}
		if(tg.performAssert("ele_SpanByDDToggleBtn_3a031a40", ComparisonType.IS_VISIBLE)){
		tg.check.isVisible("ele_SpanByDDToggleBtn_3a031a40");
		tg.click("ele_SpanByDDToggleBtn_3a031a40", 1);
		tg.check.isVisible("ele_All_3a1fa027");
		}
		tg.check.isVisible("ele_ExpandAddOns_3a0888f5");
		tg.check.isVisible("ele_FilterButton_3a073007");
		tg.click("ele_ShowFiltersRow_3a073007", 1);
		tg.click("ele_FilterButton_3a073007", 1);
		tg.click("ele_ExpandAddOns_3a0888f5", 1);
		tg.check.isVisible("ele_FilterButton_3a073007");
		tg.click("ele_FilterButton_3a073007", 1);
		tg.type("ele_SELECT_3a031621", "=");
		tg.type("ele_INPUT_3a030b49", var_Paycode);
		tg.check.isVisible("ele_PayCodeHeader_3a03161f");
		tg.check.isVisible("ele_Paycode_3a03ba2a");
		tg.testFunction("fnValidationScreenshot", new Object[]{});
		tg.check.isVisible("ele_ExpandAddOns_3a0888f5");
		tg.click("ele_ExpandAddOns_3a0888f5", 1);
		START_CUSTOM_SCRIPT;
		var_Tab_Name = "Totals";
		END_CUSTOM_SCRIPT;
		tg.testFunction("fnSelectAddOnTabOnTimecard", new Object[]{});
	}
}