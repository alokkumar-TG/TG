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

class fnloginfortstenvnew {

	public static void fnloginfortstenvnew() {
		tg.wait(1);
		tg.navigateToUrl("https://tmobileusainc-tst.npr.mykronos.com/");
		tg.wait(5);
		tg.check.isVisible("ele_UsernameOrEmail_3a1d367c");
		tg.check.isVisible("ele_UsernameOrEmail_3a1d367c");
		tg.check.isVisible("ele_UsernameOrEmail_3a1d367c");
		tg.check.isVisible("ele_UsernameOrEmail_3a1d367c");
		tg.type("ele_UsernameOrEmail_3a1d367c", var_Precondition_Login_UserName);
		tg.check.isVisible("ele_Password_3a1d367c");
		tg.type("ele_Password_3a1d367c", var_Precondition_Login_PassWord);
		tg.wait(2);
		tg.check.isVisible("ele_SignIn_3a1d367c");
		tg.click("ele_SignIn_3a1d367c", 1);
		if(tg.performAssert("ele_YourOrganizationUsesMultifactorAuthenticationAndYouMustEnterAAccessCodeSelectTheMethodToReceiveThisPassword_3a138a63", ComparisonType.IS_VISIBLE)){
		tg.wait(3);
		// [DISABLED] tg.check.isVisible("ele_YourOrganizationUsesMultifactorAuthenticationAndYouMustEnterAAccessCodeSelectTheMethodToReceiveThisPassword_3a138a63");
		tg.check.isVisible("ele_TroubleScanning_3a1f3eda");
		// [DISABLED] tg.type("ele_Dropdown_3a138b1e", "Token");
		// [DISABLED] tg.check.isVisible("ele_SignIn_3a138b1e");
		// [DISABLED] tg.click("ele_SignIn_3a138b1e", 1);
		tg.wait(3);
		// [DISABLED] tg.check.isVisible("ele_TryAgain_3a138a68");
		// [DISABLED] tg.click("ele_TryAgain_3a138a68", 1);
		tg.check.isVisible("ele_TroubleScanning_3a1f3eda");
		tg.type("ele_SecretKey_3a0f7987", var_Precondition_Login_Secret_Key);
		// [DISABLED] tg.type("ele_VerificationCode_3a138a66", "TOTPValue");
		// [DISABLED] tg.click("ele_Submit_3a138a66", 1);
		tg.type("ele_EnterYourOneTimeCode_3a1f3ed6", "TOTPValue");
		tg.click("ele_Continue_3a1f3ed6", 1);
		}
		tg.wait(3);
		tg.check.isVisible("ele_MainMenuOption_3a03871b");
		tg.testFunction("fnValidationScreenshot", new Object[]{});
		if(tg.performAssert(var_Precondition_Login_UserName, ComparisonType.EQUAL_TO, "OJoshi3")){
		if(tg.performAssert(var_Precondition_Login_PassWord, ComparisonType.EQUAL_TO, "Kronos@134")){
		tg.testFunction("fnLogInForTstEnvNew", new Object[]{});
		}
		}
		if(tg.performAssert(var_Process_Date_Calculation_Day, ComparisonType.EQUAL_TO, "Mon")){
		if(tg.performAssert(var_Process_Date_Calculation_Weekly_Biweekly, ComparisonType.EQUAL_TO, 0)){
		if(tg.performAssert(var_Process_Date_Calculation_No_of_days_to_punch, ComparisonType.EQUAL_TO, 2)){
		if(tg.performAssert(var_Process_Date_Calculation_PunchDate, ComparisonType.EQUAL_TO, "04/03/2026")){
		tg.testFunction("fnDateSToDoPunch", new Object[]{});
		}
		}
		}
		}
		if(tg.performAssert(var_Process_Payrule, ComparisonType.EQUAL_TO, "FTH-PT1-1731C-W-H-OT840-PR")){
		if(tg.performAssert(var_Process_Employee_ID, ComparisonType.EQUAL_TO, 13040026)){
		tg.testFunction("fnGoToPeopleInfoAndVerifyPayRule", new Object[]{});
		}
		}
		if(tg.performAssert(var_Process_Employee_ID, ComparisonType.EQUAL_TO, 13040026)){
		tg.testFunction("fnEmpTimecardFromPeopleInfo", new Object[]{});
		}
		tg_String var_TimeFrame = "Select Range";
		tg.testFunction("fnSelectPeriodOfTimeframeTimecardSchedule", new Object[]{});
		tg.testFunction("fnDeleteExistingEntryInTimecard", new Object[]{});
		if(tg.performAssert(var_Process_In_Punch, ComparisonType.EQUAL_TO, "06:00")){
		if(tg.performAssert(var_Process_Out_Punch, ComparisonType.EQUAL_TO, "12:00")){
		tg.testFunction("fnEmpTimecardHolidayAddNewRowAndEnterPunch", new Object[]{});
		}
		}
		tg.testFunction("fnValidationScreenshot", new Object[]{});
		if(tg.performAssert(var_Validation_Type, ComparisonType.EQUAL_TO, "Daily")){
		tg.testFunction("fnCaptureTotalsTab", new Object[]{});
		}
		tg.wait(1);
		tg_String var_Wages = "NA";
		if(tg.performAssert(var_Validation_Type, ComparisonType.EQUAL_TO, "Daily")){
		tg.testFunction("fnVerifyingPaycodeAmountWages", new Object[]{});
		}
		tg.testFunction("fnLogOut", new Object[]{});
	}
}