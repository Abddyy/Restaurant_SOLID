package gradleproject1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private Custmor custmor;
    private List<MenuItem> items;
    private String id;
    private LocalDate date_created;
    public boolean is_deliverd = false;

    public Order(Custmor custmor, String id) {
        this.custmor = custmor;
        this.id = id;
        date_created = LocalDate.now();
        this.items = new ArrayList<>();

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public List<MenuItem> getOrder() {
        return new ArrayList<>(items);
    }

    public void addItem(MenuItem Item) {
        items.add(Item);
    }

    private int Search(MenuItem target) {

        for (int i = 0; i < items.size(); i++) {
            if (target == items.get(i)) {
                return i;
            }
        }
        return -1;
    }

    public void deleteItem(MenuItem target) {
        if (Search(target) != -1) {
            items.remove(Search(target));
        }
        System.out.println("Item " + target + " has removed from your order.");
    }

    public double getTotalPrice() {
        double sum = 0.0;
        for (int i = 0; i < items.size(); i++) {
            sum += items.get(i).getPrice();
        }
        return sum;
    }

}
