///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment5.java
// File:               Berry.java
// Quarter:            (BSE 8B) Fall 2021
//
// Author:             maryam usman musman@ucsd.edu 
// Instructor's Name:  Benjamin Ochoa
//
public class Berry extends Item {
    private static final String BERRY = "Berry";

    private int luckiness;
    private int speedBoost;
    /**
	 * Inherits from Item and sets to berry 
	
	 */
    public Berry() {
       super("Berry"); 
       //this.BERRY="Berry";
    	
    }

    public Berry(String name, int luckiness, int speedBoost) {
    	super(name);
       this.luckiness=luckiness;
       this.speedBoost=speedBoost;
    }

    public int getLuckiness() {
        return this.luckiness;
    }

    public void setLuckiness(int luckiness) {
        this.luckiness=luckiness;
    }

    public int getSpeedBoost() {
        return this.speedBoost;   
        }

    public void setSpeedBoost(int speedBoost) {
        this.speedBoost=speedBoost;
    }
}
