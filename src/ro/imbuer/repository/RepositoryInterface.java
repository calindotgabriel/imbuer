package ro.imbuer.repository;

import ro.imbuer.entities.Item;
import ro.imbuer.validator.ValidatorException;

import java.util.ArrayList;

/**
 * @author motan
 * @date 11/21/14
 */
public interface RepositoryInterface {

    public void store(Item i) throws ValidatorException;
    public Item find(int id);
    public void update();
    public void delete(int id);
    public ArrayList<Item> getAll();
    public int size();
}
