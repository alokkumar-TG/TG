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


class fnemptimecardholidayaddnewrowandenterpunch {

	public static void fnemptimecardholidayaddnewrowandenterpunch() {
		tg.click("ele_DayDate_3a0705a6", 1);
		if (tg.performAssert("ele_AddRow_3a0759c2", ComparisonType.IS_VISIBLE)) {
						tg.check.isVisible("ele_AddRow_3a0759c2");
						tg.click("ele_AddRow_3a0759c2", 1);
		}
		tg.performRightClick("ele_ColumnNameSpecificID_3a0759c2");
		tg.check.isVisible("ele_EditPunch_3a02d461");
		tg.check.isVisible("ele_Time_3a02d463");
		tg.click("ele_Apply_3a02d463", 1);
		tg.type("ele_Time_3a02d463", var_Process_In_Punch);
		tg.check.isVisible("ele_Apply_3a02d463");
		tg.performRightClick("ele_ColumnNameSpecificID_3a0759c2");
		tg.check.isVisible("ele_EditPunch_3a02d461");
		tg.check.isVisible("ele_Time_3a02d463");
		tg.click("ele_Apply_3a02d463", 1);
		tg.type("ele_Time_3a02d463", var_Process_Out_Punch);
		tg.check.isVisible("ele_Apply_3a02d463");
		tg.click("ele_SaveButton_3a0306c3", 1);
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
		if(tg.performAssert(var_Process_Payrule, ComparisonType.EQUAL_TO, "FTH-PT1-1731C-W-H-OT840-PR-LTFA")){
		if(tg.performAssert(var_Process_Employee_ID, ComparisonType.EQUAL_TO, 13316837)){
		tg.testFunction("fnGoToPeopleInfoAndVerifyPayRule", new Object[]{});
		}
		}
		if(tg.performAssert(var_Process_Employee_ID, ComparisonType.EQUAL_TO, 13316837)){
		tg.testFunction("fnEmpTimecardFromPeopleInfo", new Object[]{});
		}
		tg_String var_TimeFrame = "Select Range";
		tg.testFunction("fnSelectPeriodOfTimeframeTimecardSchedule", new Object[]{});
		tg.testFunction("fnDeleteExistingEntryInTimecard", new Object[]{});
		if(tg.performAssert(var_Process_In_Punch, ComparisonType.EQUAL_TO, "09:00")){
		if(tg.performAssert(var_Process_Out_Punch, ComparisonType.EQUAL_TO, "21:30")){
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