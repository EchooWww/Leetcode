class MyQueue {
    Stack<Integer> stack;
    Stack<Integer> helper;
    public MyQueue() {
        this.stack = new Stack<>();
        this.helper = new Stack<>();
    }
    
    public void push(int x) {
        while(!this.empty()) helper.push(stack.pop());
        stack.push(x);
        while (!this.helper.isEmpty()) stack.push(helper.pop());
    }
    
    public int pop() {
       return stack.pop();
    }
    
    public int peek() {
        return stack.peek();
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */