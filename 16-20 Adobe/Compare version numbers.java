// https://leetcode.com/problems/compare-version-numbers/

class Solution {
    public ArrayList<String> splits(String str){
        ArrayList<String> list = new ArrayList();
        int index=0,n=str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='.'){
                list.add(str.substring(index,i));
                index=i+1;
            }
        }
        list.add(str.substring(index));
        return list;
    }
    public int compareVersion(String version1, String version2) {
        if(version1==null || version2==null)
            return 0;
        ArrayList<String> v1 = splits(version1);
        ArrayList<String> v2 = splits(version2);
        int l1=v1.size(),l2=v2.size();
        int i=0,j=0;
        while(i<l1 && j<l2){
            int one = Integer.parseInt(v1.get(i));
            int two = Integer.parseInt(v2.get(j));
            if(one>two)
                return 1;
            else if(two>one)
                return -1;
            i++;j++;
        }
        while(i<l1){
            int one = Integer.parseInt(v1.get(i));
            i++;
            if(one>0)
                return 1;
        }
        while(j<l2){
            int one = Integer.parseInt(v2.get(j));
            j++;
            if(one>0)
                return -1;
        }
        return 0;
    }
}
