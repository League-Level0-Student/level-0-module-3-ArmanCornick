package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Adventure {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("There once was a pirate. His name was _____");	
	String q2 = JOptionPane.showInputDialog(name+" was on his ship one day when he crashed into a massive rock.\nWill he explore the massive rock or stay in his ship?\nSay rock to explore and say ship to stay.");	
	if(q2.equals("ship")) {
	JOptionPane.showMessageDialog(null, name+" stayed on the ship for a day, then a week, then a month.\nOne day, he got tired of staying on the ship, so he ended his life.");	
	}
	else if(q2.equals("rock")) {
	String q3 = JOptionPane.showInputDialog(name+" decided to explore the rock.\nHe got off his ship and walked into the rock.\nA sea creature then crawled up to him and bit his head off and he died.");	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
