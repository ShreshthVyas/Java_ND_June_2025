package Lecture35;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<String, Integer> map = new HashMap<>();
		
//		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		
		TreeMap<String,Integer> map  = new TreeMap<>();
		map.put("B", 130);
		map.put("A", 10);
		
		map.put("C", 140);
		map.put("A", 100);
//		map.put(null, 250);
//		map.put(null, 2500);
//		map.put(null, null);
		map.put("null", 10);
		System.out.println(map.containsKey("A"));
		map.remove("DEF");
		
//		System.out.println(map.get("DE"));
		
		System.out.println(map.getOrDefault("A", 10000));
		
		
		System.out.println(map);
		
		for (String s : map.keySet()) {
			System.out.println(s+ "==>" + map.get(s));
		}
	}

}
