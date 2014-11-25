package ro.imbuer.repository;

import android.test.suitebuilder.annotation.MediumTest;
import junit.framework.TestCase;
import ro.imbuer.entities.Hobby;
import ro.imbuer.validator.HobbyValidator;
import ro.imbuer.validator.ValidatorException;

/**
 * @author motan
 * @date 11/22/14
 */
public class InMemoryRepositoryTest extends TestCase {

    @MediumTest
    public void testStore(){
        InMemoryRepository hobbyRep = new InMemoryRepository(new HobbyValidator() {
        });
        assertEquals(hobbyRep.size(), 0);


        try {
            hobbyRep.store(new Hobby(1, "Running"));
            assertEquals(hobbyRep.size(), 1);

            // storing item with same id just updates the item.
            hobbyRep.store(new Hobby(1, "Programming"));
            assertEquals(hobbyRep.size(), 1);
            assertTrue(true);

            hobbyRep.store(new Hobby(2, "Winning"));
            assertEquals(hobbyRep.size(), 2);
            hobbyRep.delete(2);
            assertEquals(hobbyRep.size(), 1);
        }
        catch (ValidatorException e) {
            assertTrue(false);
            e.printStackTrace();
        }


        try {
            hobbyRep.store(new Hobby(-1, "lel"));
            assertTrue(false);
        }
        catch (ValidatorException e) {
            assertTrue(true);
        }



    }

}
