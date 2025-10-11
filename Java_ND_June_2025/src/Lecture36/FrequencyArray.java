package Lecture36;

import java.util.HashMap;

public class FrequencyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,1,2,3,4,5,1,1,3,4,3,2,3,4,2,1,1};
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i],1);
			}
		}
		
		System.out.println(map);
	}

}
