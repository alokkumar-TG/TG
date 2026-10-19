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


class fnlogintmobileusastagingsignin {

	public static Object fnlogintmobileusastagingsignin(String var_Url, String var_Regression_Username, String var_Regression_Password) {
		tg_String var_TGReturn = "";
			// [DISABLED] tg.testFunction("fnCloseAllBrowser");
			tg.navigateToUrl(var_Url);
			tg.wait(30);
			if (tg.performAssert("ele_TMobileUSAStagingLogoLogo_3a0942ed", ComparisonType.IS_VISIBLE)) {
								tg.pressKey(F5, 1);
								tg.check.isVisible("ele_TMobileUSAStagingLogoLogo_3a0942ed");
								tg.check.isVisible("ele_ProvideYourNTIDADIDOrGCMetroID_39fc8c5b");
									tg.click("ele_Next_39fc8c5b", 1);
									tg.type("ele_ProvideYourNTIDADIDOrGCMetroID_39fc8c5b", var_Regression_Username);
									tg.wait(5);
									// [DISABLED] tg.type("ele_ProvideYourPassword_39fd4a3f", var_Regression_Password);
									// [DISABLED] tg.click("ele_Verify_39fc8c5c", 1);
									// [DISABLED] tg.wait(60);
			} else {
										// [DISABLED] tg.click("ele_Next_39fc8c5b", 1);
										// [DISABLED] tg.type("ele_ProvideYourNTIDADIDOrGCMetroID_39fc8c5b", var_Regression_Username);
										// [DISABLED] tg.click("ele_SignInUsingTestAccountCredentials_3a092965", 1);
										// [DISABLED] tg.type("ele_SignInUsingTestAccountCredentials_3a092965", "pcadminuser");
										// [DISABLED] tg.click("ele_Next_3a092965", 1);
										// [DISABLED] tg.wait(5);
										// [DISABLED] tg.type("ele_ProvideYourPassword_39fd4a3f", var_Regression_Password);
										// [DISABLED] tg.click("ele_Verify_39fc8c5c", 1);
										// [DISABLED] tg.wait(60);
										// [DISABLED] tg.type("ele_EnterPassword_3a092967", "21489a0b-c163-4a62-b61e-501090c9506aMgAxADQAOAA5AGEAMABiAC0AYwAxADYAMwAtADQAYQA2ADIALQBiADYAMQBlAC0ANQAwADEAMAA5ADAAYwA5ADUAMAA2AGEArZB6qAXz6NVKvd0W/Od7c5+rmIgbEqe5GUzxiWLqVCE=");
										// [DISABLED] tg.click("ele_Verify_3a092967", 1);
			}
			if (tg.performAssert("ele_ProvideYourPassword_39fd4a3f", ComparisonType.IS_VISIBLE)) {
								tg.check.isVisible("ele_ProvideYourPassword_39fd4a3f");
								tg.type("ele_ProvideYourPassword_39fd4a3f", var_Regression_Password);
								tg.click("ele_Verify_39fc8c5c", 1);
			}
			// [DISABLED] if (/* Tosca: If_Maximize window */) {
				// [DISABLED] // Tosca: Caption | Sign in* | (ActionMode 69)
				// [DISABLED] // Tosca: Caption | Sign in* | (ActionMode 37)
				// [DISABLED] // Tosca: Operation | Maximize | (ActionMode 37)
			// [DISABLED] }
			if (tg.performAssert("ele_SVCQATIOTAutoTestTMobileCom_3a0ec4d9", ComparisonType.IS_VISIBLE)) {
								tg.check.isVisible("ele_SVCQATIOTAutoTestTMobileCom_3a0ec4d9");
								tg.click("ele_SVCQATIOTAutoTestTMobileCom_3a0ec4d9", 1);
								tg.wait(10);
			}
			if (tg.performAssert("ele_SvcPrdPrdiotautoteTMobileCom_3a0f2316", ComparisonType.IS_VISIBLE)) {
								tg.check.isVisible("ele_SvcPrdPrdiotautoteTMobileCom_3a0f2316");
								tg.click("ele_Button_3a0f2316", 1);
			}
			if (tg.performAssert("ele_UseAnotherAccount_3a0ec222", ComparisonType.IS_VISIBLE)) {
								tg.check.isVisible("ele_UseAnotherAccount_3a0ec222");
								tg.click("ele_UseAnotherAccount_3a0ec222", 1);
								tg.wait(8);
								tg.click("ele_SomeoneExampleCom_3a0ec224", 1);
								tg.type("ele_SomeoneExampleCom_3a0ec224", "svc_qat_iotautotest@t-mobile.com");
								tg.click("ele_Next_3a0ec224", 1);
								tg.wait(10);
			}
			if (tg.performAssert("ele_SomeoneExampleCom_3a0ec224", ComparisonType.IS_VISIBLE)) {
								tg.check.isVisible("ele_SomeoneExampleCom_3a0ec224");
								tg.click("ele_SomeoneExampleCom_3a0ec224", 1);
								tg.type("ele_SomeoneExampleCom_3a0ec224", "svc_qat_iotautotest@t-mobile.com");
								tg.click("ele_Next_3a0ec224", 1);
								tg.wait(10);
			}
			if (tg.performAssert("ele_Password_3a0ec226", ComparisonType.IS_VISIBLE)) {
								tg.check.isVisible("ele_Password_3a0ec226");
								tg.click("ele_Password1_3a0ec22b", 1);
								tg.type("ele_Password_3a0ec226", "!l{09mRQ1,FYr(B3AjzZsm!XCnhpYp");
								tg.click("ele_SignIn_3a0ec226", 1);
			}
			tg.wait(20);
		if (tg.performAssert("ele_SVCQATIOTAutoTestTMobileCom_3a0ec4d9", ComparisonType.IS_VISIBLE)) {
						tg.check.isVisible("ele_SVCQATIOTAutoTestTMobileCom_3a0ec4d9");
						tg.click("ele_SVCQATIOTAutoTestTMobileCom_3a0ec4d9", 1);
						tg.wait(15);
		}
		tg.wait(30);
		return var_TGReturn;
	}
}
