package Lecture36;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int arr[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(target-nums[i])) {
				arr[0] = i;
				arr[1] = map.get(target-nums[i]);
				break;
			}
			map.put(nums[i], i);
		}
		
		return arr;
	}

}
