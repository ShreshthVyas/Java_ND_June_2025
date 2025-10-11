package Lecture36;
import java.util.*;
public class GroupAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> map = new HashMap<>();
		List<List<String>> ans =  new ArrayList<>();
		
		for (String str : strs) {
			char [] ch =  str.toCharArray();
			Arrays.sort(ch);
			String t =  new String(ch);
			
			if(map.containsKey(t)) {
				map.get(t).add(str);
			}
			else {
				map.put(t, new ArrayList<>());
				map.get(t).add(str);
			}
		}
		
		for (String key : map.keySet()) {
			ans.add(map.get(key));
		}
		
		return ans;
	}

}
