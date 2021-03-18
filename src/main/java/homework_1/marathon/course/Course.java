package homework_1.marathon.course;

import homework_1.marathon.competitior.Copmetitor;
import homework_1.marathon.competitior.Team;

public class Course {
	private Obstacle[] obstacles;

	public Course(Obstacle... obstacles) {
		this.obstacles = obstacles;
	}

	public void doIt(Team team) {
		for (Copmetitor c : team.getMembers()) {
			for (Obstacle o : obstacles) {
				o.doIt(c);
				if (!c.isOnDistance()) {
					break;
				}
			}
		}
	}
}
