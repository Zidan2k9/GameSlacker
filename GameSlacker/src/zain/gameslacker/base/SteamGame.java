package zain.gameslacker.base;

import java.util.ArrayList;

public class SteamGame extends Game 
{
	private ArrayList<SteamAchievement> steamAchievementsOfGame;
	
	
	public SteamGame(String title, String publisher, String dev, int year) 
	{
		super(title, publisher, dev, year);
		// TODO Auto-generated constructor stub
		steamAchievementsOfGame = new ArrayList<SteamAchievement>();
		
	}

	public SteamGame() 
	{
		// TODO Auto-generated constructor stub
		steamAchievementsOfGame = new ArrayList<SteamAchievement>();
	}

	public ArrayList<SteamAchievement> getSteamAchievementsOfGame() {
		return steamAchievementsOfGame;
	}

	public void setSteamAchievementsOfGame(ArrayList<SteamAchievement> steamAchievementsOfGame) {
		this.steamAchievementsOfGame = steamAchievementsOfGame;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((steamAchievementsOfGame == null) ? 0 : steamAchievementsOfGame.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof SteamGame))
			return false;
		SteamGame other = (SteamGame) obj;
		if (steamAchievementsOfGame == null) {
			if (other.steamAchievementsOfGame != null)
				return false;
		} else if (!steamAchievementsOfGame.equals(other.steamAchievementsOfGame))
			return false;
		return true;
	}

	@Override
	public String toString() 
	{
		return "Title of Game: " + super.getTitleOfGame()
		+ "\nPublisher: " + super.getPublisher()
		+ "\nDeveloper: " + super.getDeveloper()
		+ "\nDirector: " + super.getDirector()
		+ "\nProducer: " + super.getProducer()
		+ "\nComposer: " + super.getComposer();
	}

}
