package ro.imbuer.domain;

import android.test.ActivityUnitTestCase;
import ro.imbuer.ui.MainActivity;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class ro.imbuer.domain.MainActivityTest \
 * ro.hobby.tests/android.test.InstrumentationTestRunner
 */
public class MainActivityTest extends ActivityUnitTestCase<MainActivity> {

    public MainActivityTest() {
        super(MainActivity.class);

    }


}
