package homework_2;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		String[][] array  = fillArray(5);
		
		try {
			int sum = sumArray(array);
			System.out.println(sum);
		} catch (MyArraySizeException | MyArrayDataException e) {
			e.printStackTrace();
		}
	}

	private static String[][] fillArray(int len) {
		String[][] array = new String[len][len];
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = String.valueOf(random.nextInt(100));
			}
		}

		//array[2][3] = "abc";
		return array;
	}

	private static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
		int sum = 0;
		int neededLength = 4;
		
		if (array.length != neededLength) {
			throw new MyArraySizeException();
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i].length != neededLength) {
				throw new MyArraySizeException();
			}
			for (int j = 0; j < array[i].length; j++) {
				try {
					sum += Integer.parseInt(array[i][j]);
				} catch (NumberFormatException e) {
					throw new MyArrayDataException(i, j);
				}
			}
		}
		return sum;
	}
}
