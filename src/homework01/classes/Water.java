package homework01.classes;

import homework01.interfaces.Difficulty;
import homework01.interfaces.Movable;

public class Water implements Difficulty {

	int length;

	public Water(int length) {
		this.length = length;
	}

	@Override
	public boolean overcome(Movable m) {
		return m.swim(length);
	}
}
