///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment5.java
// File:               WildPokemon.java
// Quarter:            (BSE 8B) Fall 2021
//
// Author:             maryam usman musman@ucsd.edu 
// Instructor's Name:  Benjamin Ochoa
//
public class WildPokemon extends Pokemon {
    private static final int HUNDRED = 100;

    private int power;
    private int speed;
    private int timesEscapedFromBall;

    public WildPokemon() {
        this.power=HUNDRED;
        this.speed=0;
        this.timesEscapedFromBall=0;
    }

    public WildPokemon(String name, String sound, String type, int power, 
        int speed) {
    	super(name,sound,type);
    	this.power=power;
    	this.speed=speed;
    	
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power=power;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed=speed;
    }

    public int getTimesEscapedFromBall() {
        return this.timesEscapedFromBall;
    }

    public void setTimesEscapedFromBall(int timesEscapedFromBall) {
        this.timesEscapedFromBall=timesEscapedFromBall;
    }
    /**
	 * checks if speed of wildpokemon is greater than ballspeed and speedboost of berry 
	 *
	 * @param ballspeed stored in int
	 * @param berry in Berry 
	 * @return false
	 */
    public boolean isFasterThan(int ballSpeed, Berry berry) {
        if (this.speed>ballSpeed+ berry.getSpeedBoost()) {
        	return true;
        }
        return false;
    }
    /**
 	 * checks if power of wildpokemon is greater than performance and luckiness of berry  
 	 *
 	 * @param pokeball 
 	 * @param berry in Berry 
 	 * @return false
 	 */
    public boolean canEscapeFromBall(Pokeball pokeball, Berry berry) {
        if (this.power>pokeball.getPerformance()+berry.getLuckiness()) {
        	return true;
        }
        return false; 
        	
    }
    /**
 	 * chekcs if wildpokemon is faster than if true than checks if wildpokemon can escape from ball then incremenets by 1. 
 	 *
 	 * @param berry Berry
 	 * @param pokeball Pokeball
 	 * @return true
 	 */
    public boolean canBeCollectedBy(Berry berry, Pokeball pokeball, 
        int ballSpeed) {
 
        if(this.isFasterThan(ballSpeed, berry)) {
        	return false;
        }
        if (this.canEscapeFromBall(pokeball,berry)) {
        	this.timesEscapedFromBall+=1;
        	return false;
        }
    return true;
    }
}
