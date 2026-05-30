package com.tnsif.fooddeliverysystem;

class FoodItem {

	   final String restaurantName = "FoodHub";

	   String itemName;
	   double price;

	   FoodItem(String itemName, double price) {
	       this.itemName = itemName;
	       this.price = price;
	   }

	   void display() {
	       System.out.println(itemName + " " + price + " " + restaurantName);
	   }
	}

	class Pizza extends FoodItem {

	   Pizza(String itemName, double price) {
	       super(itemName, price);
	   }
	}

	class Burger extends FoodItem {

	   Burger(String itemName, double price) {
	       super(itemName, price);
	   }
	}

	public class Main{
	   public static void main(String[] args) {

	       Pizza p = new Pizza("Veg Pizza", 299);
	       Burger b = new Burger("Cheese Burger", 199);

	       p.display();
	       b.display();
	   }
 }
