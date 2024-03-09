package gradleproject1;

public class MenuItem {

    private String item_name;
    private double price;
    private String id;

    public MenuItem(String name, double pri, String id) {
        this.item_name = name;
        this.id = id;
        this.price = pri;
    }

    public void setName(String name) {
        this.item_name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return this.item_name;
    }

    public String getId(){
    return this.id;
    }
    
    public double getPrice(){
    return this.price;
    }
}
