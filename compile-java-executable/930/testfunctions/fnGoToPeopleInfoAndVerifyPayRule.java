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

class fngotopeopleinfoandverifypayrule {

	public static void fngotopeopleinfoandverifypayrule() {
		if(tg.performAssert("ele_EditLicenses_3a1f1726", ComparisonType.IS_VISIBLE)){
		tg.check.isVisible("ele_EditLicenses_3a1f1726");
		tg.check.isVisible("ele_More_3a1f9c87");
		tg.click("ele_More_3a1f9c87", 1);
		tg.check.isVisible("ele_PayRuleLabel_3a1f9c89");
		tg.check.isVisible("ele_PayRuleValue_3a1f9c89");
		// [DISABLED] tg.wait(1);
		tg.testFunction("fnValidationScreenshot", new Object[]{});
		} else {
		tg.testFunction("fnSearchEmployeeIdWithLense", new Object[]{});
		tg.check.isVisible("ele_More_3a1f9c87");
		tg.click("ele_More_3a1f9c87", 1);
		tg.check.isVisible("ele_PayRuleLabel_3a1f9c89");
		tg.check.isVisible("ele_PayRuleValue_3a1f9c89");
		// [DISABLED] tg.wait(1);
		tg.testFunction("fnValidationScreenshot", new Object[]{});
		}
	}
}