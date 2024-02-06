class Solution {
    public String sortStr (String org) {
        char[] arr = org.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String s: strs) {
            String sorted = sortStr(s);
            anagrams.putIfAbsent(sorted, new ArrayList<String>());
            anagrams.get(sorted).add(s);
        }
        List<List<String>> res = new ArrayList<>();
        for (List<String> l: anagrams.values()) res.add(l);
        return res;
    }
}