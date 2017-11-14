package com.lesson_9.javaiterator.menu;

import com.lesson_9.javaiterator.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu extends Menu {
	private ArrayList<MenuItem> menuItems = new ArrayList<>();
 
	public PancakeHouseMenu(String name) {
	    super(name);
    
		addItem("K&B's Pancake Breakfast", 
			"Pancakes with scrambled eggs, and toast", 
			true,
			2.99);
 
		addItem("Regular Pancake Breakfast", 
			"Pancakes with fried eggs, sausage", 
			false,
			2.99);
 
		addItem("Blueberry Pancakes",
			"Pancakes made with fresh blueberries",
			true,
			3.49);
 
		addItem("Waffles",
			"Waffles, with your choice of blueberries or strawberries",
			true,
			3.59);
	}

	public void addItem(String name, String description,
	                    boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

	public String toString() {
		return "Objectville Pancake House Menu";
	}

	@Override
	public Iterator<MenuItem> createIterator() {
	    return menuItems.iterator();
    }
}
