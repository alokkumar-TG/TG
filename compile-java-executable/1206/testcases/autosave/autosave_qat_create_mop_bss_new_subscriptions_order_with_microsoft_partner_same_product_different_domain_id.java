import java.sql.Connection;;
import java.sql.DriverManager;;
import java.sql.ResultSet;;
import java.sql.SQLException;;
import java.sql.Statement;;
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
public class qat_create_mop_bss_new_subscriptions_order_with_microsoft_partner_same_product_different_domain_id {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void qat_create_mop_bss_new_subscriptions_order_with_microsoft_partner_same_product_different_domain_id() {
		tg.openBrowser();
		tg_String var_fnGenerateOAuthAccessTokenV1response = "";
		var_fnGenerateOAuthAccessTokenV1response = (String) tg.testFunction("fnGenerateOAuthAccessTokenV1_copy3", new Object[]{var_Regression_Get_Product});
		tg_String var_fnGetAccountDetailsresponse = "";
		var_fnGetAccountDetailsresponse = (String) tg.testFunction("fnGetAccountDetails_copy2", new Object[]{var_Regression_Get_Product, var_Account_Id, var_Effective_Date});
		tg_String var_Qat_Create_Mop_Bss_New_Subscriptions_Order_With_Microsoft_Partner_Same_Product_Different_Domain_Id_Response = "";
				tg.readFromAPI("qat_create_mop_bss_new_subscriptions_order_with_microsoft_partner_same_product_different_domain_id.json", var_Qat_Create_Mop_Bss_New_Subscriptions_Order_With_Microsoft_Partner_Same_Product_Different_Domain_Id_Response);
		START_CUSTOM_SCRIPT;
		JSONObject responseJson = new JSONObject(var_Qat_Create_Mop_Bss_New_Subscriptions_Order_With_Microsoft_Partner_Same_Product_Different_Domain_Id_Response);
		var_Order_Id = responseJson.getString("orderId");
		END_CUSTOM_SCRIPT;
		tg.close();
	}
}