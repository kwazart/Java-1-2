package homework01.classes;

import homework01.interfaces.Difficulty;

public class Wall implements Difficulty {
	private int height = 3;

	public Wall(int height) {
		this.height = height;
	}

	@Override
	public int getValue() {
		return height;
	}
}
