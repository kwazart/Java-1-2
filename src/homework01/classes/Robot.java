package homework01.classes;

import homework01.interfaces.Movable;

public class Robot implements Movable {

	private int runLength = 200;
	private int jumpHeight = 3;

	@Override
	public boolean run(int length) {
		if (length <= runLength) {
			System.out.println("Робот пробежал " + length + " метров");
			return true;
		} else {
			System.out.println("Робот не смог пробежать " + length + " метров и остановился");
			return false;
		}
	}

	@Override
	public boolean jump(int height) {
		if (height <= jumpHeight) {
			System.out.println("Робот перепрыгнул стену");
			return true;
		} else {
			System.out.println("Робот не смог перепрыгнуть стену");
			return false;
		}
	}
}
