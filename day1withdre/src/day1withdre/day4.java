package day1withdre;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class day4 {
	public static void main (String []args) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		panel.setLayout(null);
		
		//JLabel image1 = new JLabel(C:\Users\User\eclipse-workspace\day1withdre\smile.png);
		//JImageComponent ic = new JImageComponent();
		//image1.setBounds(5, 40, 50, 25);
		//panel.add(image1);
		
		JLabel userLabel = new JLabel("Jhay");
		 userLabel.setBounds(5, 40, 50, 25);
		panel.add(userLabel);
		frame.setVisible(true);
	}
}
