import java.util.*;


public class OrderKiosk {

    private ArrayList<Item> menu = new ArrayList<Item>();
    private ArrayList<Order> orders = new ArrayList<Order>();

    

    public OrderKiosk(){
    
        
    }


    public void addMenuItem(String name, double price){
        Item item = new Item(name, price);
        menu.add(item);
        int index = menu.indexOf(item);
        item.setIndex(index);
    }

    public void displayMenu(){
        for(int i = 0; i < menu.size(); i++){
            System.out.println(menu.get(i).getName() + " " + menu.get(i).getPrice());
        }
    }


    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        // Show the user the menu, so they can choose items to add.
        
        
            System.out.println("Hi  " + name + "  ! Please choose an item to add to your order.");
            Order newOrder = new Order(name);
            displayMenu();
        
        
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            
            // Get the item object from the menu, and add the item to the order

            int i = Integer.parseInt(itemNumber);
            if(i >= 0 && i < menu.size()) {
                Item orderItem = menu.get(i);
                newOrder.addItem(orderItem);
            } else {
                System.out.println("Invalid item number. Please try again.");
            }
            // Ask them to enter a new item index or q again, and take their input
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
        newOrder.display();
        this.orders.add(newOrder);
        
    }



}