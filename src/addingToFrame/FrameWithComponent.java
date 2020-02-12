package addingToFrame;

import javax.swing.JFrame;
import javax.swing.JButton;

public class FrameWithComponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a JFrame
		JFrame frame = new JFrame("FrameWithComponent");
		
		//Each JFrame contains a content pane. A content pane is an instance of
		//java.awt.Container.
		//A content pane is like an invisible layer placed on top of the frame.
		//GUI components such as buttons can be placed onto the 
		//content pane of a frame
		
		//Create a JButton object
		JButton jbtSubmit = new JButton("Submit");
		
		//Add a button to the content pane of the frame
		
		/*
		Note: A frame by default, uses a border layout manager to organise where its
		components are located.
		We will be looking at the concept of layout managers in future topics.
		For now, be aware that a layout manager is an object that is responsible for the layout
		of GUI components within a container, such as a frame.
		A Border Layout Manager, divides a container up into different regions.
		The regions are North | East | Centre | West | South.
		Think of the map of Ireland - and the different regions.
		By default, the Border Layout Manager will place GUI components into the centre
		region.
		*/
		
		//Add the button to the frame - placed by default into the centre region 
		//by the Border Layout Manager.
		frame.add(jbtSubmit);
		
		//Set the frame's attributes
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
