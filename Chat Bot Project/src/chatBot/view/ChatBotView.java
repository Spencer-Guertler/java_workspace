package chatBot.view;

import javax.swing.JOptionPane;

import chatBot.model.ChatBot;
/**
 * The class were you see what the ChatBot does
 * @author Spencer Guertler
 *
 */
public class ChatBotView
{
	/**
	 * talks to the user. Using input from the user.
	 */
	private ChatBot myChatBot;
	
	public ChatBotView()
	{
		myChatBot = new ChatBot();
	}
	/**
	 * loop that makes it so that the ChatBot keeps talking to you as long as the answer is not no.
	 */
	public void showApp()
	{
		String answer = "keep going";
		
		while(answer == null ||  !answer.equals("no") )
		{
			JOptionPane.showInputDialog(null, myChatBot.getRandomTopic());		
			answer = getInput();
			useInput(answer);	
		}
		myChatBot.topicConversation();
}
	
		/**
		 * Gets the input from the user. 
		 * @return It returns the user input.
		 */
		private String getInput()
		{
			String userInput = "";
			
			userInput = JOptionPane.showInputDialog("Do you want to talk?");
			
			return userInput;
		}
		
		/**
		 * Uses the input from the user. Gives a answer based on the input.
		 * @param currentInput Whatever the user types .
		 */
		private void useInput(String currentInput)
		{
			JOptionPane.showMessageDialog(null, "seriously");
			if (myChatBot.memeChecker(currentInput))
			{
				JOptionPane.showMessageDialog(null, "you like memes huh?");
			}
			
			if(myChatBot.musicChecker(currentInput))
			{	
				JOptionPane.showMessageDialog(null, "you like music huh?");
			}
			
			if (myChatBot.climbingChecker(currentInput))
			{
				
			}
	
		}
	
}
