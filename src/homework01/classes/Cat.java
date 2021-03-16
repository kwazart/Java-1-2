package homework01.classes;

import homework01.interfaces.Movable;

public class Cat implements Movable {

	private int runLength = 80;
	private int jumpHeight = 2;
	private boolean done = true;

	@Override
	public boolean isDone() {
		return done;
	}

	@Override
	public void setDone(boolean done) {
		this.done = done;
	}

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

	@Override
	public boolean swim(int length) {
		System.out.println("Кошка не умеет плавать");
		return false;
	}
}
