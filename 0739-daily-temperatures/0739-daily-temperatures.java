class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        // stack to keep track of unknown indexes in temps array
        Stack<Integer> idx = new Stack<>();
        for (int i = 0; i < res.length; i++) {
            // on top of the stack is the index of last unresolved day. Once we meet a higher temperature, we can decide the distance
            while (!idx.isEmpty() && temperatures[i] > temperatures[idx.peek()]) {
                res[idx.peek()] = i - idx.pop();
            }
            idx.push(i);
        }
        return res;
    }
}