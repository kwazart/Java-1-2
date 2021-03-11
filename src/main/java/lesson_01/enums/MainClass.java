package lesson_01.enums;

public class MainClass {
	public static void main(String[] args) {
//		System.out.println(EnumClass.FIRST_VALUE);
//		System.out.println(EnumClass.FIRST_VALUE.getValue());
//		System.out.println(EnumClass.SECOND_VALUE.ordinal());
//		System.out.println(EnumClass.FIRST_VALUE.ordinal());
//
//		EnumClass[] array = EnumClass.values();
//		for (EnumClass e : array) {
//			System.out.println(e.getValue());
//		}


		MonthsEnum[] array = MonthsEnum.values();
		for (MonthsEnum e : array) {
			System.out.println(e.getRussianTranslate());
		}

		System.out.println(MonthsEnum.DECEMBER);
	}
}
