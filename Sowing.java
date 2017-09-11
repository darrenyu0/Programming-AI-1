package nl.ru.ai.p4ai.exercise1;

import static nl.ru.ai.karel.Karel.*;

public class Sowing {

	public static void main(String[] args) {
		sowing();
	}

	private static void sowing() {
		while (!inFrontOfWall()) {
			makeLine();
			changeLine();
			makeLine();
			changeLine2();
		}
		putBall();
	}

	private static void changeLine2() {
		turnLeft();
		if (!inFrontOfWall()) {
			putBall();
			step();
			turnLeft();
		}
	}

	private static void changeLine() {
		turnRight();
		if (!inFrontOfWall()) {
			putBall();
			step();
			turnRight();
		}
	}

	private static void makeLine() {
		while (!inFrontOfWall()) {
			putBall();
			step();
		}
	}
}