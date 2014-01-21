package chatBot.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * Explanation of the class: ChatBot model to test string manipulation and use.
 * 
 * @author Spencer Guertler
 * @version 1.5 10/15/13
 * 
 */
public class ChatBot
{
	/**
	 * An arrayList of strings that holds the memes.
	 */
	private ArrayList<String> myMemes;

	/**
	 * An arrayList of strings that holds music.
	 */

	private ArrayList<String> myMusic;
	/**
	 * an arrayList of strings to hold random topics
	 */

	private ArrayList<String> randomList;
	/**
	 * an ArrayList of strings to hold climbing stuff.
	 */

	private ArrayList<String> myClimbing;

	private ArrayList<String> topicConversation;

	public ChatBot()
	{
		myMemes = new ArrayList<String>();
		fillTheMemeList();

		myMusic = new ArrayList<String>();
		fillTheMusicList();

		randomList = new ArrayList<String>();
		fillTheRandomList();

		myClimbing = new ArrayList<String>();

	}

	/**
	 * arranges a list of names into alphabetical order
	 * 
	 * @param first
	 *            the first name that is sorted.
	 * @param middle
	 *            the middle name that is sorted.
	 * @param last
	 *            the last name that is sorted.
	 * @return the names in alphabetical order
	 */
	public String alphabetizeYourName(String first, String middle, String last)
	{
		String nameInOrder = "";

		if (first.compareTo(middle) < 0)
		{
			if (first.compareTo(last) < 0)
			{
				if (middle.compareTo(last) < 0)
				{
					nameInOrder = first = ", " + middle + ", " + last;
				}
				else
				{
					nameInOrder = first + ", " + last + ", " + middle;
				}
			}
			else
			{
				nameInOrder = last + ", " + first + "," + middle;
			}
		}
		else
		{
			if (middle.compareTo(last) < 0)
			{
				if (first.compareTo(last) < 0)
				{
					nameInOrder = middle + ", " + first + ", " + last;
				}
				else
				{
					nameInOrder = middle + ", " + last + ". " + first;
				}
			}
			else
			{
				nameInOrder = last + ", " + middle + ", " + first;
			}
		}

		return nameInOrder;
	}

	/**
	 * array list that gets the memes
	 * 
	 * @return myMemes
	 */
	public ArrayList<String> getMyMemes()
	{
		return myMemes;
	}

	/**
	 * array list that gets myMusic
	 * 
	 * @return myMusic
	 */
	public ArrayList<String> getMyMusic()
	{
		return myMusic;
	}

	/**
	 * array list of strings that gets the RandomList
	 * 
	 * @return randomList
	 */
	public ArrayList<String> getRandomList()
	{
		return randomList;
	}

	/**
	 * array list of strings that gets myClimbing
	 * 
	 * @return myClimbing
	 */
	public ArrayList<String> getMyClimbing()
	{
		return myClimbing;
	}

	/**
	 * Fills the memeList with Strings for the ChatBot.
	 */
	private void fillTheMemeList()
	{
		myMemes.add("nicolas cage");
		myMemes.add("arrow to the knee");
		myMemes.add("one does not simply");
		myMemes.add("y u no");
	}

	/**
	 * Fills the musicList with various Strings for the ChatBot.
	 */
	private void fillTheMusicList()
	{
		myMusic.add("rock");
		myMusic.add("jazz");
		myMusic.add("pop");
		myMusic.add("rap");
		myMusic.add("classical");
		myMusic.add("music");
		myMusic.add("song");
		myMusic.add("coldplay");
		myMusic.add("celtic thunder");
		myMusic.add("imagine dragons");
		myMusic.add("the killers");
		myMusic.add("voice male");
		myMusic.add("green day");
		myMusic.add("Philip Phillips");

	}

	/**
	 * Fills the randomList with various Strings for the ChatBot.
	 */

	private void fillTheRandomList()
	{
		randomList.add("I like cheese");
		randomList.add("I hate essays");
		randomList.add("I like ceareal");
		randomList.add("This is random");
		randomList.add("I like typing");
	}

	/**
	 * This method chooses a random item from the random list.
	 * 
	 * @return A random element from the randomList
	 */

	public String getRandomTopic()
	{
		String randomTopic = "";

		double myRandom = Math.random();
		int myRandomListPosition = (int) (myRandom * randomList.size());

		randomTopic = randomList.get(myRandomListPosition);

		return randomTopic;
	}

	/**
	 * The conversation that the ChatBot can have about rock climbing.
	 */
	public ArrayList<String> topicConversation()
	{
		// must have at least 3 JOptionPane.showInputDialog statements about a
		// single topic of your choice

		myClimbing.add(" let's talk about climbing");
		myClimbing.add(" Do you like rock climbing");
		myClimbing.add(" I think that rock climbing is great");

		return myClimbing;
	}

	/**
	 * checks to see if the input talks about climbing.
	 * 
	 * @param currentInput
	 *            the current input from the user.
	 * @return it the input talks about climbing.
	 */
	public boolean climbingChecker(String currentInput)
	{
		boolean hasClimbing = false;
		if (currentInput != null)
		{
			for (String currentPhrase : myClimbing)
			{
				if (currentPhrase.equalsIgnoreCase(currentInput))
				{
					hasClimbing = true;
				}
			}
		}
		return hasClimbing;
	}

	/**
	 * Checks the currentInput from the user to see if it is a member of the
	 * memeList. It returns true if the input is a member of the list.
	 * 
	 * @param currentInput
	 *            The current phrase typed by the user.
	 * @return What is returned by the method. The method returns whether or not
	 *         the input is a meme from the memeList
	 */
	public boolean memeChecker(String currentInput)
	{
		boolean hasMeme = false;
		// loop over all the items in the list, if the input matches a meme,
		// change hasMeme to true

		if (currentInput != null)
		{
			for (String currentPhrase : myMemes)
			{
				if (currentPhrase.equalsIgnoreCase(currentInput))
				{
					hasMeme = true;
				}
			}
		}
		return hasMeme;
	}

	/**
	 * Checks the currentInput form the user to see if it is a member of the
	 * musicList. It returns true if the input us a member of the list.
	 * 
	 * @param currentInput
	 *            the current phrase typed by the user
	 * @return the method returns whether or not the input is music from the
	 *         musicList.
	 */
	public boolean musicChecker(String currentInput)
	{
		boolean hasMusic = false;

		if (currentInput != null)
		{
			for (String currentPhrase : myMusic)
			{
				if (currentPhrase.equalsIgnoreCase(currentInput))
				{
					hasMusic = true;
				}
			}
		}
		return hasMusic;
	}
}
