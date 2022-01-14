// https://practice.geeksforgeeks.org/problems/bridge-edge-in-graph/1

class Solution
{
    //Function to find if the given edge is a bridge in graph.
    static int isBridge(int v, ArrayList<ArrayList<Integer>> adj,int c,int d)
    {
        // code here
        boolean [] visited = new boolean [v];
        int [] timeOfInsertion = new int [v];
        int [] lowestTime = new int [v];
        int timer = 0;
        for (int i=0; i<v; i++) {
            if (!visited[i]) {
                if (isBridgeFoundAtCD(i, -1, visited, timeOfInsertion, lowestTime, adj, timer, c, d)) {
                    return 1;
                }
            }
        }
        return 0;
    }
    
    static boolean isBridgeFoundAtCD(int node, int parent, boolean [] visited, int [] timeOfInsertion, int [] lowestTime, ArrayList<ArrayList<Integer>>adj, int timer, int c, int d) {
        visited[node] = true;
        timeOfInsertion[node] = lowestTime[node] = timer++;
        ArrayList<Integer> children =adj.get(node);
        for (Integer child : children) {
            if (child == parent) {
                continue;
            }
            if (!visited[child]) {
                if (isBridgeFoundAtCD(child, node, visited, timeOfInsertion, lowestTime, adj, timer, c, d)) {
                    return true;
                }
                lowestTime[node] = Math.min(lowestTime[node], lowestTime[child]);
                if (lowestTime[child] > timeOfInsertion[node]) {
                    if ((child == c && node == d) || (child == d && node == c)) {
                        return true;
                    }
                }
            }
            else {
                lowestTime[node] = Math.min(lowestTime[node], timeOfInsertion[child]);
            }
        }
        return false;
    }
}
