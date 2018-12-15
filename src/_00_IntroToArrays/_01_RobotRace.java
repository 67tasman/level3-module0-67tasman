package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String args[]) {
		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < 5; i++) {
			robots[i] = new Robot();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < 5; i++) {
			robots[i].setY(550);
			robots[i].setX(50);
			robots[i].setSpeed(20);
		}

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		// 7. declare that robot the winner and throw it a party!
		boolean isracing = true;

		while (isracing == true) {
			for (int j = 0; j < 5; j++) {

				int a = (int) (Math.random() * 100);
				if (a > 51) {
					robots[j].move(50);
					if (robots[j].getY() == 50 && robots[j].getX() == 50) {
						robots[j].turn(90);

					}
					if (robots[j].getY() == 50 && robots[j].getX() == 800) {
						robots[j].turn(90);

					}
					if (robots[j].getY() == 550 && robots[j].getX() == 800) {
						robots[j].turn(90);
					}

					if (robots[j].getY() == 550 && robots[j].getX() == 0) {
						JOptionPane.showMessageDialog(null, "Robot " + (j + 1) + " Wins!");
						isracing = false;
						break;

					}
				}
				
			}

			/*
			 * if (robots[i].getY() <= 0) { robots[i].turn(90);
			 * 
			 * }
			 */

			// 8. try different races with different amounts of robots.

			// 9. make the robots race around a circular track.

		}
	}
}