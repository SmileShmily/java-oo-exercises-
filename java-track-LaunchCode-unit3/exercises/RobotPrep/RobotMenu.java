package RobotPrep;

import java.util.ArrayList;
import java.util.Scanner;

public class RobotMenu {
	
	private ArrayList<Robot> robots;
	private Scanner s;

	public static void main(String[] args) {
		int x = 0;
		RobotMenu rm = new RobotMenu();
		do{
			x = rm.startMenu();
			rm.processInput(x);
		}while(x != 5);
	}

	public RobotMenu(){
		s = new Scanner(System.in);
		robots = new ArrayList<Robot>();
	}
	
	public int startMenu(){
		System.out.println("Welcome to the Robot menu!");
		System.out.println("1. Create a robot");
		System.out.println("2. Display the list of available robots");
		System.out.println("3. Rotate a robot");
		System.out.println("4. Move a robot");
		System.out.println("5. Exit menu");
		System.out.println("Please select an option: ");
		int selection = s.nextInt();
		while(selection < 1 || selection > 5){
			System.out.println("Invalid selection, please try again: ");
			selection = s.nextInt();
		}
		return selection;
	}
	
	public void processInput(int selection){
		if(selection == 1){
			createRobot();
		}else if(selection == 2){
			displayRobots();
		}else if(selection == 3){
			displayRobots();
			Robot r = selectRobot();
			System.out.println("Please enter a direction to rotate(Right or Left): ");
			String rot = s.next();
			r.Rotate(rot);
			System.out.println(r.getDirection());
		}else if(selection == 4){
			displayRobots();
			Robot r = selectRobot();
			r.Move();
			System.out.println(r.getPos());
		}
	}
	
	public void displayRobots(){
		for(int i = 0; i < robots.size(); i++){
			System.out.println((i+1) + ".) " + robots.get(i));
		}
	}
	
	public Robot selectRobot(){
		System.out.println("Please select a robot: ");
		int selection = s.nextInt();
		while(selection < 1 || selection > robots.size()){
			System.out.println("Invalid selection, please try again: ");
			selection = s.nextInt();
		}
		return robots.get(selection-1);
	}
	
	public void createRobot(){
		System.out.println("Please enter a name for the robot: ");
		String name = s.next();
		System.out.println("Please enter a X position for the robot: ");
		int x = s.nextInt();
		System.out.println("Please enter a Y position for the robot: ");
		int y = s.nextInt();
		System.out.println("Please enter a speed for the robot: ");
		int speed = s.nextInt();
		System.out.println("Please enter a direction for the robot(North, East, South, or West): ");
		String direct = s.next();
		robots.add(new Robot(name, x, y, speed, direct));
	}
}
