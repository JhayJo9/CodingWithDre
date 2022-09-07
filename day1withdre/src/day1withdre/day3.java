package day1withdre;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class day3 {
    public static void main (String []args) {
    	
    	JOptionPane.showMessageDialog(null, "Welcome to my virus","Alert", JOptionPane.PLAIN_MESSAGE);
         
    	//String[] responses = {"s", "g"};
    	//ImageIcon icon = new ImageIcon("smile.png");
    	//JOptionPane.showConfirmDialog(null, "q", "w", JOptionPane.YES_NO_CANCEL_OPTION );
    	//JOptionPane.showMessageDialog(null,"g", "r", JOptionPane.INFORMATION_MESSAGE,icon);
    	ImageIcon smileicon = new ImageIcon("smile1.png");
    	
    	Image smileimage =  smileicon.getImage();
    	Image modifiedsmileimage = smileimage.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
    	
    	smileicon = new ImageIcon(modifiedsmileimage);
    	JOptionPane.showOptionDialog(null, "Hello!!!", "Virus", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, smileicon, null, 0);
      // int answer = JOptionPane.showOptionDialog(null, "q", "w", JOptionPane.DEFAULT_OPTION, 0, icon, responses, responses[0]);        	
    	//System.out.println(answer);
    }
}
