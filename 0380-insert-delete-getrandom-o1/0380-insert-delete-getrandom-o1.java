class RandomizedSet {
    
    List<Integer> nums;
    Map<Integer, Integer> numsToIndex;
    int size;
    
    public RandomizedSet() {
        this.nums = new ArrayList<>();
        this.numsToIndex = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if (numsToIndex.containsKey(val)) return false;
        nums.add(val);
        numsToIndex.put(val, nums.size() - 1);
        return true;
    }
    
    public boolean remove(int val) {
        if (!numsToIndex.containsKey(val)) return false;
        int idx = numsToIndex.get(val);
        numsToIndex.put(nums.get(nums.size()-1), idx);
        Collections.swap(nums, idx, nums.size() -1);
        nums.remove(nums.size() -1);
        numsToIndex.remove(val);
        return true;
    }
    
    public int getRandom() {
        return nums.get((int)(Math.random()*nums.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */