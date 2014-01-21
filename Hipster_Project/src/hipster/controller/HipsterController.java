package hipster.controller;

import javax.swing.JOptionPane;

import hipster.model.Hipster;
import hipster.view.HipsterFrame;
/**
 * Controller for the Hipster project
 * @author SpencerG
 * @version 1.1 11/20.13 Added constructor information.
 */
public class HipsterController
{
	/**
	 * the hipster frame reference for MVC
	 */
	private HipsterFrame appFrame;
	/**
	 * The Hipster object representing me
	 */
	private Hipster selfHipster;
	/**
	 * The array of hipsters for my cubby
	 */
	private Hipster [] cubbyHipsters;
	

	/**
	 * The current hipster in the array
	 */
	private int hipsterCount;
	/**
	 * Creates a Hipster controller for the MVC
	 */
	public HipsterController()
	{
		selfHipster = new Hipster();
		cubbyHipsters = new Hipster[4];
		hipsterCount = 0;
	}
	/**
	 * Starts the application GUI for the Hipster app
	 */
	public void start()
	{
		appFrame = new HipsterFrame(this);
	}
	/**
	 * Gets the current hipster.
	 * @param position the position in the array of the hipster
	 * @return The current hipster.
	 */
	public Hipster getSpecifiedHipster(int position)
	{
		Hipster currentHipster = null;
		
		if(position < cubbyHipsters.length && position >= 0)
		{
			currentHipster = cubbyHipsters[position];
		}
		return currentHipster;
	}
	/**
	 * Used to get a random Hipster from the array of cubbyHipsters.
	 * @return The current hipster
	 */
	public Hipster getRandomHipster()
	{
		Hipster currentHipster = null;
		
		int randomIndex = 0;
		double random = Math.random();
		randomIndex = (int) (random*cubbyHipsters.length);
		currentHipster = cubbyHipsters[randomIndex];
		
		return currentHipster;
				
	}
	/**
	 * Creates and adds a Hipster to the array of hipsters
	 * @param books the array of books for the current hipster
	 * @param name the current hipster's name 
	 * @param type the current hipster's type
	 * @param phrase the current hipster's phrase
	 */
	public void addHipster(String [] books, String name, String type, String phrase)
	{
		if(hipsterCount < cubbyHipsters.length)
		{
			Hipster tempHipster = new Hipster(name, type, phrase, books);
			cubbyHipsters[hipsterCount] = tempHipster;
			
			hipsterCount++;
		}
		else
		{
			JOptionPane.showMessageDialog(appFrame, "the class is full you are too mainstream to be added");
		}
	}
	public Hipster[] getCubbyHipsters()
	{
		return cubbyHipsters;
	}
	
	public Hipster getSelfHipster()
	{
		return selfHipster;
	}

	public void setSelfHipster(Hipster selfHipster)
	{
		this.selfHipster = selfHipster;
	}
}
