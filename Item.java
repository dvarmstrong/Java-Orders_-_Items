import java.util.*;
public class Item {


        private String name;
        private double price;

        public Item(){}

        // Add a constructor to take a String Name, and double price as arguments
        public Item (String name, double price ) {
                this.name = name;
                this.price = price;
        }

        public String getName(){
                return this.name;
        }

        public double getPrice(){
                return this.price;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void setPrice(double price) {
                this.price = price;
        }





}
