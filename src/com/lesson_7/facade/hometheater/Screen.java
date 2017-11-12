package com.lesson_7.facade.hometheater;

public class Screen {
	private String description;
	
	public Screen(String description) {
		this.description = description;
	}
 
	public void up() {
		System.out.println(description + " going up");
	}
 
	public void down() {
		System.out.println(description + " going down");
	}
 
	public String toString() {
                return description;
        }
}
