package homework01.classes;

import homework01.interfaces.*;

public class Test {
	public static void main(String[] args) {

		Movable[] movables = {new Cat(), new Human(), new Robot()};

		Difficulty[] difficulties = {new Wall(1), new Treadmill(100)};

		for (Movable m : movables) {
			if (!m.jump(difficulties[0].getValue())) {
				continue;
			}
			if (!m.run(difficulties[1].getValue())) {

			}
		}
	}
}
