package panels;

import javax.swing.*;
import java.awt.*;

public class Panels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a JFrame object
		JFrame frame = new JFrame();
		
		//Create a JPanel object to hold two labels and two text fields.
		//A panel has a flow layout by default
		//We are going to use a grid layout instead.
		
		JPanel panelUserEntry = new JPanel(new GridLayout(2,2,5,5));
		
		//Create and add labels, text fields to panelUserEntry.
		panelUserEntry.add(new JLabel("First Name:"));
		panelUserEntry.add(new JTextField(10));
		panelUserEntry.add(new JLabel("Last Name:"));
		panelUserEntry.add(new JTextField(10));
		
		//Create a second JPanel object to hold two buttons.
		JPanel panelButtons = new JPanel();
		
		//Create and add two buttons to panelButtons
		panelButtons.add(new JButton("Submit"));
		panelButtons.add(new JButton("Exit"));
		
		//Create a third panel to act as a parent panel
		//to story panel1 and panel2
		
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		JPanel panelParent = new JPanel(layout);
		panelParent.add(panelUserEntry);
		panelParent.add(panelButtons);
		
		//Add panelParent to the frame
		frame.add(panelParent);
		
		//Set the attributes of the frame.
		frame.setTitle("Panels as Subcontainers");
		frame.setSize(300, 160);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}//main

}//class
