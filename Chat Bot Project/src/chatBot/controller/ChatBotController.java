package chatBot.controller;

import java.util.ArrayList;

import chatBot.model.ChatBot;
import chatBot.view.ChatBotFrame;
import chatBot.view.ChatBotView;

/**
 * The controller for the ChatBot.
 * 
 * @author Spencer Guertler
 * @version 1.2 10/23/13 Removed old pop-up GUI, reference to ChatBot
 */
public class ChatBotController
{
	/**
	 * Where you see what the chatBot does.
	 */
	private ChatBot myChatBot;
	private ChatBotFrame appFrame;

	public ChatBotController()
	{
		myChatBot = new ChatBot();
	}

	public ChatBot getMyChatBot()
	{
		return myChatBot;
	}

	/**
	 * Starts the ChatBot.
	 */
	public void start()
	{
		appFrame = new ChatBotFrame(this);
	}

	/**
	 * Gets items from the conversation list
	 * 
	 * @param conversationList
	 *            list of strings for a conversation
	 * @return pieces of the conversation
	 */
	private String conversationHelper(ArrayList<String> conversationList)
	{
		String currentConversationPiece = "";

		if (conversationList.size() > 0)
		{
			currentConversationPiece = conversationList.remove(0);
		}

		return currentConversationPiece;
	}
	/**
	 * Gets the pieces of the conversation from the conversationHelper
	 * @return the current conversation
	 */
	public String processConversation()
	{
		String currentConversation = "";

		currentConversation = conversationHelper(myChatBot.topicConversation());

		return currentConversation;
	}
	/**
	 * a response depending on whether or not the user talks about memes.
	 * @param currentInput the current input form the user. 
	 * @return a response for a meme.
	 */
	public String processMeme(String currentInput)
	{
		String memeResponse = "you don't like memes?";

		if (myChatBot.memeChecker(currentInput))
		{
			memeResponse = currentInput + " is a cool meme";
		}
		return memeResponse;
	}
	
	public String processMusic(String currentInput)
	{
		String musicResponse = "do you not like music";
		
		if (myChatBot.musicChecker(currentInput))
		{
			musicResponse = currentInput + "is great music!";
		}
		
		return musicResponse;
	}
}
