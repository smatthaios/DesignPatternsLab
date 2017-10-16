package gr.regenerationcodingschool.patterns.prototype;

import java.util.HashMap;
import java.util.Map;

//Registry holds all created objects of the type
public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;

        try {
            item = (Item) (items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    private void loadItems() {
        //Add movie
        Movie movie = new Movie();
        movie.setTitle("Johnny English");
        movie.setPrice(24.99);
        movie.setRuntime("2 hours");

        Case movieCase = new Case("plastic", "green");
        movie.setItemCase(movieCase);

        items.put("Movie", movie);

        //Add book
        Book book = new Book();
        book.setNumberOfPages(335);
        book.setPrice(19.99);
        book.setTitle("Basic Book");

        Case bookCase = new Case("handcover", "grey");
        book.setItemCase(movieCase);

        items.put("Book", book);
    }
}
