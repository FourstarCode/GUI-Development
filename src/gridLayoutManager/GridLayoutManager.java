package gridLayoutManager;

import javax.swing.*;
import java.awt.*;

public class GridLayoutManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a JFrame object
		JFrame frame = new JFrame();
		
		//Set GridLayout as the layout manager for the frame.
		//Specify 3 rows, 2 columns and spacing gaps of 5 pixels
		//between components, both vertically and horizontally
		
		GridLayout layout = new GridLayout(3,2,5,5);
		frame.setLayout(layout);
		
		//Create and add labels, text fields and buttons to the frame.
		frame.add(new JLabel("First Name:"));
		frame.add(new JTextField(10)); //space for 10 characters
		frame.add(new JLabel("Last Name:"));
		frame.add(new JTextField(10)); //space for 10 characters
		frame.add(new JButton("Submit:"));
		frame.add(new JButton("Exit"));
		
		//Set the attributes of the frame.
		frame.setTitle("GridLayout Manager");
		frame.setSize(300,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
				
	}//main

}//class
