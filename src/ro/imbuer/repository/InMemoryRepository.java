package ro.imbuer.repository;

import ro.imbuer.entities.Item;
import ro.imbuer.validator.Validator;
import ro.imbuer.validator.ValidatorException;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author motan
 * @date 11/21/14
 */
public class InMemoryRepository implements RepositoryInterface{

    private HashMap<Integer, Item> __items;
    private Validator __val;

    public InMemoryRepository(Validator val) {
        __items = new HashMap();
        __val = val;
    }

    @Override
    public void store(Item i) throws ValidatorException{
        __val.validate(i);
        __items.put(i.getId(), i);
    }

    @Override
    public Item find(int id) {
        return __items.get(id);
    }

    @Override
    public void update() {

    }

    @Override
    public void delete(int id) {
        __items.remove(id);
    }


    @Override
    public ArrayList<Item> getAll() {
        return new ArrayList<Item>(__items.values());
    }

    @Override
    public int size() {
        return __items.size();
    }
}
