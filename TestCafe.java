import java.util.*;
public class TestCafe {

    public static void main(String[] args) {
        

        // Create Items from the Itme class 

        Item item1 = new Item();

        item1.name ="mocha";
        item1.price = 5.99;

        Item item2 = new Item();

        item2.name = "latte";
        item2.price = 12.72;

        Item item3 = new Item();
        
        item3.name = "drip coffee";
        item3.price = 9.99;

        Item item4 = new Item();
        
        item4.name = "capuccino";
        item4.price = 11.50;


        Order order1 = new Order();

        order1.name = "Cindhuri";

        Order order2 = new Order();

        order2.name = "Jimmy";


        Order order3 = new Order();

        order3.name = "Noah";

        Order order4= new Order();

        order4.name = "Sam";

        System.out.println(order1.total);

        order2.items.add(item1);
        order2.total += item1.price;
        System.out.println(order2.total);

        order3.items.add(item4);
        order2.total += item4.price;

        order4.items.add(item2);
        order4.total += item2.price;

        order1.ready = true;

        order4.items.add(item2);
        order4.total += item2.price * 2;

        order2.ready = true;

        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);


        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);


        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);

    }
    
}
