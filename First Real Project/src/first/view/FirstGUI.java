package first.view;

import java.awt.Component;
import first.model.Friend;

import javax.swing.JOptionPane;
import first.model.Thingy;
public class FirstGUI
{
	private Thingy myGUIThingy;
	private Friend alexFriend;
	private Friend taylorFriend;
	private Friend spencerFriend;
	private Friend tristinFriend;
	
	public FirstGUI()
	{
		myGUIThingy = new Thingy();
		alexFriend = new Friend();
		taylorFriend = new Friend();
		spencerFriend = new Friend();
		tristinFriend = new Friend();
	}
	
	public void start()
	{
		findOutAboutFriends();
		showAndTell();
//		JOptionPane.showMessageDialog(null,"silly");
//		JOptionPane.showMessageDialog(null,"what's silly");
//		JOptionPane.showMessageDialog(null,"I have no idea");
//		JOptionPane.showMessageDialog(null,"this is silly");
//		JOptionPane.showMessageDialog(null,"why");
//		JOptionPane.showMessageDialog(null,"just because");
//		interact();
//		meetTheThingyGUI();
//		checkWrapper();
	}
	
	private void findOutAboutFriends()
	{
		//Friend names
		String alexName;
		alexName = JOptionPane.showInputDialog("What is your name");
		alexFriend.setName(alexName);
		
		String alexHumorStyle;
		alexHumorStyle = JOptionPane.showInputDialog("What is your humor style");
		alexFriend.setHumorStyle(alexHumorStyle);
		
		int alexAge;
		String alexTemp;
		alexTemp = JOptionPane.showInputDialog("How old are you?");
		alexAge = Integer.parseInt(alexTemp);
		alexFriend.setAge(alexAge);
		
		String alexInterest;
		alexInterest = JOptionPane.showInputDialog("What is one of your interests?");
		alexFriend.setInterest(alexInterest);
		

		boolean alexLikesPineapple;
		String alexPineapple;
		alexPineapple = JOptionPane.showInputDialog("Do you like pineapple? type yes or no");
		if(alexPineapple.equalsIgnoreCase("yes"))
		{
			alexLikesPineapple = true;
			alexFriend.setLikesPineapple(alexLikesPineapple);
		}
		
		else if(alexPineapple.equals("no"))
		{
			alexLikesPineapple = false;		
			alexFriend.setLikesPineapple(alexLikesPineapple);
		}
		
		double alexWeight;
		
		String temp = JOptionPane.showInputDialog("How much do you weigh?");
		alexWeight = Double.parseDouble(temp);
		alexFriend.setWeight(alexWeight);
		
		String taylorName;
		taylorName = JOptionPane.showInputDialog("What is your name");
		spencerFriend.setName(taylorName);
		
		String taylorHumorStyle;
		taylorHumorStyle = JOptionPane.showInputDialog("What is your humor style");
		taylorFriend.setHumorStyle(taylorHumorStyle);
		
		int taylorAge;
		String taylorTemp;
		taylorTemp = JOptionPane.showInputDialog("How old are you?");
		taylorAge = Integer.parseInt(taylorTemp);
		spencerFriend.setAge(taylorAge);
		
		String taylorInterest;
		taylorInterest = JOptionPane.showInputDialog("What is one of your interests?");
		taylorFriend.setInterest(taylorInterest);
		
		boolean taylorLikesPineapple;
		String taylorPineapple;
		taylorPineapple = JOptionPane.showInputDialog("Do you like pineapple? type yes or no");
		if(taylorPineapple.equalsIgnoreCase("yes"))
		{
			taylorLikesPineapple = true;
			taylorFriend.setLikesPineapple(taylorLikesPineapple);
		}
		
		else if(taylorPineapple.equals("no"))
		{
			taylorLikesPineapple = false;	
			taylorFriend.setLikesPineapple(taylorLikesPineapple);
		}
		
		double taylorWeight;
		
		String temp1 = JOptionPane.showInputDialog("How much do you weigh?");
		taylorWeight = Double.parseDouble(temp1);
		taylorFriend.setWeight(taylorWeight);
		
		String spencerName;
		spencerName = JOptionPane.showInputDialog("What is your name");
		spencerFriend.setName(spencerName);
		
		String spencerHumorStyle;
		spencerHumorStyle = JOptionPane.showInputDialog("What is your humor style");
		spencerFriend.setHumorStyle(spencerHumorStyle);
		
		int spencerAge;
		String spencerTemp;
		spencerTemp = JOptionPane.showInputDialog("How old are you?");
		spencerAge = Integer.parseInt(spencerTemp);
		spencerFriend.setAge(spencerAge);
		

		String spencerInterest;
		spencerInterest = JOptionPane.showInputDialog("What is one of your interests?");
		spencerFriend.setInterest(spencerInterest);
		
		boolean spencerLikesPineapple;
		String spencerPineapple;
		spencerPineapple = JOptionPane.showInputDialog("Do you like pineapple? type yes or no");
		if(spencerPineapple.equalsIgnoreCase("yes"))
		{
			spencerLikesPineapple = true;
			spencerFriend.setLikesPineapple(spencerLikesPineapple);
		}
		
		else if(spencerPineapple.equals("no"))
		{
			spencerLikesPineapple = false;
			spencerFriend.setLikesPineapple(spencerLikesPineapple);
		}
		
		double spencerWeight;
		
		String temp2 = JOptionPane.showInputDialog("How much do you weigh?");
		spencerWeight = Double.parseDouble(temp2);
		spencerFriend.setWeight(spencerWeight);
		
		String tristinName;
		tristinName = JOptionPane.showInputDialog("What is your name");
		tristinFriend.setName(tristinName);
		
		String tristinHumorStyle;
		tristinHumorStyle = JOptionPane.showInputDialog("What is your humor style");
		tristinFriend.setHumorStyle(tristinHumorStyle);
		
		int tristinAge;
		String tristinTemp;
		tristinTemp = JOptionPane.showInputDialog("How old are you?");
		tristinAge = Integer.parseInt(tristinTemp);
		spencerFriend.setAge(tristinAge);

		String tristinInterest;
		tristinInterest = JOptionPane.showInputDialog("What is one of your interests?");
		tristinFriend.setInterest(tristinInterest);
		
		boolean tristinLikesPineapple;
		String tristinPineapple;
		tristinPineapple = JOptionPane.showInputDialog("Do you like pineapple? type yes or no");
		if(tristinPineapple.equalsIgnoreCase("yes"))
		{
			tristinLikesPineapple = true;
			tristinFriend.setLikesPineapple(tristinLikesPineapple);
		}
		
		else if(tristinPineapple.equals("no"))
		{
			tristinLikesPineapple = false;
			tristinFriend.setLikesPineapple(tristinLikesPineapple);
		}
	
		double tristinWeight;
		
		String temp3 = JOptionPane.showInputDialog("How much do you weigh?");
		tristinWeight = Double.parseDouble(temp3);
		tristinFriend.setWeight(tristinWeight);

	}
	
	private void showAndTell()
	{
		
	}
	
	private void meetTheThingyGUI()
	{
		String newName;
		JOptionPane.showMessageDialog(null,"Here is a Thingy: ");
		newName = JOptionPane.showInputDialog("what do you want to change my name to?");
		JOptionPane.showMessageDialog(null,"My name is " + newName);
		String answer;
		JOptionPane.showMessageDialog(null,"are you really sure that my name should be: " + newName + " realllly?");
		answer = JOptionPane.showInputDialog("Type Yes or no");
		
		
		if (answer.equalsIgnoreCase("Yes"))
		{
			JOptionPane.showMessageDialog(null,"I love my new name");
			myGUIThingy.setName(newName);
			JOptionPane.showMessageDialog(null, "My new name is:" + newName);
			
		}
		
		else if (answer.equals("no"));
		{
		JOptionPane.showMessageDialog(null, "I never liked the name of: " + newName + " anyway, phhht");
		meetTheThingyGUI();
		}
	
	}
	
	
	private void interact()
	{
		String answer;
		JOptionPane.showMessageDialog(null,"Let's chat");
		answer = JOptionPane.showInputDialog("What is your name?");
		// If I do not type a response null will be stored in my variable.
		// Cancel is the same as pressing the red X in the corner.
		JOptionPane.showMessageDialog(null,"Hi there " + answer);	  
	}
	
	private void checkWrapper()
	{
		int age;
		
		JOptionPane.showMessageDialog(null, "Hi let's try something new");
		String temp = JOptionPane.showInputDialog("How old are you?");
		
		age = Integer.parseInt(temp);
		//parseInt reads counting # from parameter
		JOptionPane.showMessageDialog(null, "You are " + age + " years old. Next year you will be " + (age+1) + " years old");
	}

}
