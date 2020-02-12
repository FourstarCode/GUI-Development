package borderLayoutManager;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a JFrame object
		JFrame frame = new JFrame();
		
		//Set BorderLayout as the layout manager for the frame.
		//Note, by default, a frame has a border layout set.
		
		BorderLayout layout = new BorderLayout();
		frame.setLayout(layout);
		
		//Create and add labels to the frame.
		frame.add(new JButton("Centre"), BorderLayout.CENTER);
		frame.add(new JButton("North"), BorderLayout.NORTH);
		frame.add(new JButton("South"), BorderLayout.SOUTH);
		frame.add(new JButton("West"), BorderLayout.WEST);
		frame.add(new JButton("East"), BorderLayout.EAST);
		
		//Set the attributes of the frame.
		frame.setTitle("BorderLayout Manager");
		frame.setSize(250,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}//main

}//class
