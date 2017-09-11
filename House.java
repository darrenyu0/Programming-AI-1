package nl.ru.ai.p4ai.exercise1;

import static nl.ru.ai.karel.Karel.*;

public class House {

	public static void main(String[] args) {
		speed(150);
		moveToPoint();
		makeWall();
		makeGround();
		turnRight();
		makeWall();
		makeGround();
		turnRight();
		climbWall();
		makeRoof();
	}

	private static void moveToPoint() {
		turnRight();
		move3Steps();
		turnLeft();
		step();
	}

	private static void makeRoof() {
		step();
		turnRight();
		step();
		putBall();
		turnLeft();
		step();
		turnRight();
		step();
		putBall();
		turnLeft();
		step();
		turnRight();
		step();
		putBall();
		step();
		turnRight();
		step();
		putBall();
		turnLeft();
		step();
		turnRight();
		step();
		putBall();
	}

	private static void climbWall() {
		step();
		step();
		step();
		step();
	}

	private static void makeGround() {
		turnRight();
		step();
		putBall();
		step();
		putBall();
		step();
		putBall();
		step();
		putBall();
		step();
		putBall();
		step();
	}

	private static void makeWall() {
		putBall();
		step();
		putBall();
		step();
		putBall();
		step();
		putBall();
		step();
		putBall();
	}

	private static void move3Steps() {
		step();
		step();
		step();
	}
}