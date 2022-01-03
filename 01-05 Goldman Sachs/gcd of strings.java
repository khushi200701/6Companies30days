// https://leetcode.com/problems/greatest-common-divisor-of-strings/

class Solution {
    public String gcdOfStrings(String str1, String str2) {
          if (!(str1+str2).equals(str2+str1)) {
        return "";
    }
    int len = str1.length();
    int len2 = str2.length();
    int gcd = GCD(len, len2);
    if (len < len2) {
        return str1.substring(0, gcd);
    }
    return str2.substring(0, gcd);
}

public int GCD(int a, int b) {
    if (b == 0) {
        return a;
    }
    return a % b == 0 ? b : GCD(b, a % b);
    }
}
