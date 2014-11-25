package ro.imbuer.utils;

import junit.framework.TestCase;
import ro.imbuer.utils.Util;

/**
 * @author motan
 * @date 11/25/14
 */
public class TestUtil extends TestCase {

    public void testUtil() {
        assertEquals(Util.getFirstLetter("Andrei"), "A");
        assertEquals(Util.getFirstLetter("Georgel"), "G");
        assertEquals(Util.getFirstLetter("georgel"), "G");


    }
}
