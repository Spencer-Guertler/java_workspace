package array.Controller;

public class ArrayController
{

	int[][] numberArray;
	String[][] stringArray;
	PotatoObject[][] potatoArray;
	
	public void start()
	{
		fillNumberArray();
		changeNumberArray();
		outputNumberArray();
		fillStringArray();
		fillPotatoArray();
	}
	
	public ArrayController()
	{
		numberArray = new int[5][3];
		stringArray = new String[4][4];
		potatoArray = new PotatoObject[6][4];
	}
	
	private void fillStringArray()
	{
		for(int row = 0; row<stringArray.length; row++)
		{
			for(int col = 0; col<stringArray[0].length; col++)
			{
				stringArray[row][col] = "row: " + row +" column: " + col;
				System.out.println(stringArray[row][col]);
				
			}
		}
	}
	
	private void fillPotatoArray()
	{
		for(int row = 0; row<potatoArray.length; row++)
		{
			for(int col = 0; col<potatoArray[0].length; col++)
			{
				potatoArray[row][col] = new PotatoObject((int) (7 * Math.random()));
				System.out.println(potatoArray[row][col].getPotatoSize());
			}
		}
	}
	
	private void fillNumberArray()
	{
		numberArray[0][0] = 17;
		numberArray[1][1] = 7;
		numberArray[2][2] = 3;
		numberArray[3][0] = 5;
		numberArray[4][1] = 8;
		numberArray[0][2] = 2;
		numberArray[1][0] = 1;
		numberArray[2][1] = 6;
		numberArray[3][2] = 12;
		numberArray[4][0] = 0;
		numberArray[0][1] = 9;
		numberArray[1][2] = 13;
		numberArray[2][0] = 21;
		numberArray[3][1] = 70;
		numberArray[4][2] = 74;
		for(int row= 0; row<numberArray.length; row++)
		{
			for(int col = 0; col<numberArray[0].length; col++)
			{
				System.out.println(numberArray[row][col]);
			}
		}
	}
	
	private void changeNumberArray()
	{
		for(int row= 0; row<numberArray.length; row++)
		{
			for(int col = 0; col<numberArray[0].length; col++)
			{
				numberArray[row][col] = (row + 2) + (col + 2);
			}
		}
	}
	
	private void outputNumberArray()
	{
		for(int row= 0; row<numberArray.length; row++)
		{
			for(int col = 0; col<numberArray[0].length; col++)
			{
				System.out.println(numberArray[row][col]);
			}
		}
	}
	
	
	
	
	
	
}
