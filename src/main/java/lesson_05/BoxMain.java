package lesson_05;

public class BoxMain {
	public static void main(String[] args) {
		Box box = new Box();
		new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				box.doSomething();
			}
		}).start();

		new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				box.doSomething();
			}
		}).start();

		new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				box.doSomething();
			}
		}).start();
	}
}
