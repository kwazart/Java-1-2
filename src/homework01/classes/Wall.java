package homework01.classes;

import homework01.interfaces.Difficulty;
import homework01.interfaces.Movable;

public class Wall implements Difficulty {
	private int height = 3;

	public Wall(int height) {
		this.height = height;
	}

	@Override
	public boolean overcome(Movable m) {
		return m.jump(height);
	}
}