

class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here        
        ArrayList<Integer> ans = new ArrayList<>();
        int j, max;

        for (int i = 0; i <= n - k; i++) {
            max = arr[i];

            for (j = 1; j < k; j++) {
                if (arr[i + j] > max)
                    max = arr[i + j];
            }
            ans.add(max);
        }
        return ans;
    }
}
