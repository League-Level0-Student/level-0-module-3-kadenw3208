package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
public static void main(String[] args) {
	String input=JOptionPane.showInputDialog("You are traveling in a long tunnel and cave. An expensive bracelet is lying on the ground."
			+ "\nYou get super excited. But there is a sign that says: STEAL FROM ME AND PERISH. What do you do?"
			+ "\n1. Take it"
			+ "\n2. Be cautious and leave it there.");
	if(input.equals("Take it")) {
		JOptionPane.showMessageDialog(null, "You take the expensive bracelet and start running."
				+ "\nSuddenly the ground starts rumbling. The ground opens and you fall to the bottom and die. Better luck next time!");
	}
	else if(input.equals("take it")) {
		JOptionPane.showMessageDialog(null, "You take the expensive bracelet and start running."
				+ "\nSuddenly the ground starts rumbling. The ground opens and you fall to the bottom and die. Better luck next time!");
}
	else {
		JOptionPane.showMessageDialog(null, "You leave the gem there and run away. You run outside and find a sack of gold coins lying"
				+ "\nnext to the cave entrance. Nice Job!");
	}
}}
