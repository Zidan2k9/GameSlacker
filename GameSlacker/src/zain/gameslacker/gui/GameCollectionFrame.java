package zain.gameslacker.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import zain.gameslacker.base.Game;

public class GameCollectionFrame extends JFrame 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8924155103767382645L;
	
	private JPanel gamesListPanel;
	private JPanel buttonsPanel;
	private JPanel flowLayoutContainerForButtonsPanel;
	
	private JButton viewGameButton;
	private JButton addNewGameButton;
	private JButton editGameButton;
	private JButton deleteGameButton;
	private JButton saveCollection;
	private JButton clearCollection;
	
	private JList<Game> listOfGamesInCollection;
	
	private ArrayList<JButton> listOfButtonsOnMainScreen;
	
	public GameCollectionFrame()
	{
		this.setLayout(new BorderLayout());
		initializeComponents();
		gamesListPanel.setLayout(new BorderLayout());
		
		//BoxLayout layoutforButtonsPanel = new BoxLayout(buttonsPanel, BoxLayout.Y_AXIS);
		int numberOfRowsForBPGridLayoutForBPGridLayout = 6;
		GridLayout gridLayoutForButtonsPanel = new GridLayout(numberOfRowsForBPGridLayoutForBPGridLayout,0,0,10);
		//FlowLayout flowLayoutForButtonsPanel = new FlowLayout();
		flowLayoutContainerForButtonsPanel.setLayout(new FlowLayout());
		buttonsPanel.setLayout(gridLayoutForButtonsPanel);
		
		viewGameButton = new JButton("View Game");
		viewGameButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		viewGameButton.setMaximumSize(viewGameButton.getPreferredSize());
		
		addNewGameButton = new JButton("Add Game");
		addNewGameButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		addNewGameButton.setMaximumSize(addNewGameButton.getPreferredSize());
		
		editGameButton = new JButton("Edit Game");
		editGameButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		editGameButton.setMaximumSize(editGameButton.getPreferredSize());
		
		deleteGameButton = new JButton("Delete Game");
		deleteGameButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		deleteGameButton.setMaximumSize(deleteGameButton.getPreferredSize());
		
		saveCollection = new JButton("Save Collection");
		saveCollection.setAlignmentX(Component.CENTER_ALIGNMENT);
		saveCollection.setMaximumSize(saveCollection.getPreferredSize());
		
		clearCollection = new JButton("Clear Collection");
		clearCollection.setAlignmentX(Component.CENTER_ALIGNMENT);
		clearCollection.setMaximumSize(clearCollection.getPreferredSize());
		
		
		buttonsPanel.add(addNewGameButton);
		buttonsPanel.add(Box.createVerticalGlue());
		buttonsPanel.add(viewGameButton);
		buttonsPanel.add(Box.createVerticalGlue());
		buttonsPanel.add(editGameButton);
		buttonsPanel.add(Box.createVerticalGlue());
		buttonsPanel.add(deleteGameButton);
		buttonsPanel.add(Box.createVerticalGlue());
		buttonsPanel.add(saveCollection);
		buttonsPanel.add(Box.createVerticalGlue());
		buttonsPanel.add(clearCollection);
		
		flowLayoutContainerForButtonsPanel.add(buttonsPanel);
		
		listOfGamesInCollection.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		gamesListPanel.add(new JScrollPane(listOfGamesInCollection));
		
		
		this.add(gamesListPanel,BorderLayout.CENTER);
		this.add(flowLayoutContainerForButtonsPanel,BorderLayout.EAST);
		//this.add(borderLayoutContainerForButtonsPanel, BorderLayout.EAST);
		//this.add(buttonsPanel,BorderLayout.EAST);
		
		disableButtonsIfGameListIsEmpty();
		
		this.setTitle("Zain's collection");
		
		this.setSize(1200, 600);
		this.setAlwaysOnTop(true);
		this.setVisible(true);
		
	}
	
	public void initializeComponents()
	{
		flowLayoutContainerForButtonsPanel = new JPanel();
		buttonsPanel = new JPanel();
		gamesListPanel = new JPanel();
		listOfGamesInCollection = new JList<Game>();
		
	}
	
	
	public void disableButtonsIfGameListIsEmpty() 
	{
		if (listOfGamesInCollection != null || listOfGamesInCollection.getModel().getSize() == 0)
		{
			disableJButton(viewGameButton);
			disableJButton(editGameButton);
			disableJButton(deleteGameButton);
			disableJButton(saveCollection);
			disableJButton(clearCollection);
		}
	}
	
	public void disableJButton(JButton button)
	{
		button.setEnabled(false);
		//button.setForeground(Color.orange);
	}
	
	public void addGame()
	{
		
	}
}