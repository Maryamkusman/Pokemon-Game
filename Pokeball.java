///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment5.java
// File:               Pokeball.java
// Quarter:            (BSE 8B) Fall 2021
//
// Author:             maryam usman musman@ucsd.edu 
// Instructor's Name:  Benjamin Ochoa
//
public class Pokeball extends Item {
    private int performance;
    private PalPokemon palPokemon;

    /**
	 * Inheritst from superclass and sets it to Pokeball 
	 */
    public Pokeball() {
    	super("Pokeball");
    }
    /**
	 * @param name this is a string
	 * @param perfromance integer
	 */
    public Pokeball(String name, int performance) {
       super(name);
        this.performance=performance;
    }

    public int getPerformance() {
       return this.performance;
    }

    public void setPerformance(int performance) {
        this.performance=performance; //check
    }

    public void setPalPokemon(PalPokemon palPokemon) {
       this.palPokemon=palPokemon;
    }

    public PalPokemon getPalPokemon() {
        return this.palPokemon;
    }
    /**
	 * checks if palPokemon is null return true otherwise false.
	 *
	 * @return return false 
	 */
    public boolean isEmpty() {
        if (palPokemon==null) {
        	return true;
        }
    return false;
    }
}
