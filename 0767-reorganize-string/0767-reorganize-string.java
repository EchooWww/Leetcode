class Solution {
    public String reorganizeString(String s) {
        int[] freq = new int[26];
        // create a descending pq to store the frequency of characters
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1] - a[1]);
        for(char c: s.toCharArray()) {
            freq[c-'a']++;
        }
        for (int i = 0; i < 26; i++){
            if (freq[i] != 0) {
                pq.offer(new int[]{ i +'a', freq[i]});
            }
        }
        StringBuilder res = new StringBuilder();
        while(!pq.isEmpty()) {
            int[] first = pq.poll();
            // if the last char for now is not most frequent one, append the most frequent one to string builder
            if (res.length()==0 || res.charAt(res.length()-1) != first[0]) {
                res.append((char)first[0]);
                // add the char back after decrement the frequency
                if (--first[1] > 0) {
                    pq.offer(first);
                }
            } else {
            // if the most frequent char is at the end, and we have no other char to append, return empty string
                if (pq.isEmpty()) {
                    return "";
                } else {
                    // if pq is not empty, append the second most frequent char
                    int[] second = pq.poll();
                    res.append((char)second[0]);
                    if (--second[1] > 0) {
                        pq.offer(second);
                    }
                    pq.offer(first);
                }
            }
        }
        return res.toString();
    }
}