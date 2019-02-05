package nested_loops;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

public class CircleRing {
	public static void main(String[] args) throws Exception {

		// 1. Make a new Robot
Robot robot=new Robot();
		// 2. Set your robot’s position to x=150 and y=200
robot.setSpeed(100);
robot.moveTo(150, 250);
		// 3. Put the robot's pen down
robot.penDown();
		// 4. Set the robot’s speed to 10

		// 5. Do everything below here 360 times (use i as the counter)
for(int i = 0; i<360; i++){
		// 6. Move the robot 3 pixels
robot.move(3);
		// 7. Turn the robot 1 degree
robot.turn(1);
		// 8. If the counter i is divisible by 20 (hint: use mod operator %)..
if(i%20==0) {
	for(int j=0; j<360; j++) {
		robot.move(1);
		robot.turn(1);
		
	}
}
		// 9. do steps 10 and 11 exactly 360 times (use j as the counter)

		// 10. Move the robot 1 pixel

		// 11. Turn the robot 1 degree
	}
}
}