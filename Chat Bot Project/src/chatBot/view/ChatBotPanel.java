package chatBot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import chatBot.controller.ChatBotController;
import chatBot.model.ChatBot;

/**
 * the panel for the chatBot
 * 
 * @author Spencer G
 * @version 1.2 10/30/13
 */
public class ChatBotPanel extends JPanel
{

	private ChatBotController baseController;
	private JButton submitButton;
	private JTextField userInputField;
	private JTextArea chatArea;
	private SpringLayout baseLayout;
	private JScrollPane textPane;
	private ChatBot appBot;
	private int clickCount;

	/**
	 * initializes the objects in the panel
	 * 
	 * @param baseController
	 */
	public ChatBotPanel(ChatBotController baseController)
	{
		this.baseController = baseController;
		this.appBot = baseController.getMyChatBot();

		submitButton = new JButton("Submit this to the Chatbot!");
		userInputField = new JTextField(30);
		chatArea = new JTextArea(10, 30);
		textPane = new JScrollPane(chatArea);
		baseLayout = new SpringLayout();
		clickCount = 0;

		setupPanel();
		setupLayout();
		setupListeners();
		startChat();
	}

	/**
	 * starts the chatBot and get's a random topic
	 */
	private void startChat()
	{
		chatArea.setText(appBot.getRandomTopic());

	}

	/**
	 * positions the button, text pane, and input field in the frame
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, textPane, -42,
				SpringLayout.WEST, submitButton);
		baseLayout.putConstraint(SpringLayout.NORTH, userInputField, 23,
				SpringLayout.SOUTH, textPane);
		baseLayout.putConstraint(SpringLayout.WEST, userInputField, -42,
				SpringLayout.WEST, submitButton);
		baseLayout.putConstraint(SpringLayout.NORTH, textPane, 26,
				SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 156,
				SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, submitButton, -23,
				SpringLayout.SOUTH, this);
	}

	/**
	 * sets up the panel
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.blue);
		this.add(submitButton);
		this.add(userInputField);
		this.add(textPane);

		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
	}

	/**
	 * listens for a button click and gives the chatBot the input
	 */
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			/**
			 * This is what happens when I click the button.
			 */
			public void actionPerformed(ActionEvent click)
			{
				clickCount++;
				String currentInput = userInputField.getText();

				if (clickCount % 7 == 0)
				{
					String currentConversation = baseController.processConversation();
					if (currentConversation.length() != 0)
					{
						chatArea.append(currentConversation);
						clickCount--;
					}
				}
				else if (clickCount % 11 == 0)
				{
					chatArea.append(baseController.processMeme(currentInput));
				}
				else
				{
					chatArea.append("\n" + currentInput);
					chatArea.append("\n" + appBot.getRandomTopic());
				}
				if (clickCount % 3 == 0)
				{
					chatArea.append(baseController.processMusic(currentInput));
				}
			}
		});
	}
}
