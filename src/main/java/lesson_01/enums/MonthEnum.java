package lesson_01.enums;

public enum MonthEnum {
	FIRST_VALUE("one"),
	SECOND_VALUE("two") {
		public String getValue() {
			return "second";
		}
	},
	THIRD_VALUE("three") {
		public String getValue() {
			return "third";
		}
	};

	private String value;

	MonthEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
