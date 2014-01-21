package chatBot.view;

import javax.swing.JFrame;

import chatBot.controller.ChatBotController;
/**
 * a frame for the chatBot  
 * @author Spencer G
 * @version 1.0 10/30/13
 */
public class ChatBotFrame extends JFrame
{
	private ChatBotController baseController;
	private ChatBotPanel basePanel;
	/**
	 * makes a new panel for the chatBot 
	 * @param baseController
	 */
	public ChatBotFrame(ChatBotController baseController)
	{
		this.baseController = baseController;
		basePanel = new ChatBotPanel(baseController);
		
		setupFrame();
	}
	/**
	 * sets the size and visibility of the frame.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(550, 500);
		this.setVisible(true);
	}
	
}
