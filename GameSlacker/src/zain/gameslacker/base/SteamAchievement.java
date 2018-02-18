/**
 * Implements a Steam Achievement that is associated with most Steam games
 * @author Zain Ul-Abdeen
 * @version 1.0 
 */

package zain.gameslacker.base;

public class SteamAchievement extends Achievement
{
	private static int achievementIdIncrement = 1;
	private int achievementIdNumber = 0;
	private String achievementDescription;
	private String achievementUnlockRequirements;
	
	/**
	 * Constructs a SteamAchievement object by calling the super constructor which assigns the name and game title of the achievement
	 * Each achievement is given an achievement id
	 * @param name The name of the achievement
	 * @param gameTitle The game title the achievement is associated with
	 */
	
	public SteamAchievement(String name, String gameTitle)
	{
		super(name, gameTitle);
		achievementDescription = "";
		achievementUnlockRequirements = "";
		achievementIdNumber = achievementIdIncrement++;
	}
	
	/**
	 * Constructs a blank SteamAchievement by calling the blank super constructor
	 * Each achievement is given an achievement id
	 */
	
	public SteamAchievement()
	{
		super();
		achievementIdNumber = achievementIdIncrement++;
		achievementDescription = "";
		achievementUnlockRequirements = "";
	}

	public String getAchievementDescription() {
		return achievementDescription;
	}

	public String getAchievementUnlockRequirements() {
		return achievementUnlockRequirements;
	}

	public void setAchievementDescription(String achievementDescription) {
		this.achievementDescription = achievementDescription;
	}

	public void setAchievementUnlockRequirements(String achievementUnlockRequirements) {
		this.achievementUnlockRequirements = achievementUnlockRequirements;
	}

	/**
	 * Returns the achievement's information
	 * @return this achievement's name and game title
	 */
	
	@Override
	public String toString() 
	{
		return "Steam Achievement ID: " + this.achievementIdNumber
				+"\nName of Steam Achievement: " + super.getNameOfAchievement()
				+ "\nAchievement Description: " + this.achievementDescription
				+"\nAchievement Unlock Requirements: " + this.achievementUnlockRequirements
				+ "\nGame Title of Achievement: " + super.getGameTitleOfAchievement()
				+ "\nUnlock Status: " + super.isUnlocked();
	}
	
	
}