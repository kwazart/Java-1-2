package lesson_03;

import java.util.Objects;

//public class Developer implements Comparable<Developer>{
public class Developer {
	private String name;
	private String language;
	private int salary;

	public Developer(String name, String language, int salary) {
		this.name = name;
		this.language = language;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getLanguage() {
		return language;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Developer{" +
				"name='" + name + '\'' +
				", language='" + language + '\'' +
				", salary=" + salary +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Developer)) return false;
		Developer developer = (Developer) o;
		return getSalary() == developer.getSalary() && getName().equals(developer.getName()) && getLanguage().equals(developer.getLanguage());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getName(), getLanguage(), getSalary());
	}

//	@Override
//	public int compareTo(Developer o) {
////		return this.getSalary() - o.getSalary();
//		return o.getSalary() - this.getSalary();
//	}
}
