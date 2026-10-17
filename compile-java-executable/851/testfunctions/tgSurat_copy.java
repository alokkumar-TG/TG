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

class tgsurat_copy {

	public static void tgsurat_copy() {
		tg.wait("ele_viewmaleImageView1785959200600", ComparisonType.IS_VISIBLE);
		tg.click("ele_viewmaleImageView1785959200600", 1);
		tg.wait("ele_btnplaceholderView1785959205565", ComparisonType.IS_VISIBLE);
		tg.click("ele_btnplaceholderView1785959205565", 1);
		// [DISABLED] tg.wait("ele_FullbodyTextView1785959210534", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_FullbodyTextView1785959210534", 1);
		tg.wait("ele_btnplaceholderView1785959205565", ComparisonType.IS_VISIBLE);
		tg.click("ele_btnplaceholderView1785959205565", 1);
		tg.wait("ele_ivimgImageView1785959217954", ComparisonType.IS_VISIBLE);
		tg.click("ele_ivimgImageView1785959217954", 1);
		tg.wait("ele_btnplaceholderView1785959205565", ComparisonType.IS_VISIBLE);
		tg.click("ele_btnplaceholderView1785959205565", 1);
		tg.wait("ele_viewforegroundView1785959272169", ComparisonType.IS_VISIBLE);
		tg.click("ele_viewforegroundView1785959272169", 1);
		tg.wait("ele_btnplaceholderView1785959205565", ComparisonType.IS_VISIBLE);
		tg.click("ele_btnplaceholderView1785959205565", 1);
		tg.wait("ele_pushupsTextView1785959287118", ComparisonType.IS_VISIBLE);
		tg.click("ele_pushupsTextView1785959287118", 1);
		tg.wait("ele_btnplaceholderView1785959205565", ComparisonType.IS_VISIBLE);
		tg.click("ele_btnplaceholderView1785959205565", 1);
		tg.wait("ele_viewforegroundViewGroup1785959295897", ComparisonType.IS_VISIBLE);
		tg.click("ele_viewforegroundViewGroup1785959295897", 1);
		tg.wait("ele_btnplaceholderView1785959205565", ComparisonType.IS_VISIBLE);
		tg.click("ele_btnplaceholderView1785959205565", 1);
		tg.wait("ele_btnplaceholderView1785959205565", ComparisonType.IS_VISIBLE);
		tg.click("ele_btnplaceholderView1785959205565", 1);
		tg.wait("ele_GETMYPLANTextView1785959332723", ComparisonType.IS_VISIBLE);
		tg.click("ele_GETMYPLANTextView1785959332723", 1);
		tg.wait("ele_GotohomepageTextView1785959352558", ComparisonType.IS_VISIBLE);
		tg.click("ele_GotohomepageTextView1785959352558", 1);
		tg.testFunction("tgSurat_copy", new Object[]{});
	}
}