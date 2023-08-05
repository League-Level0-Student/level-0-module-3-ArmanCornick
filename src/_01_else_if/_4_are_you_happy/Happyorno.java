package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Happyorno {
	public static void main(String[] args) {
		String question1 = JOptionPane.showInputDialog("Are you happy?");
		if(question1.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
		}
		else if(question1.equals("no")) {
			String question2 = JOptionPane.showInputDialog("Do you wanna be happy?");
			if(question2.equals("yes")) {	
				JOptionPane.showMessageDialog(null, "Change what you're doing.");
			}
			else if(question2.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");	
			}
		}













	}
}
