package zain.gameslacker.gui;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class Launcher extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 973321586582775543L;

	public Launcher()
	{
		GameCollectionFrame gameCollectionFrame = new GameCollectionFrame();
	}
	
	public static void main(String [] args)
	{
		Launcher launcherWindow = new Launcher();
		
	}

}
