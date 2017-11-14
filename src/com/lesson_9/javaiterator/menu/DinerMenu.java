package com.lesson_9.javaiterator.menu;

import com.lesson_9.javaiterator.MenuItem;

import java.util.Arrays;
import java.util.Iterator;

public class DinerMenu extends Menu {
	private static final int MAX_ITEMS = 6;
	private int numberOfItems = 0;
	private MenuItem[] menuItems = new MenuItem[MAX_ITEMS];
  
	public DinerMenu(String name) {
	    super(name);
 
		addItem("Vegetarian BLT",
			"(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("BLT",
			"Bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("Soup of the day",
			"Soup of the day, with a side of potato salad", false, 3.29);
		addItem("Hotdog",
			"A hot dog, with saurkraut, relish, onions, topped with cheese",
			false, 3.05);
		addItem("Steamed Veggies and Brown Rice",
			"Steamed vegetables over brown rice", true, 3.99);
		addItem("Pasta",
			"Spaghetti with Marinara Sauce, and a slice of sourdough bread",
			true, 3.89);
	}
  
	public void addItem(String name, String description, 
	                     boolean vegetarian, double price) 
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}

	@Override
	public Iterator<MenuItem> createIterator() {
	    return Arrays.asList(menuItems).iterator();
    }
}
