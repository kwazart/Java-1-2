package homework_1.marathon.course;

import homework_1.marathon.competitior.Copmetitor;

public class Wall extends Obstacle{
	int height;

	public Wall(int height) {
		this.height = height;
	}

	@Override
	public void doIt(Copmetitor copmetitor) {
		copmetitor.jump(height);
	}
}
