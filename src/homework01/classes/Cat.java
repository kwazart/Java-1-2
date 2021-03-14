package homework01.classes;

import homework01.interfaces.Movable;

public class Cat implements Movable {

	private int runLength = 80;
	private int jumpHeight = 2;

	@Override
	public boolean run(int length) {
		if (length <= runLength) {
			System.out.println("Кошка пробежала " + length + " метров");
			return true;
		} else {
			System.out.println("Кошка устала бежать и легла спать");
			return false;
		}
	}

	@Override
	public boolean jump(int height) {
		if (height <= jumpHeight) {
			System.out.println("Кошка перепрыгнула стену");
			return true;
		} else {
			System.out.println("Кошка умная и не стала прыгать так высоко");
			return false;
		}
	}
}
