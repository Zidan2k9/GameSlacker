/**
 * Implements a PlayStationTrophy that is associated with every PlayStation 3 game(post 2008) and every PlayStation 4 game
 * @author Zain Ul-Abdeen
 * @version 1.2
 */

package zain.gameslacker.base;

public class PlayStationTrophy extends Achievement
{
	private String gradeOfTrophy;
	private static int trophyIdIncrement = 1;
	private int trophyIdNumber = 0;
	private String trophyDescription;
	private String trophyUnlockRequirements;
	
	//TODO: Add a variable that gives the trophy a unique identifier for the game it belongs to
	//For example the first trophy in a game will have the id 1. The last trophy will have the id n.
	//You might decide later that you don't want this feature.
	
	//TODO: You could also add a description string to describe what is required to unlock a trophy
	
	/**
	 * Constructs a PlayStationTrophy by calling the super constructor which assigns the name, game title and grade of the trophy
	 * Each trophy is given a trophy id
	 * @param name The name of the trophy
	 * @param grade The grade of the trophy (bronze, silver, gold, platinum)
	 * @param gameTitle The game title the trophy is associated with
	 */
	
	public PlayStationTrophy(String name, String grade,String gameTitle)
	{
		super(name, gameTitle);
		trophyDescription = "";
		trophyUnlockRequirements = "";
		trophyIdNumber = trophyIdIncrement++;
		setGradeOfTrophy(grade);
	}
	
	/**
	 * Constructs a blank PlayStationTrophy by calling the blank super constructor
	 * The trophy grade is not set
	 * Each trophy is given a trophy id
	 */
	public PlayStationTrophy()
	{
		super();
		trophyIdNumber = trophyIdIncrement++;
		trophyDescription = "";
		trophyUnlockRequirements = "";
		setGradeOfTrophy("Not set");
	}
	
	/**
	 * Returns the grade of the trophy
	 * @return the grade of this trophy
	 */
	public String getGradeOfTrophy() {
		return gradeOfTrophy;
	}
	
	/**
	 * Sets the grade of the trophy
	 * @param gradeOfTrophy the grade of this trophy (bronze, silver, gold, platinum)
	 * @exception IllegalArgumentException if the parameter is not a String
	 */

	public void setGradeOfTrophy(String gradeOfTrophy)
	{
		this.gradeOfTrophy = gradeOfTrophy;
	}
	
	/**
	 * Returns the description of the trophy
	 * @return the description of this trophy
	 */

	public String getTrophyDescription() {
		return trophyDescription;
	}

	/**
	 * Returns the unlock requirements of the trophy
	 * @return the unlock requirements of this trophy
	 */
	public String getTrophyUnlockRequirements() {
		return trophyUnlockRequirements;
	}

	/**
	 * Sets the description of the trophy
	 * @param trophyDescription the description of the trophy
	 * @exception IllegalArgumentException if the parameter is not a String
	 */
	public void setTrophyDescription(String trophyDescription) {
		this.trophyDescription = trophyDescription;
	}
	
	/**
	 * Sets the unlock requirements of the trophy
	 * @param trophyUnlockRequirements the unlock requirements of this trophy
	 * @exception IllegalArgumentException if the parameter is not a String
	 */

	public void setTrophyUnlockRequirements(String trophyUnlockRequirements) {
		this.trophyUnlockRequirements = trophyUnlockRequirements;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((gradeOfTrophy == null) ? 0 : gradeOfTrophy.hashCode());
		return result;
	}

	/**
	 * Checks to see if 2 PlayStation trophies are the same
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof PlayStationTrophy))
			return false;
		PlayStationTrophy other = (PlayStationTrophy) obj;
		if (gradeOfTrophy == null) {
			if (other.gradeOfTrophy != null)
				return false;
		} else if (!gradeOfTrophy.equals(other.gradeOfTrophy))
			return false;
		return true;
	}

	/**
	 * Returns the trophy's information
	 * @return this trophy's trophy id, name, description, unlock requirements, game title and unlock status
	 */
	@Override
	public String toString() 
	{
		return "Trophy ID: " + this.trophyIdNumber
				+"\nName of Trophy: " + super.getNameOfAchievement()
				+ "\nTrophy Description: " + this.trophyDescription
				+"\nTrophy Unlock Requirements: " + this.trophyUnlockRequirements
				+ "\nGame Title of Trophy: " + super.getGameTitleOfAchievement()
				+"\nGrade of Trophy: " + getGradeOfTrophy()
				+ "\nUnlock Status: " + super.isUnlocked();
	}
}