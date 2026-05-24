class Solution {
    // [5,-2,-4,9,5,14] -- > 27
    public int calPoints(String[] operations) {
        int n = operations.length;
        Stack<Integer> st = new Stack();
        int i=0;
        while(i<n){
            if(operations[i].equals("+")){
                int number2 = st.pop();
                int number1 = st.pop();

                int number3 = number1+number2;

                st.push(number1);
                st.push(number2);
                st.push(number3);
            } else if(operations[i].equals("C")){
                st.pop();
            } else if(operations[i].equals("D")){
                int top = st.peek();
                top *= 2;
                st.push(top);
            } else {
                int num = Integer.parseInt(operations[i]);
                st.push(num);
            }
            i++;
        }
        int ans = 0;
        while(!st.isEmpty()){
            ans += st.pop();
        }

        return ans;
    }
}