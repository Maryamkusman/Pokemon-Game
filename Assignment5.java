///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:              Assignment5
// Files:              Assignment5.java, WildWorld.java, Player.java, PalPokemon.java, Pokemon.java, Berry.java, Pokeball.java, Item.java, NumberGenerator.java
// Quarter:            (CSE 8b) Fall 2021
//
// Author:             Maryam Usman
// Email:              musman@ucsd.edu
// Instructor's Name:  Benjamin Ochoa
//
public class Assignment5 {
	
	/**
	 * An example tester that tests the functionality of {@Code canBeCollectedBy} 
	 * method in {@Code WildPokemon} class. Notice that this tester assumes
	 * the correctness of the constructors.
	 * @return true if the tester passes
	 */

	public static boolean testWildPokemonCanBeCollectedBy() {
		WildPokemon pokemon = new WildPokemon("Pikachu", "pikapika", "electric", 
			25, 10);
		Berry berry = new Berry("Golden Berry", 9, 5);
		Pokeball uselessBall = new Pokeball("UselessBall", 1);
		Pokeball ultraBall = new Pokeball("UltraBall", 80);

		if(pokemon.canBeCollectedBy(berry, ultraBall, 0)) {
			System.out.println("The pokemon should not be collected due to low speed!");
			return false; //unit test failed
 		}

		if(pokemon.canBeCollectedBy(berry, uselessBall, 49)) {
			System.out.println("The pokemon should not be collected due to low performance");
			return false;
		}

		if(!pokemon.canBeCollectedBy(berry, ultraBall, 5)) {
			System.out.println("The pokemon should be collected");
			return false;
		}


		return true;
	}
	/**
	 * An example tester that tests the functionality of {@Code canBeCollectedBy} 
	 * method in {@Code berry} class. Notice that this tester assumes
	 * the correctness of the constructors.
	 * @return true if the tester passes
	 */
	public static boolean testBerrygetLuckiness() {
		Berry berry=new Berry ("Golden Berry", 9, 5);
		int lucky=9;
		if (berry.getLuckiness()==lucky) {
			return true;
		}
		return false;
	}
	/**
	 * An example tester that tests the functionality of {@Code canBeCollectedBy} 
	 * method in {@Code berry} class. Notice that this tester assumes
	 * the correctness of the constructors.
	 * @return true if the tester passes
	 */
	public static boolean testBerrygetSpeed() {
		Berry berry=new Berry ("Golden Berry", 9, 5);
		int speed=5;
		if (berry.getSpeedBoost()==speed) {
			return true;
		}
		return false;
	}
	
	/**
	 * An example tester that tests the functionality of {@Code canBeCollectedBy} 
	 * method in {@Code berry} class. Notice that this tester assumes
	 * the correctness of the constructors.
	 * @return true if the tester passes
	 */
	public static boolean testerOne() {//can be collected method
		WildPokemon pikachu = new WildPokemon("Pikachu", "pikapika", "electric", 25, 
				10);
		
		Berry berry = new Berry("Golden Razz Berry", 10, 5);
		Pokeball superball = new Pokeball("superball", 30);
		
		boolean result = pikachu.canBeCollectedBy(berry, superball, 12);
		
		if (result == false) {
			return false;
		}
		
		return true;
	}
	/**
	 * An example tester that tests the functionality of {@Code canBeCollectedBy} 
	 * method in {@Code berry} class. Notice that this tester assumes
	 * the correctness of the constructors.
	 * @return true if the tester passes
	 */
	public static boolean testertwo() {//can escape from ball 
		WildPokemon pikachu = new WildPokemon("Pikachu", "pikapika", "electric", 25, 
				10);
		
		Berry berry1 = new Berry("Golden Razz Berry", 10, 5);
		Pokeball superball1 = new Pokeball("superball", 30);
		boolean result = pikachu.canEscapeFromBall(superball1, berry1);
		
		if (result == true) {
			return false;
		}
		
		return true;
	}
	/**
	 * An example tester that tests the functionality of {@Code canBeCollectedBy} 
	 * method in {@Code berry} class. Notice that this tester assumes
	 * the correctness of the constructors.
	 * @return true if the tester passes
	 */
	public static boolean testerthree() {//isfaster than
		WildPokemon pikachu = new WildPokemon("Pikachu", "pikapika", "electric", 25, 
				10);
		
		Berry berry2 = new Berry("Golden Razz Berry", 10, 5);
		boolean result = pikachu.isFasterThan(30, berry2);
		
		if (result == true) {
			//System.out.println("n");
			return false;
		}
		//System.out.println("k");
		return true;
	}
	


	
	

	/**
	 * This method is a simple simulation of how pokemon go works. The expected
	 * result is shown in the writeup.
	 */
	public static void simulation() {
		// create three pokeballs
		Pokeball[] pokeballs = new Pokeball[3];
		pokeballs[0] = new Pokeball("UselessBall", 0);
		pokeballs[1] = new Pokeball("superball", 30);
		pokeballs[2] = new Pokeball("ultraball", 80);

		// create a berry
		Berry berry = new Berry("Golden Razz Berry", 10, 5);

		// create a player with pokeballs and berry equiped
		Player AshKetchum = new Player(pokeballs, berry);

		// create three wild pokemons
		WildPokemon[] wildPokemons = new WildPokemon[3];
		wildPokemons[0] = new WildPokemon("Pikachu", "pikapika", "electric", 25, 
			10);
		wildPokemons[1] = new WildPokemon("Charmander", "char", "fire", 20, 3);
		wildPokemons[2] = new WildPokemon("Mew", "mew", "psychic", 100, 100);

		// create a world with the threee wild pokemons
		WildWorld world = new WildWorld(wildPokemons);

		// Ash Ketchum starts his adventure
		world.adventure(AshKetchum);

		// Ash Ketchum show off his collection
		AshKetchum.showOff();
		
	}
	/**
	 * chekcs if unit tests pass
	 * @return true if the tester passes
	 */
	public static boolean unitTests() {
		if (!testWildPokemonCanBeCollectedBy()) {
			return false;
		}
		if (!testBerrygetLuckiness()) {
			return false; 
		}
		
		if (!testertwo()) {
			return false;
		}
		
		
		if (!testerthree()) {
			return false;
		}
		if (!testBerrygetSpeed()) {
			return false;
		}
		return true;

}

	
	public static void main(String[] args) {

		// Perform unitTests first
		if(unitTests()) {
			System.out.println("All unit tests passed.\n");
		} else {
			System.out.println("Failed test.\n");
			return;
		}
		simulation();
	}
}