///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment5.java
// File:              Pokemon.java
// Quarter:            (BSE 8B) Fall 2021
//
// Author:             maryam usman musman@ucsd.edu 
// Instructor's Name:  Benjamin Ochoa
//
public class Pokemon {
	private static final String POKEMON = "Pokemon";
	private static final String SOUND = "Sound";
	private static final String UNKNOWN = "Unknown";

	private String name;
	private String sound;
	private String type;

	public Pokemon() {
		this.name=POKEMON;
		this.sound=SOUND;
		this.type=UNKNOWN;
	}

	public Pokemon(String name, String sound, String type) {
		this.name=name;
		this.sound=sound;
		this.type=type;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name=name;
	}


	public String getSound() {
		return this.sound;
	}

	public void setSound(String sound) {
		this.sound=sound;
	}


	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type=type;
	}
}