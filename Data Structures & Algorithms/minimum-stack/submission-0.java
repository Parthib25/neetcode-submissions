class MinStack {
    private Stack <Integer[]> st;
    public MinStack() {
       st=new Stack<>();
    }
    
    public void push(int val) {
      Integer[] pair=new Integer[2];
        if(!st.empty()){
           Integer[] topPair=st.peek();
            if(topPair[1]<val){
                pair[0]=val;
                pair[1]=topPair[1];
            }else{
               pair[0]=val;
               pair[1]=val;
            }
        }else{
             pair[0]=val;
             pair[1]=val;
        }
        st.push(pair);
    }
    
    public void pop() {
        Integer[] popedPair=st.pop();
    }
    
    public int top() {
        Integer[] topPair=st.peek();
        return topPair[0];
    }
    
    public int getMin() {
        Integer[] topPair=st.peek();
        return topPair[1];
    }
}
