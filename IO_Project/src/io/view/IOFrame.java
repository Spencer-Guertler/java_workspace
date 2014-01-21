package io.view;

import io.controller.IOController;

import javax.swing.JFrame;
/**
 * Frame for the IO Project
 * @author SpencerG
 * @version 1.1 13/12/2013 Created setup and method and constructor. Added a title to the window.
 */
public class IOFrame extends JFrame
{
	/**
	 * IOPanel for the frame
	 */
	private IOPanel basePanel;

	public IOFrame(IOController baseController)
	{
		basePanel = new IOPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("IO Project");
		this.setSize(500, 400);
		this.setVisible(true);
	}
}
