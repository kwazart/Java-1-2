package homework02;

import homework02.exceptions.MyArrayDataException;
import homework02.exceptions.MyArraySizeException;

public class Main {

	public static void main(String[] args) {

		String[][] array = arrayInit();

//	3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException, и вывести результат расчета.
		try {
			method1(array);
		} catch (MyArrayDataException e) {
			e.printStackTrace();
		} catch (MyArraySizeException e) {
			e.printStackTrace();
		}
	}

	public static String[][] arrayInit () {
		String[][] array = {
				{"1", "2", "3", "4"},
				{"5", "6", "7", "8"},
				{"9", "10", "11", "12"},
				{"13", "14", "15", "16"}
		};

		return array;
	}

//	1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива другого размера необходимо бросить исключение MyArraySizeException.

	public static void method1 (String[][] arr) throws MyArrayDataException, MyArraySizeException {

		if (arr.length == 4) {
			for (String[] str : arr) {
				if (str.length != 4) {
					throw new MyArraySizeException();
				}
			}
		} else {
			throw new MyArraySizeException();
		}

//	2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				try {
					sum += Integer.parseInt(arr[i][j]);
				} catch (Exception e) {
					throw new MyArrayDataException(i, j);
				}
			}
		}

		System.out.println(sum);

	}

}
