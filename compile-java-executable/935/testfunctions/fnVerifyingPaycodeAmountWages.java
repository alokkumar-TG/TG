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


class fnverifyingpaycodeamountwages {

	public static void fnverifyingpaycodeamountwages() {
		// [DISABLED] tg.testFunction("fnValidationScreenshot");
		var_Tab_Name = "Totals";
		tg.testFunction("fnSelectAddOnTabOnTimecard");
		if (tg.performAssert("ele_SpanByDDToggleBtn_3a031a40", ComparisonType.IS_VISIBLE)) {
						tg.check.isVisible("ele_SpanByDDToggleBtn_3a031a40");
						tg.click("ele_SpanByDDToggleBtn_3a031a40", 1);
						tg.check.isVisible("ele_Daily_3a031a40");
						tg.click("ele_Daily_3a031a40", 1);
		}
		if (tg.performAssert("ele_SpanByDDToggleBtn_3a031a40", ComparisonType.IS_VISIBLE)) {
						tg.check.isVisible("ele_SpanByDDToggleBtn_3a031a40");
						tg.click("ele_SpanByDDToggleBtn_3a031a40", 1);
						tg.check.isVisible("ele_All_3a1fa027");
		}
		tg.check.isVisible("ele_ExpandAddOns_3a0888f5");
		tg.check.isVisible("ele_FilterButton_3a073007");
		tg.click("ele_ShowFiltersRow_3a073007", 1);
		tg.click("ele_FilterButton_3a073007", 1);
		tg.click("ele_ExpandAddOns_3a0888f5", 1);
		tg.check.isVisible("ele_FilterButton_3a073007");
		tg.click("ele_FilterButton_3a073007", 1);
			tg.type("ele_SELECT_3a031621", "=");
			tg.type("ele_INPUT_3a030b49", var_Paycode);
			tg.check.isVisible("ele_PayCodeHeader_3a03161f");
			tg.check.isVisible("ele_Paycode_3a03ba2a");
			tg.testFunction("fnValidationScreenshot");
			tg.check.isVisible("ele_ExpandAddOns_3a0888f5");
			tg.click("ele_ExpandAddOns_3a0888f5", 1);
		var_Tab_Name = "Totals";
		tg.testFunction("fnSelectAddOnTabOnTimecard");
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