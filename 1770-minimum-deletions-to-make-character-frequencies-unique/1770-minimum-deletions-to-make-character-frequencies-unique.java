class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c: s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        HashSet<Integer> usedFreq = new HashSet<>();
        int steps = 0;
        for (int n :freq.values()) {
            while (n > 0 && usedFreq.contains(n)) {
                n--;
                steps++;
            }
            usedFreq.add(n);
        }
        return steps;
    }
}

// class Solution {
//     public int minDeletions(String s) {
//         Integer[] freq = new Integer[26];
//         for (int i = 0; i < 26; i++) {
//             freq[i] = 0; 
//         }
//         for (char c: s.toCharArray()) {
//             freq[c-'a']++;
//         }
//         Arrays.sort(freq, (a, b) ->b-a);
//         int res = 0;
//         for (int i = 1; i < 26; i++) {
//             while (freq[i] != 0 && freq[i] >= freq[i-1]) {
//                 freq[i]--;
//                 res++;
//             }
//         }
//         return res;
//     }
// }

