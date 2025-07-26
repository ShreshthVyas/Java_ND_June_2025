package Lecture14;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>  list = new ArrayList<>();
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(1, 20);
		System.out.println(list);
		
		list.addFirst(30);
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		list.remove(3);
		System.out.println(list);
		
		list.set(2, 100);
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+",");
		}
		
		for (Integer i : list) {
			System.out.println(i);
		}
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		
		
		
		
	}

}
