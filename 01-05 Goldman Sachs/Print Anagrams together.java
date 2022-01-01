// https://practice.geeksforgeeks.org/problems/print-anagrams-together/1/
// https://leetcode.com/problems/group-anagrams/

class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
	if(strs==null || strs.length == 0){
		return new ArrayList<List<String>>();
	}
	HashMap<String, List<String>> map = new HashMap<String, List<String>>();
	//Arrays.sort(strs);
	for (String s:strs) {
		char[] ca = new char[26];
		// Arrays.sort(ca);
            for (char c : s.toCharArray()) ca[c - 'a']++;
		String keyStr = String.valueOf(ca);
		if(!map.containsKey(keyStr))
			map.put(keyStr, new ArrayList<String>());
		map.get(keyStr).add(s);
	}
	
	// for(String key: map.keySet()) {
	// 	Collections.sort(map.get(key));
	// }
	return new ArrayList<List<String>>(map.values());
}
}
