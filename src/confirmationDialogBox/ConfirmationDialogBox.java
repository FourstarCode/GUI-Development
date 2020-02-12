package confirmationDialogBox;

import javax.swing.JOptionPane;

public class ConfirmationDialogBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = JOptionPane.showConfirmDialog(null,"Continue?");
		
		if(option == JOptionPane.YES_OPTION) {//Yes Button... 0
			JOptionPane.showMessageDialog(null, "You wush to contine!");
		}else if(option == JOptionPane.NO_OPTION) {//No Button...1
			JOptionPane.showMessageDialog(null, "You do not wish to continue!");
		}else if(option == JOptionPane.CANCEL_OPTION) {//Cancel Button ... 2
			JOptionPane.showMessageDialog(null, "You pressed the cancel button!");
		}
	}

}
