package candy.controller;

import candy.model.MarshmallowCreature;

public class CandyController
{
	private MarshmallowCreature myCreature;
	
	public CandyController()
	{
		
	}

	public void start()
	{
		promptForInfo();
		makeMonster();
	}
	
	private void promptForInfo()
	{
		//decide what to put on the marshmallowCreature.
		//do not code this
	}
	
	private void makeMonster()
	{
		//make a creature that does not use the default constructor
		myCreature = new MarshmallowCreature("John XVI", 4, 4, 3, true);
	}

}
