package homework01.classes;

import homework01.interfaces.Difficulty;

public class Treadmill implements Difficulty {
	private int length = 100;

	public Treadmill(int length) {
		this.length = length;
	}

	@Override
	public int getValue() {
		return length;
	}
}
