package gradleproject1;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String id;
    private String resturant_id;
    private List<MenuItem> items;

    public Menu(String menu_id, Restaurant res) {
        this.id = menu_id;
        this.resturant_id = res.getID();
        this.items = new ArrayList<>();
    }

    public void setId(String ID) {
        this.id = ID;
    }

    public void setResturnsId(String res_id) {
        this.resturant_id = res_id;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }


}
