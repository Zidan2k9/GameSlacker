package zain.gameslacker.base;

public class XboxAchievement extends Achievement
{
	private int gamerScoreOfAchievement;
	private static int achievementIdIncrement = 1;
	private int achievementIdNumber = 0;
	private String achievementDescription;
	private String achievementUnlockRequirements;

	public XboxAchievement() 
	{
		super();
		setGamerScoreOfAchievement(0);
		achievementDescription = "";
		achievementUnlockRequirements = "";
		achievementIdNumber = achievementIdIncrement++;
		// TODO Auto-generated constructor stub
	}

	public XboxAchievement(String name, String gameTitle, int gamerScore)
	{
		super(name, gameTitle);
		setGamerScoreOfAchievement(gamerScore);
		achievementDescription = "";
		achievementUnlockRequirements = "";
		achievementIdNumber = achievementIdIncrement++;
		// TODO Auto-generated constructor stub
	}

	public int getGamerScoreOfAchievement()
	{
		return gamerScoreOfAchievement;
	}

	public void setGamerScoreOfAchievement(int gamerScoreOfAchievement)
	{
		this.gamerScoreOfAchievement = gamerScoreOfAchievement;
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

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + gamerScoreOfAchievement;
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof XboxAchievement))
			return false;
		XboxAchievement other = (XboxAchievement) obj;
		if (gamerScoreOfAchievement != other.gamerScoreOfAchievement)
			return false;
		return true;
	}

	@Override
	public String toString() 
	{
		return "Xbox Achievement ID: " + this.achievementIdNumber
				+"\nName of Xbox Achievement: " + super.getNameOfAchievement()
				+ "\nAchievement Description: " + this.achievementDescription
				+"\nAchievement Unlock Requirements: " + this.achievementUnlockRequirements
				+ "\nGame Title of Achievement: " + super.getGameTitleOfAchievement()
				+ "\nUnlock Status: " + super.isUnlocked();
	}
}
