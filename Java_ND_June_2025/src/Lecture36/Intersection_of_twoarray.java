package Lecture36;

import java.util.HashSet;

public class Intersection_of_twoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set1 =  new HashSet<>();
		HashSet<Integer> set2 =  new HashSet<>();
		
		for (int i = 0; i < nums1.length; i++) {
			set1.add(nums1[i]);
		}
		
		for (int i = 0; i < nums2.length; i++) {
			if(set1.contains(nums2[i])) {
				set2.add(nums2[i]);
			}
		}
		int k =0;
		int ans[] = new int[set2.size()];
		
		for (int i : set2) {
			ans[k++] = i;
		}
		
		return ans;
		
	}

}
