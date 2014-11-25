package ro.imbuer.entities;

/**
 * @author motan
 * @date 11/21/14
 */
public class Hobby implements Item {

    private int id;
    private String title;

    public Hobby(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
