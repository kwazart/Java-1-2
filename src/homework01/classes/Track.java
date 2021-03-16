package homework01.classes;

import homework01.interfaces.Difficulty;
import homework01.interfaces.Movable;

public class Track implements Difficulty {
	private int length = 100;

	public Track(int length) {
		this.length = length;
	}

	@Override
	public boolean overcome (Movable m) {
		return m.run(length);
	}
}
