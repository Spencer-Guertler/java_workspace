package hipster.view;

import hipster.controller.HipsterController;

import javax.swing.JFrame;
/**
 * Creates a JFrame for the project
 * @author SpencerG
 * @version 1.1 20/11/2013
 */
public class HipsterFrame extends JFrame
{
	private HipsterController baseController;
	private HipsterPanel basePanel;
	
	public HipsterFrame(HipsterController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		
		setUpFrame();
	}
	/**
	 * Sets up the size and visibility of the Frame 
	 */
	private void setUpFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(700,450);
		this.setVisible(true);
	}
	
	
}
