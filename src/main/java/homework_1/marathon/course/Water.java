package homework_1.marathon.course;

import homework_1.marathon.competitior.Copmetitor;

public class Water extends Obstacle {
	int length;

	public Water(int length) {
		this.length = length;
	}

	@Override
	public void doIt(Copmetitor copmetitor) {
		copmetitor.swim(length);
	}
}
