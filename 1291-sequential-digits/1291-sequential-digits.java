class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String sequential = "123456789";
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            for (int j = i + 2; j < 10; j++) {
                int num = Integer.parseInt(sequential.substring(i, j));
                if(low <= num && num <= high) res.add(num);
            }
        }
        Collections.sort(res);
        return res;
    }
}