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


@Listeners(TestListener.class)
public class QAT_QAT_Create_MOP_Dialpad_Add_a_license_Order extends tc_QAT_f305658e {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void QAT_QAT_Create_MOP_Dialpad_Add_a_license_Order() {
		tg.openBrowser();
		tg_String var_fnGenerateOAuthAccessTokenV1response = "";
		var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1_copy", new Object[]{var_Regression_Get_Product});
		tg_String var_fnGetAccountDetailsDialpadresponse = "";
		var_fnGetAccountDetailsDialpadresponse = (String) tg.testFunction("fnGetAccountDetailsDialpad", new Object[]{var_Regression_Get_Product, var_Account_Id});
		tg_String var_fnGetProductDialpadresponse = "";
		var_fnGetProductDialpadresponse = (String) tg.testFunction("fnGetProductDialpad", new Object[]{var_Regression_Get_Product, var_Product_Id});
		tg_String var_Created_By = "SDET_Automation";
		tg_String var_fnDialpadAALRequestAndResponseresponse = "";
		var_fnDialpadAALRequestAndResponseresponse = (String) tg.testFunction("fnDialpadAALRequestAndResponse", new Object[]{var_Regression_Get_Product, var_Created_By});
		tg.wait(15);
				tg_String var_Qat_Qat_Create_Mop_Dialpad_Add_A_License_Order_Response = "";
				var_Qat_Qat_Create_Mop_Dialpad_Add_A_License_Order_Response = tg.readFromAPI("qat_qat_create_mop_dialpad_add_a_license_order.json").getString();
				tg.swipe("ele_OrderStatusHistory_3a0de2b7", Direction.UP);
				tg.swipe("ele_Item_3a0de2b7", Direction.UP);
				tg.check.isVisible("ele_IotOrderStatus_3a0de2b7");
				tg.check.isVisible("ele_IotOrderSubStatus_3a0de2b7");
				tg.swipe("ele_Item_3a0de2b7", Direction.UP);
				tg.check.isVisible("ele_IotOrderStatus_3a0de2b7");
				tg.check.isVisible("ele_IotOrderSubStatus_3a0de2b7");
				tg.swipe("ele_Item_3a0de2b7", Direction.UP);
				tg.check.isVisible("ele_IotOrderStatus_3a0de2b7");
				tg.check.isVisible("ele_IotOrderSubStatus_3a0de2b7");
				tg.swipe("ele_Item_3a0de2b7", Direction.UP);
				tg.check.isVisible("ele_IotOrderStatus_3a0de2b7");
				tg.check.isVisible("ele_IotOrderSubStatus_3a0de2b7");
				tg.swipe("ele_Item_3a0de2b7", Direction.UP);
				tg.check.isVisible("ele_IotOrderStatus_3a0de2b7");
				tg.check.isVisible("ele_IotOrderSubStatus_3a0de2b7");
				tg.swipe("ele_Item_3a0de2b7", Direction.UP);
				tg.check.isVisible("ele_IotOrderStatus_3a0de2b7");
				tg.check.isVisible("ele_IotOrderSubStatus_3a0de2b7");
				tg.swipe("ele_Item_3a0de2b7", Direction.UP);
				tg.check.isVisible("ele_IotOrderStatus_3a0de2b7");
				tg.check.isVisible("ele_IotOrderSubStatus_3a0de2b7");
				tg.swipe("ele_Item_3a0de2b7", Direction.UP);
				tg.check.isVisible("ele_IotOrderStatus_3a0de2b7");
				tg.check.isVisible("ele_IotOrderSubStatus_3a0de2b7");
				tg.swipe("ele_Item_3a0de2b7", Direction.UP);
				tg.check.isVisible("ele_IotOrderStatus_3a0de2b7");
				tg.check.isVisible("ele_IotOrderSubStatus_3a0de2b7");
				tg.swipe("ele_Item_3a0de2b7", Direction.UP);
				tg.check.isVisible("ele_IotOrderStatus_3a0de2b7");
				tg.check.isVisible("ele_IotOrderSubStatus_3a0de2b7");
				tg.swipe("ele_Item_3a0de2b7", Direction.UP);
				tg.check.isVisible("ele_IotOrderStatus_3a0de2b7");
				tg.check.isVisible("ele_IotOrderSubStatus_3a0de2b7");
				tg.swipe("ele_Item_3a0de2b7", Direction.UP);
				tg.check.isVisible("ele_IotOrderStatus_3a0de2b7");
				tg.check.isVisible("ele_IotOrderSubStatus_3a0de2b7");
	}
}
