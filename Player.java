///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment5.java
// File:              Player.java
// Quarter:            (BSE 8B) Fall 2021
//
// Author:             maryam usman musman@ucsd.edu 
// Instructor's Name:  Benjamin Ochoa
//
public class Player {
    private static final String POKEMON_OUT = "%s: %s\n";
    private static final String EMPTY_POKEBALL = "Pokeball %s is empty\n";
    private static final String GO_POKEMON = "Go my pokemons!!!\n";
  //  private static final String GET_POKEBALL="Pokeball"

    private Pokeball[] pokeballs;
    private Berry berry;

    public Player(Pokeball[] pokeballs, Berry berry) {
        this.pokeballs=pokeballs;
        this.berry=berry;
    }

    public Pokeball[] getPokeballs() {
        return pokeballs;
    }

    public void setPokeballs(Pokeball[] pokeballs) {
        this.pokeballs=pokeballs;
    }

    public Berry getBerry() {
        return berry;
    }

    public void setBerry(Berry berry) {
    	this.berry=berry;
    }
    /**
 	 * iterates until pokeballs is empty then prints the statement otherwise prints another statement 
 	 *
 	 */
    public void showOff() {
        System.out.print(GO_POKEMON);
        
        // Use a for-loop to iterate through each Pokeball in `pokeballs`.
       for (int i=0; i<pokeballs.length; i++) {
        	if (pokeballs[i].isEmpty()) {
            	String emptyOut = String.format(EMPTY_POKEBALL,pokeballs[i].getName());//getPalPokemon().getName());
            	System.out.print(emptyOut);
            	//return true;
          }
            else { 
            	String pokeOut = String.format(POKEMON_OUT, pokeballs[i].getPalPokemon().getName(), pokeballs[i].getPalPokemon().getSound());
            	System.out.print(pokeOut);
            }
            
        	
        }
       
        
    }
}
