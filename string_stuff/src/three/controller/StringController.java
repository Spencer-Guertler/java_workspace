package three.controller;

import three.view.StringView;

/**
 * String controller for the third project dealing with strings in java
 * 
 * @author SpencerG
 * 
 */

public class StringController
{
	// Declaration Section
	// All needed models and view objects
	private StringView myView;

	/**
	 * creates a StringController object initializing all values
	 */

	public StringController()
	{
		myView = new StringView();
	}

	/**
	 * Starts the view using the displayError method from StringView
	 */

	public void start()

	{
		// myView.displayError();
		// String myResponse = myView.getResponse();
		// myView.showPassedValue(myResponse);
		//
		// myView.moreInteractive("Spencer", myResponse);
		//
		myView.testStringMethods();

		// Same as previous two lines
		// myView.showPassedValue(myView.getResponse());
	}

}
