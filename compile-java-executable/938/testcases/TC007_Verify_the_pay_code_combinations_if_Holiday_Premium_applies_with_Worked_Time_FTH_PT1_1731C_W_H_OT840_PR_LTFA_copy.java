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
public class tc007_verify_the_pay_code_combinations_if_holiday_premium_applies_with_worked_time_fth_pt1_1731c_w_h_ot840_pr_ltfa_copy {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc007_verify_the_pay_code_combinations_if_holiday_premium_applies_with_worked_time_fth_pt1_1731c_w_h_ot840_pr_ltfa_copy() {
		tg.openBrowser();
			if (tg.performAssert(var_Precondition_Login_UserName, ComparisonType.EQUAL_TO, "OJoshi3")) {
				if (tg.performAssert(var_Precondition_Login_PassWord, ComparisonType.EQUAL_TO, "Kronos@134")) {
			tg.testFunction("fnLogInForTstEnvNew");
				}
			}
			if (tg.performAssert(var_Process_Date_Calculation_Day, ComparisonType.EQUAL_TO, "Mon")) {
				if (tg.performAssert(var_Process_Date_Calculation_Weekly_Biweekly, ComparisonType.EQUAL_TO, "0")) {
					if (tg.performAssert(var_Process_Date_Calculation_No_of_days_to_punch, ComparisonType.EQUAL_TO, "2")) {
						if (tg.performAssert(var_Process_Date_Calculation_PunchDate, ComparisonType.EQUAL_TO, "04/03/2026")) {
			tg.testFunction("fnDateSToDoPunch");
						}
					}
				}
			}
			if (tg.performAssert(var_Process_Payrule, ComparisonType.EQUAL_TO, "FTH-PT1-1731C-W-H-OT840-PR-LTFA")) {
				if (tg.performAssert(var_Process_Employee_ID, ComparisonType.EQUAL_TO, "13316837")) {
			tg.testFunction("fnGoToPeopleInfoAndVerifyPayRule");
				}
			}
			if (tg.performAssert(var_Process_Employee_ID, ComparisonType.EQUAL_TO, "13316837")) {
							tg.testFunction("fnEmpTimecardFromPeopleInfo");
			}
			tg_String var_TimeFrame = "Select Range";
			tg.testFunction("fnSelectPeriodOfTimeframeTimecardSchedule");
			tg.testFunction("fnDeleteExistingEntryInTimecard");
			if (tg.performAssert(var_Process_In_Punch, ComparisonType.EQUAL_TO, "09:00")) {
				if (tg.performAssert(var_Process_Out_Punch, ComparisonType.EQUAL_TO, "17:00")) {
			tg.testFunction("fnEmpTimecardHolidayAddNewRowAndEnterPunch");
				}
			}
			// [DISABLED] tg.wait(1);
			tg.testFunction("fnValidationScreenshot");
			if (tg.performAssert(var_Validation_Type, ComparisonType.EQUAL_TO, "Daily")) {
							tg.testFunction("fnCaptureTotalsTab");
			}
			tg.wait(1);
				tg_String var_Wages = "NA";
				if (tg.performAssert(var_Validation_Type, ComparisonType.EQUAL_TO, "Daily")) {
				tg.testFunction("fnVerifyingPaycodeAmountWages");
				}
			tg.testFunction("fnLogOut");
	}
}
