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

class tf002 {

	public static Object tf002(String abc1, String abc2, String abc3) {
		tg_String var_TGReturn = "";
		START_CUSTOM_SCRIPT;
		var_TGReturn = abc1+abc2+abc3 ;
		END_CUSTOM_SCRIPT;
				tg.wait(2);
				tg.wait("ele_viewmaleImageView1791305686125", ComparisonType.IS_VISIBLE);
				tg.click("ele_viewmaleImageView1791305686125", 1, true);
				tg.wait("ele_btnplaceholderView1791305689443", ComparisonType.IS_VISIBLE);
				tg.click("ele_btnplaceholderView1791305689443", 1, true);
				tg.wait("ele_FullbodyTextView1791305692609", ComparisonType.IS_VISIBLE);
				tg.click("ele_FullbodyTextView1791305692609", 1, true);
				tg.wait("ele_btnplaceholderView1791305696192", ComparisonType.IS_VISIBLE);
				tg.click("ele_btnplaceholderView1791305696192", 1, true);
				tg.wait("ele_viewforegroundView1791305700737", ComparisonType.IS_VISIBLE);
				tg.click("ele_viewforegroundView1791305700737", 1, true);
				tg.wait("ele_btnplaceholderView1791305705561", ComparisonType.IS_VISIBLE);
				tg.click("ele_btnplaceholderView1791305705561", 1, true);
				tg.wait("ele_viewforegroundView1791305709718", ComparisonType.IS_VISIBLE);
				tg.click("ele_viewforegroundView1791305709718", 1, true);
				tg.wait("ele_btnplaceholderView1791305750804", ComparisonType.IS_VISIBLE);
				tg.click("ele_btnplaceholderView1791305750804", 1, true);
				tg.wait("ele_pushupsTextView1791305756938", ComparisonType.IS_VISIBLE);
				tg.click("ele_pushupsTextView1791305756938", 1, true);
				tg.wait("ele_btnplaceholderView1791305763456", ComparisonType.IS_VISIBLE);
				tg.click("ele_btnplaceholderView1791305763456", 1, true);
				tg.wait("ele_viewforegroundViewGroup1791305768608", ComparisonType.IS_VISIBLE);
				tg.click("ele_viewforegroundViewGroup1791305768608", 1, true);
				tg.wait("ele_btnplaceholderView1791305773517", ComparisonType.IS_VISIBLE);
				tg.click("ele_btnplaceholderView1791305773517", 1, true);
				tg.wait("ele_btnplaceholderView1791305780782", ComparisonType.IS_VISIBLE);
				tg.click("ele_btnplaceholderView1791305780782", 1, true);
				tg.wait("ele_GETMYPLANTextView1791305784898", ComparisonType.IS_VISIBLE);
				tg.click("ele_GETMYPLANTextView1791305784898", 1, true);
				tg.wait("ele_GotohomepageTextView1791305800534", ComparisonType.IS_VISIBLE);
				tg.click("ele_GotohomepageTextView1791305800534", 1, true);
		return var_TGReturn;
	}
}