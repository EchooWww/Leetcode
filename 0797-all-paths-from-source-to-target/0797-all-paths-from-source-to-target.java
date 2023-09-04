class Solution {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        LinkedList<Integer> path = new LinkedList<>();
        traverse(graph, 0, path);
        return res;
    }
    
    public void traverse(int[][] graph, int s, LinkedList<Integer> path) {
        path.add(s);
        if (s == graph.length -1) {
            res.add(new LinkedList<>(path));
        }
        
        for (int nb: graph[s]) {
            traverse(graph, nb, path);
        }
        
        path.removeLast();
    } 
}