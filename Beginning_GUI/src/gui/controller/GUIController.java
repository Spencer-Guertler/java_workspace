package gui.controller;

import gui.view.GUIFrame;

public class GUIController
{

	private GUIFrame appFrame;
	
	public GUIController()
	{
		
	}
	
	public void start()
	{
		appFrame = new GUIFrame(this);
	}
}
