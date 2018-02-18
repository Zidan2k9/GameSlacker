package zain.gameslacker.basetests;

import java.lang.reflect.Array;
import java.util.*;

import zain.gameslacker.base.PlayStation4Game;
import zain.gameslacker.base.PlayStationTrophy;

public class PlayStationTrophyTest 
{

	public static void main(String[] args) 
	{
		ArrayList<PlayStationTrophy> someTrophies = new ArrayList<PlayStationTrophy>();
		ArrayList<PlayStationTrophy> projectCarsTrophies = new ArrayList<PlayStationTrophy>();
		ArrayList<PlayStation4Game> playStation4Games = new ArrayList<PlayStation4Game>();
		String desc = "DESCRIPTION GOES HERE";
		String req = "REQUREMENTS GO HERE";
		
		PlayStationTrophy trophy1 = new PlayStationTrophy("Brutal Slugger","Silver","Uncharted");
		trophy1.setTrophyDescription(desc);
		trophy1.setTrophyUnlockRequirements(req);
		PlayStationTrophy trophy2 = new PlayStationTrophy("Historian","Bronze","Tomb Raider");
		PlayStationTrophy trophy3 = new PlayStationTrophy("Brutal Slugger","Silver","Uncharted");
		PlayStationTrophy hallOfFame = new PlayStationTrophy("Hall Of Fame", "Gold", "Project Cars");
		PlayStationTrophy doubleRainbow = new PlayStationTrophy("DoubleRainbow","Bronze","Project Cars");
		
		someTrophies.add(trophy1);
		someTrophies.add(trophy2);
		someTrophies.add(trophy3);
		
		System.out.println(trophy1.equals(trophy2));
		System.out.println(trophy1.equals(trophy3));
		//System.out.println(trophy1.toString());
		
		for (PlayStationTrophy trophy : someTrophies) 
		{
			System.out.println(trophy.toString());
			System.out.println("");
		}
		
		PlayStation4Game projectCars = new PlayStation4Game("Project Cars", "Bandai Namco Entertainment", "Slightly Mad Studios", 2015);
		projectCarsTrophies.add(hallOfFame);
		projectCarsTrophies.add(doubleRainbow);
		projectCars.setGameTrophies(projectCarsTrophies);
		
		for (PlayStationTrophy trophy : projectCars.getGameTrophies()) 
		{
			System.out.println(trophy.toString());
			System.out.println("");
		}
	}
	
	
}