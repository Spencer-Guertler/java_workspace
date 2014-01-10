package gui.view;

import gui.controller.GUIController;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * 
 * @author Spencer G
 * @version 1.2
 */
public class GUIPanel extends JPanel
{

	private GUIController baseController;
	private SpringLayout baseLayout;
	private JButton firstButton;
	private JButton secondButton;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("my first button!");	
		secondButton = new JButton("I made a second button!!");
		
		
		setupPanel();
		setupLayout();
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(secondButton);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 22, SpringLayout.WEST, this);
	}
}

