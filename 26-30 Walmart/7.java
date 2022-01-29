class Solution {
    ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
        Stack<Integer>s=new Stack<Integer>();
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!s.isEmpty()&&s.peek()<=arr.get(i))
                s.pop();
            s.push(arr.get(i));
            if(s.size()==3)
                break;
        }
        if(s.size()>=3)
        {
            for(int i=2;i>=0;i--)
                res.add(s.pop());
        }
        return res;
    }
}
