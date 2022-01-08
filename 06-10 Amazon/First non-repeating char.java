//https://practice.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream1216/1#

class Solution
{
    public String FirstNonRepeating(String A)
    {
        StringBuilder ret = new StringBuilder();
		int isRepeated[] = new int[26];
		Deque<Character> queue = new ArrayDeque<>();
		for (int i = 0; i < A.length(); i++) {
			char ch = A.charAt(i);
			if (isRepeated[ch - 'a'] == 0)
				queue.add(ch);
			
			isRepeated[ch - 'a']++;
			while (!queue.isEmpty() && isRepeated[queue.peek() - 'a'] != 1)
				queue.poll();
			ret.append(queue.isEmpty() ? '#' : queue.peek());
		}
		return  ret.toString();
    }
}
