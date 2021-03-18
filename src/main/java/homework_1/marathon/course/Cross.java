package homework_1.marathon.course;

import homework_1.marathon.competitior.Copmetitor;

public class Cross extends Obstacle {
	int length;

	public Cross(int length) {
		this.length = length;
	}

	@Override
	public void doIt(Copmetitor copmetitor) {
		copmetitor.run(length);
	}
}
