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


class fnesgin_copy2 {

	public static Object fnesgin(String var_Url, String var_Primary_Contact_Email_Address) {
		tg_String var_TGReturn = "";
			tg.navigateToUrl(var_Url);
			tg.wait(10);
			tg.click("ele_EmailAddress_3a0aca39", 1);
			tg.type("ele_EmailAddress_3a0aca39", "Email Address");
			tg.click("ele_Authenticate_3a0aca39", 1);
			tg.wait(10);
			tg.check.isVisible("ele_6447b27456935b7a89a7654d_3a0aca48");
			tg.click("ele_ViewServiceAgreement_3a0aca48", 1);
			tg.wait(10);
			tg.type("ele_IHaveReviewedAndAgreeToTheTMobileElectronicRecordsAndSignatureDisclosuresAndFinancialPrivacyPolicyRequired_3a0aca58", "True");
			tg.click("ele_Continue_3a0aca58", 1);
			tg.click("ele_SignRequiredSignHere_3a0aca58", 1);
			tg.wait(10);
			tg.click("ele_AdoptAndSign_3a0aca5c", 1);
			tg.wait(10);
			tg.click("ele_Finish_3a0aca5f", 1);
			tg.wait(15);
			if (tg.performAssert("ele_Submit_3a0aca61", ComparisonType.IS_VISIBLE)) {
								tg.check.isVisible("ele_Submit_3a0aca61");
								// [DISABLED] // Tosca: Caption | IoT Order Portal* | (ActionMode 37)
								// [DISABLED] // Tosca: Keys | ^(+(r)) | (ActionMode 37)
			}
			tg.wait(5);
			if (tg.performAssert("ele_Submit_3a0aca61", ComparisonType.IS_VISIBLE)) {
								tg.check.isVisible("ele_Submit_3a0aca61");
								// [DISABLED] // Tosca: Caption | IoT Order Portal* | (ActionMode 37)
								// [DISABLED] // Tosca: Keys | ^(+(r)) | (ActionMode 37)
			}
			tg.wait(5);
			tg.click("ele_Submit_3a0aca61", 1);
			tg.click("ele_Yes_3a0aca62", 1);
			tg.wait(10);
			tg.check.isVisible("ele_DIV_3a0aca67");
			tg.click("ele_Close_3a0aca67", 1);
		return var_TGReturn;
	}
}
