// https://practice.geeksforgeeks.org/problems/nuts-and-bolts-problem0431/1

class Solution {
    void matchPairs(char nuts[], char bolts[], int n) {
        // code here
        HashMap<Character, Integer> hash = new HashMap<>();
 
    for (int i = 0; i < n; i++)
      hash.put(nuts[i], i);
    for (int i = 0; i < n; i++)
      if (hash.containsKey(bolts[i]))
        nuts[i] = bolts[i];
    for (int i = 0; i < n; i++)
      System.out.print(nuts[i] + " ");
    System.out.println();
    for (int i = 0; i < n; i++)
      System.out.print(bolts[i] + " ");
  }
}
