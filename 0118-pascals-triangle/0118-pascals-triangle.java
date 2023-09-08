class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new LinkedList<>();

       for(int i = 0; i < numRows; i++) {
           List<Integer> row = new LinkedList<>();
           for (int j = 0; j <= i; j++) {
               int num = j==0 || j==i? 1: res.get(i-1).get(j-1) + res.get(i-1).get(j);
               row.add(num);
           }
           res.add(row);
       }
        return res;
    }
}