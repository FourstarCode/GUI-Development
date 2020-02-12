package myFrame;

import javax.swing.JFrame;

public class MyFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a JFrame
		JFrame frame = new JFrame("MyFrame");
		
		//Set the frame size
		frame.setSize(400,300);//400 pixels wide and 300 pixels high
		
		//Centre the frame
		frame.setLocationRelativeTo(null);
		
		//Close the frame upon exit
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Display the frame
		frame.setVisible(true);
	}

}
