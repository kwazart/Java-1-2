package lesson_05;

public class MainCounter {
	public static void main(String[] args) {
		Counter c = new Counter(0);

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1_000_000; i++) {
				c.incrC();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1_000_000; i++) {
				c.decrC();
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("c = " + c.getC());
	}
}
