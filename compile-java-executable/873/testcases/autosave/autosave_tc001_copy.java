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
public class tc001_copy {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc001_copy() {
		tg.openDevice();
				tg.wait(1);
				tg.wait("ele_HomescreenScrollView1791371631928", ComparisonType.IS_VISIBLE);
				tg.click("ele_HomescreenScrollView1791371631928", 1, true);
				tg.wait("ele_TextView1791371639832", ComparisonType.IS_VISIBLE);
				tg.click("ele_TextView1791371639832", 1, true);
				tg.wait("ele_contentFrameLayout1791371649651", ComparisonType.IS_VISIBLE);
				tg.click("ele_contentFrameLayout1791371649651", 1, true);
				tg.wait("ele_pnpmView1791371656785", ComparisonType.IS_VISIBLE);
				tg.click("ele_pnpmView1791371656785", 1, true);
				tg.wait("ele_bunView1791371661651", ComparisonType.IS_VISIBLE);
				tg.click("ele_bunView1791371661651", 1, true);
				tg.swipe(Direction.UP);
				tg.swipe(Direction.UP);
				tg.wait("ele_TracesagentscanreadTextView1791371678390", ComparisonType.IS_VISIBLE);
				tg.click("ele_TracesagentscanreadTextView1791371678390", 1, true);
				tg.swipe(Direction.UP);
				tg.wait("ele_FormsView1791371692431", ComparisonType.IS_VISIBLE);
				tg.click("ele_FormsView1791371692431", 1, true);
				tg.wait("ele_ActiveTextView1791371698693", ComparisonType.IS_VISIBLE);
				tg.click("ele_ActiveTextView1791371698693", 1, true);
				tg.wait("ele_OKButton1791371704047", ComparisonType.IS_VISIBLE);
				tg.click("ele_OKButton1791371704047", 1, true);
				tg.wait("ele_TextView1791371708596", ComparisonType.IS_VISIBLE);
				tg.click("ele_TextView1791371708596", 1, true);
				tg.swipe(Direction.DOWN);
				tg.swipe(Direction.UP);
				tg.wait("ele_DragTextView1791371722481", ComparisonType.IS_VISIBLE);
				tg.click("ele_DragTextView1791371722481", 1, true);
				tg.wait("ele_TextView1791371727534", ComparisonType.IS_VISIBLE);
				tg.click("ele_TextView1791371727534", 1, true);
				tg.wait("ele_TextView1791372054873", ComparisonType.IS_VISIBLE);
				tg.click("ele_TextView1791372054873", 1, false);
				tg.wait("ele_TextView1791372173986", ComparisonType.IS_VISIBLE);
				tg.click("ele_TextView1791372173986", 1, false);
				tg.wait("ele_TextView1791372177356", ComparisonType.IS_VISIBLE);
				tg.click("ele_TextView1791372177356", 1, false);
		tg.close();
	}
}