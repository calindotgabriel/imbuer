package ro.imbuer.controller;

import ro.imbuer.entities.Hobby;
import ro.imbuer.repository.InMemoryRepository;
import ro.imbuer.validator.HobbyValidator;
import ro.imbuer.validator.ValidatorException;

/**
 * @author motan
 * @date 11/22/14
 */
public class HobbyController {

    private HobbyValidator __val;
    private InMemoryRepository __rep;

    public HobbyController(HobbyValidator val, InMemoryRepository rep) {
        this.__val = val;
        this.__rep = rep;
    }

    public void add(Hobby hobby) throws ValidatorException{
        __val.validate(hobby);
        __rep.store(hobby);
    }
}
