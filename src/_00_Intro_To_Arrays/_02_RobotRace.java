package _00_Intro_To_Arrays;

import java.util.Iterator;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
	// 1. make a main method
	static Random ran = new Random();
	static boolean raceDone = false;

	public static void main(String[] args) {
		Robot[] robots = new Robot[3];
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setY(300);
			robots[i].setX(100 + 100 * i);
		}
		while (raceDone == false) {
			for (int i = 0; i < robots.length; i++) {
				if (raceDone == false) {
					robots[i].move(ran.nextInt(50));
				}
				if (robots[i].getY() < 200 && robots[i].getX() < 500) {
					robots[i].setAngle(90);
				}
				if (robots[i].getY() < 200 && robots[i].getX() > 500) {
					robots[i].setAngle(180);
				}
				if (robots[i].getY() > 500 && robots[i].getX() > 500) {
					robots[i].setAngle(270);
				}
				if (robots[i].getY() > 500 && robots[i].getX() < 500) {
					// robots[i].setAngle(360);
				}
				if (robots[i].getY() > 400 && robots[i].getX() < 300) {
					raceDone = true;
					System.out.println("Robot " + i + 1 + " wins!");
				}
			}
		}
	}
	// 2. create an array of 5 robots.

	// 3. use a for loop to initialize the robots.

	// 4. make each robot start at the bottom of the screen, side by side, facing up

	// 5. use another for loop to iterate through the array and make each robot move
	// a random amount less than 50.

	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.

}
