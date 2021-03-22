package homework_2;

public class MyArrayDataException extends Exception {
	public MyArrayDataException(int row, int column) {
		super(String.format("Wrong data: row - %d\tcolumn - %d", row, column));
	}
}
