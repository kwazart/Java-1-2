package lesson_01.interfaces;

public class MyClass2 implements Testable {
	@Override
	public void testMethod() {
		System.out.println("into test method-01 class-2");
	}

	@Override
	public String testMethod2(int value, String text) {
		return text + value;
	}

	@Override
	public int testMethod3(int a, int b) {
		return a * b;
	}
}
