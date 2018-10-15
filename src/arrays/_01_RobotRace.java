package arrays;

import org.jointheleague.graphical.robot.Robot;

import java.awt.*;
import java.util.Random;

public class _01_RobotRace {

    //1. make a main method
    public static void main(String[] args) {
        //2. create an array of 5 robots.
        Robot[] allRobots = new Robot[5];
        RobotDetail[] robotDetails = new RobotDetail[5];

        robotDetails[0] = new RobotDetail("John", Color.BLUE);
        robotDetails[1] = new RobotDetail("Emile", Color.CYAN);
        robotDetails[2] = new RobotDetail("Pierre", Color.GREEN);
        robotDetails[3] = new RobotDetail("Georges", Color.MAGENTA);
        robotDetails[4] = new RobotDetail("Elliott", Color.PINK);


        //3. use a for loop to initialize the robots.
        for (int i = 0; i < allRobots.length; i++) {
            allRobots[i] = new Robot();
            allRobots[i].setPenWidth(150);
            allRobots[i].penDown();
            allRobots[i].setY(600);
            allRobots[i].setX(50 + i * 190);
            allRobots[i].setPenColor(robotDetails[i].getRobotColor());
        }

        //4. make each robot start at the bottom of the screen, side by side, facing up

        //5. use another for loop to iterate through the array and make each robot move
        //   a random amount less than 50.
        Random aRandomNumber = new Random();
 /*       boolean continueLoop = true;

        do {
            for (int i = 0; i < allRobots.length; i++) {
                int valueMove = aRandomNumber.nextInt(50);

                allRobots[i].move(valueMove);

                if (allRobots[i].getY() <= 0) {
                    continueLoop = false;
                    System.out.println(robotDetails[i].getRobotName() + ", the robot in position " + (i + 1) + " is the WINNER!!!");
                    break;
                }
            }
        } while (continueLoop);
*/
        //6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

        //7. declare that robot the winner and throw it a party!

        //8. try different races with different amounts of robots.

        //9. make the robots race around a circular track.
        int defaultAngle = 1;
        for (int i = 0; i < 5; i++) {
            allRobots[i].setX(20 + i * 190);
            allRobots[i].setY(300);
        }

        boolean continueLoop = true;
        do {
            for (int i = 0; i < allRobots.length; i++) {
                int valueMove = aRandomNumber.nextInt(50);

                for (int j = 0; j < valueMove; j++) {
                    allRobots[i].turn(1);
                    allRobots[i].move(1);
                    robotDetails[i].setAngle(defaultAngle);
                }

                  if (robotDetails[i].getAngle() >= 360) {

                      continueLoop = false;
                    System.out.println(robotDetails[i].getRobotName() + ", the robot in position " + (i + 1) + " is the WINNER!!!");

                      for (int j = 0; j < 5; j++) {
                          System.out.println(robotDetails[j].getRobotName() + " - " + robotDetails[j].getAngle());
                      }
                    break;
                }
            }
        } while (continueLoop);

    }

}

class RobotDetail {
    private String robotName;
    private Color robotColor;
    private int angle;

    RobotDetail(String name, Color color) {
        robotName = name;
        robotColor = color;
        angle = 0;
    }

    String getRobotName() {
        return robotName;
    }

    Color getRobotColor() {
        return robotColor;
    }

    int getAngle() {
        return angle;
    }

    void setAngle(int angle) {
        this.angle += angle;
    }
}