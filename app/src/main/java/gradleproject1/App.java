package gradleproject1;

import java.util.List;

public class App {

    public static void main(String[] args) {

        Restaurant res = new Restaurant("shawarman", "123456", "Nablus");

        //create two users of each type
        Custmor user_custmor = new Custmor("5566", "Abdallah", "Yahya", "Jenin");
        DeliveryMan user_delivery_man = new DeliveryMan("7788", "Ahmad", "Mohssen", "Nablus");

        //create Menu and Menu Items for the Restaurant
        Menu restaurant_menu = new Menu("1", res);
        MenuItem item1 = new MenuItem("Shawarma Super", 30, "1");
        MenuItem item2 = new MenuItem("Arbic Shawarma", 20.5, "2");
        MenuItem item3 = new MenuItem("Falafel", 5.5, "3");
        restaurant_menu.addItem(item1);
        restaurant_menu.addItem(item2);
        restaurant_menu.addItem(item3);

        //let User make an order
        Order the_first_order = new Order(user_custmor, "0001");
        the_first_order.addItem(item2);
        the_first_order.addItem(item2);
        the_first_order.addItem(item1);
        the_first_order.deleteItem(item2);
        the_first_order.addItem(item3);

        user_delivery_man.deliver(the_first_order);

        user_custmor.addPereferances(item2);
        user_custmor.addPereferances(item3);

        List<MenuItem> the_order = the_first_order.getOrder();
        List<MenuItem> preferences = user_custmor.getPereferances();

        System.out.println("The total price of the order number ("
                + the_first_order.getId() + ") is : ("
                + the_first_order.getTotalPrice()
                + "$) which contains : ");
        
        for (MenuItem item : the_order) {
            System.out.println(item.getName() + " - Price: " + item.getPrice());
        }

        System.out.println("\nand the status of the order is "
                + the_first_order.is_deliverd + " and a custmor named : "
                + user_custmor.getFname() + " " + user_custmor.getLname()
                + "\nand he added a Pereferances : ");
        for (MenuItem item : preferences) {
            System.out.println(item.getName() + " - Price: " + item.getPrice());
        }

    }
}
