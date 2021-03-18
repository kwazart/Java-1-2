package lesson_03;

import java.util.*;

public class ListInfoCLass {
	public static void main(String[] args) {
		// ArrayList
//		ArrayList<String> list = new ArrayList<>();
//		list.add("first");
//		list.add("second");
//		list.add(0, "third");
//		list.remove("first");
//		list.remove(0);
//		System.out.println(list);

//		List<String> list1 = new ArrayList<>(list);
//		list1.add("123");
//		list1.add("45");
//		list1.add("67");
//		list1.add("89");
//		list1.add(null);
//		list1.add("100");
//		list1.add(null);
//		list1.add("200");
//		list1.add("200");
//		list1.add("200");
//		list1.add("200");
//		System.out.println(list1);
//		System.out.println(list.size());
//		System.out.println(list1.get(5));
//		ArrayList<Integer> list2 = new ArrayList<>(1000);
//		System.out.println(list.indexOf("89"));


//		//LinkedList
//		LinkedList<String> linkedList = new LinkedList<>();
//		linkedList.add("abc");
//		linkedList.add("def");
//		linkedList.add("ghi");
//		linkedList.add("jkl");
//		linkedList.addFirst("mno");
//		linkedList.addLast("pqr");
//		System.out.println(linkedList);
//		linkedList.remove(3);
//		System.out.println(linkedList);


//		List<Developer> listDeveloper = new ArrayList<>();
//		Developer developer = new Developer("name1", "java", 3000);
//		listDeveloper.add(developer);
//		listDeveloper.add(developer);
//		listDeveloper.add(new Developer("name2", "python", 2000));
//		listDeveloper.add(new Developer("name3", "c++", 4000));
//		listDeveloper.add(new Developer("name4", "python", 3000));
//		listDeveloper.add(new Developer("name5", "java", 4000));
//		listDeveloper.add(developer);
//		listDeveloper.add(null);
//		listDeveloper.add(new Developer("name6", "java", 4500));
//		listDeveloper.add(new Developer("name7", "c++", 3000));

//		for (Developer d : listDeveloper) {
//			if (developer.equals(d)) {
//				listDeveloper.remove(developer);
//			}
//		}

//		for (int i = 0; i < listDeveloper.size(); i++) {
//			if (developer.equals(listDeveloper.get(i))) {
//				listDeveloper.remove(listDeveloper.get(i));
//			}
//		}

//		Iterator<Developer> iterator = listDeveloper.iterator();
//		while (iterator.hasNext()) {
//			if (developer.equals(iterator.next())) {
//				iterator.remove();
//			}
//		}
//
//		for (Developer d : listDeveloper) {
//			System.out.println(d);
//		}


//		Map<Integer, String> map = new HashMap<>(); // Entry
		// Map<Integer, List<String>> map1 = new HashMap<>();
//		map.put(1, "one");
//		map.put(2, "two");
//		map.put(3, "three");
//		map.put(4, "four");
//		System.out.println(map);
//
//		for (Map.Entry entry : map.entrySet()) {
//			System.out.println(entry.getKey() + " - " + entry.getValue());
//		}


//		Developer dev = new Developer("name", "java", 4000);
//		Developer dev1 = new Developer("name-1", "python", 3000);
//		Developer dev2 = new Developer("name-2", "c++", 4000);
//		Map<Developer, String> developerMap = new HashMap<>();
//		developerMap.put(dev, dev.getName());
//		developerMap.put(dev1, dev1.getName());
//		developerMap.put(dev2, dev2.getName());
//		developerMap.put(dev2, "lidkfhnldkifhgbl'dkif");
//		developerMap.put(dev, dev.getName());
//		developerMap.put(new Developer("name", "java", 4000), "sjdkbgkjsdagb");
//
//
//		for (Map.Entry entry : developerMap.entrySet()) {
//			System.out.println(entry.getKey() + " - " + entry.getValue());
//		}


		Set<Developer> developerSet = new TreeSet<>(new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return 0;
			}
		});
		developerSet.add(new Developer("name", "java", 1000));
		developerSet.add(new Developer("name", "java", 2000));
		developerSet.add(new Developer("name1", "java", 3000));
		developerSet.add(new Developer("name2", "java", 4000));
		developerSet.add(new Developer("name2", "java", 5000));
		System.out.println(developerSet);
	}
}
