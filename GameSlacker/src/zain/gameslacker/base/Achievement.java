/**
 * The base class for every PlayStation Trophy, Xbox Achievement and Steam Achievement
 * @author Zain Ul-Abdeen
 * @version 1.0 
 */

package zain.gameslacker.base;

public class Achievement 
{
	private String nameOfAchievement;
	private String gameTitleOfAchievement;
	private boolean unlocked;
	
	/**
	 * Constructs a locked Achievement object with a specified Achievement name and a specified name of the game title that object belongs to
	 * @param name The name of the Achievement
	 * @param gameTitle The game that the Achievement belongs to
	 */
	
	public Achievement(String name, String gameTitle)
	{
		this.nameOfAchievement = name;
		this.gameTitleOfAchievement = gameTitle;
		this.unlocked = false;
	}
	
	/**
	 * Constructs a blank locked Achievement object
	 */
	public Achievement()
	{
		this.nameOfAchievement = "Blank name";
		this.gameTitleOfAchievement = "Blank name";
		this.unlocked = false;
	}

	/**
	 * Returns the name of the Achievement
	 * @return this Achievement's name
	 */
	public String getNameOfAchievement() 
	{
		return nameOfAchievement;
	}

	/**
	 * Returns the game title associated with the Achievement
	 * @return the game title of this Achievement
	 */
	public String getGameTitleOfAchievement() 
	{
		return gameTitleOfAchievement;
	}

	/**
	 * Returns the unlock status of the Achievement
	 * @return the unlock status of this Achievement
	 */
	
	public boolean isUnlocked() 
	{
		return unlocked;
	}

	/**
	 * Sets the name of the Achievement
	 * @param nameOfAchievement the name of the Achievement
	 */
	
	public void setNameOfAchievement(String nameOfAchievement) 
	{
		this.nameOfAchievement = nameOfAchievement;
	}
	
	/**
	 * Sets the game title associated with the Achievement
	 * @param gameTitleOfAchievement the game title of this Achievement
	 */

	public void setGameTitleOfAchievement(String gameTitleOfAchievement) 
	{
		this.gameTitleOfAchievement = gameTitleOfAchievement;
	}
	
	/**
	 * Sets the unlocked status of the Achievement
	 * @param locked the unlock status of this Achievement
	 */

	public void setLocked(boolean locked) 
	{
		this.unlocked = locked;
	}

	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gameTitleOfAchievement == null) ? 0 : gameTitleOfAchievement.hashCode());
		result = prime * result + (unlocked ? 1231 : 1237);
		result = prime * result + ((nameOfAchievement == null) ? 0 : nameOfAchievement.hashCode());
		return result;
	}
	

	/**
	 * Checks to see if 2 Achievement objects are equal in name and game title
	 * @return Returns true or false
	 */
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Achievement))
			return false;
		Achievement other = (Achievement) obj;
		if (gameTitleOfAchievement == null) {
			if (other.gameTitleOfAchievement != null)
				return false;
		} else if (!gameTitleOfAchievement.equals(other.gameTitleOfAchievement))
			return false;
		if (unlocked != other.unlocked)
			return false;
		if (nameOfAchievement == null) {
			if (other.nameOfAchievement != null)
				return false;
		} else if (!nameOfAchievement.equals(other.nameOfAchievement))
			return false;
		return true;
	}

	/**
	 * Returns the name, game title and unlock status of this Achievement
	 */
	
	@Override
	public String toString() 
	{
		return "Name of Achievement: " + nameOfAchievement
				+ "\nGame Title of Achievement: " + gameTitleOfAchievement
				+ "\nLock Status: " + unlocked;
	}
	
	
}
