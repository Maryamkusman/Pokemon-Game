///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment5.java
// File:               Item.java
// Quarter:            (BSE 8B) Fall 2021
//
// Author:             maryam usman musman@ucsd.edu 
// Instructor's Name:  Benjamin Ochoa
//

public class Item {
	private String name;
	/**
	 * Retrives name and sets it to "Item" 
	 */
	public Item() {
		this.name="Item";

}
	/**
	 * Retrives name and sets it to "Item" 
	 *
	 * @param (parameter name) (Describe the first parameter here)
	 * @param (parameter name) (Do the same for each additional parameter)
	 * @return (description of the return value)
	 */
	public Item(String name) {
		this.name=name;
	}
	/**
	 * Retrives name and sets it to "Item" 
	 *
	 * @param name in a string 	 
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * Retrives name and sets it to "Item" 
	 *
	 * @param name in a string 
	 */
	public void setName(String name) {
		this.name=name; //check
	}
}