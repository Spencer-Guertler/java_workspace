package three.view;

import java.util.Locale;

import javax.swing.JOptionPane;

/**
 * 
 * @author SpencerG
 * 
 */

public class StringView
{

	/**
	 * Shows the runtime error when a non integer is typed in to the JOptionPane
	 * input field
	 */
	public void displayError()
	{
		int test;
		String temp;

		JOptionPane.showMessageDialog(null, "Let's watch the program crash!");
		temp = JOptionPane.showInputDialog("Type your favorite number!");
		test = Integer.parseInt(temp);
		JOptionPane.showMessageDialog(null, "your favorite number is " + test);
	}

	public String getResponse()
	{
		// must have a value assigned to a variable in a method or it cannot be
		// used and will cause an error
		String response = null;
		response = JOptionPane.showInputDialog("type something");
		return response;
		// the local variable response may not have been initialized means that
		// you need to initialize the variable
	}

	public void showPassedValue(String currentValue)
	{
		JOptionPane.showMessageDialog(null, currentValue
				+ " is supposed to be funny....");
	}

	public void moreInteractive(String first, String second)
	{
		JOptionPane.showMessageDialog(null, "Hey" + first + "\n" + "says:"
				+ "\n" + second);
	}

	public void testStringMethods()
	{
		testSubString(7);
		concatMethod("icexpialidocious");
		toUpperCaseMethod("spencer");
	}

	private void testSubString(int startPosition)
	{
		String testString = "supercallifragilisticexpialidocious";
		JOptionPane.showMessageDialog(null, "The substring method test");
		JOptionPane.showMessageDialog(null, "we are going to go from the "
				+ startPosition + "'th letter in the test string");
		JOptionPane.showMessageDialog(null, "The test string is: "
				+ "supercallifragilisticexpialidocious" + "\n");
		JOptionPane.showMessageDialog(null,
				"the testString.substring(startPosition) call gives us:" + "\n"
						+ testString.substring(startPosition));
	}

	private void concatMethod(String addedString)
	{
		String testString = "supercallifragilist";
		JOptionPane.showMessageDialog(null, "The concat method test");
		JOptionPane.showMessageDialog(null,
				"the test string is supercallifragilist");
		JOptionPane.showMessageDialog(
				null,
				"testString.concat(addedString) gives us" + "\n"
						+ testString.concat(addedString));
	}

	private void toUpperCaseMethod(String switchedString)
	{
		String caseString = switchedString;
		JOptionPane.showMessageDialog(null, "the convert to upper Case method");
		JOptionPane.showMessageDialog(null, "the switchedString is"
				+ switchedString);
		JOptionPane.showMessageDialog(null,
				"caseString.toUpperCase(switchedString) gives us" + "\n"
						+ caseString.toUpperCase());

	}

}
