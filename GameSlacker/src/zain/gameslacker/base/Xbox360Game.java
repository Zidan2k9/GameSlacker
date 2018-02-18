/**
 * Implements a Xbox 360 game that can be added to a data bank of games.
 * @author Zain Ul-Abdeen
 * @version 1.0
 */

package zain.gameslacker.base;

import java.util.ArrayList;

public class Xbox360Game extends Game 
{

	private ArrayList<XboxAchievement> xboxAchievementsOfGame;
	
	/**
	 * Creates a Xbox360Game object with a specified game title, publisher, developer and year of release
	 * Calls the super constructor
	 * Creates a blank ArrayList for the game's achievements
	 * @param title The title of the game
	 * @param publisher The publisher of the game
	 * @param dev The developers of the game
	 * @param year The year in which the game was released
	 */
	
	public Xbox360Game(String title, String publisher, String dev, int year) 
	{
		super(title, publisher, dev, year);
		// TODO Auto-generated constructor stub
		
		xboxAchievementsOfGame = new ArrayList<XboxAchievement>();
	}
	
	/**
	 * Creates a blank Xbox360Game object
	 * Calls the super constructor
	 * Creates a blank ArrayList for the game's achievements
	 */

	public Xbox360Game() 
	{
		// TODO Auto-generated constructor stub
		xboxAchievementsOfGame = new ArrayList<XboxAchievement>();
	}
	
	/**
	 * Returns the game's trophies list
	 * @return this game's trophies
	 */

	public ArrayList<XboxAchievement> getXboxAchievementsOfGame() {
		return xboxAchievementsOfGame;
	}

	public void setXboxAchievementsOfGame(ArrayList<XboxAchievement> xboxAchievementsOfGame) {
		this.xboxAchievementsOfGame = xboxAchievementsOfGame;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((xboxAchievementsOfGame == null) ? 0 : xboxAchievementsOfGame.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Xbox360Game))
			return false;
		Xbox360Game other = (Xbox360Game) obj;
		if (xboxAchievementsOfGame == null) {
			if (other.xboxAchievementsOfGame != null)
				return false;
		} else if (!xboxAchievementsOfGame.equals(other.xboxAchievementsOfGame))
			return false;
		return true;
	}

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
