import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
       Arrays.sort(nums,(a,b)->new BigInteger(b).compareTo(new BigInteger(a)));
        return nums[k-1];
    }
}
