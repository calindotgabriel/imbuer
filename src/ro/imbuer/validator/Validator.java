package ro.imbuer.validator;

import ro.imbuer.entities.Item;

/**
 * @author motan
 * @date 11/25/14
 */
public interface Validator {
    public void validate(Item item) throws ValidatorException;
}
