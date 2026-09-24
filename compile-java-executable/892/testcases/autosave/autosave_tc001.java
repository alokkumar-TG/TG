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

@Listeners(TestListener.class);
public class tc001 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc001() {
		tg.openDevice();
				tg.wait(2);
				tg.wait("ele_viewmaleImageView1789558521278", ComparisonType.IS_VISIBLE);
				tg.click("ele_viewmaleImageView1789558521278", 1);
				tg.wait("ele_LinearLayout1790265203519", ComparisonType.IS_VISIBLE);
				tg.click("ele_LinearLayout1790265203519", 1);
				tg.wait("ele_viewmaleImageView1790265238728", ComparisonType.IS_VISIBLE);
				tg.click("ele_viewmaleImageView1790265238728", 1);
				tg.wait("ele_btnplaceholderView1790265243195", ComparisonType.IS_VISIBLE);
				tg.click("ele_btnplaceholderView1790265243195", 1);
				tg.wait("ele_FullbodyTextView1790265247047", ComparisonType.IS_VISIBLE);
				tg.click("ele_FullbodyTextView1790265247047", 1);
				tg.wait("ele_FullbodyTextView1790265249576", ComparisonType.IS_VISIBLE);
				tg.click("ele_FullbodyTextView1790265249576", 1);
				tg.wait("ele_FullbodyTextView1790265253992", ComparisonType.IS_VISIBLE);
				tg.click("ele_FullbodyTextView1790265253992", 1);
				tg.wait("ele_btnplaceholderView1790265257191", ComparisonType.IS_VISIBLE);
				tg.click("ele_btnplaceholderView1790265257191", 1);
				tg.wait("ele_viewforegroundView1790265261541", ComparisonType.IS_VISIBLE);
				tg.click("ele_viewforegroundView1790265261541", 1);
				tg.wait("ele_btnplaceholderView1790265264952", ComparisonType.IS_VISIBLE);
				tg.click("ele_btnplaceholderView1790265264952", 1);
				tg.wait("ele_ReleasestressTextView1790265268217", ComparisonType.IS_VISIBLE);
				tg.click("ele_ReleasestressTextView1790265268217", 1);
				tg.wait("ele_btnplaceholderView1790265271533", ComparisonType.IS_VISIBLE);
				tg.click("ele_btnplaceholderView1790265271533", 1);
				tg.wait("ele_ViewGroup1790265275001", ComparisonType.IS_VISIBLE);
				tg.click("ele_ViewGroup1790265275001", 1);
				tg.wait("ele_btnplaceholderView1790265278341", ComparisonType.IS_VISIBLE);
				tg.click("ele_btnplaceholderView1790265278341", 1);
				tg.wait("ele_viewforegroundViewGroup1790265282129", ComparisonType.IS_VISIBLE);
				tg.click("ele_viewforegroundViewGroup1790265282129", 1);
				tg.wait("ele_viewforegroundViewGroup1790265286031", ComparisonType.IS_VISIBLE);
				tg.click("ele_viewforegroundViewGroup1790265286031", 1);
				tg.wait("ele_btnplaceholderView1790265293155", ComparisonType.IS_VISIBLE);
				tg.click("ele_btnplaceholderView1790265293155", 1);
				tg.wait("ele_btnplaceholderView1790265302018", ComparisonType.IS_VISIBLE);
				tg.click("ele_btnplaceholderView1790265302018", 1);
				tg.wait("ele_GETMYPLANTextView1790265306088", ComparisonType.IS_VISIBLE);
				tg.click("ele_GETMYPLANTextView1790265306088", 1);
				tg.wait("ele_GotohomepageTextView1790265315010", ComparisonType.IS_VISIBLE);
				tg.click("ele_GotohomepageTextView1790265315010", 1);
		tg.close();
	}
}