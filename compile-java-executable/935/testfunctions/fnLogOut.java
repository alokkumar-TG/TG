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


class fnlogout {

	public static void fnlogout() {
		if (tg.performAssert("ele_Yes_3a0705a6", ComparisonType.IS_VISIBLE)) {
						tg.swipe("ele_MainMenuOption_3a03871b", Direction.UP);
						tg.check.isVisible("ele_MainMenuOption_3a03871b");
						tg.click("ele_SignOut_3a02637f", 1);
						if (tg.performAssert("ele_Yes_3a0705a6", ComparisonType.IS_VISIBLE)) {
											tg.check.isVisible("ele_Yes_3a0705a6");
											tg.click("ele_Yes_3a0705a6", 1);
											// [DISABLED] tg.type("ele_Label_39e706aa", "Leave Site?");
											// [DISABLED] tg.type("ele_Button_39e706aa", "Leave");
						} else {
											tg.pressKey(ESCAPE, 1);
						}
						tg.wait(2);
		} else {
						if (tg.performAssert("ele_SignOut_3a02637f", ComparisonType.IS_VISIBLE)) {
											tg.check.isVisible("ele_SignOut_3a02637f");
											tg.click("ele_SignOut_3a02637f", 1);
											if (tg.performAssert("ele_Yes_3a0705a6", ComparisonType.IS_VISIBLE)) {
																	tg.check.isVisible("ele_Yes_3a0705a6");
																	tg.click("ele_Yes_3a0705a6", 1);
																	// [DISABLED] tg.type("ele_Label_39e706aa", "Leave Site?");
																	// [DISABLED] tg.type("ele_Button_39e706aa", "Leave");
											} else {
																	tg.pressKey(ESCAPE, 1);
											}
											tg.wait(2);
						} else {
												tg.wait(1);
												// [DISABLED] tg.pressKey(ENTER, 1);
						}
		}
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