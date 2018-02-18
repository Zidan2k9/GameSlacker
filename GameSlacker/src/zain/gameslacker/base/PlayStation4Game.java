/**
 * Implements a PlayStation 4 game that can be added to a data bank of games.
 * @author Zain Ul-Abdeen
 * @version 1.0
 */

package zain.gameslacker.base;

import java.util.ArrayList;

public class PlayStation4Game extends Game
{
	
	private ArrayList<PlayStationTrophy> gameTrophies;
	
	/**
	 * Creates a PlayStation4Game object with a specified game title, publisher, developer and year of release
	 * Calls the super constructor
	 * Creates a blank ArrayList for the game's trophies
	 * @param title The title of the game
	 * @param publisher The publisher of the game
	 * @param dev The developers of the game
	 * @param year The year in which the game was released
	 */
	
	public PlayStation4Game(String title, String publisher, String dev, int year) 
	{
		super(title, publisher, dev, year);
		// TODO Auto-generated constructor stub
		gameTrophies = new ArrayList<PlayStationTrophy>();
	}
	
	/**
	 * Creates a blank PlayStation4Game object
	 * Calls the super constructor
	 * Creates a blank ArrayList for the game's trophies
	 */

	public PlayStation4Game() 
	{
		// TODO Auto-generated constructor stub
		super();
		gameTrophies = new ArrayList<PlayStationTrophy>();
	}

	/**
	 * Returns the game's trophies list
	 * @return this game's trophies
	 */
	
	public ArrayList<PlayStationTrophy> getGameTrophies() {
		return gameTrophies;
	}
	
	/**
	 * Assigns a list of trophies to the game
	 * @param gameTrophies the list of trophies that will be assigned to this game
	 * @exception IllegalArgumentException if the parameter is not an ArrayList of type PlayStationTrophy
	 */

	public void setGameTrophies(ArrayList<PlayStationTrophy> gameTrophies) {
		this.gameTrophies = gameTrophies;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((gameTrophies == null) ? 0 : gameTrophies.hashCode());
		return result;
	}
	
	/**
	 * Checks to see if 2 PlayStation 4 games are the same
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof PlayStation4Game))
			return false;
		PlayStation4Game other = (PlayStation4Game) obj;
		if (gameTrophies == null) {
			if (other.gameTrophies != null)
				return false;
		} else if (!gameTrophies.equals(other.gameTrophies))
			return false;
		return true;
	}
	
	/**
	 * Returns the title, publisher, developer, director, producer and composer of the game
	 */
	
	@Override
	public String toString() {
		return "Title of Game: " + super.getTitleOfGame()
				+ "\nPublisher: " + super.getPublisher()
				+ "\nDeveloper: " + super.getDeveloper()
				+ "\nDirector: " + super.getDirector()
				+ "\nProducer: " + super.getProducer()
				+ "\nComposer: " + super.getComposer();	
	}
}