import java.lang.StringBuilder;
import java.lang.StringBuffer;
import java.util.StringJoiner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.text.StringCharacterIterator;
import java.text.CharacterIterator;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Formatter;
import java.text.BreakIterator;
import java.text.Normalizer;
import java.text.MessageFormat;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.String;
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
public class tcaccessandusetheringsizeguidefromproductdetailpage {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tcaccessandusetheringsizeguidefromproductdetailpage() {
		tg.openBrowser();
		tg.wait(1);
		tg.wait("ele_rc9l6neapp251ff", ComparisonType.IS_INVISIBLE);
		tg.wait("ele_emailaddre050", ComparisonType.IS_INVISIBLE);
		tg.close();
	}
}