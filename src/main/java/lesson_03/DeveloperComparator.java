package lesson_03;

import java.util.Comparator;

public class DeveloperComparator implements Comparator<Developer> {
	@Override
	public int compare(Developer o1, Developer o2) {
		return o1.getSalary() - o2.getSalary();
	}
}
