package gui.view;

import gui.controller.GUIController;

import javax.swing.JFrame;
/**
 * Framework for a GUI frame class
 * @author Spencer G
 * @version 1.3 10/22/13
 */
public class GUIFrame extends JFrame
{
	/**
	 * the controller object that will be shared across the application
	 */
	private GUIController baseController;
	/**
	 * the main panel for the application
	 */
	private GUIPanel basePanel;
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);
		
		setupFrame();
	}
	
	/**
	 * Helper method to setup the default size and panel for the frame.
	 */	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(700, 300);
		this.setVisible(true);
	}

}
