1class MinStack {
2    Stack<Integer> st;
3    Stack<Integer> minSt;
4
5    public MinStack() {
6        st = new Stack();
7        minSt = new Stack();
8        
9    }
10    
11    public void push(int value) {
12        st.push(value);
13        if(minSt.isEmpty() || value<=minSt.peek()){
14            minSt.push(value);
15        }
16        
17
18        
19    }
20    
21    public void pop() {
22        if(st.peek().equals(minSt.peek())){
23            minSt.pop();
24        }
25        st.pop();
26
27        
28    }
29    
30    public int top() {
31        return st.peek();
32        
33    }
34    
35    public int getMin() {
36        return minSt.peek();
37        
38    }
39}
40
41/**
42 * Your MinStack object will be instantiated and called as such:
43 * MinStack obj = new MinStack();
44 * obj.push(value);
45 * obj.pop();
46 * int param_3 = obj.top();
47 * int param_4 = obj.getMin();
48 */