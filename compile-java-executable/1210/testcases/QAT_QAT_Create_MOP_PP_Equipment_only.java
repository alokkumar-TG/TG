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
public class QAT_QAT_Create_MOP_PP_Equipment_only extends tc_QAT_f305658e {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void QAT_QAT_Create_MOP_PP_Equipment_only() {
		tg.openBrowser();
			// [DISABLED] // Tosca: id_token | AccessTocken | (ActionMode 165)
		tg_String var_fnGenerateOAuthAccessTokenV1response = "";
		var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1_copy2", new Object[]{var_Regression_Get_Product});
		tg_String var_fnGetSkuproductresponse = "";
		var_fnGetSkuproductresponse = (String) tg.testFunction("fnGetSkuproduct_copy", new Object[]{var_Regression_Get_Product, var_Product_Id});
		tg_String var_Created_By = "SDET_Automation";
		tg_String var_fnIOTPPEQRequestAndResponseresponse = "";
		var_fnIOTPPEQRequestAndResponseresponse = (String) tg.testFunction("fnIOTPPEQRequestAndResponse_copy", new Object[]{var_Regression_Get_Product, var_Created_By});
		tg.wait(30);
				tg_String var_Qat_Qat_Create_Mop_Pp_Equipment_Only_Response = "";
				var_Qat_Qat_Create_Mop_Pp_Equipment_Only_Response = tg.readFromAPI("qat_qat_create_mop_pp_equipment_only.json").getString();
				tg.swipe("ele_OrderStatusHistory_3a0dc407", Direction.UP);
				tg.swipe("ele_Item_3a0dc407", Direction.UP);
				tg.check.isVisible("ele_IotOrderStatus_3a0dc407");
				tg.check.isVisible("ele_IotOrderSubStatus_3a0dc407");
				tg.swipe("ele_Item_3a0dc407", Direction.UP);
				tg.check.isVisible("ele_IotOrderStatus_3a0dc407");
				tg.check.isVisible("ele_IotOrderSubStatus_3a0dc407");
				tg.swipe("ele_Item_3a0dc407", Direction.UP);
				tg.check.isVisible("ele_IotOrderStatus_3a0dc407");
				tg.check.isVisible("ele_IotOrderSubStatus_3a0dc407");
				tg.swipe("ele_Item_3a0dc407", Direction.UP);
				tg.check.isVisible("ele_IotOrderStatus_3a0dc407");
				tg.check.isVisible("ele_IotOrderSubStatus_3a0dc407");
	}
}
