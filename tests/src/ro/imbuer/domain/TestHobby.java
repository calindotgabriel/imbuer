package ro.imbuer.domain;

import android.test.suitebuilder.annotation.MediumTest;
import junit.framework.TestCase;
import ro.imbuer.entities.Hobby;

/**
 * @author motan
 * @date 11/22/14
 */
public class TestHobby extends TestCase {

    @MediumTest
    public void testCreate(){
        Hobby hobby = new Hobby(1, "Running");
        assertTrue(hobby.getId() == 1);
        assertTrue(hobby.getTitle().equals("Running"));
    }
}
