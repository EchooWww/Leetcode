class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq= new HashMap();
        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort(Map.Entry.<Character, Integer>comparingByValue().reversed());

        Map<Character, Integer> sorted = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : list) {
            sorted.put(entry.getKey(), entry.getValue());
        }
        for (char c: sorted.keySet()) {
            for (int i = 0; i < sorted.get(c); i++) sb.append(c);
        }
        return sb.toString();
    }
}