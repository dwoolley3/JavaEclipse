/***********************************************************************
Program Name:        OfficeAreaCalculator.java
Programmer's Name:   Doug Woolley
Program Description: 
 ***********************************************************************/
package DeVry_CIS355A.week4;

import java.awt.*;
import java.awt.event.*;
//import java.awt.Container;
//import java.awt.FlowLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.FocusEvent;
//import java.awt.event.FocusListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
import java.text.DecimalFormat;

import javax.swing.*;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JTextField;

public class OfficeAreaCalculator extends JFrame 
{
	//Global objects to be used in inner classes, if necessary
	private JFrame mainFrame;
	private JButton calculateButton;
	private JButton exitButton;
	private JTextField lengthField;
	private JTextField widthField;
	private JTextField areaField;
	private JLabel lengthLabel;
	private JLabel widthLabel;
	private JLabel areaLabel;
	
	//Class constructor method
	public OfficeAreaCalculator()
	{
		//Define objects in constructor
		mainFrame = new JFrame("Office Area Calculator");
		
		exitButton = new JButton("Exit");
		lengthLabel = new JLabel("Enter the length of the office:");
		widthLabel = new JLabel("Enter the width of the office:");
		areaLabel = new JLabel("Office area:");
		lengthField = new JTextField(5);
		widthField = new JTextField(5);
		areaField = new JTextField(5);
		areaField.setEditable(false);
		calculateButton = new JButton("Calculate");
		
		//Get a container for the frame
		Container c = mainFrame.getContentPane();
		//Set the layout of the container
		c.setLayout(new FlowLayout());
		
		//Add components to the container
		c.add(lengthLabel);
		c.add(lengthField);
		c.add(widthLabel);
		c.add(widthField);
		c.add(areaLabel);
		c.add(areaField);
		c.add(calculateButton);
		c.add(exitButton);
		
		//Set the mnemonic for each button
		calculateButton.setMnemonic('C');
		exitButton.setMnemonic('X');
		
		//Set the size of the GUI frame
		mainFrame.setSize(260, 150);
		
		//Make sure you terminate the program when the application is closed
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		} );
		
		//Add action listener to each button
		//CalculateButtonhandler is a class that is defined below
		CalculateButtonHandler chandler = new CalculateButtonHandler();
		calculateButton.addActionListener(chandler);
		
		//ExitButtonHandler is a class that is defined below
		ExitButtonHandler ehandler = new ExitButtonHandler();
		exitButton.addActionListener(ehandler);
		
		//FocusHandler is a class that is defined below
		FocusHandler fhandler = new FocusHandler();
		lengthField.addFocusListener(fhandler);
		widthField.addFocusListener(fhandler);
		areaField.addFocusListener(fhandler);
		
		//Set the GUI frame visible
		mainFrame.setVisible(true);
	}
	
	/**
	 * This class implements the interface ActionListener.
	 * It is a class that will handle the action on the
	 * Calculate button. The required method actionPerformed
	 * is created to read the input values of the input fields
	 * and calculate the area of an office given the dimensions.
	 */

	class CalculateButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			DecimalFormat num = new DecimalFormat(",###.##");
			double width, length, area;
			String instring;
			
			instring = lengthField.getText();
			if (instring.equals(""))
			{
				instring = ("0");
				lengthField.setText("0");				
			}
			length = Double.parseDouble(instring);
		
			instring = widthField.getText();
			if (instring.equals(""))
			{
				instring = ("0");
				widthField.setText("0");				
			}
			width = Double.parseDouble(instring);
			
			area = length * width;
			areaField.setText(num.format(area));
		}
	}
	
	/**
	 * This class implements the ActionListner interface
	 * and handles the action of the Exit button
	 */	
	class ExitButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	} 
			
	/**
	 * This class implements the FocusListener interface
	 * and handles the focus of the components.
	 */	
	class FocusHandler implements FocusListener
	{
		public void focusGained(FocusEvent e)
		{
			if (e.getSource() == lengthField || e.getSource() == widthField)
			{
				areaField.setText("");
			}
			else if (e.getSource() == areaField)
			{
				calculateButton.requestFocus();
			}
		}
		
		public void focusLost(FocusEvent e)
		{
			if (e.getSource() == widthField)
			{
				calculateButton.requestFocus();
			}
		}
	}
			
	public static void main(String[] args)
	{
		new OfficeAreaCalculator();
	}
}
