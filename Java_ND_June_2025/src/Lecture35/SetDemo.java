package Lecture35;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set =  new TreeSet<>();
//		HashSet<Integer> set =  new HashSet<>();
//		LinkedHashSet<Integer> set =  new LinkedHashSet<>();
		set.add(10);
		set.add(140);
		set.add(140);
//		set.add(null);
		set.add(190);
		set.add(180);
		set.add(20);
		
		set.remove(10);
		
		System.out.println(set.contains(20));
		
		for (Integer i : set) {
			System.out.println(i);
		}
		System.out.println(set);
		
		
	}

}
