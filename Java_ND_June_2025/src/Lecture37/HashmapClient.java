package Lecture37;

public class HashmapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashmap<String, Integer> map =  new Hashmap<>();
		map.put("A", 10);
		map.put("B", 23);
		map.put("C", 44);
		map.put("D", 78);
		map.put("E", 90);
		map.put("G", 87);
		map.put("H", 76);
		System.out.println(map);
		map.remove("hello");
		map.remove("B");
		System.out.println(map.containsKey("B"));
		System.out.println(map.containsKey("C"));
		System.out.println(map.get("A"));
		System.out.println(map.get("B"));
		map.put("A", 100);
		
		System.out.println(map);
	}

}
