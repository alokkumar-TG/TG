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
				tg.wait(1);
				tg.wait("ele_viewmaleImageView1791305440123", ComparisonType.IS_VISIBLE);
				tg.click("ele_viewmaleImageView1791305440123", 1, true);
				tg.wait("ele_btnplaceholderView1791305444270", ComparisonType.IS_VISIBLE);
				tg.click("ele_btnplaceholderView1791305444270", 1, true);
				tg.wait("ele_FullbodyTextView1791305449890", ComparisonType.IS_VISIBLE);
				tg.click("ele_FullbodyTextView1791305449890", 1, true);
				tg.wait("ele_btnplaceholderView1791305452818", ComparisonType.IS_VISIBLE);
				tg.click("ele_btnplaceholderView1791305452818", 1, true);
				tg.wait("ele_viewforegroundView1791305457758", ComparisonType.IS_VISIBLE);
				tg.click("ele_viewforegroundView1791305457758", 1, true);
				tg.wait("ele_btnplaceholderView1791305462345", ComparisonType.IS_VISIBLE);
				tg.click("ele_btnplaceholderView1791305462345", 1, true);
				tg.wait("ele_FeelconfidentTextView1791305466996", ComparisonType.IS_VISIBLE);
				tg.click("ele_FeelconfidentTextView1791305466996", 1, true);
				tg.wait("ele_btnplaceholderView1791305470563", ComparisonType.IS_VISIBLE);
				tg.click("ele_btnplaceholderView1791305470563", 1, true);
				tg.wait("ele_ViewGroup1791305474604", ComparisonType.IS_VISIBLE);
				tg.click("ele_ViewGroup1791305474604", 1, true);
				tg.wait("ele_btnplaceholderView1791305478559", ComparisonType.IS_VISIBLE);
				tg.click("ele_btnplaceholderView1791305478559", 1, true);
				tg.wait("ele_SedentaryTextView1791305482643", ComparisonType.IS_VISIBLE);
				tg.click("ele_SedentaryTextView1791305482643", 1, true);
				tg.wait("ele_btnplaceholderView1791305486319", ComparisonType.IS_VISIBLE);
				tg.click("ele_btnplaceholderView1791305486319", 1, true);
				tg.wait("ele_btnplaceholderView1791305490587", ComparisonType.IS_VISIBLE);
				tg.click("ele_btnplaceholderView1791305490587", 1, true);
				tg.swipe(Direction.LEFT);
				tg.swipe(Direction.RIGHT);
				tg.swipe(Direction.LEFT);
				tg.swipe(Direction.LEFT);
				tg.wait("ele_GETMYPLANTextView1791305514318", ComparisonType.IS_VISIBLE);
				tg.click("ele_GETMYPLANTextView1791305514318", 1, true);
				tg.wait("ele_GotohomepageTextView1791305524795", ComparisonType.IS_VISIBLE);
				tg.click("ele_GotohomepageTextView1791305524795", 1, true);
		tg.close();
	}
}