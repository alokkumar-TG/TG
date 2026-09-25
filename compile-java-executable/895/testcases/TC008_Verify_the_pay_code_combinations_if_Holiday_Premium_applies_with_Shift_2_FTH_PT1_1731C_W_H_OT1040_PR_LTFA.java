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
public class tc008_verify_the_pay_code_combinations_if_holiday_premium_applies_with_shift_2_fth_pt1_1731c_w_h_ot1040_pr_ltfa {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc008_verify_the_pay_code_combinations_if_holiday_premium_applies_with_shift_2_fth_pt1_1731c_w_h_ot1040_pr_ltfa() {
		tg.openBrowser();
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
		if(tg.performAssert(var_Process_Payrule, ComparisonType.EQUAL_TO, "FTH-PT1-1731C-W-H-OT1040-PR-LTFA")){
		if(tg.performAssert(var_Process_Employee_ID, ComparisonType.EQUAL_TO, 13316750)){
		tg.testFunction("fnGoToPeopleInfoAndVerifyPayRule", new Object[]{});
		}
		}
		if(tg.performAssert(var_Process_Employee_ID, ComparisonType.EQUAL_TO, 13316750)){
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
		// [DISABLED] tg.wait(1);
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
		tg.close();
	}
}