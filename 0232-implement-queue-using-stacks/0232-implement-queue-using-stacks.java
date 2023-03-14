class MyQueue {
    // -Contains value based on question
    Stack<Integer> main;
    //-Conatins reverse Values
    Stack<Integer> temp;

    public MyQueue() {
        this.main=new Stack<>();
        this.temp=new Stack<>();
    }
    
    public void push(int x) {
        main.push(x);
    }
    
    public int pop() {
        while(!main.isEmpty()){
            temp.push(main.pop());
        }
        int remove=temp.pop();
        //-Update main
        while(!temp.isEmpty()){
            main.push(temp.pop());
        }
        return remove;
    }
    
    public int peek() {
        while(!main.isEmpty()){
            temp.push(main.pop());
        }
        int top=temp.peek();
        while(!temp.isEmpty()){
            main.push(temp.pop());
        }
        return top;
    }
    
    public boolean empty() {
        if(main.isEmpty()){
            return true;
        }
        return false;
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