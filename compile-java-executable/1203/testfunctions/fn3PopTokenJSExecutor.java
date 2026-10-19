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


class fn3poptokenjsexecutor {

	public static Object fn3poptokenjsexecutor(String var_Uri, String var_Method, String var_Body_Replace, String var_Body_Replace_String, String var_Client_Id, String var_Secret_Key, String var_Private_Key) {
		tg_String var_TGReturn = "";
		if (tg.performAssert("ele_Expression_3a119796", ComparisonType.IS_VISIBLE)) {
						tg.check.isVisible("ele_Expression_3a119796");
		} else {
		}
		// [DISABLED] // Tosca: Path | powershell | (ActionMode 37)
		// [DISABLED] tg.type("ele_Directory_3a1260f5", "{B[Directory]}\\{B[Folder Name]}");
		// [DISABLED] // Tosca: Arguments | {NULL} | (ActionMode 517)
		// [DISABLED] tg.type("ele_Argument_3a1260f5", "-command");
		// [DISABLED] tg.type("ele_Argument_3a1260f5", "npm i --legacy-peer-deps");
		// [DISABLED] tg.swipe("ele_WaitForExit_3a1260f5", Direction.UP);
		// [DISABLED] tg.type("ele_StandardOutputFile_3a1260f5", "{B[Directory]}\\{B[Folder Name]}\\out.txt");
		// [DISABLED] tg.type("ele_TimeoutForExit_3a1260f5", "1000");
		// [DISABLED] tg.check.isVisible("ele_ExitCode_3a1260f5");
		tg_String var_Install = "axios";
		tg_String var_fn2JSLibraryInstallresponse = "";
		var_fn2JSLibraryInstallresponse = (String) tg.testFunction("fn2JSLibraryInstall", new Object[]{var_Install});
		var_Install = "jsrsasign";
		var_fn2JSLibraryInstallresponse = (String) tg.testFunction("fn2JSLibraryInstall", new Object[]{var_Install});
		var_Install = "node-jq";
		var_fn2JSLibraryInstallresponse = (String) tg.testFunction("fn2JSLibraryInstall", new Object[]{var_Install});
		// [DISABLED] var_Install = "jsrsasign axios node-jq";
		// [DISABLED] var_fn2JSLibraryInstallresponse = (String) tg.testFunction("fn2JSLibraryInstall", new Object[]{var_Install});
		// [DISABLED] // Tosca: Path | node | (ActionMode 37)
		tg.type("ele_Directory_3a1260f5", "{B[Directory]}\\{B[Folder Name]}");
		// [DISABLED] // Tosca: Arguments | {NULL} | (ActionMode 517)
		tg.type("ele_Argument_3a1260f5", "script.js");
		tg.type("ele_Argument_3a1260f5", var_Uri);
		tg.type("ele_Argument_3a1260f5", var_Method);
		tg.type("ele_Argument_3a1260f5", var_Client_Id);
		tg.type("ele_Argument_3a1260f5", var_Secret_Key);
		tg.type("ele_Argument_3a1260f5", var_Private_Key);
		tg.type("ele_Argument_3a1260f5", var_Body_Replace);
		tg.type("ele_Argument_3a1260f5", var_Body_Replace_String);
		tg.swipe("ele_WaitForExit_3a1260f5", Direction.UP);
		tg.type("ele_StandardOutputFile_3a1260f5", "{B[Directory]}\\{B[Folder Name]}\\script-out.txt");
		tg.type("ele_TimeoutForExit_3a1260f5", "1000");
		tg.check.isVisible("ele_ExitCode_3a1260f5");
		tg.type("ele_Directory_3a1260f5", "{B[Directory]}\\{B[Folder Name]}");
		tg.type("ele_File_3a1260f5", "popToken.txt");
		// [DISABLED] // Tosca: Text | apigee_pop_token | (ActionMode 165)
		tg.type("ele_Overwrite_3a1260f5", "True");
		tg.type("ele_Directory_3a1260f5", "{B[Directory]}\\{B[Folder Name]}");
		tg.type("ele_File_3a1260f5", "accessToken.txt");
		// [DISABLED] // Tosca: Text | access_token | (ActionMode 165)
		tg.type("ele_Overwrite_3a1260f5", "True");
		return var_TGReturn;
	}
}
