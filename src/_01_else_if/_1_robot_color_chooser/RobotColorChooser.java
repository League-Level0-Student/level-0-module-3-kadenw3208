
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;
public class RobotColorChooser {
	public static void main(String[] args) {
      Robot rob=new Robot();
      rob.penDown();
      rob.setSpeed(100);
     
      for (int i=0; i<1000000000; i++) {
    	  
      
      String input=JOptionPane.showInputDialog("What color would you like to draw with? The list of Colors is:"
      		+ "\nBlue"
      		+ "\nGreen"
      		+ "\nRed"
      		+ "\nOrange"
      		+ "\nBlack"
      		+ "\nCyan"
      		+ "\nGray"
      		+ "\nMagenta"
      		+ "\nPink"
      		+ "\nOr you can leave the space blank, where in that case I will pick a random color.");
	if(input.equals("Blue")) {
		rob.setPenColor(Color.blue);
		for(int k=0; k<4; k++) {
   	  
         rob.move(200);
         rob.turn(90);  
      }}
       if(input.equals("Green")) {
    	   for(int k=0; k<4; k++) {
       
    	  rob.setPenColor(Color.green);
    	  
    	  
          rob.move(200);
          rob.turn(90); 
    	   }
      }
      if (input.equals("Red")) {
    	  for(int k=0; k<4; k++) {
      
    	  rob.setPenColor(Color.red);
    	  
    	  
          rob.move(200);
          rob.turn(90);  
    	  }
      }
      if(input.equals("Orange")) {
    	  for(int k=0; k<4; k++) {
      
    	  rob.setPenColor(Color.orange);
    	  
    	  
          rob.move(200);
          rob.turn(90);  
      }}
      if(input.equals("Black")) {
    	  for(int k=0; k<4; k++) {
    	
    	  rob.setPenColor(Color.black);
    	  
    	 
          rob.move(200);
          rob.turn(90);  
      }}
      if(input.equals("Cyan")) {
    	  for(int k=0; k<4; k++) {
    	  rob.setPenColor(Color.cyan);
    	  
    	  
          rob.move(200);
          rob.turn(90);
      }}
      if(input.equals("Gray")) {
    	  for(int k=0; k<4; k++) {
      
    	  rob.setPenColor(Color.gray);
    	
    	 
          rob.move(200);
          rob.turn(90);  
      }}
      if(input.equals("Magenta")) {
    	  for(int k=0; k<4; k++) {
      
    	  rob.setPenColor(Color.magenta);
    	 
    	 
          rob.move(200);
          rob.turn(90);  
      }}
      if (input.equals("Pink")){
    	  for(int k=0; k<4; k++) {
      
    	  rob.setPenColor(Color.pink);
    	 
          rob.move(200);
          rob.turn(90);  
      }}
      if (input.equals("")) {
    	  for(int k=0; k<4; k++) {
      
    	  rob.setRandomPenColor();
    	  
          rob.move(200);
          rob.turn(90);  
      }}
		
		

		



	}
}}
