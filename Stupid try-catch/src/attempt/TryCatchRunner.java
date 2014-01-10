package attempt;

import javax.swing.JOptionPane;

public class TryCatchRunner
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int testNumber = 15;
		double testFloatingPoint = 0.000001;
		double errorTest = 0.0;
		
		int otherNumber = 0;
		
		try
		{
			testNumber = testNumber / otherNumber;
		}
		catch(ArithmeticException currentError)
		{
			JOptionPane.showMessageDialog(null, currentError.getMessage());
			JOptionPane.showMessageDialog(null, currentError.getClass().toString()); 
		}
		
		try
		{
			errorTest = errorTest /-errorTest;
		}
		catch(ArithmeticException currentError)
		{
			JOptionPane.showMessageDialog(null, currentError.getMessage());
			JOptionPane.showMessageDialog(null, currentError.getClass().toString()); 
		}
		JOptionPane.showMessageDialog(null, "Funny answer: " + errorTest/errorTest);

	}

}
