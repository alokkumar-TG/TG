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
public class tc03 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc03() {
		tg.openBrowser();
		tg.wait(1);
		START_CUSTOM_SCRIPT;
		
		try {
		    System.out.println("Checking delete confirmation popup...");
		
		    if (tg.performAssert("ele_DeleteConfirmation", ComparisonType.IS_VISIBLE)) {
		        tg.wait("ele_DeleteConfirmation", ComparisonType.IS_VISIBLE);
		
		        System.out.println("Delete confirmation popup is visible.");
		
		        if (tg.performAssert("ele_ConfirmDelete", ComparisonType.IS_VISIBLE)) {
		            tg.click("ele_ConfirmDelete", 1);
		            System.out.println("Delete confirmed successfully.");
		        } else {
		            System.out.println("Confirm delete button is not visible.");
		        }
		
		    } else {
		        System.out.println("Delete confirmation popup is not displayed.");
		    }
		
		} catch (Exception e) {
		    System.out.println("Error while handling delete confirmation popup: "
		            + e.getMessage());
		}
		
		END_CUSTOM_SCRIPT;
		tg.close();
	}
}