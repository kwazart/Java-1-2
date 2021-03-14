package homework01.classes;

import homework01.interfaces.Movable;

public class Human implements Movable {

	private int runLength = 1000;
	private int jumpHeight = 1;

	@Override
	public boolean run(int length) {
		if (length <= runLength) {
			System.out.println("Человек пробежал " + length + " метров");
			return true;
		} else {
			System.out.println("Человек не смог пробежать " + length + " метров и упал");
			return false;
		}
	}

	@Override
	public boolean jump(int height) {
		if (height <= jumpHeight) {
			System.out.println("Человек перепрыгнул стену");
			return true;
		} else {
			System.out.println("Человек подпрыгнул, но врезался в высокую стену");
			return false;
		}
	}
}
