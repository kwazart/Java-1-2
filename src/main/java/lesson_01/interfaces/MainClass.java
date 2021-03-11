package lesson_01.interfaces;

public class MainClass {
	public static void main(String[] args) {
		MyClass1 mc1 = new MyClass1(10, "text");
		Testable mc2 = new MyClass2();
//
//		mc1.testMethod();
//		mc2.testMethod();
//
//		System.out.println(mc1.testMethod2(4, "some text"));
//		System.out.println(mc2.testMethod2(5, "else text"));
//		System.out.println(mc1.testMethod3(2, 5));
//		System.out.println(mc2.testMethod3(2, 5));

		Testable[] testables = {mc1, mc2};
		for (Testable t : testables) {
			t.testMethod();
			System.out.println(t.testMethod2(3, "a"));
			System.out.println(t.testMethod3(2, 3));
		}

		System.out.println(Testable.COUNTER);
		System.out.println(Testable.MESSAGE);
		System.out.println(MyClass1.COUNTER);
		System.out.println(MyClass2.MESSAGE);
	}
}
