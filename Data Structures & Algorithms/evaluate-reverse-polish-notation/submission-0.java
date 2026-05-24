class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack();
        for(String op : tokens){
            if(op.equals("+")){
                int top = st.pop();
                int newtop = top + st.pop();
                st.push(newtop);
            }else if(op.equals("-")){
                int top = st.pop();
                int newtop = st.pop()-top;
                st.push(newtop);
            }else if(op.equals("*")){
                int top = st.pop();
                int newtop = st.pop()*top;
                st.push(newtop);
            }else if(op.equals("/")){
                int top = st.pop();
                int newtop = st.pop()/top;
                st.push(newtop);
            } else {
                st.push(Integer.parseInt(op));
            }
        }
        return st.peek();
    }
}
