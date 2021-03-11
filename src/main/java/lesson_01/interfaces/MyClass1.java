package lesson_01.interfaces;

public class MyClass1 implements Testable {
	private int classIntValue;
	private String classStringValue;

	public MyClass1(int classIntValue, String classStringValue) {
		this.classIntValue = classIntValue;
		this.classStringValue = classStringValue;
	}

	@Override
	public void testMethod() {
		System.out.println("into test method-01 class-1");
	}

	@Override
	public String testMethod2(int value, String text) {
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < value; i++) {
			sb.append(text).append("\t");
		}
		return sb.toString();
	}
}
