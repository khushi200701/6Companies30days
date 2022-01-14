// https://practice.geeksforgeeks.org/problems/minimum-number-of-steps-to-reach-a-given-number5234/1/#

class Solution{
    static int minSteps(int D){
        // code here
        int steps = 0;
        int sum = 0;
        while(sum<D) {
            sum+=steps;
            steps++;
        }
        while((sum-D)%2 != 0) {
            sum+=steps;
            steps++;
        }
        return steps-1;
}
}
