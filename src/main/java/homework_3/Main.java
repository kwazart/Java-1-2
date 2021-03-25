package homework_3;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		// 1
		String[] arr = {"Abd", "def", "ghi", "jkl", "mno", "Abd", "def", "ghi", "jkl",
				"mno", "Abd", "def", "ghi", "jkl", "mno", "DEgf", "123"};
		Map<String, Integer> map = new HashMap<>();
		for (String s : arr) {
			map.put(s , map.getOrDefault(s, 0) + 1);
		}

		System.out.println("Unique: " + map.size());
		System.out.println(map);

		// 2

		PhoneBook book = new PhoneBook();
		book.add("Ivanov", "123");
		book.add("Ivanov", "124");
		book.add("Ivanov", "125");
		book.add("Petrov", "444");
		book.add("Petrov", "445");
		book.add("Petrov", "446");

		book.get("Ivanov");
		book.get("Petrov");
		book.get("Sidorov");
	}
}
