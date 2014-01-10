package first.view;

import first.model.Thingy;

import java.util.Scanner;
import java.util.scanner;
public class ConsoleView
{
	//Declare a Scanner object to use in the console.
	private Scanner wordScanner;
	/**
	 * Declare a Thingy object for testing purposes
	 */
	private Thingy testThingy;
	
	/**
	 * 
	 */
	public ConsoleView()
	{
		wordScanner = new Scanner(System.in);
		testThingy = new Thingy();
	}
	public void start()
	{
//		System.out.println("Hi there, lets talk!!");
//		getWords();
//		questionsAndAnswers();
		meetTheThingy();
		reallyMeetTheThingy();
	}
	
	private void meetTheThingy()
	{
		System.out.println("Here is a Thingy: " + testThingy.getName());
		System.out.println("What do you want to change my name to?");
		
		String newName = wordScanner.nextLine();
		System.out.print("Are you really sure my name should be: " + newName + " reallllly?");
		System.out.println("Type Yes or no");
		
		String answer = wordScanner.nextLine();
		
		if (answer.equalsIgnoreCase("yes"))
		{
			System.out.println("I love my new name!!");
			testThingy.setName(newName);
			System.out.println("My new name is: " + testThingy.getName());
			reallyMeetTheThingy();
		}
		else if (answer.equals("no"))
		{
			System.out.println("I never liked the name of: " + newName + " anyway, phhht");
			meetTheThingy();
		}
		else
		{
			System.out.println("Stop typing gibberish?!");
			meetTheThingy();
		}
	}
	
	private void reallyMeetTheThingy()
	
	{
		System.out.println("I am " + testThingy.getName());
		System.out.println("What is your favorite movie?");
		
		String newMovie = wordScanner.nextLine();
		System .out.print("Are you sure that " + newMovie + " is your favorite movie?");
		System .out.println("Type Yes or no");
		
		String answer = wordScanner.nextLine();
		
		if (answer.equals("yes"))
		{
			System.out.println("I love that movie!!!");
			testThingy.setMovie(newMovie);
			System.out.println("My favorite movie is: " + testThingy.getMovie());
		}
		else if (answer.equals("no"))
		{
			System.out.print("I don't like " + newMovie + " anyway ");
			reallyMeetTheThingy();
		}
		
		System.out.println("What is your favorite food");
		String newFood = wordScanner.nextLine();
		System.out.println("is " + newFood + "actually your favorite Food");
		System.out.println("Type Yes or no");
		
		String answer1 = wordScanner.nextLine();
		
		if (answer1.equalsIgnoreCase("yes"))
		{
			System.out.println("are you shure");
			System.out.println("Type yes or no");
			String answer2 = wordScanner.nextLine();
			
			if (answer2.equalsIgnoreCase("yes"))
			{
				System.out.println("That is fantasic!!!");
				testThingy.setFood(newFood);
				System.out.println("My favorite food is " + newFood );
			}
			else
			{
				System.out.println("I don't like" + newFood +  "anyway it's gross");
			}
		
		}
		
		
		
	}
	
	private void getWords()
	{
		String test = wordScanner.nextLine();
		System.out.print("You typed this to me: ");
		System.out.println(test);
	}
	private void getWords1()
	{
		String test = wordScanner.nextLine();
		System .out.print("Your name is: ");
		System.out.println(test);
	}
	private void getWords2()
	{
		String test = wordScanner.nextLine();
		System .out.print("you have this many people in your familiy: ");
		System.out.println(test);
	}
	private void getWords3()
	{
		String test = wordScanner.nextLine();
		System .out.print("you are: ");
		System.out.println(test);
	}
	private void getWords4()
	{
		String test = wordScanner.nextLine();
		System .out.print("you go to: ");
		System.out.println(test);
	}
	
	/**
	 * Ask the user four questions. Print their answers.
	 */
	private void questionsAndAnswers()
	{
		System.out.println("What is your name");
		getWords1();
		System.out.println("How many people are in your family?");
		getWords2();
		System.out.println("How old are you?");
		getWords3();
		System.out.println("Were do you go to School");
		getWords4();
	}

	private void show()
	{
		System.out.println("show this on my screen");
		System.out.print("Is this working?");
		System.out.println(" It works!!!");
		System.out.println(":)");
		
		Thingy testThing = new Thingy();
		testThing.setName("pineapple potato Dilbert");
		System.out.print("My test thingy name is :");
		System.out.println(testThing.getName());
	}
}