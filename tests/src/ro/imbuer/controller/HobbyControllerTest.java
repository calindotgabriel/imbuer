package ro.imbuer.controller;

import android.test.suitebuilder.annotation.MediumTest;
import junit.framework.TestCase;
import ro.imbuer.repository.InMemoryRepository;
import ro.imbuer.entities.Hobby;
import ro.imbuer.validator.HobbyValidator;
import ro.imbuer.validator.ValidatorException;

/**
 * @author motan
 * @date 11/23/14
 */
public class HobbyControllerTest extends TestCase {


    @MediumTest
    public void testAddHobby(int id, String title)  {
        HobbyValidator __val = new HobbyValidator();
        InMemoryRepository __rep = new InMemoryRepository(new HobbyValidator());

        Hobby hobby = new Hobby(id, title);

        try {
            __val.validate(hobby);
            __rep.store(hobby);
        }
        catch (ValidatorException e){
            e.printStackTrace();
        }

    }
}
