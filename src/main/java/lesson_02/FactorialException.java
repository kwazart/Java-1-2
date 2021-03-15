package lesson_02;

public class FactorialException extends Exception {
	int num;

	public int getNum() {
		return num;
	}

	public FactorialException() {}

	public FactorialException(String message, int num) {
		super(message);
		this.num = num;
	}
}
