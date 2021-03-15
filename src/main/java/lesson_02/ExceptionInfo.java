package lesson_02;

import java.io.*;
import java.util.Arrays;

public class ExceptionInfo {
	public static void main(String[] args) {
		// ArrayIndexOutOfBoundException
//
//		int[] array= {1, 2, 3};
//		System.out.println(Arrays.toString(array));
//		array[1] = 8;
//		System.out.println(Arrays.toString(array));
//		array[6] = 30;
//		System.out.println(Arrays.toString(array));


		// IOException
//		File file = new File("src/main/java/lesson_02/test2.txt");
//		if (file.exists()) {
//			System.out.println("exists");
//		}
//		try {
//			String line;
//			BufferedReader br = new BufferedReader(new FileReader(file));
//			while ((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println("---------------");


		// ClassCastException
//		Object obj = "lcfvxhblkdfhbgk'df";
//		System.out.println((Integer) obj);

		// NumberFormatException
//		Object line = "djsfklhglkdfhlgkhdf";
//		System.out.println(Integer.parseInt((String) line));

		// NullPointerException
//		String line = null;
//		System.out.println(line.substring(4));


		// ArithmeticException
//		System.out.println(5 / 0);

//		method1();
//		System.out.println("------------");

//		try {
//			method1();
//		} catch (ArithmeticException e) {
//			System.err.println("Деление на ноль");
//			e.printStackTrace();
//		}
//		System.out.println("-------------");

		int[] arr = {1, 2, 3};

//		try {
//			int a = 10 / 0;
//			arr[9] = 10;
//		} catch (ArithmeticException e) {
//			System.err.println("Деление на ноль"); // 1
//			e.printStackTrace();
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.err.println("выход за границы массива"); // 2
//			e.printStackTrace();
//		} // all - 3

//		try {
//			arr[9] = 10;
//		} catch (Exception e) {
//			System.err.println("Деление на ноль"); // 1
//			// logging
//		}
//		System.out.println("------------");

//		try {
////			method1();
//			System.out.println("HERE");
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			System.out.println("I am here");
//		}
//		System.out.println("------------");

//		method4();

		// System.exit(0)
		// JVM crush
		// infinity loop
		// power off
		// deamon thread

		System.out.println(method5());
	}

	private static void method1() throws IOException {
		method2();
	}

	private static void method2() throws IOException {
//		try {
//			method3();
//		} catch (Exception e) {
//			System.err.println("деление на 0");
//		}
		method3();
	}

	private static void method3() throws IOException {
//		int a = 15;
//		int b = 0;
//		if (b == 0) {
//			throw new ArithmeticException("делить на 0 нельзя");
//		}
//		System.out.println("-----------");
//		System.out.println(a / b);
//		System.out.println("-----------");


		System.out.println("first");
		if (5 > 3) {
			throw new IOException("some error");
		} else {
			System.out.println("second");
		}
	}

	private static void method4() {
//		BufferedReader br = null;
//		try {
//			String line;
//			br = new BufferedReader(new FileReader("src/main/java/lesson_02/test.txt"));
//			while ((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				br.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}

		try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/lesson_02/test.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int method5() {
		try {
			return 1;
		} finally {
			return 2;
		}
	}
}
