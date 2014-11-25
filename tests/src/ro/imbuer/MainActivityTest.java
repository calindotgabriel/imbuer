package ro.imbuer;

import android.test.ActivityUnitTestCase;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class ro.imbuer.MainActivityTest \
 * ro.imbuer.tests/android.test.InstrumentationTestRunner
 */
public class MainActivityTest extends ActivityUnitTestCase<MainActivity> {

    public MainActivityTest() {
        super(MainActivity.class);
    }

    public void testSomething() {
        assertEquals(1, 2);
    }

}
