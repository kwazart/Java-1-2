package homework_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
	Map<String, Set<String>> map;

	public PhoneBook() {
		map = new HashMap<>();
	}

	public void add(String name, String phoneNumber) {
//		Set<String> set = map.getOrDefault(name, new HashSet<>());
//		set.add(phoneNumber);
//		map.get(name).add(phoneNumber);

		if (!map.containsKey(name)) {
			map.put(name, new HashSet<>());
		}
		map.get(name).add(phoneNumber);
	}

	public void get(String name) {
		if (map.containsKey(name)) {
			System.out.println(name + ": " + map.get(name));
		} else {
			System.out.println("Not found");
		}
	}
}
