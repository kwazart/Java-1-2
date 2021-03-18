package homework_1.marathon;

import homework_1.marathon.competitior.Cat;
import homework_1.marathon.competitior.Dog;
import homework_1.marathon.competitior.Human;
import homework_1.marathon.competitior.Team;
import homework_1.marathon.course.Course;
import homework_1.marathon.course.Cross;
import homework_1.marathon.course.Wall;

public class Main {
	public static void main(String[] args) {
//		Copmetitor[] competitors = {new Human("Jack"), new Cat("Barsik"), new Dog("Bobik")};
//		Obstacle[] obstacles = {new Cross(70), new Wall(2), new Water(20)};
//
//		for (Copmetitor copmetitor : competitors) {
//			for (Obstacle o : obstacles) {
//				o.doIt(copmetitor);
//				if (!copmetitor.isOnDistance()) {
//					break;
//				}
//			}
//		}
//
//		for (Copmetitor c : competitors) {
//			c.info();
//		}

		// Выполнение ДЗ
		Team team = new Team("Rocket", new Human("Jack"), new Cat("Barsik"), new Dog("Bobik"));
		Course course = new Course(new Cross(80), new Wall(1), new Wall(2), new Cross(120));
		course.doIt(team);
		team.showWinners();
	}
}
