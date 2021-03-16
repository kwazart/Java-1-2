package homework01.classes;

import homework01.interfaces.*;

public class Test {
	public static void main(String[] args) {

		Movable[] movables = {new Cat(), new Human(), new Robot()};

		Difficulty[] difficulties = {new Wall(1), new Track(20), new Water(50)};

		for (Movable m : movables) {
			for (Difficulty d : difficulties) {
				if (!d.overcome(m)) {
					m.setDone(false);
					break;
				}
			}
		}

		for (Movable m : movables) {
			if (m.isDone()) {
				System.out.println("");
				System.out.println(m.getClass().getSimpleName() + " прошёл дистанцию");
			}
		}
	}
}
