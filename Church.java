package nl.ru.ai.p4ai.exercise1;

import static nl.ru.ai.karel.Karel.*;

public class Church {

	public static void main(String[] args) {
		map("church.map");
		speed(100);
		findWall();
		putFinishLine();
		followWall();
	}

	private static void putFinishLine() {
		turnLeft();
			if (!inFrontOfWall()) {
				putBall();
				step();
			} else {
				turnLeft();
				if (!inFrontOfWall()) {
					putBall();
					step();
				} else
					turnLeft();
			}
	}
	private static void followWall() {
		while (!onBall())
			if (inFrontOfWall())
				turnLeft();
			else {
				step();
				turnRight();
			}
	}

	private static void findWall() {
		while (!inFrontOfWall())
			step();
	}
}
