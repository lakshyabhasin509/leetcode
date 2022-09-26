class MyStack {
    
    Queue<Integer> q1,q2;
    

    public MyStack() {
    
        q1=new ArrayDeque<>();
        q2=new ArrayDeque<>();
    }
    
    public void push(int x) {
        if(q1.isEmpty())q1.add(x);
        else {
            int size=q1.size();
            for(int i=0;i<size;i++){
                q2.add(q1.poll());
            }
            q1.add(x);
            size=q2.size();
            for(int i=0;i<size;i++){
                q1.add(q2.poll());
            }
        }
    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */