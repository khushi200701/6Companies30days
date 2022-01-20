// https://practice.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names-1587115621/1/

public static String[] winner(String arr[], int n)
    {
        Map<String, Integer> map = new HashMap<>();
        int maxVotes = 0;        
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
            if (map.get(s) > maxVotes) maxVotes = map.get(s);
        }        
        List<String> candidates = new ArrayList<>();
        // \Theta(n)
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxVotes) {
                candidates.add(entry.getKey());
            }
        }        
        String candidate = getCandidate(candidates);
        return new String[] {candidate, String.valueOf(maxVotes)};
        
    }
    private static String getCandidate(List<String> list) {
        String min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(min) < 0) {
                min = list.get(i);
            }
        }
        return min;
    }
