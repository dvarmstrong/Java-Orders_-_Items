import java.util.*;
public class Order {

        private String name;
        private boolean ready;
        private ArrayList<Item> items = new ArrayList<Item>();

        //Constructor with no arguments sets name to "Guest" initializes items as an empty list 

        public Order() {
                this.name = "Guest";
                this.ready = false;
        }

        // OVERLOADED CONSTRUCTOR
        // Takes a name as an argument, sets name to this custom name.
        // Initializes items as an empty list. Why didn't we intialize an empty list 
        public Order(String name) {
                this.name = name;
                this.ready = false;
        }

        //Getters and Setters 

        public String getName(){
                return this.name;
        }

        public boolean getReady() {
                return this.ready;
        }

        public ArrayList<Item> getItems(){
                return items;
        }

        public void setName(String name){
                this.name = name ; 

        }

        public void setReady(boolean ready){
                this.ready = ready; 
        }

        public void setItems(ArrayList<Item> items){
                this.items = items;
        }

        public void addItem(Item item){
                this.items.add(item);
        }

        public String getStatusMessage(){
                if(this.ready == true) {
                        return "Your order is ready .";
                }else {
                        return "Your order will be ready soon .";
                }
        }

        public double getOrderTotal(){
                double total = 0.0;
                for(Item i: this.items) {
                total += i.getPrice();
                }
                return total;
        }

        public void display(){
                System.out.printf("Customer Name: %s", this.name);
                for(Item i: this.items) {
                        System.out.println(i.getName() + " - $" + i.getPrice());
                }
                System.out.println("Total: $" + this.getOrderTotal());
        }

}






