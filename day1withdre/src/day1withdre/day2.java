package day1withdre;
import javax.swing.JOptionPane;
public class day2 {
	public static void main (String[] args) {
		
		String user1 = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "oh your name is" + user1);
		
	    String num1 = JOptionPane.showInputDialog("age?");
	    JOptionPane.showMessageDialog(null, "your age is " + num1 );
	    
	    if(num1.equals("17")) {
	    	JOptionPane.showMessageDialog(null,"ediwow");
	    }
	    else if(user1.equals("18")) {
	    	JOptionPane.showMessageDialog(null,"sana all");
	    }
	    else if(user1.equalsIgnoreCase("dre")) {
	    	JOptionPane.showMessageDialog(null,"forda");
	    }
	    
	    String user2 = JOptionPane.showInputDialog("What you do for living? ");
	    JOptionPane.showMessageDialog(null,"edi wow");
    }
	    
	}

