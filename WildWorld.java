///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment5.java
// File:               WildWorld.java
// Quarter:            (BSE 8B) Fall 2021
//
// Author:             maryam usman musman@ucsd.edu 
// Instructor's Name:  Benjamin Ochoa
//
public class WildWorld {
    private WildPokemon[] wildPokemons;

    public WildWorld(WildPokemon[] wildPokemons) {
        this.wildPokemons=wildPokemons;
    }

    public WildPokemon[] getWildPokemons() {
        return wildPokemons;
    }

    public void setWildPokemons(WildPokemon[] wildPokemons) {
        this.wildPokemons=wildPokemons;
    }

    /**
     * This class iterates through pokeballs and wild pokemon and sets them to each counter number. 
     * it then runs an if statement to check if the pokeball is empty or if the wild pokemon returns null. A number generator is stored in ball speed. 
     *it then runs another if statement. it then runs another if statement 
     * Bugs: (a list of bugs and other problems)
     *
     * @author Maryam Usman 
     */
    public void adventure(Player player) {
        for (int i=0; i<wildPokemons.length ; i++) {
        	WildPokemon wp= this.wildPokemons[i];
        	Pokeball pokeball=player.getPokeballs()[i];
        	
        	if(pokeball.isEmpty()==false || wp==null) {
        		continue;
        		
        	}
        	
        	// Check if pokeball is empty, or if wp is null. If this true, then you `continue;`
        	
        	// Use NumberGenerator.generate() to generate a random integer (assign to variable).
        	int ballSpeed = NumberGenerator.generate();
        	if(wp.canBeCollectedBy(player.getBerry()/* player's berry */, pokeball, ballSpeed/* randomly generated ball speed */) == true) {
        		// Create a new PalPokemon Object using the wild pokemon's name, sound, type, and pokeball
        		PalPokemon palpokemon = new PalPokemon(wp.getName(), wp.getSound(), wp.getType(), pokeball);
        		// Set the palPokemon within `pokeball` (pokeball.set ...)
	        	pokeball.setPalPokemon(palpokemon);
	        	// Set this.wildPokemons[i] = null;
	        	this.wildPokemons[i]=null;
	        	//splayer.getPokeballs();
        	}
        }
    }
}
