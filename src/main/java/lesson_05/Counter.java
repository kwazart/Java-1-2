package lesson_05;

public class Counter {
	int c;

	public Counter(int c) {
		this.c = c;
	}

	public int getC() {
		return c;
	}

	public synchronized void incrC() {
		this.c++;
	}

	public synchronized void decrC() {
		this.c--;
	}
}
