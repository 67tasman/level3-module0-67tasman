package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String args[]){
		//2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		//3. use a for loop to initialize the robots.
		for (int i = 0; i < 5; i++) {
			robots[i] = new Robot();
		}
			//4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < 5; i++) {
			robots[i].setY(550);
		}
	robots[0].setX(100);
	robots[1].setX(200);
	robots[2].setX(300);
	robots[3].setX(400);
	robots[4].setX(500);
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
	 for (int i = 0; i < 5; i++) {
		 robots[i].setSpeed(3);
		while (robots[i].getY()>0){
			for (int j = 0; j < 5; j++) {
				int a = (int)(Math.random()*50);
				robots[j].move(a);
				robots[j].turn(5);
				
		}
			if(robots[i].getY()<=0){
				JOptionPane.showMessageDialog(null, "Robot " + i + " Wins!");
				break;
				
				
}
	}
	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.


		//7. declare that robot the winner and throw it a party!
	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.
	
	
	 }
}
}
