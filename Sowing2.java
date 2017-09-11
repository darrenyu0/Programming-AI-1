package nl.ru.ai.p4ai.exercise1;

import static nl.ru.ai.karel.Karel.*;

public class Sowing2 {

	public static void main(String[] args) {
		speed(1);
		north();
		while (!onBall()) {
			sowingLine();
			fixLine();
		}
	}

	private static void sowingLine() {
		{
			if (!inFrontOfWall()) {
				putBall();
				step();
			} else
				turnRight();
		}
	}

	private static void fixLine() {
		if (onBall()) {
			turnRight();
			turnRight();
			step();
			turnLeft();
			step();
		}
	}
}