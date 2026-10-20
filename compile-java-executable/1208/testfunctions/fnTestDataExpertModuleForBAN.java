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


class fntestdataexpertmoduleforban {

	public static Object fntestdataexpertmoduleforban(String var_Test_Data_Task, String var_Query, String var_Primary_Contact_Details_Position, String var_Alias_Name_Item, String var_Status, String var_Customer_Details_Ban) {
		tg_String var_TGReturn = "";
		tg.type("ele_TestDataTask_39f68e81", var_Test_Data_Task);
		tg.type("ele_ExistingOrNewTDSType_39f68e81", "T-BAN");
		tg.type("ele_AliasNameItem_39f68e81", var_Alias_Name_Item);
		tg.type("ele_EnterTDSAttributeAndAValue_39f68e81", var_Status);
		tg.type("ele_Position_3a0df533", var_Primary_Contact_Details_Position);
		tg.type("ele_Query_3a0df533", var_Query);
		tg.type("ele_ExistingAliasNameItem_39f68e81", "T-BAN");
		return var_TGReturn;
	}
}
