package homework_5;

import java.util.Arrays;

public class Main {
	static final int SIZE = 10000000;
	static final int THREAD_COUNT = 20;
	static final int PART_SIZE = SIZE / THREAD_COUNT;

	public static void main(String[] args) {
		float[] arr1 = method1();
		float[] arr2 = method2();
//		for (int i = 0; i < SIZE; i++) {
//			System.out.println(arr1[i] + " " + arr2[i]);
//		}
		/*
		1: 1739
		2: 832
		4: 477
		8: 401
		10: 345
		16: 359
		 */
	}

	private static float[] method1() {
		float[] arr = new float[SIZE];
		Arrays.fill(arr,1f);
		long a = System.currentTimeMillis();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
		}
		long b = System.currentTimeMillis();
		System.out.println("Method 1: Time: " + (b - a));

		return arr;
	}

	private static float[] method2() {
		float[] arr = new float[SIZE];
		Arrays.fill(arr,1f);
		long a = System.currentTimeMillis();

		final float[][] m = new float[THREAD_COUNT][PART_SIZE];
		Thread[] t = new Thread[THREAD_COUNT];

		for (int i = 0; i < THREAD_COUNT; i++) {
			System.arraycopy(arr, PART_SIZE * i, m[i], 0, PART_SIZE);
			final int u = i;
			t[i] = new Thread(() -> {
				for (int j = 0; j < PART_SIZE; j++) {
					m[u][j] = (float)(m[u][j]
							* Math.sin(0.2f + (j + PART_SIZE * u) / 5)
							* Math.cos(0.2f + (j + PART_SIZE * u) / 5)
							* Math.cos(0.4f + (j + PART_SIZE * u) / 2));
				}
			});
			t[i].start();
		}

		try {
			for (int i = 0; i < THREAD_COUNT; i++) {
				t[i].join();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < THREAD_COUNT; i++) {
			System.arraycopy(m[i], 0, arr, i * PART_SIZE, PART_SIZE);
		}

		long b = System.currentTimeMillis();
		System.out.println("Method 2: Time: " + (b - a));

		return arr;
	}

}
