package zain.gameslacker.basetests;

import java.util.ArrayList;
import zain.gameslacker.base.XboxAchievement;;

public class XboxAchievementTest 
{
	public static void main(String[] args) 
	{
		ArrayList<XboxAchievement> someXboxAchievements = new ArrayList<XboxAchievement>();
		
		XboxAchievement xboxA1 = new XboxAchievement("Fearless","Assassin's Creed", 25);
		XboxAchievement xboxA2 = new XboxAchievement("Green as Grass","Gears of War",10);
		XboxAchievement xboxA3 = new XboxAchievement("Fearless","Assassin's Creed", 25);
		
	
		someXboxAchievements.add(xboxA1);
		someXboxAchievements.add(xboxA2);
		someXboxAchievements.add(xboxA3);
		
		System.out.println(xboxA1.equals(xboxA2));
		System.out.println(xboxA1.equals(xboxA3));
		
		for (XboxAchievement xba : someXboxAchievements) 
		{
			System.out.println(xba.toString());
			System.out.println("");
		}
	}
	
}
