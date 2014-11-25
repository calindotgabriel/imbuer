package ro.imbuer.validator;

import ro.imbuer.entities.Item;

/**
 * @author motan
 * @date 11/22/14
 */


public class HobbyValidator implements Validator {

    public void validate(Item hobby) throws ValidatorException {
        if (hobby.getId() < 0)
            throw new ValidatorException("Wrong Id.");
        if (hobby.getTitle().equals(""))
            throw new ValidatorException("Empty title.");
    }
}
