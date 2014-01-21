package array.controller;

import candy.model.MarshmallowCreature;
import grid.view.GridView;

public class ArrayController
{
private int[][] numberArray;
private String[][] stringArray;
private GridView consoleView;
private MarshmallowCreature [][] myMonsters;

public ArrayController()
{
	numberArray = new int[7][7];
	stringArray = new String[4][4];
	myMonsters = new MarshmallowCreature[2][2];
	consoleView = new GridView();
}

public void start()
{
	fillNumberArray();
	fillStringArray();
	fillMonsters();
	consoleView.printIntInformation(numberArray);
	consoleView.printStringInfromation(stringArray);
	consoleView.printMonsterInformation(myMonsters);
}

private void fillMonsters()
{
	myMonsters[0][0] = new MarshmallowCreature("Bob", 6, 4, 8, true);
	myMonsters [0][1] = new MarshmallowCreature("Spencer", 7, 4, 5, true);
	myMonsters [1][0] = new MarshmallowCreature("George",3, 7, 2, false);
	myMonsters [1][1] = new MarshmallowCreature("Derf", 3, 5, 7, false);
	
}

private void fillNumberArray()
{
	for(int row = 0; row<numberArray.length; row++ )
	{
		for(int col = 0; col<numberArray[0].length; col++ )
		{
			numberArray[row][col] = (int) (7 * Math.random());
//			System.out.println(numberArray[row][col]);
		}
	}
}

private void fillStringArray()
{
	stringArray[0][0] = "Spencer";
	stringArray[0][1] = "Tristin";
	stringArray[0][2] = "Jalen";
	stringArray[0][3] = "David";
	stringArray[1][0] = "Ben";
	stringArray[1][1] = "Cameron";
	stringArray[1][2] = "Mikel";
	stringArray[1][3] = "Michael";
	stringArray[2][0] = "Nathan";
	stringArray[2][1] = "Jared";
	stringArray[2][2] = "George";
	stringArray[2][3] = "Sam";
	stringArray[3][0] = "Nick";
	stringArray[3][1] = "Eric";
	stringArray[3][2] = "Andrew";
	stringArray[3][3] = "Jacob";
}

}

