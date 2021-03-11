package lesson_01.enums;

public enum MonthsEnum {

	JANUARY("Январь"),
	FEBRUARY("Февраль"),
	MARCH("Март"),
	APRIL("Апрель"),
	MAY("Май"),
	JUNE("Июнь"),
	JULY("Июль"),
	AUGUST("Август"),
	SEPTEMBER("Сентябрь"),
	OCTOBER("Октябрь"),
	NOVEMBER("Ноябрь"),
	DECEMBER("Декабрь");

	MonthsEnum(String russianTranslate) {
		this.russianTranslate = russianTranslate;
	}

	private String russianTranslate;


	public String getRussianTranslate() {
		return russianTranslate;
	}
}
