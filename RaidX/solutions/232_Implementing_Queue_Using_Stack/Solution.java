class MyQueue {
    Stack<Integer> queue =  new Stack<>(); ;
    Stack<Integer> helpingStack =  new Stack<>();;
    public MyQueue() {
    }
    
    public void push(int x) {
        if(!queue.empty()){
            while(!queue.empty()){
                helpingStack.add(queue.pop());
            }
        }
        queue.add(x);
        while(!helpingStack.empty()) queue.add(helpingStack.pop());
    }
    
    public int pop() {
        return queue.pop();
    }
    
    public int peek() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.empty();
    }
}
