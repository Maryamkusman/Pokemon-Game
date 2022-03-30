///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment5.java
// File:               PalPokemon.java
// Quarter:            (BSE 8B) Fall 2021
//
// Author:             maryam usman musman@ucsd.edu 
// Instructor's Name:  Benjamin Ochoa
//
public class PalPokemon extends Pokemon {
    private Pokeball pokeball;

    public PalPokemon() {
        this.pokeball=null;
    }

    public PalPokemon(String name, String sound, String type, 
        Pokeball pokeball) {
    	super(name,sound,type);
        this.pokeball=pokeball;
    }

    public Pokeball getPokeball() {
        return pokeball;
    }

    public void setPokeball(Pokeball pokeball) {
        this.pokeball=pokeball;
    }
}
