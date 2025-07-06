package Lecture9;

public class FirstBadVersionLeetcode {
	// https://leetcode.com/problems/first-bad-version/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int firstBadVersion(int n) {
		int lo = 1;
		int hi = n;
		int ans =0;
		while(lo<=hi) {
			int mid = lo + (hi-lo)/2;
			if(isBadVersion(mid)) {// returns true --> mid is bad
				ans = mid;
				hi = mid-1;
			}
			else {// mid is good
				lo = mid+1;
			}
		}
		
		return ans;
	}
	
	public static boolean isBadVersion(int version) {
		return false;
	}

}
