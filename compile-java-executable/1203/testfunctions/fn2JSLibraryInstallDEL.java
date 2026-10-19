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


class fn2jslibraryinstalldel {

	public static Object fn2jslibraryinstalldel(String var_Install) {
		tg_String var_TGReturn = "";
		// [DISABLED] // Tosca: Path | powershell | (ActionMode 37)
		tg.type("ele_Directory_3a170ab2", "{B[Directory]}\\{B[Folder Name]}");
		// [DISABLED] // Tosca: Arguments | {NULL} | (ActionMode 517)
		tg.type("ele_Argument_3a170ab2", "-command");
		tg.type("ele_Argument_3a170ab2", var_Install);
		tg.swipe("ele_WaitForExit_3a170ab2", Direction.UP);
		tg.type("ele_StandardOutputFile_3a170ab2", "{B[Directory]}\\{B[Folder Name]}\\out.txt");
		tg.type("ele_TimeoutForExit_3a170ab2", "1000");
		tg.check.isVisible("ele_ExitCode_3a170ab2");
		return var_TGReturn;
	}
}
