class RandomizedSet:

    def __init__(self):
        self.data = {}
        self.items = []
        
    def insert(self, val: int) -> bool:
        if val in self.data:
            return False
        self.data[val] = len(self.items)
        self.items.append(val)
        return True

    def remove(self, val: int) -> bool:
        if val not in self.data:
            return False
        last_elem = self.items[-1]
        val_idx = self.data[val]
        self.items[val_idx] = last_elem
        self.items.pop()
        del self.data[val]
        return True

    def getRandom(self) -> int:
        import random
        return random.choice(self.items)
        
# Your RandomizedSet object will be instantiated and called as such:
# obj = RandomizedSet()
# param_1 = obj.insert(val)
# param_2 = obj.remove(val)
# param_3 = obj.getRandom()