import java.util.*;
public class TestCafe {

    public static void main(String[] args) {

        OrderKiosk dojoKiosk = new OrderKiosk();

        dojoKiosk.addMenuItem("Coffee", 2.50);
        dojoKiosk.addMenuItem("Cappuccino", 9.95);
        dojoKiosk.addMenuItem("Latte", 6.95);
        dojoKiosk.addMenuItem("Espresso", 5.95);

        dojoKiosk.newOrder();
        

        // Create Items from the Item class 

        // Item item1 = new Item("Cappuccino", 9.95);
        // Item item2 = new Item("latte", 8.25);
        // Item item3 = new Item("mocha", 7.50);
        // Item item4 = new Item("black coffee", 5.00);


        // // Create 2 orders for guests with out a name

        // Order order1 = new Order();
        // Order order2 = new Order();

        // // Create 3 orders using the overloaded constuctor to give names for each order 
        // Order order3 = new Order("Billy");
        // Order order4 = new Order("Dana");
        // Order order5 = new Order("Tommy");


        // // Add items to each of the orders

        // order1.addItem(item1);
        // order2.addItem(item4);

        // System.out.println(order1.getStatusMessage());

        // order2.addItem(item3);
        // order4.addItem(item4);
        // order5.addItem(item1);
        // order3.addItem(item2);
        // order4.addItem(item2);
        // order2.addItem(item1);
        
        // order1.setReady(true);
        // order3.setReady(true);
        // order5.setReady(true);

        // order2.display();
        // order4.display();
        // order5.display();
    

        // System.out.println(order3.getStatusMessage());
        // System.out.println(order5.getStatusMessage());
        // System.out.println(order1.getStatusMessage());

        // order1.display();

        // System.out.println(order2.getOrderTotal());






    

        
        

        
    


        // Order order1 = new Order();

        // order1.name = "Cindhuri";

        // Order order2 = new Order();

        // order2.name = "Jimmy";


        // Order order3 = new Order();

        // order3.name = "Noah";

        // Order order4= new Order();

        // order4.name = "Sam";

        // System.out.println(order1.total);

        // order2.items.add(item1);
        // order2.total += item1.price;
        // System.out.println(order2.total);

        // order3.items.add(item4);
        // order2.total += item4.price;

        // order4.items.add(item2);
        // order4.total += item2.price;

        // order1.ready = true;

        // order4.items.add(item2);
        // order4.total += item2.price * 2;

        // order2.ready = true;

        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);


        // System.out.printf("Name: %s\n", order2.name);
        // System.out.printf("Total: %s\n", order2.total);
        // System.out.printf("Ready: %s\n", order2.ready);


        // System.out.printf("Name: %s\n", order3.name);
        // System.out.printf("Total: %s\n", order3.total);
        // System.out.printf("Ready: %s\n", order3.ready);

        // System.out.printf("Name: %s\n", order4.name);
        // System.out.printf("Total: %s\n", order4.total);
        // System.out.printf("Ready: %s\n", order4.ready);

    }
    
}
