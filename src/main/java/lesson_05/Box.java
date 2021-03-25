package lesson_05;

public class Box {
	Object obj = new Object();

	void doSomething() {
		System.out.println(Thread.currentThread().getName() + " - " + 1);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		synchronized (obj) {
			System.out.println(Thread.currentThread().getName() + " - " + 2);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " - " + 3);
		}

		System.out.println(Thread.currentThread().getName() + " - " + 4);
	}
}
