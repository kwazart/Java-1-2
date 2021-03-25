package lesson_05;

public class ThreadClass {
	public static void main(String[] args) {
		Thread t1 = new MyThread();
		t1.start();

		Thread t2 = new Thread(new MyRunnable());
		t2.start();

		Thread t3 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Thread: " + i);
				}
			}
		};
		t3.start();

		Runnable myRun = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Runnable: " + i);
				}
			}
		};
		Thread t4 = new Thread(myRun);
		t4.start();

		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Lambda: " + i);
			}
		}).start();



		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Main: " + i);
		}
	}
}


class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("MyThread: " + i);
		}
	}
}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("MyRunnable: " + i);
		}
	}
}