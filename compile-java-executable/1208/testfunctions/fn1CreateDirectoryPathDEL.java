import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import static io.testgrid.enums.KeyboardKeys.*;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import org.openqa.selenium.*;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import static io.testgrid.baseClass.driver;


class fn1createdirectorypathdel {

	public static Object fn1createdirectorypathdel() {
		tg_String var_TGReturn = "";
		// [DISABLED] // Tosca: Path | powershell | (ActionMode 37)
		tg.type("ele_Directory_3a170ab2", "Directory");
		// [DISABLED] // Tosca: Arguments | {NULL} | (ActionMode 517)
		tg.type("ele_Argument_3a170ab2", "if (!(Test-Path .\\\"{B[Folder Name]}\")) { New-Item -Path .\\ -Name \"{B[Folder Name]}\" -ItemType Directory -Force }");
		tg.swipe("ele_WaitForExit_3a170ab2", Direction.UP);
		tg.type("ele_TimeoutForExit_3a170ab2", "500");
		return var_TGReturn;
	}
}
