class MyQueue {
  Stack<Integer> a=new Stack<>();
        Stack<Integer> b=new Stack<>();
    public MyQueue() {
      
        
    }
    
    public void push(int x) {
        a.push(x);
    }
    
    public int pop() {
    int temp=0;
        if(!b.isEmpty())
        {
            return b.pop();
        }
        else
        {
            while(!a.isEmpty())
                b.push(a.pop());
            return b.pop();
        }
        
    }
    
    public int peek() {
        if(!b.isEmpty())
        {
            return b.peek();
        }
        else
        {
            while(!a.isEmpty())
                b.push(a.pop());
            return b.peek();
        }
    }
    
    public boolean empty() {
       if(a.isEmpty() && b.isEmpty())
           return true;
        return false;
    }
}